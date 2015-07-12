<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Art-Trade.com
</h1>

<a href="/login">Sign in to your account</a>

<p>Your account is created successfully.</p>

<h4>Account Details</h4>
<p>${eventOrg.toString()}</p>
</body>
</html>
