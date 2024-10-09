package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloServlet() {
        super();
    }
    // 톰캣 서버가 호출하는 함수
    // => 브라우저의 통신 방식이 get 일 경우
    // request : 요청 정보와 전달된 데이터가 저장된 요청 처리 객체
    // reponse : 응답 처리 객체
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 데이터 처리
		System.out.println("doGet() 호출");
		// 2. HTML 문서 작성
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Hello Servlet!!<br>");
		out.println("안녕하세요 서블릿!!<br>");
		out.println("</body>");
		out.println("</html>");
		
	}
	// 톰캣 서버가 호출하는 함수
    // => 브라우저의 통신 방식이 post 일 경우
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
