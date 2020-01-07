<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<htlm>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>${name}'s todos</title>
</head>

<body>
<div class="container">
<h1>Your todos</h1>
	<table class="table table-striped">
		<caption>Your todos</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is it done?</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.desc}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a type="button" href="/delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
	</table>
	<div><a class="button" href="/add-todo">Add a to do</a></div>
</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>