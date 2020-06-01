<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resourses/css/Login.css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
      <h3>Enter login details</h3>
    </div>

    <!-- Login Form -->
    <form:form action="AdminDetailsVerification" modelAttribute="adminLogin" method="POST">
      <form:input path="userName" type="text" id="login" class="fadeIn second" name="userName" placeholder="login"/>
      <form:input path="password" type="text" id="password" class="fadeIn third" name="password" placeholder="password"/>
      <input type="submit" class="fadeIn fourth" value="Log In">
    </form:form>>

    <!-- Remind Password -->
    <div id="formFooter">
      <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

  </div>
</div>