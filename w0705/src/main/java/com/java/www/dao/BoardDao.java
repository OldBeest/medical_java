package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Board;

public class BoardDao {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Board board;
	
	int bno, bgroup, bstep, bindent, bhit;
	String id, btitle, bcontent, bfile;
	private Timestamp bdate;
	
	ArrayList<Board> list = new ArrayList<Board>();
	String query;
	
	
	
	public void listInsert(String btitle, String bcontent){
		
		try {
			conn = getConnection();
			
			query = "INSERT INTO BOARD VALUES(BOARD_SEQ.nextval, ?, ?, ?, sysdate, BOARD_SEQ.currval, 0, 0, 0, ?)";
			pstmt = conn.prepareStatement(query);

			// input values "?" data
			pstmt.setString(1, "aaa"); // id
			pstmt.setString(2, btitle); // btitle
			pstmt.setString(3, bcontent); // bcontent
			pstmt.setString(4, ""); // bfile
			
//			rs = pstmt.executeQuery(); // select
			int result =  pstmt.executeUpdate(); //insert, update, delete -> success : 1 , fail : 0
			System.out.println("exeuteUpdate 결과 : " + result);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 역순으로 닫아줌
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public ArrayList<Board> listSelectAll(){
		
		try {			
			conn = getConnection();
			
			query = "SELECT * FROM BOARD";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
//			pstmt.executeUpdate(); : insert, update, delete
			
			while(rs.next()) {
				bno = rs.getInt("BNO");
//				System.out.println("bno : " + bno);
				id = rs.getString("ID");
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bdate = rs.getTimestamp("BDATE");
				bgroup = rs.getInt("BGROUP");
				bstep = rs.getInt("BSTEP");
				bindent = rs.getInt("BINDENT");
				bhit = rs.getInt("BHIT");
				bfile = rs.getString("BFILE");
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
				list.add(new Board(bno, id, btitle, bcontent, bdate, bgroup, bstep, bindent, bhit, bfile));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 역순으로 닫아줌
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}

	public Board selectOne(int bno) {
		
		Board board = null;
		
		try {			
			conn = getConnection();
			
			query = "SELECT * FROM BOARD WHERE BNO = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
//			pstmt.executeUpdate(); : insert, update, delete
			
			while(rs.next()) {
				bno = rs.getInt("BNO");
				id = rs.getString("ID");
				btitle = rs.getString("BTITLE");
				bcontent = rs.getString("BCONTENT");
				bdate = rs.getTimestamp("BDATE");
				bgroup = rs.getInt("BGROUP");
				bstep = rs.getInt("BSTEP");
				bindent = rs.getInt("BINDENT");
				bhit = rs.getInt("BHIT");
				bfile = rs.getString("BFILE");
				                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
				board = new Board(bno, id, btitle, bcontent, bdate, bgroup, bstep, bindent, bhit, bfile);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 역순으로 닫아줌
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return board;
	}
	
	public void update(int bno, String btitle, String bcontent, String bfile) {
		
		try {
			conn = getConnection();
			
			query = "UPDATE BOARD SET BTITLE = ?, BCONTENT = ?, BFILE = ? WHERE BNO = ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setString(3, bfile);
			pstmt.setInt(4, bno);
			
//			rs = pstmt.executeQuery(); // select
			int result =  pstmt.executeUpdate(); //insert, update, delete -> success : 1 , fail : 0
			System.out.println("exeuteUpdate 결과 : " + result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 역순으로 닫아줌
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public void deleteOne(int bno) {
		
		try {
			conn = getConnection();
			
			query = "DELETE BOARD WHERE BNO = ?";
			pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, bno);
			
//			rs = pstmt.executeQuery(); // select
			int result =  pstmt.executeUpdate(); //insert, update, delete -> success : 1 , fail : 0
			System.out.println("exeuteUpdate 결과 : " + result);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 역순으로 닫아줌
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	
	// 커넥션 풀에서 connection 객체 가져오기
	public Connection getConnection() {
		
		Connection connection = null;
		
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			connection = ds.getConnection();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}


	
}
