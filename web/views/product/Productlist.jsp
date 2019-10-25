<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "LF.product.model.vo.ProductList,java.util.ArrayList"%>
<%
	ArrayList<ProductList> plist = (ArrayList<ProductList>)request.getAttribute("plist"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#cataWrap{
	margin : 0 auto;
	width : 1000px;
	}

	#productWrap{
	position: relative;
	padding :10px;
	margin : 0 auto;
	border: 1px solid black;
	border-radius: 5px;
	width : 1000px;
	height : 1000px;
	}
	.productWrap{

	margin :10px;
	display: inline-block;
	border: 1px solid black;
	width : 220px;
	height: 300px;
	}
	.cateBtn{
	border-radius: 5px;
	}
	
	#product_imgwraper{
	margin : 0px auto;
	border: 1px solid black;
	width : 210px;
	height: 200px;
	}
	
	#gocart{
	float : right;
	border-radius: 5px;
	text-align : center;
	margin : 4px;
    margin-top: 1px;
	background-color : #ff6a57;
	color : white;
	border: 1px solid black;
	width : 90px;
	height: 25px;
	}
	#gocart:hover{
	background-color : #ff2235;
	cursor: pointer;
	transition: 0.5s;
	}
	#product_title{
	text-align : center;
	margin : 2px;
	border: 1px solid black;
	width : 210px;
	height: 25px;
	}
	#product_price{
	text-align : center;
	margin : 2px;
	border: 1px solid black;
	width : 210px;
	height: 25px;
	}
	#test1{
	margin : 0px auto;
	width : 215px;
	height: 265px;
	}
	
	
	/* Pagination links */
	
#pagination {             /* 페이지네이션 div */
	align : center;
	position:absolute;
	bottom:10px;
 	border : 2px solid red;
    width : 97.7%;
    height : 60px;
    	}
    	
   #awrap{				/* A태그 묶음 div */
	border : 2px solid red;
    margin-top: 3px;
    margin-left: 3px;
    margin-right: 2px;
    margin-bottom: 2px;
 	padding : 5px;
 	height : 50px;
 	display: inline-block;
   } 
    	
.pagination1 a {
  color: black;
  float: left;
  padding: 8px 16px;
  text-decoration: none;
  transition: background-color .3s;
}

/* Style the active/current link */
.pagination1 a.active {
  background-color: dodgerblue;
  color: white;
}

/* Add a grey background color on mouse-over */
.pagination1 a:hover:not(.active) {
	background-color: #ddd;
	}

</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp"%>
	
<div style="margin-top: 120px;margin-bottom: 20px;"  >
	<h1 align = "center">상품 리스트</h1>
	<hr>
	<div id ="cataWrap">
	<button class = "cateBtn">과일</button> <button class = "cateBtn">채소</button>	
	<button class = "cateBtn">견과류</button>	<button class = "cateBtn">가공품</button>
	</div>
	<hr>
	<div id = "productWrap">
		<div class = "productWrap">
			<div id ="content">
				<div id ="test1">
				<div id="product_imgwraper">
					<img src="">
				</div>
				<div id ="product_title">기모링ㅇㅇㅇㅇㅇㅇ</div>
				<div id ="product_price">100억</div>
				</div>
				<div id = "gocart">go cart</div>
			</div>
		</div>
		
			<div class="pagination1" id ="pagination" style="text-align:center">
				
				<div id = "awrap">
			
					<a href="#">&laquo;</a>
 		 			<a class="active" href="#">1</a>
 		 			<a href="#">2</a>
  		 			<a href="#">3</a>
  		 			<a href="#">4</a>
  		 			<a href="#">5</a>
 					<a href="#">&raquo;</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>