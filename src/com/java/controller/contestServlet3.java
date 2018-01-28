package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.model.dao.ContestDAO;
import com.java.model.vo.Contest;
import com.java.model.vo.User;
import com.java.model.vo.Vote;

@WebServlet("/result.do")
public class contestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		User user = (User)session.getAttribute("user");
		int usernum = user.getUsernum();
		
//		User user = (User)session.getAttribute("vote");
//		int usernum = user.getUsernum();
		System.out.println(usernum);
//		ContestDAO contestDao = new ContestDAO(); // DAO는 결과만 줄 뿐
//		Vote vote  = (Vote)session.getAttribute("usernum");
//		ContestDAO contestDao = (ContestDAO)session.getAttribute("vote");
//		Vote vote = (Vote)session.getAttribute("result");
//		int result1 = contestDao.
//		int result1 = vote.result1(usernum);
//		System.out.println(result1 +"dhnjklsafhadsjklfhadhl");
		
//		int result2 = contestDao.result2(usernum);
//		System.out.println(result2);
		
		if (usernum != 0){
			session.setAttribute("user", new User(usernum));
			session.setAttribute("vote", new Vote(usernum));
			response.sendRedirect("result.jsp");
			return;
		}else{
			request.setAttribute("errorMessage1", " 로그인 후 시도해주세요."); //이름과 값을 저장(보관함)
			response.sendRedirect("result.jsp");
			return;
		}

	}

	

}

