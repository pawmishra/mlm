<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<title>Admin</title>
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<!-- Bootstrap 3.3.2 -->
<link href="<c:url value='/static/bootstrap/css/bootstrap.min.css' />"
	rel="stylesheet" type="text/css" />
<!-- FontAwesome 4.3.0 -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!-- Ionicons 2.0.0 -->
<link
	href="http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css"
	rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link href="<c:url value='/static/dist/css/AdminLTE.min.css' />"
	rel="stylesheet" type="text/css" />

<!-- AdminLTE Skins. Choose a skin from the css/skins 
         folder instead of downloading all of them to reduce the load. -->
<link href="<c:url value='/static/dist/css/skins/_all-skins.min.css' />"
	rel="stylesheet" type="text/css" />
<link
	<c:url value='/static/dist/css/skins/style.css' />" rel="stylesheet"
	type="text/css" />
<!-- iCheck -->
<link href="<c:url value='/static/plugins/iCheck/flat/blue.css' />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value='/static/dist/css/style.css' />"
	rel="stylesheet" type="text/css" />
<!-- jvectormap -->
<link
	href="<c:url value='/static/plugins/jvectormap/jquery-jvectormap-1.2.2.css' />"
	rel="stylesheet" type="text/css" />
<!-- Date Picker -->
<link
	href="<c:url value='/static/plugins/datepicker/datepicker3.css' />"
	rel="stylesheet" type="text/css" />
<!-- Daterange picker -->
<link
	href="<c:url value='/static/plugins/daterangepicker/daterangepicker-bs3.css' />"
	rel="stylesheet" type="text/css" />
<!-- bootstrap wysihtml5 - text editor -->
<link
	href="<c:url value='/static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css' />"
	rel="stylesheet" type="text/css" />

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
<!-- Morris chart -->

<link href="<c:url value='/static/plugins/morris/morris.css' />"
	rel="stylesheet" type="text/css" />


