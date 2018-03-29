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
<!-- AdminLTE Skins. Choose a skin from the css/skins 
         folder instead of downloading all of them to reduce the load. -->
<link href="<c:url value='/static/dist/css/skins/_all-skins.min.css' />"
	rel="stylesheet" type="text/css" />
<link href="<c:url value='/static/dist/css/skins/style.css' />"
	rel="stylesheet" type="text/css" />
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

<link href="<c:url value='/static/css/treeview.css' />" rel="stylesheet"
	type="text/css" />
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

<script type="text/javascript">
var members = [
    {memberId : 1, parentId:null, amount:200, otherInfo:"blah"},
    {memberId : 2, parentId:1, amount:300, otherInfo:"blah1"},
    {memberId : 3, parentId:1, amount:400, otherInfo:"blah2"},
    {memberId : 4, parentId:3, amount:500, otherInfo:"blah3"},
    {memberId : 6, parentId:1, amount:600, otherInfo:"blah4"},
    {memberId : 9, parentId:4, amount:700, otherInfo:"blah5"},
    {memberId : 12, parentId:2, amount:800, otherInfo:"blah6"},
    {memberId : 5, parentId:2, amount:900, otherInfo:"blah7"},
    {memberId : 13, parentId:2, amount:0, otherInfo:"blah8"},
    {memberId : 14, parentId:2, amount:800, otherInfo:"blah9"},
    {memberId : 55, parentId:2, amount:250, otherInfo:"blah10"},
    {memberId : 56, parentId:3, amount:10, otherInfo:"blah11"},
    {memberId : 57, parentId:3, amount:990, otherInfo:"blah12"},
    {memberId : 58, parentId:3, amount:400, otherInfo:"blah13"},
    {memberId : 59, parentId:6, amount:123, otherInfo:"blah14"},
    {memberId : 54, parentId:6, amount:321, otherInfo:"blah15"},
    {memberId : 53, parentId:56, amount:10000, otherInfo:"blah7"},
    {memberId : 52, parentId:2, amount:47, otherInfo:"blah17"},
    {memberId : 51, parentId:6, amount:534, otherInfo:"blah18"},
    {memberId : 50, parentId:9, amount:55943, otherInfo:"blah19"},
    {memberId : 22, parentId:9, amount:2, otherInfo:"blah27"},
    {memberId : 33, parentId:12, amount:-10, otherInfo:"blah677"}
    
];
var testImgSrc = "http://0.gravatar.com/avatar/06005cd2700c136d09e71838645d36ff?s=69&d=wavatar";
(function heya( parentId ){
    // This is slow and iterates over each object everytime.
    // Removing each item from the array before re-iterating 
    // may be faster for large datasets.
    for(var i = 0; i < members.length; i++){
        var member = members[i];
        if(member.parentId === parentId){
            var parent = parentId ? $("#containerFor" + parentId) : $("#mainContainer"),
                memberId = member.memberId,
                    metaInfo = "<img src='"+testImgSrc+"'/>" + member.otherInfo + " ($" + member.amount + ")";
            parent.append("<div class='container' id='containerFor" + memberId + "'><div class='member'>" + memberId + "<div class='metaInfo'>" + metaInfo + "</div></div></div>");
            heya(memberId);
        } 
    }
 }( null ));

// makes it pretty:
// recursivley resizes all children to fit within the parent.
var pretty = function(){
    var self = $(this),
        children = self.children(".container"),
        // subtract 4% for margin/padding/borders.
        width = (100/children.length) - 2;
    children
        .css("width", width + "%")
        .each(pretty);
    
};
$("#mainContainer").each(pretty);
    
</script>



</head>
<body class="skin-blue">

	<%@include file="header.jsp"%>
	<div id="mainContainer" class="clearfix"></div>


</body>
</html>