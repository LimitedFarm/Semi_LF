<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="LF.review.model.vo.*, LF.product.model.vo.*, java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<style>
	.outer{
	position: absolute;
   	margin-top: 250px;
   	pading-top:50px;
   	top: 150px;
   	left: 220px;
    width: 1280;
    min-width: 1280px;
    min-height: 800px;
    display: inline-block; 
    pading-left:300px;
	
	margin:0 auto;
	
	}
	h1{
	text-align:left;

	}
</style>
</head>
<body>


	<%@ include file="../seller/menubar.jsp" %>
	
	<div class="outer">
		<br>
		
		<h2 align="center">상품 리뷰 확인</h2>
		
		<!-- 공지사항 때와 마찬가지로 검색 부분이 있다. 기능 구현은 생략 -->
		<div class="searchArea" align="center">
			<select id="searchCondition" name="searchCondition">
				<option>----</option>
				<option value="category">상품명</option>
				<option value="writer">작성자</option>
				<option value="title">내용</option>
				<option value="content">별점</option>
			</select>
			<input type="search">
			<button type="submit">검색하기</button>
			<br><br>
			<!-- <label>기간설정</label> --><!-- 기간설정 달력 선택하는거 만들어서 붙여주기. 리뷰,상품관리페이지 전부 다 똑같이 만들어줘야됨, 버튼이 아니라 달력으로 수정해야함 -->
			<input type="date" id="startDate">~<input type="date" id="lastDate">
			
			<!-- 추천순, 최신순 정렬 만들기 -->
			
			<!-- 공지사항 때와는 다르게 여기선 로그인을 한 사람만 게시글을 작성하게 하자 -->
			<%-- <% if(loginUser != null){%>
				<button onclick="location.href='views/board/boardInsertForm.jsp'">작성하기</button>
			<%} %> --%>
			<!-- boardInsertForm.jsp 만들러 ㄱㄱ씽 -->
		</div>
		
		<br>
		<div class="tableArea">
		</div>
		
	</div>
	
	<script>
	 $(document).ready(function(){
		
		 	if($("body").height() < $(window).height()){	//화면에 표시된 내용이 적어서 스크롤바가 생기지 않는 경우 => 최초 로딩
		 		/* window.alert("There isn't a vertical scroll bar"); */
		 		<%
					ArrayList<Review> list = (ArrayList<Review>)session.getAttribute("list");
		 			ListObj lo = (ListObj)session.getAttribute("lo");
					
					System.out.println(list);
					System.out.println(lo);
					//상품 대표 이미지도 불러와야 함. 대표 이미지는 물품번호가 같은 이미지 중 정보순서가 가장 이른 것(또는 파일 번호가 가장 이른 것)
				%>    
					
		 		<%if(list.isEmpty()){ %>
		 			$(".tableArea").append("<a href='"+<%=request.getContextPath()%>+"/views/common/menubar.jsp'>아직 등록된 물품이 없습니다.</a>");
				<%}else{ %>
					<%for(Review r : list){ %>
					//값 받아오는거는 for문 돌리든 해서 넣기.
					var reId = <%=r.getReId()%>;
					var grade = <%=r.getGrade()%>;
					var sale_Id = <%=r.getSaleId()%>;
					var review_Date = "<%=r.getReviewModify()%>";
					var reContent = "<%=r.getReContent()%>";
	
					$(".tableArea").append("<hr><table align='center' width='90%' border='1px solid black' style='border-collapse:collapse'>"
							+ "<tr><td colspan='3' width='60%' >" + reId + "</td><td colspan='1' width='30%'>" + grade + "</td></tr>"
							+ "<tr><td width='45%'>" + sale_Id + "</td><td colspan='3' align='right'>" + review_Date + "</td></tr>"
							+ "<tr><td colspan='4' width='90%'>" + reContent + "<br><div align='right'><button>신고하기</button></div></td></tr>"
							+ "</table>");
					
					<%} %>
				<%} %>
		 	}
		 
		 	sid = <%=lo.getSid()%>;
			currentPage = <%=lo.getCurrentPage()%>;
				
		  $(window).scroll(function(){	//스크롤 이벤트 
			if($(window).scrollTop() == $(document).height() - $(window).height()){	//스크롤바 바닥까지 내려가면 내용 추가 스크롤 위치 == 문서길이 - 화면 길이
				
				alert("scroll");
				currentPage++;
				console.log(sid, currentPage);
				
				
				$.ajax({
					url : "<%=request.getContextPath()%>/reviewRoad.selr",		/* PrMngRoad */
					method:"post",
					data: {sid : sid, currentPage : currentPage},
					success: function(data){
						alert("clear");
						console.log("clear");
						for(var key in data){
						//값 받아오는거는 for문 돌리든 해서 넣기.
						var reId = data[key].reId;
						var grade = data[key].grade
						var sale_Id = data[key].saleId;
						var review_Date = data[key].reviewModify;
						var reContent = data[key].reContent;
						$(".tableArea").append("<hr><table align='center' width='90%' border='1px solid black' style='border-collapse:collapse'>"
								+ "<tr><td colspan='3' width='60%' >" + reId + "</td><td colspan='1' width='30%'>" + grade + "</td></tr>"
								+ "<tr><td width='45%'>" + sale_Id + "</td><td colspan='3' align='right'>" + review_Date + "</td></tr>"
								+ "<tr><td colspan='4' width='90%'>" + reContent + "<br><div align='right'><button>신고하기</button></div></td></tr>"
								+ "</table>");
						}
					} ,
					error:function(){
						alert("error");
						console.log("error");
						alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
					},
					complete : function(data) {
		                 console.log("complete");
		        }

				}); 
				
				//추가해야 할 내용
				//초기에 데이터 몇개나 불러올 것인지(되도록 스크롤바가 생길 수 있는 만큼의 값을 불러와야 함[대충 5개에서 10개 생각함])
				//스크롤 끝까지 닿으면 새로운 데이터 n개 불러온다
				//데이터가 더 이상 없으면 '데이터가 없음'을 알려줘야 한다 (+ 신규 판매 게시글 추가 버튼을 넣어서 신규 판매 게시글을 작성하는 링크 달아주기)
				//https://velopert.com/1890
				//https://sir.kr/qa/212594
			}
		 
		 });
	 });
	 
	 
	
	</script>
	
	
	


</body>
</html>