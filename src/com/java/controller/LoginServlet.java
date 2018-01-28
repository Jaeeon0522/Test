package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.model.dao.UserDAO;
import com.java.model.vo.User;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//post�� ����
		request.setCharacterEncoding("utf-8");
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		if(userid == null || userid.trim().length() == 0 
				|| password == null || password.trim().length() == 0){
			System.out.println("��ȿ�� �˻� ����");
			
			//request : ��û����, response : ���䳻�� ����
			request.setAttribute("errorMessage", "���̵�� ��й�ȣ�� �������� �ʽ��ϴ�."); //�̸��� ���� ����(������)
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return; //�Ʒ��� �ڵ带 �������� ���� return�ؼ� ȣ���ڷ� ���ư��� �����.
		}
		
		UserDAO userDao = new UserDAO(); //DAO�� ����� �� �� 
		int userNum = userDao.login(userid, password);

		if (userNum != 0){
			//�α��� ����
			HttpSession session = request.getSession();
			//User��ü�� �����ؼ� �־���
			session.setAttribute("user", new User(userNum));
			response.sendRedirect("main.jsp");
			return;
		}else{
			//�α��� ����
			System.out.println("�α��� ����");
			request.setAttribute("errorMessage", " ���̵�� ��й�ȣ�� �ٽ� �Է����ּ���."); //�̸��� ���� ����(������)
			request.getRequestDispatcher("main.jsp").forward(request, response);
			return;
		}
		
		
	
	
	}

}
