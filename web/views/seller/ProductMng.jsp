<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="LF.product.model.vo.*, LF.member.model.vo.*, java.util.*, java.io.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<style>
	.inBtn{
	margin-left:auto;
	margin-right:auto;
	margin-top:20px;
	margin-bottom:20px;
		}
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
		<h2 align="center">판매 상품 관리</h2>
		
		<!-- 공지사항 때와 마찬가지로 검색 부분이 있다. 기능 구현은 생략 -->
		<div class="searchArea" align="center">
			<select id="searchCondition" name="searchCondition">
				<option>----</option>
				<option value="category">상품명</option>
				<option value="title">내용</option>
				<!-- 작성일자는 검색에서 따로 빼서 설정하게 해주는 게 낫지 않을가 -->
				<option value="writer">작성일자</option>
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
		
		<!-- 실제로 작업은 아래 스크립트에서 진행해야 함 -->
		
		<div class="tableArea">
			
		</div>
		
	</div>
	
 	<script>
	 $(document).ready(function(){
		
		 	if($("body").height() < $(window).height()){	//화면에 표시된 내용이 적어서 스크롤바가 생기지 않는 경우 => 최초 로딩
		 		/* window.alert("There isn't a vertical scroll bar"); */
		 		<%
					ArrayList<pList> list = (ArrayList<pList>)session.getAttribute("list");
					ListObj lo = (ListObj)session.getAttribute("lo");
					
					System.out.println(list);
					System.out.println(lo);
					
					//상품 대표 이미지도 불러와야 함. 대표 이미지는 물품번호가 같은 이미지 중 정보순서가 가장 이른 것(또는 파일 번호가 가장 이른 것)
					
				%>    
					
		 		<%if(list.isEmpty()){ %>
		 			$(".tableArea").append("<a href='"+<%=request.getContextPath()%>+"/views/common/menubar.jsp'>아직 등록된 물품이 없습니다.</a>");
				<%}else{ %>
					<%for(pList p : list){ %>
					//값 받아오는거는 for문 돌리든 해서 넣기.
					var pName = "<%=p.getpName()%>";
					var pPrice = <%=p.getpPrice()%>;
					var pCount = <%=p.getpCount()%>;
					var createDate = "<%=p.getpDay()%>";
					var pPeriod = "<%=p.getpPeriod()%>";
					var pContent = "<%=p.getpText1()%>";
					
					$(".tableArea").append("<hr><table id='productTable' align='center' width='90%' border='1px solid black' style='border-collapse:collapse'>"
							+ "<tr><td rowspan='5' width='20%' height='30%'>" 
							+ "<div align='center' border='1px solid black'>image</div></td>"
							+ "<td rowspan='1' width='65%'>상품명 : " + pName + "</td>"
							+ "<td rowspan='5' width='20%'>"
							+ "<div class='inBtn' align='center'><button>정보 수정</button></div>"
							+ "<div class='inBtn' align='center'><button>재고 추가</button></div>"
							+ "<div class='inBtn' align='center'><button>판매 중지</button></div>"
							+ "<div class='inBtn' align='center'><button>리뷰 확인</button></div> </td> </tr>"
							+ "<tr><td rowspan='1'>판매 가격 : " +pPrice+"</td></tr>"
							+ "<tr><td rowspan='1'>재고 상태 : " +pCount +"</td></tr>"
							+ "<tr><td rowspan='1'>판매 기간 : " + createDate +"~"+ pPeriod +"</td></tr>"
							+ "<tr><td>상품소개 : "+pContent + "<br><div align='right'><button>신고하기</button></div></td></tr>"
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
					url : "<%=request.getContextPath()%>/prMngRoad.prod",
					method:"post",
					data: {sid : sid, currentPage : currentPage},
					/* contentType: 'application/json; charset=utf-8', */
					/* dataType: "json",   */
					/* beforesend:function(){
						alert("before");
						alert(sid, currentPage);
						console.log("before");
					}, */
					success: function(data){
						alert("clear");
						console.log("clear");
						for(var key in data){
						//값 받아오는거는 for문 돌리든 해서 넣기.
						var pName = data[key].pName;
						var pPrice = data[key].pPrice;
						var pCount = data[key].pCount;
						var createDate = data[key].createDate;
						var pPeriod = data[key].pPeriod;
						var pContent = data[key].pContent;
						$(".tableArea").append("<hr><table id='productTable' align='center' width='90%' border='1px solid black' style='border-collapse:collapse'>"
								+ "<tr><td rowspan='5' width='20%' height='30%'>" 
								+ "<div align='center' border='1px solid black'>image</div></td>"
								+ "<td rowspan='1' width='65%'>상품명 : " + pName + "</td>"
								+ "<td rowspan='5' width='20%'>"
								+ "<div class='inBtn' align='center'><button>정보 수정</button></div>"
								+ "<div class='inBtn' align='center'><button>재고 추가</button></div>"
								+ "<div class='inBtn' align='center'><button>판매 중지</button></div>"
								+ "<div class='inBtn' align='center'><button>리뷰 확인</button></div> </td> </tr>"
								+ "<tr><td rowspan='1'>판매 가격 : " +pPrice+"</td></tr>"
								+ "<tr><td rowspan='1'>재고 상태 : " +pCount +"</td></tr>"
								+ "<tr><td rowspan='1'>판매 기간 : " + createDate +"~"+ pPeriod +"</td></tr>"
								+ "<tr><td>상품소개 : "+pContent + "<br><div align='right'><button>신고하기</button></div></td></tr>"
								+ "</table>");
						}
					} ,
					error:function(){
						alert("error");
						console.log("error");
						alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
					},
					complete : function(data) {
						alert("complete");
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