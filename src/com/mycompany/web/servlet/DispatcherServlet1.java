package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet1 extends HttpServlet{
	//변수로 선언하면 로컬 변수가 되어 다른 괄호 안에서 사용 할 수 없기 때문에 필드로 선언해줘야 한다.
//	private String x;
//	private String y;
	
	//서블릿 객체가 언제 생성되는지 알아보기 위해 생성자이용
	//결과: 최초로 서비스 요청이 이뤄졌을 때 서블릿객체 생성됨
//	public DispatcherServlet() {
//		System.out.println("DispatcherServlet() run...");
//	}
	//서블릿 객체를 초기화하는 친구는 init(원래 객체처럼 생성자로 하는게 아니야), http서블릿 안에 그렇게 선언이 되어있어
	//왜 생성자에 넣으면 안돼?? 서블릿은 생성자를 일부러 만들지 않아 그냥 기본 생성자를 쓰고 초기화 할 내용이 있다면 init에서 초기화해
	//왜냐면 서블릿은 준비할 것이 너무 많아 거기서 생성자에 초기화까지 해주면 너무 할게 많아지기 때문에 기본 작업하게 하고 우리는 init에서 초기화 하는거야
	//init은 언제 실행돼?? 서블릿 객체가 만들어 질 때 딱 한번! 실행 돼(서블릿은 요청이 올때마다 실행, init는 서블릿 객체가 만들어 질 때 딱 한번!)
	//보통은 서블릿이 실행하기 위해 필요한 조건 이미 다 외부에서 수집해서 가지고 있어 근데 그 외에 사용자가 주고 싶은 것이 있을경우가 있어
	//예를 들어 기본 경로(개발자가 따로 지정할 경우)
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		System.out.println("init(ServletConfig config) run...");
//		//x= config.getInitParameter("x");//매개값(config)을 통해 값(web.xml의 init-param에 주어진 값)을 얻을 수 있어
//		
//		//그냥 코드상에서 x와 y값을 주면은 되는걸 왜 이렇게 굳이 init을 통해줘?
//		//바꿀때마다 서블릿 코드 수정해서 다시 컴파일 해야하니까 xml에서 살짝살짝 바꿔주려고 이렇게 하는거지
////		System.out.println("전달 받은 x 값: " + x);
////		y = config.getInitParameter("y");
////		System.out.println("전달 받은 y 값: " + y);
	//}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DispatcherServlet service run...");
//		int xValue = Integer.parseInt(x);
//		int yValue = Integer.parseInt(y);
//		int result = xValue + yValue;
//		System.out.println("result: " +result);
	}
}
