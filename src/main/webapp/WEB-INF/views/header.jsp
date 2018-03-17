<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <header class="main-header">
        <!-- Logo -->
        <a href="index.jsp" class="logo"><b>MLM</b> ADMIN</a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- Messages: style can be found in dropdown.less-->
              
              <!-- Notifications: style can be found in dropdown.less -->
              <li class="dropdown notifications-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <i class="fa fa-bell-o"></i>
                  <span class="label label-warning">5</span>
                </a>
                <ul class="dropdown-menu">
                  <li class="header">MLM</li>
                  <li>
                    <!-- inner menu: contains the actual data -->
                    <ul class="menu">
                      <li>
                        <a href="#">
                          <i class="fa fa-users text-aqua"></i> My Direct
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <i class="fa fa-warning text-yellow"></i> My Downline
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <i class="fa fa-users text-red"></i> Direct Buisness
                        </a>
                      </li>

                      <li>
                        <a href="#">
                          <i class="fa fa-shopping-cart text-green"></i> Downline Buisness
                        </a>
                      </li>
                      <li>
                        <a href="#">
                          <i class="fa fa-user text-red"></i> My Wallet
                        </a>
                      </li>
					  
                    </ul>
					
                  </li>
                </ul>
              </li>
              <!-- Tasks: style can be found in dropdown.less -->
              
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image"/>
                  <span class="hidden-xs">${loggedinuser}</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
                    <p>
                     ID12345
                    </p>
                  </li>
                  <!-- Menu Body -->
                
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="#" class="btn btn-default btn-flat">Profile</a>
                    </div>
                    <div class="pull-right">
                      <a href="#" class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
        </nav>
      </header>
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- Sidebar user panel -->
          <div class="user-panel">
            <div class="pull-left image">
              <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
              <p>${loggedinuser}</p>
			  <p> ID12345 </p>

  
            </div>
          </div>
          <!-- search form -->
         
          <!-- /.search form -->
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
			 <li class="treeview">
              <a href="index.jsp">
                <i class="fa fa-pie-chart"></i>
                <span>Dashboard</span>
              </a>
            </li>
            
            <li class="treeview">
              <a href="#">
                <i class="fa fa-table"></i>
                <span>Details</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="edit_profile.jsp"><i class="fa fa-circle-o"></i> Edit Profile</a></li>
                <li><a href="bank_details.jsp"><i class="fa fa-circle-o"></i> Bank Details</a></li>
                <li><a href="kyc_update.jsp"><i class="fa fa-circle-o"></i> KYC Document</a></li>
				<li><a href="edit_pass.jsp"><i class="fa fa-circle-o"></i> Edit Password</a></li>
              </ul>
            </li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-file-text-o"></i>
                <span>Associates</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="my_direct.jsp"><i class="fa fa-circle-o"></i> My Direct</a></li>
                <li><a href="my_team.jsp"><i class="fa fa-circle-o"></i> My Team</a></li>
                <li><a href="my_level.jsp"><i class="fa fa-circle-o"></i> My Level</a></li>
                <li><a href="pages/UI/sliders.html"><i class="fa fa-circle-o"></i> Genelogy</a></li>
              </ul>
            </li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-rub"></i> <span>Epin Management</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="create_epin.jsp"><i class="fa fa-circle-o"></i> Create Epin</a></li>
                <li><a href="epin.jsp"><i class="fa fa-circle-o"></i> Epin</a></li>
                <li><a href="epin_transfer.jsp"><i class="fa fa-circle-o"></i> Epin Transfer</a></li>
                <li><a href="epin_transfer_history.jsp"><i class="fa fa-circle-o"></i> Epin Transfer History</a></li>
				<li><a href="epin_received_history.jsp"><i class="fa fa-circle-o"></i> Epin Recieved History</a></li>
              </ul>
            </li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-level-up"></i> <span>Upgrade Management</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i> Upgrade</a></li>
                <li><a href="reports.jsp"><i class="fa fa-circle-o"></i> Reports</a></li>
              </ul>
            </li>
            
            <li class="treeview">
              <a href="#">
                <i class="fa fa-rupee"></i> <span>Income Report</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="level_income.jsp"><i class="fa fa-circle-o"></i> Level Income(Reciever)</a></li>
                <li><a href="level_income1.jsp"><i class="fa fa-circle-o"></i> Level Income(Sender)</a></li>
               
              </ul>
            </li>
            <li class="treeview">
              <a href="#">
                <i class="fa fa-rupee"></i> <span>Income Management</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="withdraw_balance.jsp"><i class="fa fa-circle-o"></i> Withdraw Balance</a></li>
                <li><a href="withdraw_report.jsp"><i class="fa fa-circle-o"></i> Withdraw Report</a></li>
                <li><a href="account_history.jsp"><i class="fa fa-circle-o"></i> Account History</a></li>
                <li><a href="fund_transfer_report.jsp"><i class="fa fa-circle-o"></i> Fund Transfer Report</a></li>
              </ul>
            </li>
			<li class="treeview">
              <a href="#">
                <i class="fa fa-archive"></i> <span>Product Status</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="pages/examples/invoice.html"><i class="fa fa-circle-o"></i> Product Delivery Details</a></li>
                <li><a href="pages/examples/login.html"><i class="fa fa-circle-o"></i> Product Report</a></li>
              </ul>
            </li>
			<li class="treeview">
              <a href="#">
                <i class="fa fa-folder"></i> <span>Send Query</span>
                <i class="fa fa-angle-left pull-right"></i>
              </a>
              <ul class="treeview-menu">
                <li><a href="pages/examples/invoice.html"><i class="fa fa-circle-o"></i> Send Message</a></li>
                
              </ul>
            </li>
			<li class="treeview">
              <a href="#">
                <i class="fa fa-hand-o-up"></i> <span><a href="<c:url value="/logout" />">Logout</a></span>
              </a>
            </li>
            
            
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>
