<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="LF.member.model.vo.*"%>
<%
	Customer loginUser = (Customer)session.getAttribute("loginUser");
	Seller sellerUser = (Seller)session.getAttribute("sellerUser");
	Admin adminUser = (Admin)session.getAttribute("adminUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
	.headerNavi{
		display:inline-block;
		border-radius:5px;
		width:auto;
		height:auto;
	}
	#loginBtn{
		background:url('<%=request.getContextPath()%>/images/login.png') no-repeat;
		background-size: cover; 
		background-repeat: no-repeat; 
		background-position: center;
		border: 0px;
		height: 75px;
		width : 100px;
	}
	#menuBtn{
		background:url('<%=request.getContextPath()%>/images/menubtn.png') no-repeat;
		background-size: 80%; 
		background-repeat: no-repeat; 
		background-position: center;
		border: 0px;
		height: 75px;
		width : 75px;
	}
	#signUpBtn{
		background:url('<%=request.getContextPath()%>/images/signup2.png') no-repeat;
		background-size: cover; 
		background-position: center;
		
		border: 0px;
		height: 75px;
		width : 100px;
	}
	#logoutBtn{
		background:url('<%=request.getContextPath()%>/images/login.png') no-repeat;
		background-size: cover; 
		background-position: center;
		
		border: 0px;
		height: 75px;
		width : 100px;
	}
	#inlineUl li{
		display:inline;
	}
	#rightMenu{
		align:right;
	}
	#menu{
		width: 200px; 
		height:calc(100% - 150px); 
		position: fixed; 
		top: 130px; 
		left: -320px; 
		z-index: 1055; 
		border: 1px solid red; 
		background-color: green; 
		text-align: center; 
		transition: All 0.2s ease;
		padding-left: 20px;
		padding-right: 20px;
		padding-top: 50px;
	}
	
	#menu.open{
		left:0px;
	}
