package com.java.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.java.model.vo.User;
import com.java.model.vo.Vote;
import com.java.util.DButil;

public class ContestDAO {
	public void vote1(int usernum) { // 받는 건 유저넘
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update contest " // table명은 공백으로 띄워줘야한다.
				+ "set candidate = 1 " 
//				+ "set sumcnt = ++candidate " 
				+ "where candidate is null " 
				+ "and usernum = ?";
		
		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, usernum);
			rs = stmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(stmt);
			DButil.close(conn);
		}
	}
	
	public void vote2(int usernum) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "update contest " // table명은 공백으로 띄워줘야한다.
				+ "set candidate = 2 " 
				+ "where candidate is null " 
				+ "and usernum = ?";
		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, usernum);
			rs = stmt.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(stmt);
			DButil.close(conn);
		}
	}
	
	public int result1(int usernum) {
		
		int count1 = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select sum(candidate) "
					+ "from contest "
					+ "where candidate=1; "
					+ "and usernum = ? ";
		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, usernum);
			rs = stmt.executeQuery();
			while (rs.next()) {
				count1 = rs.getInt(1);
				System.out.println(count1 + "pleeeeeeeeee");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(stmt);
			DButil.close(conn);
		}
		return count1;
	}

	public int result2(int usernum) {
		int count2 = 0;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select (sum(candidate))/2 "
					+ "from contest "
					+ "where candidate=2; "
					+ "and usernum = ? ";
		try {
			conn = DButil.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, usernum);
			rs = stmt.executeQuery();
			while (rs.next()) {
				count2 = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DButil.close(stmt);
			DButil.close(conn);
		}
		return count2;
		
	}
}
