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
<link
	href="<c:url value='/static/bootstrap/css/bootstrap.min.css' />"
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
<link
	href="<c:url value='/static/dist/css/skins/_all-skins.min.css' />"
	rel="stylesheet" type="text/css" />
	<link <c:url value='/static/dist/css/skins/style.css' />" rel="stylesheet" type="text/css" />
<!-- iCheck -->
<link
	href="<c:url value='/static/plugins/iCheck/flat/blue.css' />"
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
<link href="<c:url value='/static/plugins/daterangepicker/daterangepicker-bs3.css' />" rel="stylesheet" type="text/css" />
    <!-- bootstrap wysihtml5 - text editor -->
    <link href="<c:url value='/static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css' />" rel="stylesheet" type="text/css" />

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
          <h1>
            edit profile
          </h1>
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
            <div class="col-md-11">
              <!-- general form elements -->
              <div class="box box-primary">
                <div class="box-header">
                  <div class="container">
    <h1>Edit Profile</h1>
  	<hr>
	<div class="row">
      <!-- left column -->
    
      <!-- edit form column -->
      <div class="col-md-9 personal-info">
        
        <h3>Edit Profile  of Member</h3>
        
        <form class="form-horizontal" role="form">
        <div class="row">
          <div class="form-group">
            <label class="col-lg-3 control-label">Search by Member ID:</label>
            <div class="col-lg-3">
              <input class="form-control" type="text" >
            </div>
             <div class="col-md-2">
              <input type="button" class="btn btn-primary" value="Show Details">
            </div>
          </div>
         
          </div>
        </form>
          <form class="form-horizontal" role="form">
          <div class="form-group">
            <label class="col-lg-3 control-label">Search by Member Name:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" >
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-2">
              <input type="button" class="btn btn-primary" value="Show Details">
            </div>
          </div>
        </form>
      </div>
     
      <div class="col-md-9">
        <div class="text-center">
          <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
          <h6>Upload a different photo...</h6>
          
          <input type="file" class="form-control">
        </div>
      </div>
      
      <!-- edit form column -->
      <div class="col-md-9 personal-info">
        <div class="alert alert-info alert-dismissable">
          <a class="panel-close close" data-dismiss="alert">×</a> 
          <i class="fa fa-coffee"></i>
          This is an <strong>.alert</strong>. Use this to show important messages to the user.
        </div>
        <h3>Personal info</h3>
        
        <form class="form-horizontal" role="form">
          <div class="form-group">
            <label class="col-lg-3 control-label">First name:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="Jane">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Last name:</label>
            <div class="col-lg-3">
              <input class="form-control" type="text" value="Bishop">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Company:</label>
            <div class="col-lg-3">
              <input class="form-control" type="text" value="">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Email:</label>
            <div class="col-lg-8">
              <input class="form-control" type="text" value="janesemail@gmail.com">
            </div>
          </div>
          <div class="form-group">
            <label class="col-lg-3 control-label">Time Zone:</label>
            <div class="col-lg-8">
              <div class="ui-select">
                <select id="user_time_zone" class="form-control">
                  <option value="Hawaii">(GMT-10:00) Hawaii</option>
                  <option value="Alaska">(GMT-09:00) Alaska</option>
                  <option value="Pacific Time (US &amp; Canada)">(GMT-08:00) Pacific Time (US &amp; Canada)</option>
                  <option value="Arizona">(GMT-07:00) Arizona</option>
                  <option value="Mountain Time (US &amp; Canada)">(GMT-07:00) Mountain Time (US &amp; Canada)</option>
                  <option value="Central Time (US &amp; Canada)" selected="selected">(GMT-06:00) Central Time (US &amp; Canada)</option>
                  <option value="Eastern Time (US &amp; Canada)">(GMT-05:00) Eastern Time (US &amp; Canada)</option>
                  <option value="Indiana (East)">(GMT-05:00) Indiana (East)</option>
                </select>
              </div>
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label">Username:</label>
            <div class="col-md-8">
              <input class="form-control" type="text" value="janeuser">
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label">Password:</label>
            <div class="col-md-8">
              <input class="form-control" type="password" value="11111122333">
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label">Confirm password:</label>
            <div class="col-md-8">
              <input class="form-control" type="password" value="11111122333">
            </div>
          </div>
          <div class="form-group">
            <label class="col-md-3 control-label"></label>
            <div class="col-md-8">
              <input type="button" class="btn btn-primary" value="Save Changes">
              <span></span>
              <input type="reset" class="btn btn-default" value="Cancel">
            </div>
          </div>
        </form>
      </div>
  </div>
