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

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
<!-- <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.min.js"
	type="text/javascript"></script> -->

<!-- /static/bootstrap/css/bootstrap.min.css' -->


<link href="<c:url value='/static/plugins/morris/morris.css' />"
	rel="stylesheet" type="text/css" />
<link
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css"
	rel="stylesheet" />
<link
	href="<c:url value='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' />"
	rel="stylesheet" type="text/css" />
<!-- <link
	href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css"
	rel="stylesheet" type="text/css" />	 -->

<!-- FontAwesome 4.3.0 -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
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

<!-- jQuery 2.1.3 -->
<!-- <script src="/mlm-erp/static/plugins/jQuery/jQuery-2.1.3.min.js"></script> -->
<!-- jQuery UI 1.11.2 -->

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
<script src="/mlm-erp/static/plugins/daterangepicker/daterangepicker.js"
	type="text/javascript"></script>
<!-- datepicker -->
<script src="/mlm-erp/static/plugins/datepicker/bootstrap-datepicker.js"
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
<!-- <script src="/mlm-erp/static/dist/js/pages/dashboard.js"
	type="text/javascript"></script> -->
<!-- <script src="/mlm-erp/static/dist/js/index.js"></script> -->
<!-- AdminLTE for demo purposes -->
<!-- <script src="/mlm-erp/static/dist/js/demo.js" type="text/javascript"></script> -->
<!-- Morris chart -->

<!-- <script src="/mlm-erp/static/plugins/morris/morris.min.js"
	type="text/javascript"></script>
 -->

<script type="text/javascript">
	$(document).ready(function() {
		$('#tbl_data').DataTable({
			"pagingType" : "full_numbers"
		});
	});
	/* 
	 $(document).ready(function() {
	 $('#tbl_data1').DataTable({
	 "pagingType" : "full_numbers"
	 });
	 }); */
</script>



</head>
<body class="skin-blue">

	<div class="wrapper">


		<%@include file="header.jsp"%>

		<!-- Right side column. Contains the navbar and content of the page -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<h1>Downline Members</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">Dashboard</a></li>
				<li class="active">Downline Members</li>
			</ol>
			</section>

			<!-- Main content -->
			<section class="content">
			<div class="row">
				<div class="col-xs-12">


					<div class="box">
						<div class="box-header">
							<div class="container">
								<h1></h1>
								<hr>
								<div class="row">
									<!-- left column -->

									<%-- <!-- edit form column -->
									<div class="col-md-9 personal-info">
										<form>
											<div class="form-row">
												<div class="form-group col-md-11">
													<label for="membertype">Select Members Type:</label>
													<div class="ui-select">
														<select id="membertype" name=""
															member_type"" class="form-control">
															<option value="">Choose</option>
															<option value="">Direct Members</option>
															<option value="">Downline Members</option>
														</select><br>
														<br>
													</div>
												</div>
											</div>
										</form>
									</div> --%>
								</div>
							</div>
						</div>

						<!-- /.box-header -->
						<div class="box-body">
							<!-- <table id="tbl_data" class="table table-striped table-bordered"
									style="width: 100%"> -->

							<table class="display dataTable no-footer" border="1"
								style="width: 100%;" id="tbl_data" role="grid"
								aria-describedby="tbl_data_info">
								<thead>
									<tr
										style="background-color: #0f2a76; text-align: center; color: white"
										role="row">
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Name: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">Id</th>
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Name: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">First Name</th>
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Position: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">Last Name</th>
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Office: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">Username</th>
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Age: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">Sponsor Id</th>
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Start date: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">Sponsor Name</th>
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Salary: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">Position</th>
										<th class="sorting_desc" tabindex="0" aria-controls="tbl_data"
											rowspan="1" colspan="1"
											aria-label="Salary: activate to sort column ascending"
											style="width: 32px;" aria-sort="descending">Level</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listOfImmediateChilds}" var="item">
										<tr>
											<td>${item.id}</td>
											<td>${item.firstName}</td>
											<td>${item.lastName}</td>
											<td>${item.username}</td>
											<td>${item.sponser_id}</td>
											<td>${item.sponser_name}</td>
											<td>${item.position_left_or_right}</td>
											<td>${item.level_from_root}</td>

										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<!-- /.box-body -->
					</div>
					<!-- /.box -->


				</div>
				<!-- /.col -->
			</div>
			<!-- /.row --> </section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- ./wrapper -->


</body>
</html>