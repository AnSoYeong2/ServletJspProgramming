package com.mycompany.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet6 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(" DispatcherServlet6 doGet 실행");
		//받을때는 parameter
		String title= request.getParameter("title"); //title이라는 이름으로 값을 받겠다
		String content= request.getParameter("content"); //content라는 이름으로 값을 받겠다
		//request에 저장하는 이유 이 jsp에서 이 데이터를 사용하려고 하면 jsp에서 바로 데이터를 사용할 방법이 없어
		//jsp는 메소드가 아니야 메소드 자체가 없어 따라서 공유객체(request, response)에 저장해서 서블릿이랑 jsp에서 모두 사용할 수 있게 하는거야
		//그럼 공유객체를 어떻게 넘겨? forward하고 넘겨
		//공유 객체는 요청할때 생기고 응답할때 사라짐
		request.setAttribute("title", title);
		request.setAttribute("content", content);
		
		System.out.println("title: " + title);
		System.out.println("content: " + content);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		
		rd.forward(request, response);
	}
		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("DispatcherServlet6 doPost 실행");
			
			request.setCharacterEncoding("UTF-8");//요청 내용 UTF-8로 인코딩
			
			String title= request.getParameter("title"); //title이라는 이름으로 값을 받겠다
			String content= request.getParameter("content"); //content라는 이름으로 값을 받겠다
			//request에 저장하는 이유 이 jsp에서 이 데이터를 사용하려고 하면 jsp에서 바로 데이터를 사용할 방법이 없어
			//jsp는 메소드가 아니야 메소드 자체가 없어 따라서 공유객체(request, response)에 저장해서 서블릿이랑 jsp에서 모두 사용할 수 있게 하는거야
			//그럼 공유객체를 어떻게 넘겨? forward하고 넘겨
			//공유 객체는 요청할때 생기고 응답할때 사라짐
			request.setAttribute("title", title);
			request.setAttribute("content", content);
			
			System.out.println("title: " + title);
			System.out.println("content: " + content);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
			
			rd.forward(request, response);
		
		
	}
}