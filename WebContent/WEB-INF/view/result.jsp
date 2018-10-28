<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>URL</title>
</head>
<body>

<c:redirect url = ${finalUrl}/>

   <!--  response.sendRedirect(${finalUrl})  	response.sendRedirect(${finalUrl}); --> 

</body>
</html>