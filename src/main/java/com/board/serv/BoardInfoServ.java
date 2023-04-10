package com.board.serv;

import java.util.List;
import java.util.Map;

import com.board.dto.BoardInsertDto;



public interface BoardInfoServ {

	//게시글목록
	public List<Map<String, Object>> getReadBoardInfo();
	
	//게시글등록
	public String insertBoardInfo(BoardInsertDto req);

	
	//게시글 총 갯수
	/* public int getBoardListCnt(HashMap<String, Object> reqMap) */;
	
	//게시글상세보기
	 public com.board.vo.BoardInfoVo getBoardDetail(int bno); 
	

}
