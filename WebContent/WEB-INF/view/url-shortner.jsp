<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<!-- <c:url value="/resources/view.css" var="viewCSS" />  -->
<!-- <link href="${viewCSS}" rel="stylesheet" />  -->
<!-- <c:url value="/resources/view.js" var="viewJS" /> -->
<!-- <script src="${viewJS}"></script> -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/view.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/view.js"></script>

<title>URL Shortener</title>

</head>


<body id="main_body" >	
		
	<img id="top" src="${pageContext.request.contextPath}/resources/top.png" alt="">
	<div id="form_container">
	
		<h1><a>URL Shortener</a></h1>
		<form:form id="form_32770" class="appnitro" action="short-url" modelAttribute="urlProcess" method="POST">
					<div class="form_description">
			<h2>URL Shortener</h2>
			<p>Add the URL in the box and press submit button to get it shortened.</p>
		</div>						
			<ul >
			
					<li id="li_1" >
		<label class="description" for="element_1">URL: </label>
		<div>
			<form:input path="records" id="element_1" name="insert_url" class="element text large" type="text" maxlength="255" value="" /> 
		</div> 
		</li>
			
					<li class="buttons">
			    <input type="hidden" name="form_id" value="32770" />
			    
				<input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" />
		</li>
			</ul>
		</form:form>	
	</div>
	<img id="bottom" src="${pageContext.request.contextPath}/resources/bottom.png" alt="">
	</body>
</html>