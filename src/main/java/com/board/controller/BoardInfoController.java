package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.dto.BoardInsertDto;
import com.board.serv.BoardInfoServ;

@Controller
public class BoardInfoController {
	
	@Autowired
	private BoardInfoServ bsi;
	
	@RequestMapping(value="/")
	public String HomePage(Model model) {
		
		return "main";
	}
	

	@RequestMapping(value="/getBoardList")
	public String home(Model model) {
		
		
		
		model.addAttribute("list", bsi.getReadBoardInfo());
		
		
		
		return "board/getBoardList";
	}

	@RequestMapping(value="/setBoardInsert")
	public String insertBoard() {
		return "board/setBoardInsert";
	}
	

	@RequestMapping(value="/insertOk")
	public String insertBoardOk(Model model, BoardInsertDto req) {
		System.out.println("insertBoardOk start");
		bsi.insertBoardInfo(req);

		
		return "redirect:/getBoardList";
	}
	
	
	  @RequestMapping(value= "getBoardDetail")
	  public String getBoardDetail(@RequestParam("SEQ_BOARD")int bno, Model model) {
		  System.out.println("getBoardDetail start");
		  
		  model.addAttribute("boardDto", bsi.getBoardDetail(bno));
	  
	  return "board/getBoardDetail";
	  }
	 
		

}
