package com.java.service;

public interface EmailService {
	
	//텍스트 이메일
	void email_send(String name, String email);

	//html 이메일
	void email_send2(String name, String email);

}
