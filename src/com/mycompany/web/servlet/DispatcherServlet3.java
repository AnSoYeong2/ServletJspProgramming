package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet3 extends HttpServlet {

	//항상 service는 실행이 된다. 재정의 하지 않으면 HttpServlet의 service가 실행됨
	//HttpServlet의 service는 Get과 Post를 상황에 따라 호출함
	//service 재정의 : DispatcherServlet3의 service를 사용하게 돼 그러면 doGet과 doPost를 호출하지 못해 재정의된 service만 실행하고 끝
	//Get방식과 Post방식 요청에 따른 처리를 따로 할거면 doGet과 doPost를 재정의
	//Get이든 Post든 상관없이 똑같이 처리할거면 service만 재정의
	
	//재정의는 셋 다 하는 경우는 없음 재정의 하는 방식은 4가지
	//1) service만
	//2)doGet만
	//3)doPost만
	//4)doGet doPost만
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("DispatcherServlet3 service run...");
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet3 doGet run...");
	}
	
	@Override	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet3 doPost run...");
	}
}
