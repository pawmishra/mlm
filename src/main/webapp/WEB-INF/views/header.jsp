	<header class="main-header"> <!-- Logo --> <a href="index"
		class="logo"><b>MLM</b> ADMIN</a> <!-- Header Navbar: style can be found in header.less -->
	<nav class="navbar navbar-static-top" role="navigation"> <!-- Sidebar toggle button-->
	<a href="#" class="sidebar-toggle" data-toggle="offcanvas"
		role="button"> <span class="sr-only">Toggle navigation</span>
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
							<li><a href="#"> <i class="fa fa-users text-aqua"></i>
									My Direct
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
					src="/mlm-erp/static/dist/img/user2-160x160.jpg" class="user-image"
					alt="User Image" /> <span class="hidden-xs">${loggedinuser}</span>
			</a>
				<ul class="dropdown-menu">
					<!-- User image -->
					<li class="user-header"><img src="/mlm-erp/static/dist/img/user2-160x160.jpg"
						class="img-circle" alt="User Image" />
						<p>ID12345</p></li>
					<!-- Menu Body -->

					<!-- Menu Footer-->
					<li class="user-footer">
						<div class="pull-left">
							<a href="#" class="btn btn-default btn-flat">Profile</a>
						</div>
						<div class="pull-right">
							<a href="/mlm-erp/logout" class="btn btn-default btn-flat">Sign out</a>
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
			<img src="/mlm-erp/static/dist/img/user2-160x160.jpg" class="img-circle"
				alt="User Image" />
		</div>
		<div class="pull-left info">
			<p>${loggedinuser}</p>
			<p>ID12345</p>


		</div>
	</div>
	<!-- search form --> <!-- /.search form --> <!-- sidebar menu: : style can be found in sidebar.less -->
	<ul class="sidebar-menu">
		<li class="treeview"><a href="mlmHome"> <i
				class="fa fa-pie-chart"></i> <span>DASHBOARD</span>
		</a></li>

		<li class="treeview"><a href="#"> <i class="fa fa-user"></i>
				<span>PROFILE</span> <i class="fa fa-angle-left pull-right"></i>
		</a>
			<ul class="treeview-menu">
				<li><a href="edit_profile"><i class="fa fa-circle-o"></i>
						Edit Profile</a></li>
				<li><a href="bank_details"><i class="fa fa-circle-o"></i>
						Bank Details</a></li>
				<li><a href="change_password"><i class="fa fa-circle-o"></i>
						Change Password</a></li>
				
			</ul></li>
		<li class="treeview"><a href="#"> <i
				class="	fa fa-money"></i> <span>INCOME</span> <i
				class="fa fa-angle-left pull-right"></i>
		</a>
			<ul class="treeview-menu">
				<li><a href="payout"><i
						class="fa fa-circle-o"></i>Payout</a></li>
				
			</ul></li>
		
		</a>
			
		<li class="treeview"><a href="#"> <i class="fa fa-users"></i>
				<span>TEAM</span> <i class="fa fa-angle-left pull-right"></i>
		</a>
			<ul class="treeview-menu">
				<li><a href="view_members"><i class="fa fa-circle-o"></i>
						View Members</a></li>
				<li><a href="treeview"><i class="fa fa-circle-o"></i>
						Tree View</a></li>
				
			</ul></li>

		<li class="treeview"><a href="#"> <i class="fa fa-newspaper-o"></i>
				<span>SURVEY</span> <i class="fa fa-angle-left pull-right"></i>
		</a>
			<ul class="treeview-menu">
				<li><a href="upload_project"><i class="fa fa-circle-o"></i>
						Upload Project</a></li>
				<li><a href="review_project"><i class="fa fa-circle-o"></i>
						Review Project</a></li>
				<li><a href="add_organization"><i class="fa fa-circle-o"></i>
						Add Organization</a></li>
			    <li><a href="add_category"><i class="fa fa-circle-o"></i>
						Add Category</a></li>
				<li><a href="add_pageamount"><i class="fa fa-circle-o"></i>
						Add Per Page Amount</a></li>
			     <li><a href="add_questions"><i class="fa fa-circle-o"></i>
						Add Questions</a></li>
			</ul></li>

		<li class="treeview"><a href="#"> <i class="fa fa-rupee"></i>
				<span>EVENTS</span> <i class="fa fa-angle-left pull-right"></i>
		</a>
			<ul class="treeview-menu">
				<li><a href="latest_news"><i
						class="fa fa-circle-o"></i>Latest News</a></li>
				<li><a href="withdraw_balance.jsp"><i
						class="fa fa-circle-o"></i> Rewards Achievers</a></li>
				<li><a href="withdraw_balance.jsp"><i
						class="fa fa-circle-o"></i> Rewards Delivered</a></li>

			</ul></li>
		
		<li class="treeview"><a href="#"> <i class="fa fa-folder"></i>
				<span>Send Query</span> <i class="fa fa-angle-left pull-right"></i>
		</a>
			<ul class="treeview-menu">
				<li><a href="create_ticket"><i
						class="fa fa-circle-o"></i>Create Ticket</a></li>
			    <li><a href="view_tickets"><i
						class="fa fa-circle-o"></i>View Tickets</a></li>
			    <li><a href="add_problemtype"><i
						class="fa fa-circle-o"></i>Add Problem Type</a></li>

			</ul></li>
		<li class="treeview"><a href="/mlm-erp/logout"> <i class="fa fa-hand-o-up"></i>
				<span>Logout</span>
		</a></li>


	</ul>
	</section> <!-- /.sidebar --> </aside>
