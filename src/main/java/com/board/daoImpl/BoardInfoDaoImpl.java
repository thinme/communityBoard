package com.board.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.dao.BoardInfoDao;
import com.board.dto.BoardInsertDto;


@Repository
public class BoardInfoDaoImpl implements BoardInfoDao {
	
	@Autowired
	SqlSessionTemplate tpl;

	@Override
	public List<Map<String, Object>> getReadBoardInfo() {
		System.out.println("*************boardInfoDaoImpl********************");
		
		return tpl.selectList("BoardInfoDao.getReadBoardInfo");
	}

	@Override
	public int insertBoardInfo(BoardInsertDto req) {
		System.out.println("값 확인" + req);
		return tpl.insert("BoardInfoDao.boardInsert", req);
	}

	
	  @Override 
	  public HashMap<String, Object> getBoardDetail(int bno) {
	  System.out.println("*************boardDetailDaoImpl********************");
	  
	  return tpl.selectOne("BoardInfoDao.getBoardDetail", bno); }
	 

}
