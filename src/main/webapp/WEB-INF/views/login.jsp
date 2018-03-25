<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="application/x-javascript">
	
	
addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } 


</script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"
	type="text/css" media="all">
<link href="<c:url value='/static/css/font-awesome.min.css' />"
	rel="stylesheet" type="text/css" media="all">
<!-- //css files -->
<!-- online-fonts -->
<link
	href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Raleway+Dots'
	rel='stylesheet' type='text/css'>

</head>
<body>
	<!--header-->
	<div class="header-w3l">
		<h1>Login</h1>
	</div>
	<!--//header-->
	<!--main-->
	<div class="main-agileits">
		<h2 class="sub-head">Sign In</h2>
		<div class="sub-main">
			<c:url var="loginUrl" value="/login" />
			<form action="${loginUrl}" method="post">
				<c:if test="${param.error != null}">
					<div class="alert alert-danger">
						<p  style="color: white;">Invalid username or password.</p>
					</div>
				</c:if>
				<c:if test="${param.logout != null}">
					<div class="alert alert-success">
						<p style="color: white;">You have been logged out successfully.</p>
					</div>
				</c:if>
				<input placeholder="User Name" name="username" class="name"
					type="text" required> <span class="icon1"><i
					class="fa fa-user" aria-hidden="true"></i></span><br> <input
					placeholder="Password" name="password" class="pass" type="password"
					required> <span class="icon2"><i
					class="fa fa-unlock" aria-hidden="true"></i></span><br /> <label id="new"
					class="newregister">New User? </label> <a
					href="register" class="newregister">Register</a><br />
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" /> <input type="submit" value="Login"
					id="loginbtn">
			</form>
		</div>
		<div class="clear"></div>
	</div>
	<!--//main-->

	<!--footer-->
	<div class="footer-w3">
		<p></p>
	</div>
	<!--//footer-->

</body>
</html>