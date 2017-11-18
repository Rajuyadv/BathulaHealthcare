<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href='<core:url value="/resources/css/bootstrap.min.css"/>'>
<link rel="stylesheet"
	href='<core:url value="/resources/css/login.css"/>'>
<%-- <link href="<core:url value="/resources/css/animate.css"/>" rel="stylesheet">  --%>
<!-- jQuery -->
<script src='<core:url value="/resources/js/jquery.js"/>'></script>
<!-- Bootstrap Core JavaScript -->
<script src='<core:url value="/resources/js/bootstrap.min.js"/>'></script>

<%-- <script src="<core:url value="/resources/css/bootstrap.min.css"/>"></script> --%>
<script src='<core:url value="/resources/js/login.js"/>'></script>

<script type="text/javascript">
	
</script>
<body>
	<!-- Fixed navbar -->
	<nav id="header" class="navbar navbar-fixed-top">
	<div id="header-container" class="container navbar-container">
		<div class="navbar-header">

			<a id="brand" class="navbar-brand" href="#"><img
				src="resources/images/hospital-logo.jpg" alt="logo"
				class="img img-responsive" /></a>
		</div>
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="home">Home</a></li>
				<li class="active"><i class="icon-home icon-black"></i><a
					href="home">SignUp</a></li>

				<li><a href="getLoginPage">Login</a></li>
				<li><a href="about">About</a></li>
				<li><a href="contact">Contact</a></li>
				<li><a href="contact"></a></li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
	</div>
	<!-- /.container --> </nav>
	<!-- /.navbar -->

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<label class="active" id="login-form-link"> Login</label>
							</div>

						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form:form id="login-form" action="./registration"
									commandName="ManageUserProfileBean" method="GET" role="form"
									style="display: block;">
									<div class="form-group">
										<form:input path="firastName" type="text" id="firstname"
											tabindex="1" class="form-control" placeholder="FirstName"
											value=""></form:input>
									</div>
									<div class="form-group">
										<form:input path="lastName" type="text" id="lastname"
											tabindex="2" class="form-control" placeholder="LastName"
											value=""></form:input>
									</div>
									<div class="form-group">
										<form:input path="email" type="text" id="email" tabindex="3"
											class="form-control" placeholder="Email" value=""></form:input>
									</div>
									<div class="form-group">
										<form:input path="userName" type="text" id="username"
											tabindex="4" class="form-control" placeholder="Username"
											value=""></form:input>
									</div>
									<div class="form-group">
										<form:input path="password" type="password" id="password"
											tabindex="5" class="form-control" placeholder="Password"></form:input>
									</div>
									<div class="form-group">
										<form:input path="phoneNum" type="number" id="phonenum"
											tabindex="6" class="form-control" placeholder="PhoneNum"></form:input>
									</div>
									<!-- <div class="form-group text-center">
          <input type="checkbox" tabindex="7" class="" name="remember"
           id="remember"> <label for="remember">
           Remember Me</label>
         </div> -->
									<hr>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<div style="float: left; width: 130px">
													<input type="submit" id="login-submit" tabindex="7"
														align="left" class="form-control btn btn-login"
														value="Registration">

												</div>
											</div>
										</div>
									</div>


									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" id="login-submit" tabindex="8"
													class="form-control btn btn-login" value="cancel">
											</div>
										</div>
									</div>
									</hr>

								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="container">

		<div class="row row-offcanvas row-offcanvas-right">

			<div class="col-xs-12 col-sm-9">

				<hr>

				<footer>
				<p>© Company 2014</p>
				</footer>
			</div>
		</div>
	</div>
</body>
</html>