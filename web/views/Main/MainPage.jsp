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
<link rel="stylesheet" type="text/css" href="css/pageSlider.css">
<title>Insert title here</title>
<style>
	.headerBanner{
		margin-top:110px;
		width:100%;
      	height:700px;
      	background:#f3f3f2;
      	margin-left:auto;
      	margin-right:auto;
      	vertical-align:center;
      	align:center;
      	background:url('<%=request.getContextPath()%>/images/greenTeaFarm.jpg') no-repeat;
	}
	
  	/* Make the image fully responsive */
  	.carousel-item img {
   	   	width:900px;
   	   	height:400px;
   	   	margin-left:auto;
      	margin-right:auto;
      	vertical-align:center;
      	align:center;
  	}
  	.carousel-inner{
  		width:900px;
   	   	height:400px;
   	   	margin-left:auto;
      	margin-right:auto;
      	vertical-align:center;
      	align:center;
  	}
  	.carousel-item{
  		width:900px;
   	   	height:400px;
   	   	margin-left:auto;
      	margin-right:auto;
      	vertical-align:center;
      	align:center;
  	}
  	#LF_Carousel{
  		width:900px;
   	   	height:400px;
   	   	margin-left:auto;
      	margin-right:auto;
      	vertical-align:center;
      	align:center;
  	}
  	hr{
  		border
  	}
</style>
</head>
<body style="background-color:#f3f3f2;">
	<%@ include file="../common/menubar.jsp" %>
	<!-- 배너 -->
	<div class="headerBanner">
		<div class="innerBanner">
			<div id="LF_Carousel" class="carousel slide" data-ride="carousel">

				<ul class="pgwSlider">
					<li><img src="paris.jpg" alt="Paris, France"
						data-description="Eiffel Tower and Champ de Mars"></li>
					<li><img src="montreal_mini.jpg" alt="Montréal, QC, Canada"
						data-large-src="montreal.jpg"></li>
					<li><img src="shanghai.jpg"> <span>Shanghai,
							China</span></li>
					<li><a href="http://www.nyc.gov" target="_blank"> <img
							src="new-york.jpg"> <span>New York, NY, USA</span>
					</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div>
		<!-- <br>
		<hr>
		<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;신상품</h3>
		<hr>
		<div id="LF_Carousel" class="carousel slide"  data-ride="carousel">

			Indicators
			<ul class="carousel-indicators">
				<li data-target="#LF_Carousel" data-slide-to="0" class="active"></li>
				<li data-target="#LF_Carousel" data-slide-to="1"></li>
				<li data-target="#LF_Carousel" data-slide-to="2"></li>
			</ul>

			The slideshow
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="../../images/tomato.png" class="img-responsive center-block" alt="Los Angeles" style="opacity:0.7">
				</div>
				<div class="carousel-item">
					<img src="../../images/strawberry.png" class="img-responsive center-block" alt="strawberry" style="opacity:0.7">
				</div>
				<div class="carousel-item">
					<img src="../../images/cherry.png" class="img-responsive center-block" alt="New York" style="opacity:0.7">
				</div>
			</div>
			Left and right controls
			<a class="carousel-control-prev" href="#LF_Carousel" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a> <a class="carousel-control-next" href="#LF_Carousel" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>
			
		</div> -->


	</div>
</body>
</html>