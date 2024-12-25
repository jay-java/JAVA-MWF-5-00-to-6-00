<%@page import="model.Customer"%>
<%@page import="dao.CustomerDao"%>
<%@page import="dao.PlanDao"%>
<%@page import="model.Plans"%>
<%@page import="dao.BookingDao"%>
<%@page import="model.Booking"%>
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
	<%
	List<Plans> plan_list = PlanDao.getPlanByWPId(w.getId());
	%>
	<%
	for (Plans p : plan_list) {
	%>
	<%
	List<Booking> list = BookingDao.getPendingBookingByWeddingPlannerId(p.getPid());
	%>
	
	<div class="container">
		<div class="row">
		<%for(Booking b: list){ %>
			<%Customer c  = CustomerDao.getCustomerByid(b.getCus_id()); %>
			<div class="card" style="width: 18rem;">
				<div class="card-header"><%=c.getName()%></div>
				<ul class="list-group list-group-flush">
					<li class="list-group-item">Contact : <%=c.getContact()%></li>
					<li class="list-group-item">Address : <%=c.getAddress()%></li>
					<li class="list-group-item">Email id : <%=c.getEmail()%></li>
				</ul>
				<div class="text-center">
					<a
						href="BookingController?action=confirm&bid=<%=b.getBid()%>">Confirm</a>
				</div>
				<br>
				<div class="text-center">
					<a
						href="#">Reject</a>
				</div>
				<br>
				<br>
			</div>
			<%} %>
		</div>


	</div>
	<%
	}
	%>
</body>
</html>