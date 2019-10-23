<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="LF.member.model.vo.*"%>
<% 
	//1. 로그인 된 유저 정보 가져와야 함.(loginUser)
	Customer customer = (Customer)session.getAttribute("loginUser");
	
	//2. 해당 유저가 판매자로 등록되어 있는지 확인해야 함. 등록되어 있으면 해당 값 가져옴 (seller)
	Seller seller = (Seller)session.getAttribute("seller");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#sellerMenu{
		margin-top : 130px;
		width: 200px; 
		height: 500px;	
		display:inline-block;
		text-align:center;
	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	
	<div id="sellerMenu">
		<a href="../Main/MainPage.jsp"><span>LFmall HomePage</span></a><br>
		<a href="<%=request.getContextPath() %>/sellerRegist.selr?userId="><span>판매자 등록하기</span></a><br>
		<a href="<%=request.getContextPath() %>/sellerInfoMng.selr?userId="><span>판매자 정보 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/selInfo.ad"><span>판매 상품 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/cReportInfo.ad"><span>상품 리뷰 확인</span></a><br>
		<a href="<%=request.getContextPath() %>/sReportInfo.ad"><span>주문 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/selList.ad"><span>매출 관리</span></a><br>
		
	</div>
</body>
</html>