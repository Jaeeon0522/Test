package com.java.model.vo;

public class Vote {

	private int usernum;
	private int candidate;
	private int counting;
	
	public Vote(int usernum, int candidate) {
		super();
		this.usernum = usernum;
		this.candidate = candidate;
	}
	
	public Vote(int usernum) {
		super();
		this.usernum = usernum;
	}

	public Vote() {
		super();
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
	public int getCounting() {
		return counting;
	}
	public void setCounting(int counting) {
		this.counting = counting;
	}
	@Override
	public String toString() {
		return "Vote [usernum=" + usernum + ", candidate=" + candidate + ", counting=" + counting + "]";
	}
	
	
	
}
