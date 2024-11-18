<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="wp-header.jsp" %>
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
                                                    <input type="hidden" name="id" value="<%=w.getId()%>">
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type="text" name="name" value="<%=w.getName()%>">
                                                </div>
                                                 <div class="col-xl-12">
                                                    <input type="text" name="contact" value="<%=w.getContact()%>">
                                                </div>
                                                 <div class="col-xl-12">
                                                    <input type="text" name="address" value="<%=w.getAddress()%>">
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type="text" name="email" value="<%=w.getEmail()%>">
                                                </div>
                                                <div class="col-xl-12">
                                                    <button type="submit" name="action" value="update" class="boxed_btn3">Update</button>
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