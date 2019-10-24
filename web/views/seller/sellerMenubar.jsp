<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="LF.member.model.vo.*"%>
<% 
	//1. 로그인 된 유저 정보 가져와야 함.(loginUser)
	Customer customer = (Customer)session.getAttribute("loginUser");
	
	//2. 해당 유저가 판매자로 등록되어 있는지 확인해야 함. 등록되어 있으면 해당 값 가져옴 (seller)
	Seller seller = (Seller)session.getAttribute("sellerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<title>Insert title here</title>
<style>
	#sellerMenu{
		margin-top : 130px;
		width: 200px; 
		height: 500px;	
		display:inline-block;
		text-align:center;
	}
	.outer{
	position: absolute;
   	margin-top: 130px;
    width: 800px;
    height: 500px;
    display: inline-block;
    text-align: center;
	}
	h1{
	text-align:left;

	}
</style>
</head>
<body>
	<%@ include file="../common/menubar.jsp" %>
	
	<div id="sellerMenu">
	<%if(seller == null) {%> 
	  <script>
	  var regist = confirm("아직 판매자로 등록하지 않았습니다. 판매자 등록을 하시겠습니까?");
	  if( regist == true ){
	      alert("확인선택!");
	     /*  $("#sr").get(0).click(); */
	      window.location.replace("<%=request.getContextPath() %>/sellerRegist.selr?");
	   }else{
		   //취소 선택
	      alert("메인 페이지로 이동합니다.");
		  window.location.replace("../../views/Main/MainPage.jsp");
		  
	   }
	  </script>
	<%}else { %>
		<a href="../Main/MainPage.jsp"><span>LFmall HomePage</span></a><br>
		<%-- <a if="sr" href="<%=request.getContextPath() %>/sellerRegist.selr?"> <span>판매자 등록하기</span></a><br>	<!-- sRegistServlet --> --%>
		<a href="<%=request.getContextPath() %>/sellerInfoMng.selr?"><span>판매자 정보 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/selInfo.ad"><span>판매 상품 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/cReportInfo.ad"><span>상품 리뷰 확인</span></a><br>
		<a href="<%=request.getContextPath() %>/sReportInfo.ad"><span>주문 관리</span></a><br>
		<a href="<%=request.getContextPath() %>/selList.ad"><span>매출 관리</span></a><br>
	
	<%} %>
		
	</div>
</body>
</html>