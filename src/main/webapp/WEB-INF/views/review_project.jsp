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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">

 
	function ieClicked() {
		if (document.all) {
			return false;
		}
	}
	function firefoxClicked(e) {
		if (document.layers || (document.getElementById && !document.all)) {
			if (e.which == 2 || e.which == 3) {
				return false;
			}
		}
	}
	
	if (document.layers) {
		document.captureEvents(Event.MOUSEDOWN);
		document.onmousedown = firefoxClicked;
	} else {
		document.onmouseup = firefoxClicked;
		document.oncontextmenu = ieClicked;
	}
	document.oncontextmenu = new Function("return false")
</script>

</head>
<body class="skin-blue">
	<div class="wrapper">


		<%@include file="header.jsp"%>

		<!-- Right side column. Contains the navbar and content of the page -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>Review Project</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li><a href="#">Dashboard</a></li>
					<li class="active">Review Project</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="row">
					<!-- left column -->
					<div class="col-md-12">
						<!-- general form elements -->
						<div class="box box-primary">
							<div class="container">
								<h2>Review Completness</h2>
								<div class="progress" style="width: 80%;">
									<div class="progress-bar" role="progressbar" aria-valuenow="70"
										aria-valuemin="0" aria-valuemax="100" style="width: 70%">
										70%</div>
								</div>
							</div>

							<div class="box-header">

								<div class="embed-responsive embed-responsive-16by9"
									style="height: 400px">
									<object class="embed-responsive-item" id="id_obj_pdf"
										oncontextmenu="return abc()"
										data="static/images/sample.pdf#toolbar=0&amp;navpanes=0&amp;scrollbar=0&amp;page=1&amp;view=FitH"
										type="application/pdf" internalinstanceid="9" title=""
										style="height: 450px;"> </object>
								</div>
								<div class="container">
									<h1>Questions</h1>
									<p>1. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="a1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="a2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="a3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="a4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide1()"> <span
													class="range-slider__value" id="option1">0</span><span>%</span>
											</div>
										</div>
									</div>
									
									
									
									<p>2. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="b1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="b2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="b3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="b4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide2()"> <span
													class="range-slider__value" id="option2">0</span><span>%</span>
											</div>
										</div>
									</div>
									 
									<p>3. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="c1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="c2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="c3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="c4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide3()"> <span
													class="range-slider__value" id="option3">0</span><span>%</span>
											</div>
										</div>
									</div> 
									 
									<p>4. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="d1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="d2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="d3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="d4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide4()"> <span
													class="range-slider__value" id="option4">0</span><span>%</span>
											</div>
										</div>
									</div>
									
									<p>5. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="e1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="e2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="e3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="e4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide5()"> <span
													class="range-slider__value" id="option5">0</span><span>%</span>
											</div>
										</div>
									</div>
									
									<p>6. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="f1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="f2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="f3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="f4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide6()"> <span
													class="range-slider__value" id="option6">0</span><span>%</span>
											</div>
										</div>
									</div>
									
									<p>7. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="g1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="g2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="g3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="g4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide7()"> <span
													class="range-slider__value" id="option7">0</span><span>%</span>
											</div>
										</div>
									</div>
									
									<p>8. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="a1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="a2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="a3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="a4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide1()"> <span
													class="range-slider__value" id="option1">0</span><span>%</span>
											</div>
										</div>
									</div>
									
									<p>9. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="a1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="a2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="a3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="a4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide1()"> <span
													class="range-slider__value" id="option1">0</span><span>%</span>
											</div>
										</div>
									</div>
									
									<p>10. The blockquote element is used to present content
										from another source:</p>
									<div class="form-inline col-md-12">
										<div class="col-md-6">
											<label class="radio-inline"> <input type="radio"
												id="a1" name="optradio" >Option
												1
											</label> <label class="radio-inline"> <input type="radio"
												id="a2" name="optradio" >Option
												2
											</label> <label class="radio-inline"> <input type="radio"
												id="a3" name="optradio" >Option
												3
											</label> <label class="radio-inline"> <input type="radio"
												id="a4" name="optradio" >Option
												4
											</label>
										</div>
										<div class="col-md-6">
										
											<div class="range-slider">
												<input class="range-slider__range" type="range" value="0" id="slider_range_id"
													min="0" max="100" onchange="slide1()"> <span
													class="range-slider__value" id="option1">0</span><span>%</span>
											</div>
										</div>
									</div>

								
									
									
								</div>

							</div>
						</div>
						<!-- /.row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- ./wrapper -->
	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
	<script>
		var rangeSlider = function() {
			var slider = $('.range-slider'), range = $('.range-slider__range'), value = $('.range-slider__value');

			slider.each(function() {

				/* value.each(function() {
					var value = $(this).prev().attr('value');
					$(this).html(value);
				});  */

				range.on('input', function() {
					$(this).next(value).html(this.value);

					/* var v = $('#range-slider__value span').text();
					if (v <= 25) {
						$("#option1").attr('checked', 'checked');
					} else if (v >= 25 && v <= 50) {
						$("#option2").attr('checked', 'checked');
					} else if (v >= 50 && v <= 75) {
						$("#option3").attr('checked', 'checked');
					} else {
						$("#option4").attr('checked', 'checked');
					} */
				});
			});
		};

		rangeSlider();

		
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
		<script src="/mlm-erp/static/js/question.js"
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