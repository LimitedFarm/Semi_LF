<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
	.headerUnder{
		margin-top:120px;
	}
	#mainImg{
		width: 800px;
		height:500px;	
	}
	#mainGoShop{
		text-align: center;
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate( -50%, -50% );
	}
	
  	/* Make the image fully responsive */
  	.carousel-inner img {
   	   	width:400px;
   	   	 height:300px;
  	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	
	<div  class="headerUnder" style="text-align:center; background:lightgray" >
		<div>
			<img src="../../images/main.png" class="rounded" id="mainImg">
			<button class="btn btn-success" type="button" id="mainGoShop" style="z-index:100;">Shop Now</button>
		</div>
		<br>
		<hr width="80%">
		<br>
		<div id="demo" class="carousel slide" style="align:center; width:400px; data-ride="carousel">

			<!-- Indicators -->
			<ul class="carousel-indicators">
				<li data-target="#demo" data-slide-to="0" class="active"></li>
				<li data-target="#demo" data-slide-to="1"></li>
				<li data-target="#demo" data-slide-to="2"></li>
			</ul>

			<!-- The slideshow -->
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="../../images/tomato.png" alt="Los Angeles" style="opacity:0.8">
				</div>
				<div class="carousel-item">
					<img src="../../images/strawberry.png" alt="strawberry" style="opacity:0.5">
				</div>
				<div class="carousel-item">
					<img src="../../images/cherry.png" alt="New York" style="opacity:0.5">
				</div>
			</div>

			<!-- Left and right controls -->
			<a class="carousel-control-prev" href="#demo" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#demo" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>

		</div>


	</div>
</body>
</html>