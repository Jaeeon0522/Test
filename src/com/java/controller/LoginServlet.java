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
		
		//post만 가능
		request.setCharacterEncoding("utf-8");
		
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		if(userid == null || userid.trim().length() == 0 
				|| password == null || password.trim().length() == 0){
			System.out.println("유효성 검사 실패");
			
			//request : 요청내용, response : 응답내용 보냄
			request.setAttribute("errorMessage", "아이디와 비밀번호가 존재하지 않습니다."); //이름과 값을 저장(보관함)
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return; //아래의 코드를 실행하지 말고 return해서 호출자로 돌아가게 만든다.
		}
		
		UserDAO userDao = new UserDAO(); //DAO는 결과만 줄 뿐 
		int userNum = userDao.login(userid, password);

		if (userNum != 0){
			//로그인 성공
			HttpSession session = request.getSession();
			//User객체로 포장해서 넣어줌
			session.setAttribute("user", new User(userNum));
			response.sendRedirect("main.jsp");
			return;
		}else{
			//로그인 실패
			System.out.println("로그인 실패");
			request.setAttribute("errorMessage", " 아이디와 비밀번호를 다시 입력해주세요."); //이름과 값을 저장(보관함)
			request.getRequestDispatcher("main.jsp").forward(request, response);
			return;
		}
		
		
	
	
	}

}
