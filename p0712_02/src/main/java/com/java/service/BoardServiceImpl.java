package com.java.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.BoardDao;
import com.java.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	@Override //게시판 가져오기 - 리스트, 검색포함
	public Map<String, Object> selectList(int page, String category, String searchWord) {
		
		//하단 페이지 넘버링
		int countPerPage = 10; // 한 페이지당 게시글 수
		int bottomPerNum = 10; // 하단 넘버링 개수
		int countAll = boardDao.selectCount(category, searchWord); // 게시글 총 개수
		
		System.out.println("service selectlist countAll : " + countAll);
		
		//  [1] [2]........................................[maxPage]
		//  [startPage] [startPage+1].....[endPage-1] [endPage] 총 10개단위(bottomPerNum)
		//  ...
		//  ...
		//  [startPage] [startPage+1].. [maxPage]
		//  [startRow]... [endRow]
		//페이지 계산
		int maxPage = (int) Math.ceil((double)countAll / countPerPage); //최대 페이지 수(소수점 이하는 무조건 올림)
		int startPage = ((page-1) / bottomPerNum) * 10 + 1;
		int endPage = (startPage + bottomPerNum) - 1;
		
		//하단 마지막 페이지 넘버링
		if(endPage > maxPage) endPage = maxPage; // 마지막 페이지가 그 페이지의 최대 표시 페이지 수보다 작으면 마지막 페이지까지만 표시
		
		int startRow = (page - 1) * countPerPage + 1; //시작 페이지 표시
		int endRow = startRow + countPerPage - 1; //마지막 페이지 표시
		
		
		
		//mybatis연결해서 list 가져오기 - 게시글 검색 포함
		ArrayList<BoardDto> list = boardDao.selectList(startRow, endRow, category, searchWord);
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("list", list);
		map.put("countAll", countAll);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		map.put("maxPage", maxPage);
		map.put("page", page);
		map.put("category", category);
		map.put("searchWord", searchWord);
		
		return map;
	}//selectList

	@Override 
	public Map<String, Object> selectOne(BoardDto bdto) { //게시글 한개 가져오기
		boardDao.updateBhit(bdto); //조회수 1증가
		BoardDto boardDto = boardDao.selectOne(bdto);
		BoardDto prevDto = boardDao.selectOnePrev(bdto);
		BoardDto nextDto = boardDao.selectOneNext(bdto);
		
		Map<String, Object> map = new HashMap<>();
		map.put("boardDto", boardDto);
		map.put("prevDto", prevDto);
		map.put("nextDto", nextDto);
		
		return map;
	}

	@Override
	public void insertBoard(BoardDto bdto) {
		boardDao.insertBoard(bdto);
		
	}

	@Override
	public void deleteBoard(BoardDto bdto) {
		boardDao.deleteBoard(bdto);
		
	}

	@Override
	public BoardDto updateBoard(BoardDto bdto) {
		BoardDto boardDto = boardDao.selectOne(bdto);
		return boardDto;
	}

	@Override  //게시글 수정저장
	public void doUpdateBoard(BoardDto bdto) {
		boardDao.updateBoard(bdto);
	}

	@Override //답글페이지 저장
	public void insertReply(BoardDto bdto) {
		boardDao.updateBstep(bdto); // 부모보다 큰 step을 1씩 증가
		boardDao.insertReply(bdto);
		
	}
	
	

}
