<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<h1>Hello, world!</h1>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Contact</th>
					<th scope="col">Address</th>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list }" var="u">
				<tr>
					<th scope="row">${u.id }</th>
					<td>${u.name }</td>
					<td>${u.contact }</td>
					<td>${u.address }</td>
					<td><a href="edit/${u.id }">Edit</a></td>
					<td><a href="delete/${u.id }">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	<div>
		<h1><a href="register">register</a></h1>
	</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>


</body>
</html>





<%-- 

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


		<%
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
	</h4>
</body>
</html> --%>