<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<c:url value="/resources/view.css" var="viewCSS" />
<c:url value="/resources/view.js" var="viewJS" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="${viewCSS}" rel="stylesheet" />
<script src="${viewJS}"></script>

<title>URL Shortener</title>

</head>


<body id="main_body" >
<c:url value="/resources/top.png" var="top-image" />
<c:url value="/resources/bottom.png" var="bottom-image" />
	
		
	<img id="top" src="${top-image}" alt="">
	<div id="form_container">
	
		<h1><a>URL Shortener</a></h1>
		<form id="form_32770" class="appnitro"  method="get" action="processData">
					<div class="form_description">
			<h2>URL Shortener</h2>

		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="element_1">ERROR!!!</label>
		<div>
			<td>The short URL doesn't exist in our database. Please refer to</td>
			<td><A HREF="/URL-Shortner/" style="text-decoration:none" class="A">Home Page</a> </td>
		</div> 

			</ul>
		</form>	
	</div>
	<img id="bottom" src="${bottom-image}" alt="">
	</body>
</html>