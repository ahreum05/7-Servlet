<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  // 1. 데이터 처리 (자바 영역)
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
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {background: <%=color%>;}
li {color: yellow;}
</style>
</head>
<body>
	<ul>
		<li>이름: <%=name %></li>
		<li>성별: <%=gender %></li>
		<li>취미: <%=hobby %></li>
		<li>색깔: <%=color %></li>
		<li>과목: <%=subject %></li>
	</ul>
	<br><br>
	<a href="#" onclick="history.back()">뒤로</a>
</body>
</html>


