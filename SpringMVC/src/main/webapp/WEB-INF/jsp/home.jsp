<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello user this is home page

	<h2>${num }</h2>
	<h2>${name }</h2>
	<h3>${obj }</h3>

	<h3>${list }</h3>
	<c:forEach items="${list }" var="u">
		<h4>${u.id }</h4>
		<h4>${u.name }</h4>
		<h4>${u.contact }</h4>
	</c:forEach>


	<%-- 	<%
int num = (Integer) request.getAttribute("num");
String name = (String) request.getAttribute("name");
User u = (User) request.getAttribute("obj");
%>
	<h4>
		<%
		out.print(num);
		%>
	</h4>
	<h4>
		<%
		out.print(name);
		%>
	</h4>
	<h4>
		<%
		out.print(u);
		%>
	</h4> --%>
</body>
</html>