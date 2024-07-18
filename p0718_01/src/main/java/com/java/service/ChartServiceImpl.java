package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.ChartDao;
import com.java.dto.ChartDto;

@Service
public class ChartServiceImpl implements ChartService {
	
	@Autowired
	ChartDao chartDao;
	
	@Override
	public ArrayList<ChartDto> selectAll(String data) {
		
		ArrayList<ChartDto> list = chartDao.selectAll(data);
		return list;
	}
}
