<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="Peach">
	<div>
		<link rel="stylesheet" type="text/css"
			href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		<script
			src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$('#table_id').DataTable();
			});
		</script>
	</div>
	<table border="1" , align="center" , id="table_id">
		<thead>
			<tr bgcolor="apricot">
				<th>Sr-No.</th>
				<th>SSN-No.</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>PhoneNo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ models }" var="model" varStatus="index">
				<tr>
					<td bgcolor="tan"><c:out value="${index.count}" /></td>
					<td bgcolor="tan"><c:out value="${model.ssnNo}" /></td>
					<td bgcolor="tan"><c:out value="${model.firstName}" /></td>
					<td bgcolor="tan"><c:out value="${model.lastName}" /></td>
					<td bgcolor="tan"><c:out value="${model.phoneNo}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div align="center">
		<h2>
			<a href="form">HomePage</a>
		</h2>
	</div>
</body>