</style>
</head>
<body>
	<!-- header역할을 하며 로그인, 회원가입, 메뉴바를 열수 있는 버튼을 생성 -->
	<div class="navbar navbar-expand-sm bg-light navbar-dark fixed-top row" style="min-width: 1200px; z-index:1055; float:top;" >
		<div class="headerNavi col-sm-1" align="left" >
			<input id="menuBtn" type="button">
		</div>
		<div class="headerNavi col-sm-8" align="center">
			<img id="logo" src="<%=request.getContextPath()%>/images/logo.png" height='75' width="300">
		</div>
		<div class="headerNavi col-sm-3" id="rightMenu" >
			<% if(loginUser == null) {%>
				<ul id="inlineUl">
					<li><button id="loginBtn" type="button" style="align:right;" data-toggle="modal" data-target="#loginDiv"></button></li>
					<li><button id="signUpBtn" type="button" style="align:right;" data-toggle="modal" data-target="#loginDiv"></button></li>
				</ul>
			<%} else { %>
				<ul id="inlineUl">
					<li><p><%=loginUser.getUserName() %>님 환영합니다.</li>
					<li><button id="logoutBtn" type="button" style="align:right;"></button></li>
				</ul>
			<%} %>
		</div>
		<hr>
	</div>

	<!-- 슬라이드 형식으로 버튼 클릭시 도출되는 메뉴바 -->
	<div id="menu">
		<div>
			<% if(loginUser == null || loginUser.getGroupNum().equals("1")) {%>
				<% if(loginUser == null) {%>
				<button type="button" class="btn btn-light" id="subLoginBtn">로그인</button>
				<%} else {%>
				<button type="button" class="btn btn-light" id="">1</button>
				<%} %>
				<button type="button" class="btn btn-light" id="Productlist">상품 게시판</button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id="FAQ">고객센터</button>
			<%} else if(loginUser.getGroupNum().equals("2")){%>
				<button type="button" class="btn btn-light" id="">2</button>
				<button type="button" class="btn btn-light" id="Productlist">상품 게시판</button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id="FAQ">고객센터</button>
			<%} else {%>
				<button type="button" class="btn btn-light" id="adminPage">관리자페이지</button>
				<button type="button" class="btn btn-light" id="Productlist">상품 게시판</button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id=""></button>
				<button type="button" class="btn btn-light" id="FAQ">고객센터</button>
			<%} %>
		</div>
	</div>
	<!-- var list = ["Home", "마이페이지", "상품 게시판", "장바구니", "FAQ", "1:1 고객 문의"];
			}else{
				var list = ["Home", "로그인", "상품 게시판", "장바구니", "FAQ", "1:1 고객 문의"];
				for(var i=0; i<list.length; i++){
					var $btn = $("<button>").css({"width":"150px", 
													 "height": "50px", 
													 "margin":"10px"});
					$btn.attr("id","before"+i);
					$btn.addClass("btn btn-light");
					$btn.html(list[i]);
					
					$menuDiv.append($btn); -->
	<!-- 로그인창 만들 div -->
	<% if(loginUser == null) {%>
	<div id="loginDiv" class="modal fade" id="loginModal" tabindex="-1" role="dialog">
		<form id="loginForm" action="<%=request.getContextPath()%>/login.me"
		onsubmit="return validate();" method="post">
		<div class="modal-dialog modal-dialog-centered" style="width: 400px;">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">로그인</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body" style="padding: 30px;">
					<!-- <form id="loginInfo"> -->
						<table class="table-borderless">
							<tr>
								<td>아이디</td>
								<td><input type="text" id="loginId" name="loginId"></td>
							</tr>
							<tr>
								<td>비밀번호</td>
								<td><input type="password" id="loginPwd" name="loginPwd"></td>
							</tr>
							<tr>
								<td colspan=2 align="right"><a href="#">아이디/비밀번호 찾기</a></td>
							</tr>
						</table>
<!-- 					</form> -->
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button id="loginConnect" type="submit" class="btn btn-success">로그인</button>
					<button type="button" class="btn btn-success" data-dismiss="modal" id="closeLogin">닫기</button>
				</div>

			</div>
		</div>
		</form>
	</div>
	<%} %>




	<script>
		$(function() {
			/* 메뉴바 버튼 */
			$("#menuBtn").click(function() {
				if ($("#menu").hasClass("open")) { //class에 open이 없을 시 open클래스 추가 있을 시 삭제
					$("#menu").removeClass("open");
				} else {
					$("#menu").addClass("open");
				}
			});

			// 일반회원 버튼`
			
			// 판매자 버튼
			
			// 관리자 버튼
			$("#adminPage").click(function(){
				location.href="../admin/adminMainPage.jsp"
			});

			/* 로그인 기능 */
			// validate() 함수 작성하기(form태그가 submit되었을 때 실행 됨)
			function validate(){
				if($("#userId").val().trim().length==0){
					alert("아이디를 입력하세요");
					$("#userId").focus();
					
					return false;	// return값이 false면 submit이 되지 않는다.
				}
				if($("#userPwd").val().trim().length==0){
					alert("비밀번호를 입력하세요");
					$("#userPwd").focus();
					
					return false;
				}
				
				return true;
			}
			/* $("#loginConnect").click(function() {
				var id = $("#loginId").val();
				var pwd = $("#loginPwd").val();

				$.ajax({
					url : "/Semi_LF/login.me",
					type : "post",
					data : {
						userId : id,
						userPwd : pwd
					},
					success : function(data) {
						$("#loginModal").modal("hide");
					}

				});
			}); */
			
			$("#subLoginBtn").click(function(){
				$("#loginBtn").click();
			});
			
		});
		$(document).click(function(event) { // 메뉴바를 제외한 부분 클릭시 메뉴바 닫힘
				if (!($("#menu").is(event.target)|| $("#menuBtn").is(event.target)
					|| $("#menu").children().is(event.target) || $(
						"#childsBtn").children().is(event.target))) {
						if ($("#menu").hasClass("open")) { //class에 open이 없을 시 open클래스 추가 있을 시 삭제
							$("#menu").removeClass("open");
						}
					}
		});
		
		$("#logoutBtn").click(function(){
			location.href = "<%=request.getContextPath()%>/logout.me";	
		});
		
		//고객센터로
		$("#FAQ").click(function(){
			location.href = "<%=request.getContextPath()%>/list.fo";
		});
		
		//상품게시판으로
		$("#Productlist").click(function(){
			location.href = "<%=request.getContextPath()%>/list.po";
		});

		
		
	</script>
</body>
</html>