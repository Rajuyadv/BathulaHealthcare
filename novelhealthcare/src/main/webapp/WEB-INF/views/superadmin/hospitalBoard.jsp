<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="panel panel-success">
		<!-- Default panel contents -->
		<div class="panel-heading">Hospital Management Board</div>
		<div class="col-md-6 col-sm-12 btn-margin-bottom action-buttons">
			<div class="btn-group" id="divAddNew">
				<a title="Add new" class="btn btn-block btn-danger btn-flat"
					href="./getHospitalRegForm"><span class="hide-on-mobile">Add
						New </span><i class="fa fa-plus"></i></a>
			</div>
			<div class="btn-group" id="divDelete">
				<a id="imgDelete" name="imgDelete" title="Delete"
					class="btn btn-block btn-primary btn-flat"><span
					class="hide-on-mobile">Delete </span><i class="fa fa-trash-o"></i></a>
			</div>
			<div class="btn-group" id="divActive">
				<a id="imgActive" name="imgActive" title="Active"
					class="btn btn-block btn-primary btn-flat"><span
					class="hide-on-mobile">Active </span><i class="fa fa-check"></i></a>
			</div>
			<div class="btn-group" id="divInactive">
				<a id="imgInactive" name="imgInactive" title="Inactive"
					class="btn btn-block btn-primary btn-flat"><span
					class="hide-on-mobile">Inactive </span><i class="fa fa-ban"></i></a>
			</div>
			<div class="btn-group">
				<a title="Show All" class="btn btn-block btn-primary btn-flat"
					onclick="showAllRecords();" href="./getAllHospitals"><span class="hide-on-mobile">Show
						All&nbsp;&nbsp;</span><i class="fa fa-th-list"></i></a>
			</div>
			<form action="./searchHospitals">
				<select id="ddlFilter"
					class="ddlFilter form-control input-sm input-small input-inline"
					selectedindex="0" name="searchKey">
					<option value="-- Select --">-- Select --</option>
					<option value="HospitalName">Hospital Name</option>
					<option value="Address1">Address1</option>
					<option value="Email">Email</option>
					<option value="Phone">Phone</option>
					<option value="IsActive">Status</option>
				</select> <input type="text" id="txtSearchField" name="searchValue"
					class="form-control input-sm input-small input-inline"> <a
					title="Search"><i class="fa fa-search"><input type="submit"
						class="btn btn-primary btn-flat" /></i></a>
			</form>

		</div>

		<!-- Table -->
		<table class="table">
			<tr>
				<th>Hospital Id</th>
				<th>Hospital Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Status</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${uiHospitalList}" var="hospBean">
				<!-- equals code:for(HospitalBean hospBean:uiHospitalList) by using for-each loop  -->
				<tr>
					<td>${hospBean.hospitalId}</td>
					<td>${hospBean.hospitalName}</td>
					<td>${hospBean.email}</td>
					<td>${hospBean.phone}</td>
					<td>${hospBean.status}</td>
					<td><a href="./editHospital?hospId=${hospBean.hospitalId}"><div
								class="glyphicon glyphicon-edit"></div></a></td>
					<td><a href="./deleteHospital?hospId=${hospBean.hospitalId }"><div
								class="glyphicon glyphicon-trash"></div></a></td>
				</tr>
			</c:forEach>
			<tr>

			</tr>
		</table>
		<nav>
		<ul class="pagination">
			<li><a href="./getAllHospitalsByPaging?currentPage=${loop.count}" aria-label="Previous"> <span
					aria-hidden="true">&laquo;</span>
					</a></li>
					 <c:forEach
						items="${pageBarList}" var="hospBean" varStatus="loop">
						<li><a href="./getAllHospitalsByPaging?currentPage=${loop.count}">${loop.count}</a></li>
					</c:forEach>
					<li><a href="./getAllHospitalsByPaging?currentPage=${loop.count}" aria-label="Next"> <span
							aria-hidden="true">&raquo;</span>
					</a></li>
		</ul>
		</nav>
	</div>
</body>
</html>