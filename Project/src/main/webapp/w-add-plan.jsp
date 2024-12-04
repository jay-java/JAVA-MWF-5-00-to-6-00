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
											<h3>Are You Attending?</h3>
										</div>

										<form action="PlanController" method="post">
											<div class="row">
												<div class="col-xl-12">
													<input type="hidden" name="id" value="<%=w.getId()%>">
												</div>
												<div class="col-xl-12">
													<select class="form-select wide" name="budget"
														id="default-select">
														<option value="1 Lac - 2 Lac">1 Lac - 2 Lac</option>
														<option value="2 Lac - 3 Lac">2 Lac - 3 Lac</option>
														<option value="3 Lac - 4 Lac">3 Lac - 4 Lac</option>
														<option value="4 Lac - 5 Lac">4 Lac - 5 Lac</option>
														<option value="5 Lac - 10 Lac">5 Lac - 10 Lac</option>
													</select>
												</div>
												<div class="col-xl-12">
													<select class="form-select wide" name="style"
														id="default-select">
														<option value="Standard">Standard</option>
														<option value="delux">Delux</option>
														<option value="superdelux">Super Delux</option>
														<option value="premium">Premium</option>
														<option value="theme">Theme</option>
													</select>
												</div>
												<div class="col-xl-12">
													<input type="text" name="noofguest"
														placeholder="No of Guest">
												</div>
												<div class="col-xl-12">
													<input type="text" name="vanue" placeholder="vanue">
												</div>
												<div class="col-xl-12">
													<input type="text" name="photosvideos"
														placeholder="Photographs And Videos">
												</div>
												<div class="col-xl-12">
													<input type="text" name="noofguestfortransport"
														placeholder="Transportations For No of Guest">
												</div>
												<div class="col-xl-12">
													<button type="submit" name="action" value="add plan"
														class="boxed_btn3">Add Plan</button>
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


