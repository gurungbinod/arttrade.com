<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Art-Trade.com
</h1>
<h3>Event Organizer Sign Up Form:</h3>

<form:form modelAttribute="eventOrg" action="/eventOrg" method="POST" >  	
	<label for="name">Organizer Name: </label>
    <form:input path="name" id="name"></form:input>
    <form:errors path="name" cssclass="error"></form:errors>
    <br />
    <label for="email">Email: </label>
    <form:input type="email" path="email" id="email"></form:input>
    <form:errors path="email" cssclass="error"></form:errors>
    <br />
    <label for="password">Password: </label>
    <form:input type="password" path="password" id="password"></form:input>
    <form:errors path="password" cssclass="error"></form:errors>
    <br />
    <label for="rePassword">Password: </label>
    <form:input type="password" path="rePassword" id="rePassword"></form:input>
    <form:errors path="rePassword" cssclass="error"></form:errors>
    <br />
    <label for="address">Address: </label>
    <form:input type="text" path="address" id="address"></form:input>
    <form:errors path="address" cssclass="error"></form:errors>
    <br />
	<input type="submit" value="Sign Up">
</form:form>

</body>
</html>
