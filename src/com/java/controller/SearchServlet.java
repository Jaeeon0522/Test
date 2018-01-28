package com.java.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.dao.UserDAO;
import com.java.model.vo.User;

@WebServlet("/search.do")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		
		UserDAO userDao = new UserDAO();
		ArrayList<User> userList= userDao.selectUserByName(name);
		request.setAttribute("userList", userList);
		
		RequestDispatcher rd = request.getRequestDispatcher("user_list.jsp");
		rd.forward(request, response);
		return ;
		
	}

}