</div>
<hr>
                <!-- /.box-header -->
                <!-- form start -->
      <div class='panel-body col-xs-12'>
        <form class='form-horizontal' role='form'>
          <h3>
            Edit Profile  of Member
          </h3>
           <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Select Member ID </label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Status' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>            
            <div class='col-md-offset-4 col-md-5'>
              <button class='btn-lg btn-danger' style='float:right' type='submit'>Show Details</button>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Select Member Name </label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Status' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>            
            <div class='col-md-offset-4 col-md-5'>
              <button class='btn-lg btn-danger' style='float:right' type='submit'>Show Details</button>
            </div>
          </div>
           <h3>
            Self Information
          </h3>
          
         <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_accomodation'>Franchies Id</label>
            <div class='col-md-4'>
              <select class='form-control' id='id_accomodation'>
                <option>Select Franchies</option>
                <option>Remove Franchies</option>                
              </select>
            </div>
          </div>           
           <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Current Frenchies</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Member Id' type='text'>
                </div>                                
              </div>
            </div>
          </div>             
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Name</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='State' type='text'>
                </div>
              </div>
            </div>
          </div>          
            <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_accomodation'>S/D/W</label>
            <div class='col-md-4'>
              <select class='form-control' id='id_accomodation'>
                <option>S/o</option>
                <option>d/o</option>
                <option>w/o</option>
              </select>
            </div>
          </div>  
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>S/D/W Name</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='City' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Address1</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Member Id' type='text'>
                </div>                
              </div>
            </div>
          </div>             
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Address2</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='State' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Address3</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Member Id' type='text'>
                </div>                
              </div>
            </div>
          </div>
            <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_accomodation'>State</label>
            <div class='col-md-4'>
              <select class='form-control' id='id_accomodation'>
                <option>Select satate</option>
                <option>UP</option>
                <option>Delhi</option>
                <option>Mumbai</option>
                <option>Pune</option>
                <option>Punjab</option>
                 <option>Haryana</option>
                <option>Gujrat</option>
                <option>Bihar</option>
                <option>Chhatishgarh</option>
                <option>Asam</option>
                <option>Pundechhery</option>
                 <option>Tamilnadu</option>
                <option>Rajasthan</option>
                <option>Udisa</option>
                <option>West bangal</option>
                <option>Utarakhand</option>
                <option>Nicobar</option>
                 <option>Goa</option>
                <option>Karnataka</option>
                <option>Tripura</option>
                <option>Meghalay</option>
                <option>Nagaland</option>
                <option>jharkhand</option>
                 <option>Jammu Kashmir</option>
                <option>Banglor</option>
                <option>chennai</option>
                <option>Himanchal Pradesh</option>
                <option>Telangana</option>
                <option>Chandigarh</option> 
                <option>Delhi NCR</option>
                <option>Madhay Pradesh</option>                
              </select>
            </div>
          </div>   
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>City</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='State' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Pin Code</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Pin Code' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Mobile No</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Mobile No' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Mobile No 2</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Mobile No 2' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Date Of Birth  </label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Date Of Birth  ' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Gender</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='State' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>E-Mail ID</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='E-Mail ID' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Joining Date</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Joining Date' type='text'>
                </div>
              </div>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Points:' type='text'>
                </div>
              </div>
            </div>            
          </div>          
           <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Current Package  </label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Current Package  ' type='text'>
                </div>
              </div>
            </div>
          </div>
           <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Kit Price</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Kit Price' type='text'>
                </div>
              </div>
            </div>
          </div>
           <h3>
            Bank Information
          </h3>
             
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Account No</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Account No' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Account Holder Name</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Account Holder Name' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Bank Name </label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class=
 id='id_email' placeholder='Bank Name' type='text'>
                </div>
                
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Bank Branch</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Bank Branch' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Bank City</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Bank City' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Pan No</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Pan No' type='text'>
                </div>
              </div>
            </div>
          </div>
           <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>IFSC  </label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='IFSC' type='text'>
                </div>
              </div>
            </div>
          </div> 
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Aadhar Card  </label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Aadhar Card  ' type='text'>
                </div>
              </div>
            </div>
          </div>          
          <h3>
            Nominee Information
          </h3>
          
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Name</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Name' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Relation</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Relation' type='text'>
                </div>
              </div>
            </div>
          </div>
           <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Address</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Address' type='text'>
                </div>
              </div>
            </div>
          </div>
           <div class='form-group'>
            <label class='control-label col-md-3 ' for='id_email'>Date Of Birth</label>
            <div class='col-md-6'>
              <div class='form-group'>
                <div class='col-md-11'>
                  <input class='form-control' id='id_email' placeholder='Date Of Birth' type='text'>
                </div>
              </div>
            </div>
          </div>
          <div class='form-group'>            
            <div class='col-md-offset-4 col-md-3'>
              <button class='btn-lg btn-danger' style='float:right' type='submit'>Update</button>
            </div>
          </div>                       
        </form>
      </div>
      
      </div>
  </div><!-- /.box -->
