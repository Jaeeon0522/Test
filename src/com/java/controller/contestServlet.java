package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.model.dao.ContestDAO;
import com.java.model.vo.User;

@WebServlet("/count1.do")
public class contestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// post만 가능
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		int usernum = user.getUsernum();
	     
		ContestDAO contestDao = new ContestDAO(); // DAO는 결과만 줄 뿐
		
		System.out.println(usernum + "로그값 찍기");
		contestDao.vote1(usernum);
		
		response.sendRedirect("contest.jsp");
			return;
	}
}

