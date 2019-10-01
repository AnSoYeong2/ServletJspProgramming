package com.mycompany.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	private String encoding;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("CharatcerEncodingFilter init run...");
		encoding = filterConfig.getInitParameter("encoding");
	}

	//Filter를 구현하고자 하면 당연히 재정의가 필요
	//매개변수 : FleterChain (필터가 여러개이면 주루루룩 앞에서 전처리 할 수 있어 그래서 FilterChain이라는 이름으로 매개변수가 붙는거지)
	//Chain메소드 : 다음필터가 있다면 다음필터를 적용해라 없다면 서블릿으로 가라
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CharacterEncodingFilter doFilter run...");
		//이거 지나면 전처리 된 상태여야 하기 때문에 request에(필터를 지나기 이전에)전처리 해주어야 한다
		
		//전처리
		request.setCharacterEncoding(encoding);
		//서블릿으로 이동
		chain.doFilter(request, response);
		
	}
	
}