<br>
<br>
<br>
            


            </div><!--/.col (left) -->
            
          </div>   <!-- /.row -->
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
    
    </div><!-- ./wrapper -->

  <!-- jQuery 2.1.3 -->
    <script src="/mlm-erp/static/plugins/jQuery/jQuery-2.1.3.min.js"></script>
    <!-- jQuery UI 1.11.2 -->
    <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.min.js" type="text/javascript"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
					$.widget.bridge('uibutton', $.ui.button);
				</script>
    <!-- Bootstrap 3.3.2 JS -->
    <script src="/mlm-erp/static/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>    
    <!-- Morris.js charts -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <!-- Sparkline -->
    <script src="/mlm-erp/static/plugins/sparkline/jquery.sparkline.min.js" type="text/javascript"></script>
    <!-- jvectormap -->
    <script src="/mlm-erp/static/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js" type="text/javascript"></script>
    <script src="/mlm-erp/static/plugins/jvectormap/jquery-jvectormap-world-mill-en.js" type="text/javascript"></script>
    <!-- jQuery Knob Chart -->
    <script src="/mlm-erp/static/plugins/knob/jquery.knob.js" type="text/javascript"></script>
    <!-- daterangepicker -->
    <script src="/mlm-erp/static/plugins/daterangepicker/daterangepicker.js" type="text/javascript"></script>
    <!-- datepicker -->
    <script src="/mlm-erp/static/plugins/datepicker/bootstrap-datepicker.js" type="text/javascript"></script>
    <!-- Bootstrap WYSIHTML5 -->
    <script src="/mlm-erp/static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" type="text/javascript"></script>
    <!-- iCheck -->
    <script src="/mlm-erp/static/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
    <!-- Slimscroll -->
    <script src="/mlm-erp/static/plugins/slimScroll/jquery.slimscroll.min.js" type="text/javascript"></script>
    <!-- FastClick -->
    <script src='/mlm-erp/static/plugins/fastclick/fastclick.min.js'></script>
    <!-- AdminLTE App -->
    <script src="/mlm-erp/static/dist/js/app.min.js" type="text/javascript"></script>

    <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
    <script src="/mlm-erp/static/dist/js/pages/dashboard.js" type="text/javascript"></script>
     <script  src="/mlm-erp/static/dist/js/index.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="/mlm-erp/static/dist/js/demo.js" type="text/javascript"></script>
     <script src="/mlm-erp/static/plugins/morris/morris.min.js" type="text/javascript"></script>
  </body>
</html>