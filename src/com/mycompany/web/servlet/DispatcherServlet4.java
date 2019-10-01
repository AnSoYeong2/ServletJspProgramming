package com.mycompany.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet4 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* how1
		//헤드에 실려 넘어감
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//바디에 실려 넘어감
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h4>DispatcherServlet4</h4>");
		out.println("		응답 내용");	
		out.println("	</body>");
		out.println("</html>");
		*/
		
		//how2
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher4.jsp");
		
		rd.forward(request, response);
	}

}
