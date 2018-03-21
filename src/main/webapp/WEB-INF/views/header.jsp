<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<header class="main-header"> <!-- Logo --> <a
	href="mlmHome.jsp" class="logo"><b>MLM</b> ADMIN</a> <!-- Header Navbar: style can be found in header.less -->
<nav class="navbar navbar-static-top" role="navigation"> <!-- Sidebar toggle button-->
<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
	<span class="sr-only">Toggle navigation</span>
</a>
<div class="navbar-custom-menu">
	<ul class="nav navbar-nav">
		<!-- Messages: style can be found in dropdown.less-->

		<!-- Notifications: style can be found in dropdown.less -->
		<li class="dropdown notifications-menu"><a href="#"
			class="dropdown-toggle" data-toggle="dropdown"> <i
				class="fa fa-bell-o"></i> <span class="label label-warning">5</span>
		</a>
			<ul class="dropdown-menu">
				<li class="header">MLM</li>
				<li>
					<!-- inner menu: contains the actual data -->
					<ul class="menu">
						<li><a href="#"> <i class="fa fa-users text-aqua"></i> My
								Direct
						</a></li>
						<li><a href="#"> <i class="fa fa-warning text-yellow"></i>
								My Downline
						</a></li>
						<li><a href="#"> <i class="fa fa-users text-red"></i>
								Direct Buisness
						</a></li>

						<li><a href="#"> <i
								class="fa fa-shopping-cart text-green"></i> Downline Buisness
						</a></li>
						<li><a href="#"> <i class="fa fa-user text-red"></i> My
								Wallet
						</a></li>

					</ul>

				</li>
			</ul></li>
		<!-- Tasks: style can be found in dropdown.less -->

		<!-- User Account: style can be found in dropdown.less -->
		<li class="dropdown user user-menu"><a href="#"
			class="dropdown-toggle" data-toggle="dropdown"> <img
				src="/mlm-erp/static/admin/dist/img/user2-160x160.jpg" class="user-image" alt="User Image" />
				<span class="hidden-xs">${loggedinuser}</span>
		</a>
			<ul class="dropdown-menu">
				<!-- User image -->
				<li class="user-header"><img src="/mlm-erp/static/admin/dist/img/user2-160x160.jpg"
					class="img-circle" alt="User Image" />
					<p>ID12345</p></li>
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
			</ul></li>
	</ul>
</div>
</nav> </header>
<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar"> <!-- sidebar: style can be found in sidebar.less -->
<section class="sidebar"> <!-- Sidebar user panel -->
<div class="user-panel">
	<div class="pull-left image">
		<img src="/mlm-erp/static/admin/dist/img/user2-160x160.jpg" class="img-circle"
			alt="User Image" />
	</div>
	<div class="pull-left info">
		<p>${loggedinuser}</p>
		<p>ID12345</p>


	</div>
