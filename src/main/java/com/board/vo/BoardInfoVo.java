package com.board.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoardInfoVo {
	
	@JsonProperty("SEQ_BOARD")
	private int seqBoard;
	
	@JsonProperty("ID")
	private String id;
	
	@JsonProperty("TITLE")
	private String title;
	
	@JsonProperty("CONTENTS")
	private String contents;

	@JsonProperty("REG_DATE")
	private Date regDate;
	
	@JsonProperty("MOD_DATE")
	private Date modDate;

	public int getSeqBoard() {
		return seqBoard;
	}

	public void setSeqBoard(int seqBoard) {
		this.seqBoard = seqBoard;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getModDate() {
		return modDate;
	}

	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	
	
}
