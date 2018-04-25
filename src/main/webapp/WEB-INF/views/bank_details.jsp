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
<link href="<c:url value='/static/dist/css/AdminLTE.css' />"
	rel="stylesheet" type="text/css" />
	
	
<link href="<c:url value='/static/dist/css/style.css' />"
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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body class="skin-blue">
	<div class="wrapper">


		<%@include file="header.jsp"%>

		<!-- Right side column. Contains the navbar and content of the page -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>Bank Details</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li><a href="#">Dashboard</a></li>
					<li class="active">Bank Details</li>
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
									<h3>Bank Details</h3>
									<hr>
									<div class="row">
										<!-- left column -->

										<!-- edit form column -->
										<div class="col-md-9 personal-info">
`												<span id="alert"></span>
											<form:form enctype="multipart/form-data" action="save_bankdetails" method="POST"
												modelAttribute="bankDetails">
												<div class="form-row">
													<div class="form-group col-md-6">
														<label for="accountholdername">Account Holder Name<span
															class="required">*</span>:
														</label>
														<form:input type="text" class="form-control"
															id="accountholdername" name="account_holder_name"
															placeholder="Account Holder Name" required="required" path="account_holder_name"/>
													</div>
													<div class="form-group col-md-6">
														<label for="mobileno">Mobile Number<span
															class="required">*</span>:
														</label> <form:input type="text" class="form-control" id="mobilenumber"
															name="mobile_number" placeholder="Mobile Number"
															required="required" path="mobile_number"/>
													</div>

												</div>
												<div class="form-row">
													<div class="form-group col-md-6">
														<label for="accountno">Account No<span
															class="required">*</span>:
														</label> <form:input type="text" class="form-control" id="accountno"
															name="account_number" placeholder="Account No"
															required="required" path="account_number"/>
													</div>
													<div class="form-group col-md-6">
														<label for="bankname">IFSC<span class="required">*</span>:
														</label> <form:input type="text" class="form-control" id="ifsc" onblur="return AllowIFSC();"  MaxLength="11" Width="200" Style='text-transform: uppercase'
															name="ifsc_code" placeholder="IFSC" required="required" path="ifsc_code"/>
													</div>

												</div>
												<div class="form-row">
													<div class="form-group col-md-6">
														<label for="accountno">Bank Name<span
															class="required">*</span>:
														</label><form:input type="text" class="form-control" id="bankname"
															name="bank_name" placeholder="Bank Name"
															required="required" path="bank_name"/>
													</div>
													<div class="form-group col-md-6">
														<label for="bankbranch">Bank Branch<span
															class="required">*</span>:
														</label><form:input type="text" class="form-control" id="bankbranch"
															name="bank_branch" placeholder="Bank Branch"
															required="required" path="bank_branch"/>
													</div>
												</div>
												<div class="form-row">

													<div class="form-group col-md-6">
														<label for="bankaddress">Bank Address<span
															class="required">*</span>:
														</label>
														<form:textarea class="form-control" aria-label="With textarea"
															id="bankaddress" name="bank_address" required="required" path="bank_address" />
													</div>
													<div class="form-row">
														<div class="form-group col-md-6">
															<label for="nomineepan">Canceled Cheque<span
																class="required">*</span>:
															</label> <br>

															<div class="demo-section k-content">

																<form:input name="cancelled_cheque_image" id="cancelledcheque"
																	type="file" required="" path="fileCanceledCheque" accept="image/jpeg, image/png"/>
																<div class="demo-hint">
																	You can only upload <strong>JPG</strong> files of 200 Pixel.
																</div>
															</div>
														</div>

													</div>
												</div>

												<div class="row">
													<!-- left column -->

													<!-- edit form column -->
													<div class="col-md-12 personal-info">
														<h3>Nominee Details</h3>
														<hr>

														<div class="form-row">
															<div class="form-group col-md-6">
																<label for="nomineename">Nominee Name:</label><form:input
																	type="text" class="form-control" id="nomineename"
																	name="nominee_name" placeholder="Nominee Name" path="nominee_name"/>
															</div>
															<div class="form-group col-md-6">
																<label for="relation">Relation:</label><form:input
																	type="text" class="form-control" id="relation"
																	name="nominee_relation" placeholder="Number of Pages" path="nominee_relation"/>
															</div>

														</div>
														<div class="form-row">
															<div class="form-group col-md-6">
																<label for="address">Address:</label><form:input type="text"
																	class="form-control" id="address" name="nominee_address"
																	placeholder="Nominee Address" path="nominee_address"/>
															</div>
															<div class="form-group col-md-6">
																<label for="dob">Date of birth:</label><form:input
																	type="Date" class="form-control" id="dob" name="nominee_dob" path="nominee_dob"/>
															</div>

														</div>
														<div class="form-row">
															<div class="form-group col-md-6">
																<label for="nomineepan">Pan Number:</label><form:input
																	type="text" class="form-control" id="nomineepan"
																	name="nominee_pan" placeholder="Pan Number" path="nominee_pan" MaxLength="10" onblur="ValidatePAN(this);"/> <label
																	for="nomineepanupload">Upload Pan Card:</label>

																<div class="demo-section k-content">

																	<form:input name="nominee_pan_image_path" id="uploadpan"
																		type="file" path="filePancard" />
																	<div class="demo-hint">
																		You can only upload <strong>JPG & PNG</strong> files of 200 Pixel.
																	</div>
																</div>
															</div>

														</div>
														<div class="form-row">
															<div class="form-group col-md-6">
																<label for="nomineeaahare">Aadhar Number:</label><form:input
																	type="text" class="form-control" id="aadhar_no"
																	placeholder="Aadhar Number" name="nominee_aadhar" path="nominee_aadhar"/> <label
																	for="nomineeaahareupload">Upload Aadhar Card:</label>

																<div class="demo-section k-content">

																	<form:input name="nominee_aadhar_image_path"
																		id="aadharfront" type="file" path="fileAadharCardFront"/>
																	<div class="demo-hint">
																		You can only upload <strong>JPG & PNG</strong> files of 200 Pixel.
																	</div>
																</div>
															</div>
														</div>
													</div>
												</div>
												<div class="form-group">

													<div class="buttons col-md-8">
														<br>
														<br> <input type="submit" class="btn btn-primary"
															value="Submit"> <span></span> <input type="reset"
															class="btn btn-default" value="Cancel">
													</div>
												</div>
											</form:form>
										</div>
									</div>
								</div>
								<hr>
								<!-- /.box-header -->
								<!-- form start -->

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
	<script type="text/javascript">
		var _URL = window.URL || window.webkitURL;

		$("#pancardupload")
				.change(
						function(e) {
							var file, img;

							if ((file = this.files[0])) {
								img = new Image();

								img.onload = function() {
									var width_image = this.width;
									var height_image = this.height;
									if (width_image > 100 || height_image > 100) {
										alert("Please upload a valid image of height and width 100 pixels");

									}

								};
								img.onerror = function() {
									alert("not a valid file: " + file.type);
								};
								img.src = _URL.createObjectURL(file);
							}
						});
	</script>
	<script src="/mlm-erp/static/js/validation.js"></script>
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