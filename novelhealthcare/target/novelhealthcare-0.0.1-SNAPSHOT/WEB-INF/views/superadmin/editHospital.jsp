<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="col-xs-6">
								<label class="active" id="login-form-link">Edit</label>
							</div>

						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form:form id="registration-form" action="./updateHospital"
									commandName="hospBean" method="POST" role="form"
									style="display: block;">
									<div class="form-group">
										<form:input path="hospitalId" type="hidden" id="hospitalId"
											tabindex="1" class="form-control" placeholder="HospitalId"
											value="${hospBean.hospitalId}"></form:input></div>
								
									<div class="form-group">
										<form:input path="hospitalName" type="text" id="hospitalName"
											tabindex="1" class="form-control" placeholder="HospitalName"
											value="${hospBean.hospitalName}"></form:input></div>
								
									<div class="form-group">
										<form:input path="address" type="text" id="address"
											tabindex="1" class="form-control" placeholder="Address"
											value="${hospBean.address}"></form:input>
									</div>
									<div class="form-group">
										<form:input path="address1" type="text" id="address1"
											tabindex="1" class="form-control" placeholder="Address1"
											value="${hospBean.address1}"></form:input>
									</div>

									<div class="form-group">
										<form:input path="city" type="text" id="city" tabindex="1"
											class="form-control" placeholder="City" value="${hospBean.city}"></form:input>
									</div>
									<div class="form-group">
										<form:input path="state" type="text" id="state" tabindex="1"
											class="form-control" placeholder="State" value="${hospBean.state}"></form:input>
									</div>
									<div class="form-group">
										<form:input path="email" type="text" id="email" tabindex="1"
											class="form-control" placeholder="Email" value=""></form:input>
									</div>
									<div class="form-group">
										<form:input path="zipcode" type="text" id="zipcode"
											tabindex="1" class="form-control" placeholder="Zipcode"
											value=""></form:input>
									</div>
									<div class="form-group">
										<form:input path="phone" type="text" id="phoneNumber"
											tabindex="1" class="form-control" placeholder="PhoneNumber"
											value=""></form:input>
									</div>


									<div class="form-group">
										<form:input path="status" type="text" id="status" tabindex="1"
											class="form-control" placeholder="Status" value=""></form:input>
									</div>
									<!-- <div class="form-group text-center">
          <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
          <label for="remember"> Remember Me</label>
         </div> -->
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" id="registration-submit" tabindex="4"
													class="form-control btn btn-registartion" value="update">
											</div>
										</div>
									</div>
									<!-- <div class="form-group">
          <div class="row">
           <div class="col-sm-6 col-sm-offset-3">
            <input type="submit"  id="registration-cancel" tabindex="4" class="form-control btn btn-login" value="Log In">
           </div>
          </div>
         </div> -->

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
