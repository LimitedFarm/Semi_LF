<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
#headerLine {
	margin-top: 98px;
	height:calc(100% - 98px); 
	display:inline;
	float:left;
	margin-right:10px;
}
#adminMenu{
	width: 250px; 
	height:100%; 
	border: 1px solid black;
}
span {
	padding-left:20px;
	margin-top: 2px;
	color:black;
	font-size:18px;
}
.nav-item hr{
	border: solid 1px black; 
	opacity: 0.3;
}
.navbar-nav li{
	width:180px;
}
</style>
</head>
<body id="page-top">
	<%@ include file="../common/menubar.jsp"%>
	<div id="headerLine">
		<!-- Sidebar -->
     	
	  			<div id="adminMenu">
	  			<nav class="navbar bg-light">
	
	  				<!-- Links -->
	  				<ul class="navbar-nav">
	    				<li class="nav-item">
	      					<a class="nav-link" href="../admin/adminMainPage.jsp"><span>관리자 Home</span></a>	
	      					<hr>
	    				</li>
	    				<li class="nav-item">
	      					<a class="nav-link" href="<%=request.getContextPath() %>/cuInfo.ad"><span>회원 관리</span></a>
	    				</li>
	    				<li class="nav-item">
	      					<a class="nav-link" href="<%=request.getContextPath() %>/selInfo.ad"><span>판매자 관리</span></a>
							<hr>
	    				</li>
	    				<li class="nav-item">
	      					<a class="nav-link" href="<%=request.getContextPath() %>/cReportInfo.ad"><span>회원 신고 내역</span></a>
			
	    				</li>
	    				<li class="nav-item">
	      					<a class="nav-link" href="<%=request.getContextPath() %>/sReportInfo.ad"><span>물품 신고 내역</span></a>
							<hr>
	    				</li>
	    				<li class="nav-item">
	      					<a class="nav-link" href="<%=request.getContextPath() %>/selList.ad"><span>판매 물품 관리</span></a>
							<hr>
	    				</li>
	    				<li class="nav-item">
	      					<a class="nav-link" href="<%=request.getContextPath() %>/question.ad"><span>1대1 문의</span></a>
							<hr>
	    				</li>
	  				</ul>
				</nav>
			</div>
		</div>

</body>
</html>