</head>
<body class="skin-blue">
	<div class="wrapper">


		<%@include file="header.jsp"%>

		<!-- Right side column. Contains the navbar and content of the page -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<h1>Add New User</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">GENERAL</a></li>
				<li class="active">Add New User</li>
			</ol>
			</section>

			<!-- Main content -->
			<section class="content">
			<div class="row">
				<!-- left column -->
				<div class="col-md-12">
					<!-- general form elements -->
					<div class="box box-primary">
						<div class="box-header">
							<div class="container">
								<h3>Add New User</h3>

								<div class="row">


									<!-- edit form column -->
									<div class="col-md-9 personal-info">

										<hr>
										<form:form class="" action="save_user" method="POST"
											modelAttribute="user">

											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="sponsorid">Sponsor Id<span
														class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="sponsorid"
														readonly="true" name="sponsor_id" placeholder="Sponsor Id"
														path="sponser_id" />
												</div>
												<div class="form-group col-md-6">
													<label for="sponsor_name">Sponsor Name<span
														class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="userid"
														readonly="true" name="sponsor_name"
														placeholder="Sponsor Name" path="sponser_name" />
												</div>

											</div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="name">Fisrt Name<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="name"
														name="first_name" placeholder="Name" required="required"
														path="firstName" />
												</div>
												<div class="form-group col-md-6">
													<label for="name">Last Name<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="name"
														name="last_name" placeholder="Name" required="required"
														path="lastName" />
												</div>

											</div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="dob">Date Of Birth<span
														class="required">*</span>:
													</label>
													<form:input type="date" class="form-control" id="dob"
														name="dob" required="required" path="MemberDetails.dob" />
												</div>
												<div class="form-group col-md-6">
													<label for="email">Email<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="email"
														name="email" placeholder="Email" required="required"
														path="email" />
												</div>
											</div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="position">Position Left Or Right<span
														class="required">*</span>:
													</label>
													<form:select id="id_position_left_or_right" class="form-control" name="state"
															required="true" path="position_left_or_right">
															<option value="">Select</option>
															<option value="Left">Left</option>
															<option value="Right">Right</option>
													</form:select>
												</div>
											</div>
											<div class="row"></div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="gender">Gender<span class="required">*</span>:
													</label><br> <label class="radio-inline"> <form:radiobutton
															path="MemberDetails.gender" value="M" />Male
													</label> <label class="radio-inline"> <form:radiobutton
															path="MemberDetails.gender" value="F" />Female
													</label>
												</div>

												<div class="form-group col-md-6">
													<label for="mobilenumber">Mobile Number<span
														class="required">*</span>:
													</label>
													<form:input type="text" class="form-control"
														id="mobilenumber" name="mobile_number"
														placeholder="Mobile Number" required="required"
														path="MemberDetails.Address.mobile" />

												</div>
											</div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="address">House Number:</label>
													<form:input type="text" class="form-control" id="address"
														name="house_number" placeholder="Address"
														path="MemberDetails.Address.houseNo" />

												</div>
												<div class="form-group col-md-6">
													<label for="address">Street/Locality Name:</label>
													<form:input type="text" class="form-control" id="address"
														required="required" name="street_locality"
														placeholder="Address"
														path="MemberDetails.Address.streetName" />



												</div>
												<div class="form-row"></div>
												<div class="form-group col-md-6">
													<label for="email">City<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="email"
														name="city" placeholder="City" required="required"
														path="MemberDetails.Address.city" />
												</div>
												<div class="form-group col-md-6">
													<label for="state">State<span class="required">*</span>:
													</label>
													<div class="ui-select">
														<form:select id="state" class="form-control" name="state"
															required="required" path="MemberDetails.Address.state">
															<option value="">State</option>
															<option value="ANDAMAN & NICOBAR ISLANDS">ANDAMAN
																& NICOBAR ISLANDS</option>
															<option value="ANDHRA PRADESH">ANDHRA PRADESH</option>
															<option value="ARUNACHAL PRADESH">ARUNACHAL
																PRADESH</option>
															<option value="ASSAM">ASSAM</option>
															<option value="BIHAR">BIHAR</option>
															<option value="CHANDIGARH">CHANDIGARH</option>
															<option value="CHHATTISGARH">CHHATTISGARH</option>
															<option value="DADRA & NAGAR HAVELI">DADRA &
																NAGAR HAVELI</option>
															<option value="DAMAN & DIU">DAMAN & DIU</option>
															<option value="DELHI">DELHI</option>
															<option value="GOA">GOA</option>
															<option value="GUJARAT">GUJARAT</option>
															<option value="HARYANA">HARYANA</option>
															<option value="HIMACHAL PRADESH">HIMACHAL
																PRADESH</option>
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

														</form:select>
													</div>
												</div>


											</div>
											<br>

											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="country">Country<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="country"
														name="country" required="required" placeholder="Country"
														path="MemberDetails.Address.country" />
												</div>
												<div class="form-group col-md-6">
													<label for="pincode">Pincode<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="pincode"
														name="pincode" required="required" placeholder="Country"
														path="MemberDetails.Address.pincode" />
												</div>

											</div>
											<%-- <div class="form-row">
												<div class="form-group col-md-6">
													<label for="epin">E-pin<span class="required">*</span>:
													</label> <input type="text" class="form-control" id="epin"
														name="epin" placeholder="Country">
												</div>

											</div>
											<div class="form-row">

												<div class="form-group col-md-6">
													<label for="pincode">Username<span class="required">*</span>:
													</label> 
													<form:input type="text" class="form-control" id="pincode"
														name="username" required="required" placeholder="Country"
														path="username"/>
												</div>
												<div class="form-group col-md-6">
													<label for="epin">Password<span class="required">*</span>:
													</label> 
													<form:input type="password" class="form-control" id="epin"
														name="password" required="required" placeholder="Country"
														path="password"/>
												</div>
											</div> --%>

											<div class="buttons col-md-8">
												<br> <br> <input type="submit"
													class="btn btn-primary" value="Submit"> <span></span>
												<input type="reset" class="btn btn-default" value="Cancel">
											</div>

										</form:form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /.box -->
				<br> <br> <br>
			</div>
			<!--/.col (left) -->
		</div>
		<!-- /.row -->
		</section>
		<!-- /.content -->
	</div>
	<!-- /.content-wrapper -->

	</div>
	<!-- ./wrapper -->


	<!-- jQuery 2.1.3 -->
	<script src="/mlm-erp/static/plugins/jQuery/jQuery-2.1.3.min.js"></script>
	<!-- jQuery UI 1.11.2 -->
	<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.min.js"
		type="text/javascript"></script>
	<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
	<script>
		$.widget.bridge('uibutton', $.ui.button);
	</script>
	<!-- Bootstrap 3.3.2 JS -->
	<script src="/mlm-erp/static/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<!-- Morris.js charts -->
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
	<!-- Sparkline -->
	<script src="/mlm-erp/static/plugins/sparkline/jquery.sparkline.min.js"
		type="text/javascript"></script>
	<!-- jvectormap -->
	<script
		src="/mlm-erp/static/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"
		type="text/javascript"></script>
	<script
		src="/mlm-erp/static/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"
		type="text/javascript"></script>
	<!-- jQuery Knob Chart -->
	<script src="/mlm-erp/static/plugins/knob/jquery.knob.js"
		type="text/javascript"></script>
	<!-- daterangepicker -->
	<script
		src="/mlm-erp/static/plugins/daterangepicker/daterangepicker.js"
		type="text/javascript"></script>
	<!-- datepicker -->
	<script
		src="/mlm-erp/static/plugins/datepicker/bootstrap-datepicker.js"
		type="text/javascript"></script>
	<!-- Bootstrap WYSIHTML5 -->
	<script
		src="/mlm-erp/static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"
		type="text/javascript"></script>
	<!-- iCheck -->
	<script src="/mlm-erp/static/plugins/iCheck/icheck.min.js"
		type="text/javascript"></script>
	<!-- Slimscroll -->
	<script
		src="/mlm-erp/static/plugins/slimScroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<!-- FastClick -->
	<script src='/mlm-erp/static/plugins/fastclick/fastclick.min.js'></script>
	<!-- AdminLTE App -->
	<script src="/mlm-erp/static/dist/js/app.min.js" type="text/javascript"></script>

	<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
	<script src="/mlm-erp/static/dist/js/pages/dashboard.js"
		type="text/javascript"></script>
	<script src="/mlm-erp/static/dist/js/index.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="/mlm-erp/static/dist/js/demo.js" type="text/javascript"></script>
	<script src="/mlm-erp/static/plugins/morris/morris.min.js"
		type="text/javascript"></script>
</body>
</html>