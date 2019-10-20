<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#adminMenu{
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
	<div id="adminMenu">
		<a href="../admin/adminMainPage.jsp"><span>관리자 Home</span></a><br>
		<a href="<%=request.getContextPath() %>/cuInfo.ad"><span>회원 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/selInfo.ad"><span>판매자 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/cReportList.ad"><span>회원 신고 내역</span></a><br>
		<a href="<%=request.getContextPath() %>/sReportList.ad"><span>물품 신고 내역</span></a><br>
		<a href="<%=request.getContextPath() %>/selList.ad"><span>판매 물품 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/category.ad"><span>물품 목록 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/question.ad"><span>1대1 문의</span></a><br>
		
	</div>
	
</body>
</html>