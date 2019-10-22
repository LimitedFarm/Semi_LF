<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="LF.adminPage.model.vo.PageInfo, LF.member.model.vo.*, java.util.ArrayList"%>
<%
	ArrayList<Seller> seInfo = (ArrayList<Seller>)request.getAttribute("seInfo");
	PageInfo pi = (PageInfo)request.getAttribute("pi");

	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();
%>
<!DOCTYPE html>
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
<title>회원 관리 페이지</title>
<style>
.cuDiv {
	display: inline-block;
	padding: 5px;
	height: 500px;
	width: 400px;
	margin: 10px;
}
#insertCustomer{
	padding: 5px;
	width: 400px;
	margin-left: 10px;
	vertical-align : middle;
	text-align:right;
}
.toggleBG{
	display:inline-block;
	background: #CCCCCC;
	width: 70px;
	height: 30px;
	border: 1px solid #CCCCCC;
	border-radius: 15px;
}

.toggleFG{
	background: #FFFFFF;
	float:left;
	width: 25px;
	height: 25px;
	border: none;
	border-radius: 15px;
	position: relative;
	left: 0px;
	top: 1px;
}

#infoTable {
	border-collapse: separate;
	border-spacing: 10px 10px;
}
.headerUnder{
	margin-top:160px
}
</style>
</head>
<body>
	<%@ include file = "../admin/adminMenubar.jsp" %>
	<div class="container headerUnder" style="">
		<h1>&nbsp;&nbsp; 판매자 관리</h1>
		<div id="insertCustomer">
			<label for="sellerbName">판매자 업체명</label>
			<input type="text" id="sellerbName" name="sellerbName">
			<button id="searchSeller">찾기</button>
		</div>
		<div id="insertCustomer">	</div>
		<div class="cuDiv">
		
			<!-- 간략한 판매자 정보를 출력하는 div -->
			<table class="table table-bordered" id="seTable" style="vertical-align:middle">
				<tr>
					<th width="70px">번호</th>
					<th width="150px">업체명</th>
					<th width="120px"> N / Y </th>
					<th width="100px">권한 변경</th>
				</tr>
				
				<!-- Servlet으로 부터 전달받은 데이터 판별 -->
				<% if(seInfo.size() == 0) {%>
						<tr>
							<td colspan="2">조회된 리스트가 없습니다.</td>
						</tr>
				<% }else {%>
						<% for(Seller s : seInfo) {%>
							<tr>
								<input type="hidden" value="<%=s.getSid()%>" id="connectCid<%=s.getSid()%>">
								<td><%=s.getSid() %></td>
								<td><%=s.getbName() %></td>
						 			<!-- 판매자 권한이 Y상태면 left값이 5 N일 경우 0으로 생성 --> 
								<td>
									<%if(s.getbStatus().equals("Y")) {%>
										
										<span class="toggleBG" style="background: #0099ff;">
										<button id="toggle<%=s.getSid() %>" class="toggleFG" style="left:40px;"></button>
										</span>
									<% } else {%>
										<span class="toggleBG">
										<button id="toggle<%=s.getSid() %>" class="toggleFG" style="left:0px;"></button>
										</span>
									<%} %>
								</td>
								<td class="updateTds"><input type="button" value="권한 적용" id="insertAuthor<%=s.getSid()%>"></td> 
							</tr>
						<%} %>
					<%} %>
				</table>
				</div>
				<div>
					<button onclick="location.href='<%=request.getContextPath() %>/selInfo.ad?currentPage=1'"> << </button>
			
					<!-- 이전 페이지로(<) -->
					<%if(currentPage <= 1) {%>
						<button disabled> < </button>
					<%} else{ %>
						<button onclick="location.href='<%=request.getContextPath() %>/seInfo.ad?currentPage=<%=currentPage-1 %>'"> < </button>
					<%} %>
			
					<!-- 10개의 페이지 목록 -->
					<%for(int p = startPage; p<=endPage; p++){ %>
						<% if(p == currentPage){ %>
					<button disabled><%=p %></button>
						<%} else{%>
					<button onclick="location.href='<%=request.getContextPath() %>/seInfo.ad?currentPage=<%=p %>'"><%=p %></button>
						<%} %>
					<%} %>
			
					<!-- 다음 페이지로(>) -->
					<%if(currentPage >= maxPage){ %>
						<button disabled> > </button>
					<%}else{ %>
						<button onclick="location.href='<%=request.getContextPath() %>/seInfo.ad?currentPage=<%=currentPage+1 %>'"> > </button>
					<%} %>
			
					<!-- 맨 끝으로(>>) -->
					<button onclick="location.href='<%=request.getContextPath() %>/seInfo.ad?currentPage=<%=maxPage %>'"> >> </button>
				</div>
		</div>
		<div class="cuDiv">
			<!-- 판매자 상세 정보를 출력하는 div -->
			<%if(true) {%><!-- id="infoTable" -->
			<table class="table table-bordered" style="vertical-align:middle">
				<tr>
					<td rowspan="5"><img src="#" id="getImg" width="150px" height="200px"></td>
					<td>업체명</td>
					<td><input type="text" id="getbName" readonly></td>
				</tr>
				<tr>
					<td>사업자번호</td>
					<td><input type="text" id="getbNum" readonly></td>
				</tr>
				<tr>
					<td>법인 번호</td>
					<td><input type="text" id="getbCpNum" readonly></td>
				</tr>
				<tr>
					<td>계좌 은행</td>
					<td><input type="text" id="getBankName" readonly></td>
				</tr>
				<tr>
					<td>예금주</td>
					<td><input type="text" id="getAcName" readonly></td>
				</tr>
				<tr>
					<td>계좌 번호</td>
					<td colspan="2"><input type="text" id="getAcNum" readonly></td>
				</tr>
			</table>
			
			<%} %>
		</div>

	
	<script>
		$(function() {
			// 판매자 정보 테이블에 데이터 넣기
			$(document).on('mouseenter', "#seTable td", function(){
				$(this).parent().css({"background":"darkgray","cursor":"pointer"});
			});
			$(document).on('mouseout', "#seTable td", function(){
				$(this).parent().css({"background":"light"});
			});
			$(document).on('click', "#seTable td", function(){
				var sid=$(this).parent().children("input").val();

				<% for(Seller se : seInfo) {%>
					if(<%=se.getSid()%> == sid) {
						// 나중에 좀더 수정
						$("#getbName").val("<%=se.getbName()%>");
						$("#getbNum").val("<%=se.getbNum()%>");
						$("#getbCpNum").val("<%=se.getCpNum()%>");
						$("#getBankName").val("<%=se.getBankName()%>");
						$("#getAcName").val("<%=se.getAcName()%>");
						$("#getAcNum").val("<%=se.getAcNum()%>");
					}
				<% } %>
				
			});
			// 권한 버튼을 통한 업데이트
			$(document).on('click', ".updateTds input", function(){
				
				var sid=$(this).parent().parent().find("input").val();
				
				<% for(Seller se : seInfo) {%>
					
					if(<%=se.getSid()%> == sid) {
						var sAuthor = parseInt($("#toggle<%=se.getSid() %>").css("left"));
						var bStatus = "";
						if(sAuthor >0){
							bStatus = "Y";
						}else{
							bStatus = "N";
						}
						$.ajax({
							url:"<%=request.getContextPath() %>/updateSeller.ad",
							type:"post",
							data:{sellerSid : sid, bStatus : bStatus},
							success:function(data){
								console.log(data);
								// 나중에 해보자
							}
						});
					} 
				<% } %>
				
				
			});
			
			// 판매자 찾기 기능
			$("#searchSeller").click(function(){
				var sellerId = $("#sellerbName").val();
				if(sellerId == ""){
					$sellerTable = $("#seTable");
					$sellerTable.html(""); // 초기화
					
					var $headerTr = $("<tr>");
					var $headerSid = $("<th>").text("번호").css("width", "70px");
					var $headerbName = $("<th>").text("업체명").css("width", "150px");
					var $headerbStatus = $("<th>").text(" N / Y ").css("width", "120px");
					var $headerButton = $("<th>").text("권한 변경").css("width", "100px");
					
					$headerTr.append($headerSid);
					$headerTr.append($headerbName);
					$headerTr.append($headerbStatus);
					$headerTr.append($headerButton);
					$sellerTable.append($headerTr);
					
					<% for(Seller s : seInfo) { %>
						var $tr = $("<tr>");
						var $hiddenInput = $("<input>").attr({"type":"hidden", "id":"connectCid<%=s.getSid()%>", "value":"<%=s.getSid()%>" });
						var $sidTd = $("<td>").text("<%=s.getSid()%>").css("width","50px");
						var $bNameTd = $("<td>").text("<%=s.getbName()%>").css("width","150px");
						
						var $bStatusTd = $("<td>");
						var $bStatusSpan = $("<span>");
						var $spanButton = $("<button>");
						/* bStatus가 Y인지 N인지 판별 */
						<%if(s.getbStatus().equals("Y")) {%>
							$bStatusSpan.addClass("toggleBG")
							$bStatusSpan.css({"background": "#0099ff"});
							$spanButton.attr({"class":"toggleFG", "id":"toggle<%=s.getSid() %>"});
							$spanButton.css('left', "40px");
						<% } else {%>
							$bStatusSpan.addClass("toggleBG");
							$bStatusSpan.css({"background": "#CCCCCC"});
							$spanButton.attr({"class":"toggleFG", "id":"toggle<%=s.getSid() %>"});
							$spanButton.css('left', "0px");
						<% } %>
						var $updateTd = $("<td>").addClass("updateTds");
						var $updateButton = $("<input>").attr({"type":"button", "value":"권한 적용", "id":"insertAuthor"+<%=s.getSid()%>});
						
						$bStatusSpan.append($spanButton);
						$bStatusTd.append($bStatusSpan);
						$updateTd.append($updateButton);
						
						$tr.append($hiddenInput);
						$tr.append($sidTd);
						$tr.append($bNameTd);
						$tr.append($bStatusTd);
						$tr.append($updateTd);
						$sellerTable.append($tr);
						
					<%} %>
				}else{
					$.ajax({
						url : "/Semi_LF/searchSe.ad",
						type : "post",
						data : {sellerbName : sellerId},
						success : function(data) {
							$sellerTable = $("#seTable");
							$sellerTable.html(""); // 초기화
							
							var $headerTr = $("<tr>");
							var $headerSid = $("<th>").text("번호").css("width", "70px");
							var $headerbName = $("<th>").text("업체명").css("width", "150px");
							var $headerbStatus = $("<th>").text(" N / Y ").css("width", "120px");
							var $headerButton = $("<th>").text("권한 변경").css("width", "100px");
							
							$headerTr.append($headerSid);
							$headerTr.append($headerbName);
							$headerTr.append($headerbStatus);
							$headerTr.append($headerButton);
							$sellerTable.append($headerTr);
							
							for ( var key in data) {
								var $tr = $("<tr>");
								var $hiddenInput = $("<input>").attr({"type":"hidden", "id":"connectCid"+data[key].sid,"value":data[key].sid});
								var $sidTd = $("<td>").text(data[key].sid).css("width","50px");
								var $bNameTd = $("<td>").text(data[key].bName).css("width","150px");
								
								var $bStatusTd = $("<td>");
								var $bStatusSpan = $("<span>");
								var $spanButton = $("<button>");
								/* bStatus가 Y인지 N인지 판별 */
								if(data[key].bStatus == "Y") {
									$bStatusSpan.addClass("toggleBG");
									$bStatusSpan.css("background", "#0099ff");
									$spanButton.attr({"class":"toggleFG", "id":"toggle"+data[key].sid});
									$spanButton.css("left","40px");
								} else {
									$bStatusSpan.addClass("toggleBG");
									$bStatusSpan.css("background", "#CCCCCC");
									$spanButton.attr({"class":"toggleFG", "id":"toggle"+data[key].sid});
									$spanButton.css("left","0px");
								}
								var $updateTd = $("<td>").addClass("updateTds");
								var $updateButton = $("<input>").attr({"type":"button", "value":"권한 적용", "id":"insertAuthor"+data[key].sid});
								
								$bStatusSpan.append($spanButton);
								$bStatusTd.append($bStatusSpan);
								$updateTd.append($updateButton);
								
								$tr.append($hiddenInput);
								$tr.append($sidTd);
								$tr.append($bNameTd);
								$tr.append($bStatusTd);
								$tr.append($updateTd);
								$sellerTable.append($tr);
								
								}
							}
						});
					}
					// 초기화
					$("#sellerbName").val("");
				});
			
			// 토글버튼 클릭시 on, off 변경
			$(document).on('click', ".toggleBG", function(){
				var toggleBG = $(this);
				var toggleFG = $(this).find('.toggleFG');
				var left = toggleFG.css('left');
				if (left == '40px') {
					toggleBG.css('background', '#CCCCCC');
					toggleActionStart(toggleFG, 'TO_LEFT');
				} else if (left == '0px') {
					toggleBG.css('background', '#0099ff');
					toggleActionStart(toggleFG, 'TO_RIGHT');
				}
			});
			
			$("#insertAuthor").click(function(){
				var toggleFG = $(this).find('.toggleFG');
				
				
			});
		});

		// 토글 버튼 이동 모션 함수
		function toggleActionStart(toggleBtn, LR) {
			// 0.01초 단위로 실행
			var intervalID = setInterval(function() {
				// 버튼 이동
				var left = parseInt(toggleBtn.css('left'));
				left += (LR == 'TO_RIGHT') ? 5 : -5;
				if (left >= 0 && left <= 40) {
					left += 'px';
					toggleBtn.css('left', left);
				}
			}, 10);
			setTimeout(function() {
				clearInterval(intervalID);
			}, 201);
		}
	</script>
</body>
</html>