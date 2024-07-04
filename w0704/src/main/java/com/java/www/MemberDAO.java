package com.java.www;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	int memNo;
	String id;
	String pw;
	String name;
	String gender;
	Timestamp mdate;
	int no;
	
	public ArrayList<MemberDTO> doMember() {
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			Connection conn = ds.getConnection();
			
			String query = "SELECT * FROM MEMBER";
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery(query);
			
			
			while(rs.next()){
				memNo = rs.getInt("MEMNO");
				id = rs.getString("ID");
				pw = rs.getString("PW");
				name = rs.getString("NAME");
				gender = rs.getString("GENDER");
				mdate = rs.getTimestamp("MDATE");
				no = rs.getInt("NO");
				
				list.add(new MemberDTO(memNo, id, pw, name, gender, mdate, no));
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null){
					rs.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				if(conn != null){
					conn.close();
				}		
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
}

