<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<htlm>
<head>
<title>${name}'s todos</title>
</head>

<body>
<h1>Your todos</h1>
	<table>
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
				</tr>
			</c:forEach>
			</tbody>
	</table>
	<a href="/add-todo">Add a to do</a>
</body>
</html>