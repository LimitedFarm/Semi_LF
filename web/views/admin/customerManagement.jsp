<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="LF.adminPage.model.vo.PageInfo, LF.member.model.vo.Customer, java.util.ArrayList"%>
<%
	ArrayList<Customer> cuInfo = (ArrayList<Customer>)request.getAttribute("cuInfo");
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
<meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>회원 관리</title>
<style>
.outer{
	text-align:center;
	border: 1px solid black;
	padding: 5px;	
	width: 1200px;
	height: 700px;
	display:inline-block;
	margin-top:160px;
	min-width:1200px;
}
.adDiv {
	display: inline-block;
	padding: 5px;
	height: 400px;
	border:1px solid black;
	width: 500px;
}
#insertCustomer{
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
	<%@ include file = "../admin/adminMenubar.jsp" %>
	<div class="outer">
		<div>
			<h1>&nbsp;&nbsp; 회원 관리</h1>
			<br>
			<div id="insertCustomer">
				<label for="customerId">회원 아이디</label> <input type="text" id="customerId" name="customerId">
				<button id="searchCustomer">찾기</button>
			</div>
			<div id="insertCustomer">
				<input type="button" value="보류">
			</div>
		</div>
		<div>
			<div class="adDiv">
				<!-- 간략한 회원 정보를 출력하는 div -->
				<div id="exam" style="width:500px; height: 500px;"> 
				<table id="cuTable">
					<tr>
						<th width="50px">번호</th>
						<th width="150px">아이디</th>
						
					</tr>
					<% if(cuInfo.size() == 0) {%>
						<tr>
							<td colspan="2">조회된 리스트가 없습니다.</td>
						</tr>
					<% }else {%>
						<% for(Customer c : cuInfo) {%>
							<tr>
								<input type="hidden" value="<%=c.getCid() %>" id="connectCid<%=c.getCid() %>">
								<td><%=c.getCid() %></td>
								<td><%=c.getUserId() %></td>
							</tr>
						<%} %>
					<%} %>
				</table>
				</div>
				<div>
					<button onclick="location.href='<%=request.getContextPath() %>/cuInfo.ad?currentPage=1'"> << </button>
			
					<!-- 이전 페이지로(<) -->
					<%if(currentPage <= 1) {%>
						<button disabled> < </button>
					<%} else{ %>
						<button onclick="location.href='<%=request.getContextPath() %>/cuInfo.ad?currentPage=<%=currentPage-1 %>'"> < </button>
					<%} %>
			
					<!-- 10개의 페이지 목록 -->
					<%for(int p = startPage; p<=endPage; p++){ %>
						<% if(p == currentPage){ %>
					<button disabled><%=p %></button>
						<%} else{%>
					<button onclick="location.href='<%=request.getContextPath() %>/cuInfo.ad?currentPage=<%=p %>'"><%=p %></button>
						<%} %>
					<%} %>
			
					<!-- 다음 페이지로(>) -->
					<%if(currentPage >= maxPage){ %>
						<button disabled> > </button>
					<%}else{ %>
						<button onclick="location.href='<%=request.getContextPath() %>/cuInfo.ad?currentPage=<%=currentPage+1 %>'"> > </button>
					<%} %>
			
					<!-- 맨 끝으로(>>) -->
					<button onclick="location.href='<%=request.getContextPath() %>/cuInfo.ad?currentPage=<%=maxPage %>'"> >> </button>
				</div>
			</div>
			
			
			<div class="adDiv" id="customerInfo">
				<!-- 회원 상세 정보를 출력하는 div -->
				<div>
					<table>
						<tr>
							<td>이름</td>
							<td><input type="text" id="cuName" readonly></td>
							<td>가입일자</td>
							<td><input type="text" id="cuJoinDate" readonly></td>
						</tr>
						<tr>
							<td>이메일</td>
							<td colspan=3><input type="text" id="cuEmail" readonly></td>
						</tr>
						<tr>
							<td colspan=4>주소</td>
						</tr>
						<tr>
							<td colspan=4><input type="text" id="cuAddress" readonly></td>
						</tr>
					</table>
				
				</div>
			</div>
		</div>

	</div>
	<script>
		$(function() {
			// 회원 정보 테이블에 데이터 넣기
			$(document).on('mouseenter', "#cuTable td", function(){
				$(this).parent().css({"background":"darkgray","cursor":"pointer"});
			});
			$(document).on('mouseout', "#cuTable td", function(){
				$(this).parent().css({"background":"black"});
			});
			$(document).on('click', "#cuTable td", function(){
				var cid=$(this).parent().children("input").val();
				<% for(Customer cu : cuInfo) {%>
					if(<%=cu.getCid()%> == cid) {
						$("#cuName").val("<%=cu.getUserName()%>");
						$("#cuJoinDate").val("<%=cu.getJoinDate()%>");
						$("#cuEmail").val("<%=cu.getEmail()%>");
						$("#cuAddress").val("<%=cu.getAddress()%>");
					}
				<% } %>
				
			});
				
			// 찾기 기능
			$("#searchCustomer").click(function(){
				var searchId = $("#customerId").val();
				if(searchId == ""){
					$customerTable = $("#cuTable");
					$customerTable.html(""); // 초기화
					
					var $headerTr = $("<tr>");
					var $headerCid = $("<th>").text("번호").css("width", "50px");
					var $headerId = $("<th>").text("아이디").css("width", "150px");
					
					$headerTr.append($headerCid);
					$headerTr.append($headerId);
					$customerTable.append($headerTr);
					
					<% for(Customer c : cuInfo) { %>
						var $tr = $("<tr>");
						var $hiddenInput = $("<input>").attr({"type":"hidden", "id":"connectCid<%=c.getCid()%>","value":"<%=c.getCid()%>"});
						var $writerTd = $("<td>").text("<%=c.getCid()%>").css("width","50px");
						var $contentTd = $("<td>").text("<%=c.getUserId()%>").css("width","150px");
						
						$tr.append($hiddenInput);
						$tr.append($writerTd);
						$tr.append($contentTd);
						$customerTable.append($tr);
					
					<%} %>
				}else{
					$.ajax({
						url : "/Semi_LF/searchCu.ad",
						type : "post",
							data : {
								searchId : searchId
							},
							success : function(data) {
								$customerTable = $("#cuTable");
								$customerTable.html(""); // 초기화
								
							
								
								for ( var key in data) {
										var $headerTr = $("<tr>");
										var $headerCid = $("<th>").text("번호").css("width", "50px");
										var $headerId = $("<th>").text("아이디").css("width", "150px");
										var $tr = $("<tr>");
										var $hiddenInput = $("<input>").attr({"type":"hidden", "id":"connectCid"+data[key].cid,"value":data[key].cid});
										var $writerTd = $("<td>").text(data[key].cid).css("width","50px");
										var $contentTd = $("<td>").text(data[key].userId).css("width","150px");

										$headerTr.append($headerCid);
										$headerTr.append($headerId);
										$customerTable.append($headerTr);
										$tr.append($hiddenInput);
										$tr.append($writerTd);
										$tr.append($contentTd);
										$customerTable.append($tr);
									}
								
								}
							});
					
						}

					});


		});
	</script>
</body>