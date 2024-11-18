<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <!-- attend_area -->
    <div class="attending_area plus_padding">
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
                                        <div class="form_heading text-center">
                                            <h3>Wedding Planner</h3>
                                        </div>
                                        <form action="WP_Controller" method="post">
                                            <div class="row">
                                                <div class="col-xl-12">
                                                    <input type="text" name="name" placeholder="Your Name">
                                                </div>
                                                 <div class="col-xl-12">
                                                    <input type="text" name="contact" placeholder="Your Contact">
                                                </div>
                                                 <div class="col-xl-12">
                                                    <input type="text" name="address" placeholder="Your Address">
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type="text" name="email" placeholder="Email">
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type="text" name="password" placeholder="Your Password">
                                                </div>
                                               
                                                <div class="col-xl-12">
                                                    <button type="submit" name="action" value="register" class="boxed_btn3">Register</button>
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