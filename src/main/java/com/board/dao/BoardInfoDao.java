package com.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.board.dto.BoardInsertDto;

public interface BoardInfoDao {
	
	public List<Map<String, Object>> getReadBoardInfo();
	
	public int insertBoardInfo(BoardInsertDto req);
	
	 public HashMap<String, Object> getBoardDetail(int bno); 
	
}