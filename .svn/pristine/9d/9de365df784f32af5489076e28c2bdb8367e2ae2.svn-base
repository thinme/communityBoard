package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.dto.CreateMemberInfoDto;
import com.board.serv.MemberInfoServ;

@Controller
public class MemberInfoController {
	
	
	@Autowired
	MemberInfoServ msi;
	
	@RequestMapping("/member")
	public String home() {
		return "member/setMemberInsert";
	}
	
	@ResponseBody
    @PostMapping("/setCreateMemberInfo")
	public String setCreateMemberInfo(CreateMemberInfoDto req) {

		
		return msi.setCreateMemberInfo(req);
	}

}
