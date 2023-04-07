package com.board.daoImpl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.dao.MemberInfoDao;
import com.board.dto.CreateMemberInfoDto;

@Repository
public class MemberInfoDaoImpl implements MemberInfoDao {
	
	@Autowired
	SqlSessionTemplate tpl;
	

	@Override
	public int setCreateMemberInfo(CreateMemberInfoDto req) {
		
		
		
		return tpl.insert("MemberInfoDao.memberInsertInfo", req);
	}
	
	

}