</div>
<!-- search form --> <!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->
<ul class="sidebar-menu">
	<li class="treeview"><a href="mlmHome.jsp"> <i
			class="fa fa-pie-chart"></i> <span>Dashboard</span>
	</a></li>

	<li class="treeview"><a href="#"> <i class="fa fa-table"></i>
			<span>EPIN</span> <i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="joining_product.jsp"><i class="fa fa-circle-o"></i>
					Joining Product</a></li>
			<li><a href="epin_generator.jsp"><i class="fa fa-circle-o"></i>
					Epin Generate</a></li>
			<li><a href="e-pin_listdelete .jsp"><i
					class="fa fa-circle-o"></i> Epin List/Delete</a></li>
			<li><a href="epin_sale.jsp"><i class="fa fa-circle-o"></i>
					Epin Sale</a></li>
			<li><a href="epin  transaction.jsp"><i
					class="fa fa-circle-o"></i> Epin Transactions</a></li>
			<li><a href="epin status.jsp"><i class="fa fa-circle-o"></i>
					Epin Status</a></li>
			<li><a href="deleted joining kits.jsp"><i
					class="fa fa-circle-o"></i> Delete Joining Kits</a></li>
			<li><a href="new joining.jsp"><i class="fa fa-circle-o"></i>
					New Joining</a></li>
		</ul></li>
	<li class="treeview"><a href="#"> <i class="fa fa-file-text-o"></i>
			<span>GENERAL</span> <i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="block reward achivers.jsp"><i
					class="fa fa-circle-o"></i> Block Reward Achievers</a></li>
			<li><a href="block payout achivers.jsp"><i
					class="fa fa-circle-o"></i> Block Payout Achievers</a></li>
			<li><a href="member view.jsp"><i class="fa fa-circle-o"></i>Member
					View</a></li>
			<li><a href="pages/UI/sliders.html"><i
					class="fa fa-circle-o"></i>Edit Profile</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>Tree
					View</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>
					View Downline</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i> Top
					Up Id</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>
					Member Password</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i> Txn
					Password</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>
					Payout Summary</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>
					Welcome Report</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>
					View Reciept Report</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>
					Member Pannel</a></li>
			<li><a href="my_team.jsp"><i class="fa fa-circle-o"></i>
					Direct IDS</a></li>
		</ul></li>
	<li class="treeview"><a href="#"> <i class="fa fa-rub"></i> <span>PAYOUTS</span>
			<i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="epin.jsp"><i class="fa fa-circle-o"></i>Process
					Payout</a></li>
			<li><a href="epin_transfer.jsp"><i class="fa fa-circle-o"></i>
					Payout Report</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> Per Payout</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> Delete Payout</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> Bank Statement</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> Withdrawal Require</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> All Transaction</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> Add Fund/Debit</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> Clear Ewallet</a></li>
			<li><a href="epin_transfer_history.jsp"><i
					class="fa fa-circle-o"></i> E&S wallet Balance</a></li>

		</ul></li>
	<li class="treeview"><a href="#"> <i class="fa fa-level-up"></i>
			<span>ADMIN</span> <i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i> Pan
					Card Report</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i>
					Admin Pass1</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i>
					Admin Pass2</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i> GST
					Master</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i> Sub
					Admin</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i> Sub
					Admin Right</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i>
					Sale Report</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i> TDS
					Report</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i>
					Admin Charges</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i>
					Commission Report</a></li>
			<li><a href="upgrade.jsp"><i class="fa fa-circle-o"></i>
					Invoice Master</a></li>
			<li><a href="reports.jsp"><i class="fa fa-circle-o"></i>
					Bill Report</a></li>
			<li><a href="reports.jsp"><i class="fa fa-circle-o"></i>
					Product Delivery</a></li>
			<li><a href="reports.jsp"><i class="fa fa-circle-o"></i>
					Member Deposit</a></li>
		</ul></li>

	<li class="treeview"><a href="#"> <i class="fa fa-rupee"></i>
			<span>MEMBER</span> <i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="level_income.jsp"><i class="fa fa-circle-o"></i>
					ID Card</a></li>
			<li><a href="level_income.jsp"><i class="fa fa-circle-o"></i>
					Edit Welcome Letter</a></li>
			<li><a href="level_income.jsp"><i class="fa fa-circle-o"></i>
					Hide Option</a></li>
			<li><a href="level_income.jsp"><i class="fa fa-circle-o"></i>
					Pair Report</a></li>
			<li><a href="level_income.jsp"><i class="fa fa-circle-o"></i>
					Quick Joining</a></li>
			<li><a href="level_income.jsp"><i class="fa fa-circle-o"></i>
					Block Member ID</a></li>
			<li><a href="level_income.jsp"><i class="fa fa-circle-o"></i>
					Delete ID</a></li>
		</ul></li>

	<li class="treeview"><a href="#"> <i class="fa fa-rupee"></i>
			<span>EVENTS</span> <i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="withdraw_balance.jsp"><i class="fa fa-circle-o"></i>
					Happy Birthday List</a></li>
			<li><a href="withdraw_balance.jsp"><i class="fa fa-circle-o"></i>
					Rewards Achievers</a></li>
			<li><a href="withdraw_balance.jsp"><i class="fa fa-circle-o"></i>
					Rewards Delivered</a></li>

		</ul></li>
	<li class="treeview"><a href="#"> <i class="fa fa-archive"></i>
			<span>USEFUL</span> <i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="pages/examples/invoice.html"><i
					class="fa fa-circle-o"></i> Plan Details</a></li>

		</ul></li>
	<li class="treeview"><a href="#"> <i class="fa fa-folder"></i>
			<span>Send Query</span> <i class="fa fa-angle-left pull-right"></i>
	</a>
		<ul class="treeview-menu">
			<li><a href="pages/examples/invoice.html"><i
					class="fa fa-circle-o"></i> Send Message</a></li>

		</ul></li>
	<li class="treeview"><a href="#"> <i class="fa fa-hand-o-up"></i>
			<span>Logout</span>
	</a></li>


</ul>
</section> <!-- /.sidebar --> </aside>


