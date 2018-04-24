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
			<h1>edit profile</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">GENERAL</a></li>
				<li class="active">edit profile</li>
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
								<h3>Edit Profile of Member</h3>
								<hr>
								<div class="row">
									<!-- left column -->

									<!-- edit form column -->
									<div class="col-md-12 personal-info">



										<%-- <form class="" role="form">
											<div class="row">
												<div class="form-group">
													<label class="col-lg-3 control-label">Search by
														Member ID:</label>
													<div class="col-lg-4">
														<input class="form-control" type="text">
													</div>
													<div class="col-md-2">
														<input type="button" class="btn btn-primary"
															value="Show Details" onclick="">
													</div>
												</div>

											</div>
										</form>
										<form class="form-horizontal" role="form">
											<div class="form-group">
												<label class="col-lg-3 control-label">Search by
													Member Name:</label>
												<div class="col-lg-4">
													<input class="form-control" type="text">
												</div>
												<div class="col-md-2">
													<input type="button" class="btn btn-primary"
														value="Show Details">
												</div>
											</div>

										</form>
									</div>

									<div class="col-md-9">
										<div class="text-center">
											<img src="//placehold.it/100" class="avatar img-circle"
												alt="avatar">
											<h6>Upload a different photo...</h6>

											<input type="file" class="form-control">
										</div>
									</div> --%>

									<!-- edit form column -->
									<div class="col-md-9 personal-info">
										<!-- <div class="alert alert-info alert-dismissable">
											<a class="panel-close close" data-dismiss="alert">×</a> <i
												class="fa fa-coffee"></i> This is an <strong>.alert</strong>.
											Use this to show important messages to the user.
										</div> 
										<h3>Personal information</h3>
										<hr>--> 
										<form:form class="" enctype="multipart/form-data"
											action="update_user" method="POST" modelAttribute="user">

											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="sponsorid">Sponsor Id:</label>
													<form:input type="text" class="form-control" id="sponsorid"
														readonly="true" name="sponsor_id" placeholder="Sponsor Id"
														path="sponser_id" />
												</div>
												<div class="form-group col-md-6">
													<label for="sponsorid">Sponsor Name:</label>
													<form:input type="text" class="form-control" id="sponsorid"
														readonly="true" name="sponsor_name"
														placeholder="Sponsor Id" path="sponser_name" />
												</div>
											</div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="userid">User Id:</label>
													<form:input type="text" class="form-control" id="userid"
														readonly="true" name="user_id" placeholder="User Id"
														path="id" />
												</div>
												<div class="form-group col-md-6">
													<label for="name">First Name<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="name"
														name="first_name" placeholder="Name" required="required"
														path="firstName" />
												</div>
											</div>

											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="name">Last Name<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="name"
														name="last_name" placeholder="Name" required="required"
														path="lastName" />
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
													<label for="mobilenumber">Alternate Mobile Number:</label>
													<form:input type="text" class="form-control"
														id="mobilenumber" name="alternate_mobile_number"
														placeholder="Mobile Number"
														path="MemberDetails.Address.altContactNo" />
												</div>
												<div class="form-group col-md-6">
													<label for="dob">Date Of Birth<span
														class="required">*</span>:
													</label>
													<form:input type="date" class="form-control" id="dob"
														name="dob" required="required" path="MemberDetails.dob" />
												</div>
											</div>
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
													<label for="email">Email<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="email"
														name="email" placeholder="Email" required="required"
														path="email" />
												</div>
											</div>
											<br>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="panno">Pan Number<span class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="panno"
														name="pan_no" placeholder="Pan Number" required="required"
														path="MemberDetails.pan_number" />

													<label for="pancardupload">Upload Pan Card:</label>
													<div class="demo-section k-content">
														<form:input name="pancard" id="pancardupload" type="file"
															required="" path="MemberDetails.filePanCard" />
														<div class="demo-hint">
															You can only upload <strong>JPG</strong> files.
														</div>
													</div>
												</div>
											</div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="aadharno">Aadhar Number<span
														class="required">*</span>:
													</label>
													<form:input type="text" class="form-control" id="aadharno"
														name="aadhar_no" placeholder="Aadhar Number"
														required="required" path="MemberDetails.aadhar_number" />
													<div class="form-row">
														<label for="aadharnoupload">Upload front:</label>
														<div class="demo-section k-content">
															<form:input name="aadharcard" id="aadharnoupload"
																type="file" accept=".png, .jpg," required=""
																path="MemberDetails.fileAadharCardFront" />
															<div class="demo-hint">
																You can only upload <strong>JPG</strong> files.
															</div>
														</div>
														<label for="aadharnoupload">Upload back:</label>
														<div class="demo-section k-content">
															<form:input name="aadharcard" id="aadharnoupload"
																type="file" accept=".png, .jpg," required=""
																path="MemberDetails.fileAadharCardBack" />
															<div class="demo-hint">
																You can only upload <strong>JPG</strong> files.
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="col-md-12 personal-info">
												<h3>Address information</h3>
												<hr>
												<div class="form-row">

													<div class="form-group col-md-6">
														<label for="housenumber">House Number<span
															class="required">*</span>:
														</label>
														<form:input type="text" class="form-control"
															id="housenumber" name="house_number"
															placeholder="House Number" required="required"
															path="MemberDetails.Address.houseNo" />
													</div>
													<div class="form-group col-md-6">
														<label for="streetname">Street/Locality Name<span
															class="required">*</span>:
														</label>
														<form:input type="text" class="form-control"
															id="streetname" name="street_locality"
															placeholder="Street Name" required="required"
															path="MemberDetails.Address.streetName" />
													</div>
												</div>
												<div class="form-group">
													<div class="form-row">

														<div class="form-group col-md-6">
															<label for="city">City<span class="required">*</span>:
															</label>
															<form:input type="text" class="form-control" id="city"
																name="city" placeholder="City" required="required"
																path="MemberDetails.Address.city" />
														</div>
													</div>
													<div class="form-row">

														<div class="form-group col-md-6">
															<label for="state">State<span class="required">*</span>:
															</label>
															<div class="ui-select">
																<form:select id="state" name="state"
																	class="form-control" required="required"
																	path="MemberDetails.Address.state">
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
																	<option value="JAMMU & KASHMIR">JAMMU &
																		KASHMIR</option>
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
														<div class="form-group col-md-6">
															<label for="country">Country<span
																class="required">*</span>:
															</label>
															<form:input type="text" class="form-control" id="country"
																name="country" placeholder="Pincode" required="required"
																path="MemberDetails.Address.country" />
														</div>
													</div>
													<div class="form-row">
														<div class="form-group col-md-6">
															<label for="pincode">Pincode<span
																class="required">*</span>:
															</label>
															<form:input type="text" class="form-control" id="pincode"
																name="pincode" placeholder="Pincode" required="required"
																path="MemberDetails.Address.pincode" />
														</div>

													</div>
												</div>
												<div class="buttons col-md-8">
													<br> <br> <input type="submit"
														class="btn btn-primary" value="Submit"> <span></span>
													<input type="reset" class="btn btn-default" value="Cancel">
												</div>
											</div>
										</form:form>
									</div>
								</div>
							</div>
							<hr>
						</div>
					</div>
				</div>
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