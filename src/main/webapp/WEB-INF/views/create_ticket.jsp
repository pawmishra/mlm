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
<link rel="stylesheet" href="styles/kendo.common.min.css" />
<link rel="stylesheet" href="styles/kendo.default.min.css" />
<link rel="stylesheet" href="styles/kendo.default.mobile.min.css" />

<script src="js/jquery.min.js"></script>
<script src="js/kendo.all.min.js"></script>

</head>
<body class="skin-blue">
	<div class="wrapper">


		<%@include file="header.jsp"%>

		<!-- Right side column. Contains the navbar and content of the page -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<h1>Create Ticket</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">Dashboard</a></li>
				<li class="active">Create Ticket</li>
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
								<h1>Create Ticket</h1>
								<hr>
								<div class="row">
									<!-- left column -->

									<!-- edit form column -->
									<div class="col-md-9 personal-info">


										<form:form action="saveHDTicket" method="POST"
											modelAttribute="helpDeskTicket">
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="ticketid">Ticket Id</label>
													<form:input type="text" class="form-control" id="ticketid"
														placeholder="Ticket Id" readonly="true" name="ticket_id"
														path="ticket_id" />
												</div>
												<div class="form-group col-md-6">
													<label for="ticketid">Status:</label>
													<form:input type="text" class="form-control" id="status"
														placeholder="Status" readonly="true"
														path="ticket_resolution_status"
														name="ticket_resolution_status" />
												</div>

											</div>
											<div class="form-row">
												<div class="form-group col-md-6">
													<label for="problemtype">Problem Type:</label>
													<div class="ui-select">
														
														<form:select id="problem_type" class="form-control"
															name="problem_type" required="required" path="problem_type">
															<form:option value="" label="--- Select ---" />
															<c:forEach items="${listOfProblemCat}" var="item">
																<option value="${item.hd_category_id}">${item.problem_category}</option>
															</c:forEach>
														</form:select>

													</div>
												</div>
												<div class="form-group col-md-6">
													<label for="ticketid">Problem Description:</label>
													<form:textarea class="form-control"
														aria-label="With textarea" rows="5" name="description"
														path="description" required="required"/>

												</div>

											</div>
											<div class="form-group">
												<div class="buttons col-md-8">
													<br> <input type="submit" class="btn btn-primary"
														value="Create"> <span></span> <input type="reset"
														class="btn btn-default" value="Cancel"> <br>
													<br>
												</div>
											</div>
										</form:form>
									</div>
								</div>

							</div>

						</div>
					</div>
				</div>
			</div>
			<!-- /.box-header -->
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
		if ($('#paperupload').val() != '') {
			$.each($('#paperupload').prop("files"), function(k, v) {
				var filename = v['name'];
				var ext = filename.split('.').pop().toLowerCase();
				if ($.inArray(ext, [ 'pdf' ]) == -1) {
					alert('Please upload only pdf format files.');
					return false;
				}
			});
		}
	</script>
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