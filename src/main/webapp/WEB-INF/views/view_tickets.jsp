<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
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

<!-- jQuery 2.1.3 -->
<!-- <script src="/mlm-erp/static/plugins/jQuery/jQuery-2.1.3.min.js"></script> -->
<!-- jQuery UI 1.11.2 -->

<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->

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
<style>

*{margin:0px; padding:0px; font-family:Helvetica, Arial, sans-serif;}



/* Center the image and position the close button */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}
.avatar {
    width: 200px;
	height:200px;
    border-radius: 50%;
}

/* The Modal (background) */
.modal {
	display:none;
    position: fixed;
    z-index: 1;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    overflow: auto;
    background-color: rgba(0,0,0,0.4);
}

/* Modal Content Box */
.modal-content {
    background-color: #fefefe;
    margin: 4% auto 15% auto;
    border: 1px solid #888;
    width: 40%; 
	padding-bottom: 30px;
}

/* The Close Button (x) */
.close {
    position: absolute;
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
}
.close:hover,.close:focus {
    color: red;
    cursor: pointer;
}

/* Add Zoom Animation */
.animate {
    animation: zoom 0.6s
}
@keyframes zoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
}
#myBtn
{
margin-left: 20px;
background-color: #000000;
color: #ffffff;
font-weight:bold; 
padding: 4px 20px 4px 20px;
}
</style>
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
				<h1>View Ticket</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li><a href="#">Dashboard</a></li>
					<li class="active">View Ticket</li>
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

										<!-- edit form column -->
										<div class="col-md-9 personal-info">
											<form>
												<div class="form-row">
													<div class="form-group col-md-11">
														<label for="ticketstatus">Select Ticket Status:</label>
														<div class="ui-select">
															<select id="ticketstatus" class="form-control">
																<option value="">Choose</option>
																<option value="">Open</option>
																<option value="">Closed</option>
															</select>
														</div>
														<br> <br>
													</div>
												</div>
											</form>
										</div>
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
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Name: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Id</th>
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Position: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Resolution Status</th>
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Office: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Problem Type</th>
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Age: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Desc</th>
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Start date: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Comment</th>
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Salary: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Resolved By</th>
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Salary: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Resolved Date</th>
											<th class="sorting_desc" tabindex="0"
												aria-controls="tbl_data" rowspan="1" colspan="1"
												aria-label="Salary: activate to sort column ascending"
												style="width: 32px;" aria-sort="descending">Ticket Creation Date</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${listOfHelpDeskTicket}" var="item">
											<tr>
												<td>${item.ticket_id}<button id="myBtn" onclick="document.getElementById('modal-wrapper').style.display='block'">Edit</button>
												<div id="modal-wrapper" class="modal">
													  <form class="modal-content animate" action="/action_page.php">													     
													    <div class="imgcontainer">
													      <span onclick="document.getElementById('modal-wrapper').style.display='none'" class="close" title="Close PopUp">&times;</span>
													      <img src="1.png" alt="Avatar" class="avatar">
													      <h1 style="text-align:center">Modal Popup Box</h1>
													    </div>													
													    <div class="container">
													      <input type="text" placeholder="Enter Username" name="uname">
													      <input type="password" placeholder="Enter Password" name="psw">        
													      <button type="submit">Login</button>
													      <input type="checkbox" style="margin:26px 30px;"> Remember me      
													      <a href="#" style="text-decoration:none; float:right; margin-right:34px; margin-top:26px;">Forgot Password ?</a>
													    </div>													    
													  </form>													  
													</div>
												</td>
												<td>${item.ticket_resolution_status}</td>
												<td>${item.helpDeskProblemCategory.problem_category}</td>
												<td>${item.description}</td>
												<td>${item.resolver_comment}</td>
												<td>${item.resolved_by}</td>
												<td>${item.resolved_datetime}</td>
												<td>${item.ticket_creation_datetime}</td>
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
				<!-- /.row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- ./wrapper -->
<script>
// If user clicks anywhere outside of the modal, Modal will close

var modal = document.getElementById('modal-wrapper');
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>

</body>
</html>