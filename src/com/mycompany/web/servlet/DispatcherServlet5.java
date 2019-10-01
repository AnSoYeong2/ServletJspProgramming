package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet5 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//받을때는 parameter
		String name= request.getParameter("name"); //name이라는 이름으로 값을 받겠다
		String age= request.getParameter("age"); //age라는 이름으로 값을 받겠다
		int intAge = Integer.parseInt(age);
		
		
		request.setAttribute("name", name);
		request.setAttribute("age", intAge);
		
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher5.jsp");
		
		rd.forward(request, response);
	}

}
