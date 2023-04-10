package com.board.servImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardInfoDao;
import com.board.dto.BoardInfoDto;
import com.board.dto.BoardInsertDto;
import com.board.serv.BoardInfoServ;
import com.board.vo.BoardInfoVo;



@Service
public class BoardInfoServImpl implements BoardInfoServ {

	@Autowired
	private BoardInfoDao bdo;

	@Override
	public List<Map<String, Object>> getReadBoardInfo() {
		System.out.println("************boardServImpl***********");
		/*
		 * HashMap<String, Object> reqMap = new HashMap<String, Object>();
		 * 
		 * Paging paging = new Paging(); paging.setCri(cri); reqMap.put("cri", cri);
		 * System.out.println("paging" + paging);
		 */
		
		List<Map<String, Object>> list = bdo.getReadBoardInfo();
		
		/*
		 * model.addAttribute("list", list); model.addAttribute("paging", paging);
		 */
		
		return list;
	}

	/*
	 * @Override public int getBoardListCnt(HashMap<String, Object> reqMap) { int
	 * totalCnt = bdo.getBoardListCnt(reqMap);
	 * 
	 * Paging paging = new Paging(); paging.setTotalCount(totalCnt);
	 * System.out.println("total" + totalCnt);
	 * 
	 * return totalCnt; }
	 */


	// insert
	@Override
	public String insertBoardInfo(BoardInsertDto req) {
		int count = 0;
		count = bdo.insertBoardInfo(req);
		
		System.out.println(count);
		String result= "";
		try {
			if (count == 1) {
				result = "Y";
				System.out.println("성공(Y)");
			}else {
				result = "N";
			}
		} catch (Exception e) {
			System.out.println("에러 메세지" + e);
		}
		
		return result;
		
	}

	
	  @Override
	  public BoardInfoVo getBoardDetail(int bno) {
	  System.out.println("************boardDetailServImpl***********");
	  
	  BoardInfoVo bif = bdo.getBoardDetail(bno);
	  
	  return bif;
	  }
	 
}
