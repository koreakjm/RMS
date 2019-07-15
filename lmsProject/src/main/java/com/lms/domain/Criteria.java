package com.lms.domain;

public class Criteria {
	
	private int page;
	private int perPageNum;
	private int startPage;
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}

	public int getPage() {
		return page;
	}
	
	// method for MyBatis SQL Mapper -
	public int getPageEnd() {
		
		return this.startPage + 9;
	}
	
	// method for MyBatis Sql Mpaaer
	public int getPageStart() {
		
		this.startPage = (this.page * perPageNum) -9;
		
		return this.startPage;
	}

	public void setPage(int page) {
		
		if (page <= 0) {
			this.page = 1;
			return;
		}
		
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", startPage=" + startPage + "]";
	}

	
	
	

}
