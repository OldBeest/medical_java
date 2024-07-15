package com.java.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder            //부분생성자
@AllArgsConstructor //전체생성자
@NoArgsConstructor  //기본생성자
@Data 				//getter, setter
public class NoticeDto {
	
	//db에 있는 형태로 변수와 자료형 똑같이 맞춰줌 - number : int, varchar : String, date : Timestamp
	private int bno;
	private String id;
	private String btitle;
	private String bcontent;
	private Timestamp bdate;
	private int bgroup;
	private int bstep;
	private int bindent;
	private int bhit;
	private String bfile;
}
