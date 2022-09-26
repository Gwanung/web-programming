<html>
<head>
<title>Welcome</title>
</head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav>
	<%!String greeting = "Welcome to Web Shopping Mall";
	String tagline = "Welcome to Web Market";%>
	<h1><%=greeting%></h1>
	<h3><%=tagline%></h3>
</body>
</html>