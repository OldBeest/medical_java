package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.java.dao.BoardDao;
import com.java.dto.BoardDto;

@Service //IOC 컨테이너에 등록 - 사용할 때마다 객체를 등록히지 않고 미리 객체를 생성함. -> autowired로 해당 객체를 찾음
@Qualifier(value="ver1")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDao boardDao;
	
	@Override
	public void selectCount() {
		System.out.println("BoardServiceImpl Ver.1이 실행됩니다.");
	}
	
	@Override
	public ArrayList<BoardDto> selectList() {
		
		ArrayList<BoardDto> list = boardDao.selectList();
		System.out.println("service list : " + list.size());
		
		return list;
	}
}
