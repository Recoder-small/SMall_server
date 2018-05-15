<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">

<meta name="viewport"
	content="width=device-width, user-scalable=no, maximum-scale=1.0, minimum-scale=1.0">
<!-- <meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no"> -->

<link rel="icon" href="favicon.ico">


<title><tiles:insertAttribute name="title" /></title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/one-page-wonder.css">
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">


<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">
<link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">



<!-- Fashion Pop Up Page -->

<title>Exclusivity - Free Bootstrap 4 Template</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Free Template by Free-Template.co" />
<meta name="keywords"
	content="free bootstrap 4, free bootstrap 4 template, free website templates, free html5, free template, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="Free-Template.co" />

<link href="https://fonts.googleapis.com/css?family=Raleway"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/open-iconic-bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/animate.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/icomoon.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.fashion.css">

<!-- Beauty Pop Up Page -->

<!-- Mobile Specific Meta -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->

<!-- Bootstrap  -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

<!-- icon fonts font Awesome -->
<link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet">

<!-- Custom Styles -->
<link href="${pageContext.request.contextPath}/resources/css/style.beauty.css" rel="stylesheet">

<!--[if lt IE 9]>
	<script src="assets/js/html5shiv.js"></script>
	<![endif]-->


</head>
<body>
	<div>
		<tiles:insertAttribute name="menu" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="<c:url value="/resources/vendor/jquery/jquery.min.js"/>">
		
	</script>
	<script src="<c:url value="/resources/js/bootstrap.min.js"/> ">
		
	</script>
	<script src="<c:url value="/resources/js/SmoothScroll.js"/> ">
		
	</script>
	<script src="<c:url value="/resources/js/theme-scripts.js"/> ">
		
	</script>


	<script
		src="<c:url value="/resources/vendor/jquery/jquery.haneul.js"/>">
		
	</script>



	<script src="<c:url value="/resources/js/popper.min.js"/> "></script>
	<script src="<c:url value="/resources/js/jquery.easing.1.3.js"/> "></script>
	<script src="<c:url value="/resources/js/jquery.waypoints.min.js"/> "></script>
	<script src="<c:url value="/resources/js/owl.carousel.min.js"/> "></script>
	<script
		src="<c:url value="/resources/js/jquery.animateNumber.min.js"/> "></script>


	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	<script src="<c:url value="/resources/js/google-map.js"/> ">
		
	</script>

	<script src="<c:url value="/resources/js/main.js"/> ">
		
	</script>


	<!-- jQuery Library -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery-2.1.0.min.js"/> "></script>
	<!-- Modernizr js -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/modernizr-2.8.0.min.js"/> "></script>
	<!-- Plugins -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/plugins.js"/>">
		
	</script>
	<!-- Custom JavaScript Functions -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/functions.js"/> "></script>
	<!-- Custom JavaScript Functions -->
	<script type="text/javascript"
		src="<c:url value="/resources/js/jquery.ajaxchimp.min.js"/>">	
	</script>

</body>
</html>
