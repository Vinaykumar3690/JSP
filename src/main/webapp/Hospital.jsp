<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Hospital Home Page</title>
	<style>
		body {
			margin: 0;
			padding: 30;
			font-family: Arial, sans-serif;
			 border-radius: 50px;
		
		}
		#box {
			width: 800px;
			height: 500px;
			background-color: #F5F5F5;
			border: 1px solid #DDDDDD;
			box-shadow: 2px 2px 5px #CCCCCC;
			border-radius: 10px;
			margin: 50px auto;
			padding: 20px;
		}

		header {
			background-color: #2c3e50;
			color: #fff;
			padding: 20px;
			
		}

		h1 {
			margin: 0;
			font-size: 36px;
			text-align: center;
		}

		nav {
			background-color: #34495e;
			color: #fff;
			padding: 10px;
		}

		nav ul {
			margin: 0;
			padding: 0;
			list-style: none;
			text-align: center;
		}

		nav ul li {
			display: inline-block;
			margin-right: 20px;
		}

		nav ul li a {
			display: block;
			color: #fff;
			text-decoration: none;
			padding: 10px;
			border-radius: 5px;
			transition: background-color 0.3s ease;
		}

		nav ul li a:hover {
			background-color: #f39c12;
		}

		main {
			padding: 90px;
			margin: 50px;
			background-color: #ecf0f1;
			border-radius: 6px;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
		}

		footer {
			background-color: #2c3e50;
			color: #fff;
			padding: 10px;
			text-align: center;
		}
	</style>
</head>
<body>
	<div id="box">
	<header>
		<h1>Well come to Hospitals</h1>
	</header>
	<nav>
		<ul>
<li><a href="SaveHospital.jsp ">CreateHospital</a></li>
<li><a href="displayHospital">DisplayHospital</a></li>
<li><a href="UpdateHospital.jsp">UpdateHospital</a></li>
</ul>
	</nav>
	<main>
	<footer>
		<p>&copy; 2023 Hospital Name. All rights reserved.</p>
	</footer>
		
	</main>
	
	</div>
	
	
	
</body>
</html>
