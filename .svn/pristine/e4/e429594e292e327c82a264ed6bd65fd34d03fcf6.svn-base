package com.board.servImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.MemberInfoDao;
import com.board.dto.CreateMemberInfoDto;
import com.board.serv.MemberInfoServ;

@Service
public class MemberInfoServImpl implements MemberInfoServ {

	@Autowired
	private MemberInfoDao mido;
	
	@Override
	public String setCreateMemberInfo(CreateMemberInfoDto req) {
		System.out.println("시작" + req);
		String result = "";
		
		try {
			result = Integer.toString(mido.setCreateMemberInfo(req));
			if(result.equals("1")) {
				result = "200";
			}else {
				result = "404";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
