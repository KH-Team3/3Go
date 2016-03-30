<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("age", "서울");
/* response.sendRedirect("testC.jsp"); */
/*  */
%>
<jsp:forward page="testC.jsp"></jsp:forward>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>testB.jsp</h2>

</body>
</html>