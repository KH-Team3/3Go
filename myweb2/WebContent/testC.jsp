<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name=request.getParameter("name");
String age=(String)request.getAttribute("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>testC.jsp</h2>
<h3>넘어온 이름:ㅣ<%=name%></h3>
<h3>넘어온 주소:ㅣ<%=age%></h3>
</body>
</html>