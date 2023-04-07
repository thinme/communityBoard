package com.board.dto;

import java.sql.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class BoardInfoDto {
	
	@JsonProperty("SEQ_BOARD")
	private int seqBoard;
	
	@JsonProperty("ID")
	private String id;
	
	@JsonProperty("TITLE")
	private String title;
	
	@JsonProperty("CONTENTS")
	private String contents;
	
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

	public BoardInfoDto(int seqBoard, String id, String title, String contents, Date regDate, Date modDate) {
		super();
		this.seqBoard = seqBoard;
		this.id = id;
		this.title = title;
		this.contents = contents;

	}
	
}
