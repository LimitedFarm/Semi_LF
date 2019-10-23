<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center"><%= msg %></h1>
	<button onclick="closing();"><h1>메인으로 돌아가기</h1></a>

<script>
function closing(){
	window.opener.location.reload();
	window.close();
}
</script>

</body>
</html>