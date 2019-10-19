<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>회원 관리</title>
<link rel="stylesheet" type="text/css" href="../css/toggleBtn.css" />
<style>
.outer{
	text-align:center;
	border: 1px solid black;
	padding: 5px;
	
}
.adDiv {
	display: inline-block;
	padding: 5px;
	height: 400px;
	border:1px solid black;
	width: 400px;
	margin: 10px;
}
#insertSeller{
	padding: 5px;
	width: 400px;
	margin-left: 10px;
	vertical-align : middle;
	text-align:left;
	display:inline-block;
}
table {
	border: 1px solid black;
}

table td {
	border: 1px solid black;
	text-align:center
}
table th {
	border: 1px solid black;
	align: center;
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
	<%@ include file="../common/menubar.jsp" %>
	<div class="outer headerUnder">
		<div>
			<h1>&nbsp;&nbsp; 회원 관리</h1>
			<div id="insertSeller">
				<label for="sellerId">판매자 아이디</label> <input type="text"
					id="sellerId" name="sellerId">
				<button id="searchSeller">찾기</button>
			</div>
			<div id="insertSeller">
				<input type="button" value="보류">
			</div>
		</div>
		<div>
			<div class="adDiv">
				<!-- 간략한 판매자 정보를 출력하는 div -->
				<table>
					<tr>
						<th width="50px">번호</th>
						<th width="150px">아이디</th>
						
					</tr>
					<tr>
						<td>1</td>
						<td>임시아이디</td>
				</table>
			</div>
			<div class="adDiv">
				<!-- 판매자 상세 정보를 출력하는 div -->

				<%
					if (true) {
				%>
				<table id="infoTable">
					<tr>
						<td>이름</td>
						<td>아무개</td>
						<td>가입일자</td>
						<td>191209</td>
					</tr>
					<tr>
						<td>이메일</td>
						<td colspan=3>이메일 주소</td>
					</tr>
					<tr>
						<td>우편번호</td>
						<td>123123</td>
						<td>주소</td>
					</tr>
					<tr>
						<td colspan=4>결기도 수원시 어쩌구 저쩌구 왔다리 갔다리</td>
					</tr>
				</table>
				<%} %>

			</div>
		</div>

	</div>
	<script>
		$(function() {
			$("#insertAuthor").click(function(){
				var sAuthor = parseInt($("#example").css("left"));
				if(sAuthor >0){
					alert("Y");
				}else{
					alert("N");
				}
			})
			
			// 토글버튼 클릭시 on, off 변경
			$(".toggleBG").click(function() {
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