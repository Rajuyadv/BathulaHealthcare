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
								<form:form id="registration-form" action="./updateAdmin"
									commandName="adminBean" method="POST" role="form"
									style="display: block;">
									<div class="row">
				                                    <div class="col-md-4">
				                                        <div class="form-group">
				                                            <label class="control-label"><label for="User_CompanyId">Hospital</label><span class="required">*</span></label>
				                                            <form:select class="form-control" path="hospitalName" style="">
																<form:option value="">-- Select Hospital --</form:option>
																<form:options items="${hospList}"></form:options>
															</form:select>
				                                            <span class="field-validation-valid" data-valmsg-for="User.CompanyId" data-valmsg-replace="true"></span>
				                                        </div>
				                                    </div>
				                                </div>
									<div class="form-group">
										<form:input path="adminId" type="hidden" id="adminId"
											tabindex="1" class="form-control" placeholder="AdminId"
											value="${adminBean.adminId}"></form:input>
									<div class="form-group">
										<form:input path="firstName" type="text" id="firstName"
											tabindex="1" class="form-control" placeholder="FirstName"
											value="${adminBean.firstName}"></form:input>
									</div>

									<div class="form-group">
										<form:input path="middleName" type="text" id="middleName"
											tabindex="1" class="form-control" placeholder="MiddleName"
											value="${adminBean.middleName}"></form:input>
									</div>
									<div class="form-group">
										<form:input path="lastName" type="text" id="lastName"
											tabindex="1" class="form-control" placeholder="LastName"
											value="${adminBean.lastName}"></form:input>
									</div>
									<div class="form-group">
										<form:input path="profileDocuments" type="text"
											id="profileDocuments" tabindex="1" class="form-control"
											placeholder="ProfileDocuments"
											value="${adminBean.profileDocuments}"></form:input>
									</div>
									<div class="form-group">
										<form:input path="email" type="text" id="email" tabindex="1"
											class="form-control" placeholder="Email" value=""></form:input>
									</div>
									<div class="form-group">
										<form:input path="password" type="text" id="password"
											tabindex="1" class="form-control" placeholder="Password"
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
