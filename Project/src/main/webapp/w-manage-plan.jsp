<%@page import="dao.PlanDao"%>
<%@page import="model.Plans"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="wp-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Budget</th>
				<th scope="col">Style</th>
				<th scope="col">No of Guest</th>
				<th scope="col">Vanue</th>
				<th scope="col">Photo Videos</th>
				<th scope="col">No Of Guest Transport</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
		<%List<Plans> list = PlanDao.getPlanByWPId(w.getId()); %>
		<%for(Plans p:list){ %>
			<tr>
				<th scope="row"><%=p.getBudget() %></th>
				<td><%=p.getStyle() %></td>
				<td><%=p.getNoofguest() %></td>
				<td><%=p.getVanue() %></td>
				<td><%=p.getPhotosvideos() %></td>
				<td><%=p.getNoofguestfortransport() %></td>
				<td><a href="#">Edit</a></td>
				<td><a href="#">Delete</a></td>
			</tr>
		<%} %>
		</tbody>
	</table>
</div>
</body>
</html>