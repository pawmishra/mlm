<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link href="<c:url value='/static/css/style.css' />" rel="stylesheet" type="text/css" media="all">
<link href="<c:url value='/static/css/font-awesome.min.css' />" rel="stylesheet" type="text/css" media="all">
<!-- //css files -->
<!-- online-fonts -->
<link href='//fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'><link href='//fonts.googleapis.com/css?family=Raleway+Dots' rel='stylesheet' type='text/css'>

</head>
<body>
<!--header-->
	<div class="header-w3l">
		<h1>Registration</h1>
	</div>
<!--//header-->
<!--main-->
<div class="main-agileits">
	<h2 class="sub-head">Sign Up</h2>
		<div class="sub-main">	
			<form action="#" method="post">
				<input placeholder="Sponsor's ID" name="s_id" class="name" type="text" required=""><br>
					
				<input placeholder="Sponsor's Name" name="s_name" class="name2" type="text" required=""><br>
					
				<input placeholder="Name" name="s_name" class="name2" type="text" required=""><br>
					
				<input placeholder="Email" name="mail" class="mail" type="text" required=""><br>
					
				<select class="select" required="" name="gender">
						<option>Gender</option>
						<option>Male</option>
						<option>Female</option>
				</select>
				<br>
				<input placeholder="Mobile" name="mobile" class="number" type="text" required=""><br>
				<input placeholder="Address" name="address" class="name2" type="text" required=""><br>
				<input placeholder="City" name="city" class="name2" type="text" required=""><br>
				<input placeholder="District" name="district" class="name2" type="text" required=""><br>
				<select class="select" required="" name="state">
						<option value="">State</option>
													  <option value="ANDAMAN & NICOBAR ISLANDS">ANDAMAN & NICOBAR ISLANDS</option>
													  <option value="ANDHRA PRADESH">ANDHRA PRADESH</option>
													  <option value="ARUNACHAL PRADESH">ARUNACHAL PRADESH</option>
													  <option value="ASSAM">ASSAM</option>
													  <option value="BIHAR">BIHAR</option>
													  <option value="CHANDIGARH">CHANDIGARH</option>
													  <option value="CHHATTISGARH">CHHATTISGARH</option>
													  <option value="DADRA & NAGAR HAVELI">DADRA & NAGAR HAVELI</option>
													  <option value="DAMAN & DIU">DAMAN & DIU</option>
													  <option value="DELHI">DELHI</option>
													  <option value="GOA">GOA</option>
													  <option value="GUJARAT">GUJARAT</option>
													  <option value="HARYANA">HARYANA</option>
													  <option value="HIMACHAL PRADESH">HIMACHAL PRADESH</option>
													  <option value="JAMMU & KASHMIR">JAMMU & KASHMIR</option>
													  <option value="JHARKHAND">JHARKHAND</option>
													  <option value="KARNATAKA">KARNATAKA</option>
													  <option value="KERALA">KERALA</option>
													  <option value="LAKSHADWEEP">LAKSHADWEEP</option>
													  <option value="MADHYA PRADESH">MADHYA PRADESH</option>
													  <option value="MAHARASHTRA">MAHARASHTRA</option>
													  <option value="MANIPUR">MANIPUR</option>
													  <option value="MEGHALAYA">MEGHALAYA</option>
													  <option value="MIZORAM">MIZORAM</option>
													  <option value="NAGALAND">NAGALAND</option>
													  <option value="ORISSA">ORISSA</option>
													  <option value="PONDICHERRY">PONDICHERRY</option>
													  <option value="PUNJAB">PUNJAB</option>
													  <option value="RAJASTHAN">RAJASTHAN</option>
													  <option value="SIKKIM">SIKKIM</option>
													  <option value="TAMIL NADU">TAMIL NADU</option>
													  <option value="TELANGANA">TELANGANA</option>
													  <option value="TRIPURA">TRIPURA</option>
													  <option value="UTTAR PRADESH">UTTAR PRADESH</option>
													  <option value="UTTARAKHAND">UTTARAKHAND</option>
													  <option value="WEST BENGAL">WEST BENGAL</option>  
						
					</select><br>
				<input placeholder="Country" name="country" class="name2" type="text" required="" value="India"><br>
				<input placeholder="Postal / Zip Code" name="p_code" class="name2" type="text" required=""><br>
				<input placeholder="Epin" name="epin" class="name2" type="text" required=""><br>
				<a href="login" class="newregister">Login</a><br>
				<input type="submit" value="Register" id="loginbtn">
			</form>
		</div>
		<div class="clear"></div>
</div>
<!--//main-->

<!--footer-->
<div class="footer-w3">
	<p></a></p>
</div>
<!--//footer-->

</body>
</html>