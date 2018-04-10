<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="favicon.ico">
</head>
<!-- Navigation -->
<%-- <nav class="navbar navbar-expand-lg navbar-default">
<div class="container">

<!-- 	<div class="navbar-header page-scroll">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target="#bs-example-navbar-collapse-1">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand page-scroll" href="#page-top"><img
			src="resources/images/weblogo.png" alt="Treviso theme logo"></a>
	</div> -->

	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		<ul class="nav navbar-nav navbar-right">
			<li class="hidden"><a href="#page-top"></a></li>
			<li><a class="page-scroll" href="<c:url value="/shoppingnews"/>">쇼핑 뉴스</a></li>
			<li><a class="page-scroll" href="<c:url value="/recommendationService"/>">추천 상품</a></li>
			<li><a class="page-scroll" href="<c:url value="/couponPage"/>">쿠폰/이벤트</a></li>
			<li><a class="page-scroll" href="<c:url value="/floorInfo"/>">층별 안내</a></li>
		</ul>
	</div>
</div>
</nav>
<!--      <header class="masthead text-center text-white">
      <div class="masthead-content">
        <div class="container">
          <h3 class="masthead-heading mb-0">Smart Shopping Mall</h3>
          <h4 class="masthead-subheading mb-0">Infinity Beacon</h4>
          <a href="#" class="btn btn-primary btn-xl rounded-pill mt-5">이벤트 보기</a>
        </div>
      </div>
    </header> --> --%>
