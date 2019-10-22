<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, LF.adminPage.model.vo.*"%>
<%
	ArrayList<CReportList> crList = (ArrayList)request.getAttribute("crList");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
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
<title>Insert title here</title>
<style>
.borderOut {
	border: 1px solid black;
	border-radius:15px;
}
.divAlign {
	width:1100;
	vertical-align:middle;
}
</style>
</head>
<body>
	<div class="divAlign">
		<div class="divAlign col">
			<form id="searchReForm">
			<label for="searchReport">판매자 아이디 찾기</label>
			<input type="text" id="searchReport">
			<input type="button" id="searchRe" value="찾기">
			</form>
		</div>
		<div id="pagingScroll" style="text-align:center; width:1000px;">
			<% for(CReportList cr : crList) {%>
				<form class="borderOut form-inline" id="reportList<%=cr.getcRid() %>" style="align:center; margin:10px; ">
					<input type="hidden" value="판매자 번호">
					<table class="table table-borderless"style="width: 1000px; min-width:1000px;">
						<tr>
							<td>신고 번호</td>
							<td width="50px"><input class="form-control" type="text" value="<%=cr.getcRid() %>" readonly></td>
							<td>신고자 아이디</td>
							<td width="50px"><input class="form-control" type="text" value="<%=cr.getUserId() %>" readonly></td>
							<td><button type="button" class="btn btn-primary">상품으로 가기</button> 
						</tr>
						<tr>
							<td>상품명</td>
							<td colspan=2><input class="form-control" type="text" value="<%=cr.getpName() %>" readonly></td>
							<td>신고 날짜</td>
							<td><input class="form-control" type="text" value="<%=cr.getReport_Date() %>" readonly></td>
						</tr>
						<tr>
							<td>신고 내용</td>
							<td colspan=4><textarea rows="5" cols="100" readonly><%=cr.getNoContent() %></textarea></td>
						</tr>
					</table>
				</form>
			<%} %>
		</div>
	</div>
	<script>
		
		$(document).ready(function() {
			//스크롤 발생 이벤트 처리
			$('#pagingScroll').scroll(function() {
				var scrollT = $(this).scrollTop(); //스크롤바의 상단위치
				var scrollH = $(this).height(); //스크롤바를 갖는 div의 높이
				var contentH = $('#divContent').height(); //문서 전체 내용을 갖는 div의 높이
				if (scrollT + scrollH + 1 >= contentH) { // 스크롤바가 아래 쪽에 위치할 때
					var addDiv = $('#pagingScroll').chlidren().html();
				}
			});
		});
	</script>
</body>
</html>