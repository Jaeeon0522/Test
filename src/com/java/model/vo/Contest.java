package com.java.model.vo;

public class Contest {

	private int usernum;
	private int candidate;
	private int sumcnt;
	
	
	
	public Contest(int usernum) {
		super();
		this.usernum = usernum;
	}

	public Contest(int usernum, int candidate, int sumcnt) {
		super();
		this.usernum = usernum;
		this.candidate = candidate;
		this.sumcnt = sumcnt;
	}
	

	public int getUsernum() {
		return usernum;
	}
	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}
	public int getCandidate() {
		return candidate;
	}
	public void setCandidate(int candidate) {
		this.candidate = candidate;
	}
	public int getSumcnt() {
		return sumcnt;
	}
	public void setSumcnt(int sumcnt) {
		this.sumcnt = sumcnt;
	}

	@Override
	public String toString() {
		return "Contest [usernum=" + usernum + ", candidate=" + candidate + ", sumcnt=" + sumcnt + "]";
	}
	
	
	
	
}
