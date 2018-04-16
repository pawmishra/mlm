<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width">
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
	href="<c:url value='/static/dist/css/skins/style.css' />" rel="stylesheet"
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
<title>Basic example</title>
<link rel="stylesheet" href="/mlm-erp/static/css/treant.css">
<link rel="stylesheet" href="/mlm-erp/static/css/custom-colored.css">

 <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {packages:["orgchart"]});
      google.charts.setOnLoadCallback(drawChart);
		
		function drawChart() {
			var data = new google.visualization.DataTable();
			data.addColumn('string', 'member_id');
			data.addColumn('string', 'sponsor_id');
			

			data.addRows([
				<?php
				include 'dbconnection.php';
				$con = OpenCon();
				$session_sponsor_id = $_GET['sess_sponsor_id'];
					//$session_sponsor_id = '91506';
				//declare the SQL statement that will query the database
				$query = "select * from register where sponsor_id='$session_sponsor_id'";
				
				
				$result = mysqli_query($con, $query);
				
				//execute the SQL query and return records
				$output = array();
				$quote='"';					
				$style1='margin-top:50px;margin-left:0px;margin-bottom:15px;width:70px;height:70px';

				while($row = mysqli_fetch_array($result)) {
					// create a temp array to hold the data
					$temp = array();
						 
					// add the data					
					
					$member_id = $row['member_id'];	
					$member_name = $row['member_name'];
					$profile_pic = $row['profile_pic'];
					
					$default = "logoMINI.png";
                    if (empty($profile_pic)) 
					{ 
                     
						$image = "{v:'$member_id', f:'</br>$member_id</br></br>$member_name<div><img style=$quote$style1$quote src=$quote$default$quote /></div>'}";  
					}
                    else
					{  
						$image = "{v:'$member_id', f:'</br>$member_id</br></br>$member_name<div><img style=$quote$style1$quote src=$quote$profile_pic$quote /></div>'}";
					}
					
		
					$temp[] = $image;
					$temp[] = "'$row[sponsor_id]'";

					// implode the temp array into a comma-separated list and add to the output array
					$output[] = '[' . implode(', ', $temp) . ']';
				}

				// implode the output into a comma-newline separated list and echo
				echo implode(",\n", $output);

				//mysql_close($con);
				?>
			]);

			var chart = new google.visualization.OrgChart(document.getElementById('chart_div'));			
			//chart.draw(data, {allowHtml:true, nodeClass:'maman'});
			chart.draw(data, {allowHtml:true});
			
			
			google.visualization.events.addListener(chart, 'select', selectHandler);
			
			function selectHandler() {
				var selection = chart.getSelection();
				var message = '';
				for (var i = 0; i < selection.length; i++) {
				var item = selection[i];
				if (item.row != null && item.column != null) {
					var str = data.getFormattedValue(item.row, item.column);
					message += str ;
				} else if (item.row != null) {
						var str = data.getFormattedValue(item.row, 0);
						message += str ;
				} else if (item.column != null) {
						var str = data.getFormattedValue(0, item.column);
						message += str ;
				}
			}
			if (message == '') {
					message = 'nothing';
			}
			//alert('You selected ' + message);
			//call page with variable message
			//var res = message.substr(5, 5);
			var result=message.match(/<\/br>(.*)<\/br><\/br>/);
			window.location.href = "tree.php?sess_sponsor_id=" + result[1]; 
		}
	}
	</script>
	<style>
		.google-visualization-orgchart-node
		{
			    width: 150px;
                height: 200px;
		}
		.google-visualization-orgchart-connrow-medium
		{
			    height: 30px !important;
                font-size: 4px;
		}
	</style>


</head>
<body class="skin-blue">



	<%@include file="header.jsp"%>

	<div id='chart_div'></div>

	<!-- <div class="chart" id="custom-colored">--@--</div>
	<script src="/mlm-erp/static/js/raphael.js"></script>
	<script src="/mlm-erp/static/js/treant.js"></script>

	<script src="/mlm-erp/static/js/custom-colored.js"></script>
	<script>
		new Treant(chart_config);
	</script> -->


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