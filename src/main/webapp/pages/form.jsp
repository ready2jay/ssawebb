<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body bgcolor="Tan">
	<center>
		<div>
			<link rel="stylesheet"
				href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
			<link rel="stylesheet" href="/resources/demos/style.css">
			<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
			<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
			<script
				src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
			<script type="text/javascript">
				$(document).ready(function() {
					$("#dob").datepicker({
						changeMonth : true,
						changeYear : true
					});
					$("#form").validate({
						
						
						rules : {
							firstName : 'required',
							lastName : 'required',
							phoneNo : 'required'
						},

						messages : {
							firstName : 'This field is required',
							lastName : 'This field is required',
							phoneNo : 'This field is required'
						},
						submitHandler : function(form) {
							form.submit();
						}
					});
				});
			</script>
		</div>
		<h1 style="color: red">
			<u>SSA Form For A NewJersey State</u>
		</h1>

		<div align="center">
			<font style="color: grey">${ Success  }</font> <font
				style="color: red">${  Failure }</font>
		</div>

		<form:form action="enrollSsn" method="post" id="form"
			modelAttribute="ssaModel" enctype="multipart/form-data">
			<table border="2" bordercolor="red">
				<tr>
					<td>FirstName::</td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td>LastName::</td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td>PhoneNo::</td>
					<td><form:input path="phoneNo" /></td>
				</tr>
				<tr>
					<td>Gender::</td>
					<td><form:radiobuttons path="gender" items="${ genderList }" /></td>
				</tr>
				<tr>
					<td>DOB::</td>
					<td><form:input path="dob" /></td>
				</tr>
				<tr>
					<td>State::</td>
					<td><form:select path="state" items="${ stateList }" /></td>
				</tr>
				<tr>
					<td>UpdatedBy::</td>
					<td><form:input path="updatedBy" /></td>
				</tr>
				<tr>
					<td>Upload Photo::</td>
					<td><form:input path="photo" type="file" /></td>
				</tr>
			</table>
			<br>
			<input type="reset" value="Reset" />
			<input type="submit" value="Enroll" />
			<h2>
				<a href="displayAll">View All SSN Details</a>
			</h2>
		</form:form>
	</center>
</body>