<%@page import="dao.WeddingPlannerDao"%>
<%@page import="model.WeddingPlanner"%>
<%@page import="dao.PlanDao"%>
<%@page import="model.Plans"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="c-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- attend_area -->
	<div class="attending_area">
		<div class="container">
			<div class="row">
				<div class="col-xl-10 offset-xl-1 col-lg-10 offset-lg-1">
					<div class="main_attending_area">
						<div class="flower_1 d-none d-lg-block">
							<img src="img/appointment/flower-top.png" alt="">
						</div>
						<div class="flower_2 d-none d-lg-block">
							<img src="img/appointment/flower-bottom.png" alt="">
						</div>
						<div class="row justify-content-center">
							<div class="col-xl-7 col-lg-8">
								<div class="popup_box ">
									<div class="popup_inner">
										<%
										String msg = (String)request.getAttribute("msg");
										if(msg!=null){
											%>
											<h3><%out.print(msg); %></h3>
											<%
										}
										%>
										<div class="form_heading text-center">
											<h3>Book Wedding</h3>
										</div>
										<%int pid = Integer.parseInt(request.getParameter("pid")); %>
										<%Plans p = PlanDao.getPlanByPId(pid); %>
										<%WeddingPlanner w = WeddingPlannerDao.getSingleWP(p.getWp_id());%>
										<form action="BookingController" method="get">
											<div class="row">
												<div class="col-xl-12">
													<input type="hidden" name="cusid" value="<%=c.getId()%>">
												</div>
												<div class="col-xl-12">
													<input type="hidden" name="pid" value="<%=p.getPid()%>">
												</div>
												<div class="col-xl-12">
													<h4>Wedding Planner name : <%=w.getName() %></h4>
												</div>
												<div class="col-xl-12">
													<h4>Budget : <%=p.getBudget() %></h4>
												</div>
												<div class="col-xl-12">
													<h4>Style : <%=p.getStyle() %></h4>
												</div>
												<div class="col-xl-12">
													<h4>No of Guest : <%=p.getNoofguest() %></h4>
												</div>
												<div class="col-xl-12">
													<h4>Vanue : <%=p.getVanue() %></h4>
												</div>
												<div class="col-xl-12">
													<h4>Photos Videos : <%=p.getPhotosvideos() %></h4>
												</div>
												<div class="col-xl-12">
													<h4>No of Guest Transport : <%=p.getNoofguestfortransport() %></h4>
												</div>
												<!-- <div class="col-xl-12">
													<input type="date" name="date" placeholder="select date">
												</div> -->
												<div class="col-xl-12">
													<button type="submit" name="action" value="booknow"
														class="boxed_btn3">Book</button>
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- / attend_area -->
</body>
</html>