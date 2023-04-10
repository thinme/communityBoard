package com.board.dao;

import java.util.List;
import java.util.Map;

import com.board.dto.BoardInsertDto;
import com.board.vo.BoardInfoVo;

public interface BoardInfoDao {
	
	public List<Map<String, Object>> getReadBoardInfo();
	
	public int insertBoardInfo(BoardInsertDto req);
	
	 public BoardInfoVo getBoardDetail(int bno); 
	
}
