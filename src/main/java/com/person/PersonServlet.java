package com.person;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PersonServlet() {
        super();
    }
    // request : 요청 정보와 전달된 데이터가 저장된 요청 처리 객체
    // reponse : 응답 처리 객체
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) throws ServletException, IOException {
		// 1. 데이터 처리하기
		String name = request.getParameter("name");
	    String gender = request.getParameter("gender") + "자";
	    String[] hobby_list = request.getParameterValues("hobby");
	    String color = request.getParameter("color");
	    String[] subject_list = request.getParameterValues("subject");

	    String hobby = "";
	    for(int i=0; i<hobby_list.length; i++) {
	        hobby += hobby_list[i] + " ";
	    }
	    
	    String subject = "";
	    for(int i=0; i<subject_list.length; i++) {
	        subject += subject_list[i] + " ";
	    }      

		// 2. html 문서 작성하기
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter(); 
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<style>");
	    out.println("body {background:" + color + ";}");
	    out.println("li {color: yellow;}");
	    out.println("</style>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<ul>");
	    out.println("<li>이름: " + name + "</li>");
	    out.println("<li>성별: " + gender + "</li>");
	    out.println("<li>취미: " + hobby + "</li>");
	    out.println("<li>색깔: " + color + "</li>");
	    out.println("<li>과목: " + subject + "</li>");
	    out.println("</ul>");
	    out.println("<br><br>");
	    out.println("<a href='#' onclick='history.back()'>뒤로</a>");
	    out.println("</body>");
	    out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
