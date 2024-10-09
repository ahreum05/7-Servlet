package com.param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ParamServlet() {
        super();
    }
    // request : 요청 정보와 전달된 데이터가 저장된 요청 처리 객체
    // reponse : 응답 처리 객체
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 데이터 처리
		String name = request.getParameter("name");
		String age_str = request.getParameter("age");
		int age = Integer.parseInt(age_str);
		
		String result = name + "님의 나이는 " + age + "살이므로, ";
		if(age >= 20) result += "성인입니다.";
		else result += "청소년 입니다.";
		
		// 2. html 문서 작성
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println(result);
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
