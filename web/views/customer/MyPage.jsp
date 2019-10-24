<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="LF.member.model.vo.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/mypage/menubar.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/reset.css" />
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic&display=swap&subset=korean" rel="stylesheet">

<script src="${pageContext.request.contextPath }/js/mypage/menubar.js" ></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<style>
	.container {
	border: 1px solid black;
	width: 1280px;
	min-width: 1280px;
	margin:0 auto;
	min-height: 800px;
	padding-bottom: 100px;
}

.nameArea {
   min-width: 320px;
    min-height: 195px;
    float: left;
    margin-top: 20px;
    margin-left: 40px;
    
}

.nameArea > span:nth-child(1) {
    margin-top: 20px;
    margin-left: 10px;
    display: inline-block;
    font-size: 23px;
    font-weight: bold;
}

.nameArea > span:nth-child(2) {
	font-size: 13px;
}

.nameArea > span:nth-child(2) a {
	text-decoration: none;
	color: #2c2cff;
}

.nameArea > span:nth-child(3) {
	display: block;
    margin-left: 10px;
    margin-top: 15px;
    color: #5d5d5d;
    font-size: 15px;
    border-bottom: 2px solid #929292;
    padding-bottom: 15px;
}

.nameArea img {
	width: 80px;
    margin-left: 10px;
    margin-top: 20px;
}

.nameArea > span:nth-child(4) {
	font-size: 35px;
    float: right;
    margin-top: 40px;
    /* margin-right: 75px; */
    font-weight: bold;
}

.nameArea .number {
	font-size: 35px;
}



.infoArea {
    min-height: 200px;
    margin-top: 30px;
    margin-left: 590px;
}

.infoArea ul {
	float: left;
}

.infoArea ul li {
	display: inline-block;
    width: 160px;
    height: 190px;
    text-align: center;
    
    background: #f1f1f1;
    background-repeat: no-repeat;
    background-size: 45px;
    background-position: 5px 5px;
    
    cursor: pointer;
}

.infoArea ul li:nth-child(1) {
	background-image: url(../../resources/img/mypage/order.png);
}

.infoArea ul li:nth-child(2) {
	background-image: url(../../resources/img/mypage/cart.png);
}

.infoArea ul li:nth-child(3) {
	background-image: url(../../resources/img/mypage/review.png);
}

.infoArea ul li:nth-child(4) {
	background-image: url(../../resources/img/mypage/qna.png);
}

.infoArea ul li span:nth-child(1) {
    display: inline-block;
    margin-top: 20px;
    font-weight: 500;
    font-size: 20px;
    float: left;
    margin-left: 65px;
}

.infoArea ul li span:nth-child(2) {
	display: block;
    font-size: 50px;
    margin-top: 88px;
}

.orderListArea, .cartListArea {
	width: 1015px;
    border: 1px solid #cccccc;
    margin-left: 40px;
    display: inline-block;
    margin-top: 20px;
}

.cartListArea {
    margin-left: 230px;
    margin-top: 20px;
    display: block;
}

.orderListArea table, .cartListArea table {
	width: 100%;
	text-align: center;
}

.orderListArea table tr th, .cartListArea table tr th {
	background: #cccccc;
	height: 30px;
	line-height: 30px;
}

.orderListArea table tr td, .cartListArea table tr td {
	border-bottom: 1px solid #cccccc;
	height: 30px;
	line-height: 30px;
}

.orderListArea table tr td:nth-child(1), .cartListArea table tr td:nth-child(1) {
	text-align: left;
	padding-left: 15px;
}

.orderListArea table tr th:nth-child(1), .cartListArea table tr th:nth-child(1) {
	width:45%
}
.orderListArea table tr th:nth-child(2), .cartListArea table tr th:nth-child(2){
	width:20%;
}
.orderListArea table tr th:nth-child(3), .cartListArea table tr th:nth-child(3){
	width:20%;
}
.orderListArea table tr th:nth-child(4), .cartListArea table tr th:nth-child(4) {
	width:15%;
}


</style>
</head>
<body>

	
	<%@ include file="../seller/menubar.jsp" %>

<%System.out.println(sellerUser.getbName()); 
System.out.println(loginUser.getGroupNum());
%>
	
		<div class="container">
			
			<div class="nameArea">
				<span>환영합니다 alexohjr님</span>
				<span><a href="${pageContext.request.contextPath }/myConfirm.bo">[ 회원정보수정 ]</a></span>
				<span>가입일자 2019.09.09</span>
				<span><span class="number comma" data-count="10000"></span>원</span>
				<img src="${pageContext.request.contextPath }/resources/img/mypage/coins.png" />
			</div>
			
			
			
			<div class="infoArea">
				<ul>
					<li class="Order">
						<span>주문</span>
						<span class="number" data-count="24"></span>
					</li>
					
					<li class="Cart">
						<span>장바구니</span>
						<span class="number" data-count="5"></span>
					</li>
					
					<li class="Review">
						<span>리뷰</span>
						<span class="number" data-count="7"></span>
					</li>
					
					<li class="Qna">
						<span>문의</span>
						<span class="number" data-count="2"></span>
					</li>
				</ul>
			
			</div>
			
			<div class="orderListArea">
				<table>
					<tr>
						<th>상품명</th>
						<th>수량</th>
						<th>판매자</th>
						<th>상태</th>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td>배송완료</td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td>배송완료</td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td>배송완료</td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td>배송완료</td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td>배송완료</td>
					</tr>
				</table>	
			</div>
			
			<div class="cartListArea">
				<table>
					<tr>
						<th>상품명</th>
						<th>수량</th>
						<th>판매자</th>
						<th>주문</th>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td><input type="button" value="주문하기" class="orderBtn" /></td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td><input type="button" value="주문하기" class="orderBtn" /></td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td><input type="button" value="주문하기" class="orderBtn" /></td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td><input type="button" value="주문하기" class="orderBtn" /></td>
					</tr>
					
					<tr>
						<td>강원도 감자 포테이토</td>
						<td>2</td>
						<td>chris</td>
						<td><input type="button" value="주문하기" class="orderBtn" /></td>
					</tr>
				</table>	
			
			</div>
		
		
		</div>
		
<input type="hidden" class="flag" value="${flag }" />

	</div>
	
	<script>
	
	$(function() {
		increaseNumber(); // 숫자 증가 시켜주기
		
		bindLink();
		
		flagAlert();
	});


	function increaseNumber() {
		$('.number').each(function() {
			var $this = $(this), countTo = $this.attr('data-count');

			$({
				countNum : $this.text()
			}).animate({
				countNum : countTo
			},

			{
				duration : 1500,
				easing : 'linear',
				step : function() {
					if($this.hasClass("comma")){
						$this.text(Math.floor(this.countNum).toString().replace(/\B(?=(\d{3})+(?!\d))/g, ","));
					} else {
						$this.text(Math.floor(this.countNum));
					}
				},
				complete : function() {
					if($this.hasClass("comma")) {
						$this.text(this.countNum.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ","));
					} else {
						$this.text(this.countNum);
					}
					// alert('finished');
				}

			});

		});
		
	}




	function bindLink() {
		$(".infoArea ul li").on("click", function() {
			$class = $(this).attr("class");
			
			location.href = "./my"+$class+".bo";
		});
	}

	function flagAlert() {
		if($(".flag").val() > 0) {
			swal("회원정보수정이 완료되었습니다.", "", "success");
		}
	}



	 function selRegist(){
		 window.location.replace("<%=request.getContextPath() %>/views/seller/SellerRegist.jsp");
	 }
	</script>

</body>
</html>