<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resourses/css/Login.css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="wrapper">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div >
      <h3>Enter login details</h3>
    </div>

    <!-- Login Form -->
    <form:form action="AdminDetailsVerification" modelAttribute="adminLogin" method="GET">
    	<div class="loginFail" id="loginFail"><c:out value="${loginFail}"/></div>
      <form:input path="userName" type="text" id="login" name="userName" placeholder="Username"/>
      <form:errors path="userName" id="errorMessage" cssClass="text-danger"></form:errors>
      <form:input path="password" type="password" id="password"  name="password" placeholder="password"/>
      <form:errors path="password" id="errorMessage" cssClass="text-danger"></form:errors>
      <input type="submit"  value="Log In">
    </form:form>

    <!-- Remind Password -->


  </div>
</div>