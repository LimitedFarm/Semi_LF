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
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
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
		width: 250px; 
		height:calc(100% - 110px); 
		position: fixed; 
		top: 110px; 
		left: -320px; 
		z-index: 1055;
		background-color: #eee; 
		font-size:1.2em;
		transition: All 0.2s ease;
		overflow-x:hidden;
	}
	
	#menu.open{
		left:0px;
	}
	.material-icons.md-25{
		color:black;
		font-size:25px;
		vertical-align:bottom;
	}
	.linkSpan{
		position: relative;
	    top: 1px;
	    display: inline-block;
	    font-style: normal;
   		font-weight: 400;
	    line-height: 1;
	}
	.linkC{
		padding: 12px 8px 12px 16px;
	    font-size: 1.1em;
	    text-decoration:none;
	    color: #333;
		display: block;
	    transition: .3s;
	}
	.aline{
		border-bottom: 1px solid #444;
	}
	.table-borderless td{
		margin-top:5px;
		margin-bottom:5px;
	}
	.modal-body td{
		text-align:left;
	}
</style>
</head>
<body>
	<!-- header역할을 하며 로그인, 회원가입, 메뉴바를 열수 있는 버튼을 생성 -->
	<div class="navbar navbar-expand-sm bg-light navbar-dark fixed-top row" id="headerDiv"style="min-width: 1200px; z-index:1055; float:top;" >
		<div class="headerNavi col-sm-1" align="left" >
			<input id="menuBtn" type="button">
		</div>
		<div class="headerNavi col-sm-8" align="center">
			<img id="logo" src="<%=request.getContextPath()%>/images/logo.png" height='75' width="300">
		</div>
		<div class="headerNavi col-sm-3" id="rightMenu" >
			<% if(loginUser == null) {%>
				<ul id="inlineUl">
					<li><button id="loginBtn" type="button" style="align:right;" data-toggle="modal" data-target="#loginModal"></button></li>
					<li><button id="signUpBtn" type="button" style="align:right;" data-toggle="modal" data-target="#signupModal"></button></li>
				</ul>
			<%} else { %>
				<ul id="inlineUl">
					<li><%=loginUser.getUserName() %>님 환영합니다.</li>
					<li><button id="logoutBtn" type="button" style="align:right;"></button></li>
				</ul>
			<%} %>
		</div>
		<hr>
	</div>
	
	<!-- 슬라이드 형식으로 버튼 클릭시 도출되는 메뉴바 -->
	<div id="menu">
		<a href="/Semi_LF/views/Main/MainPage.jsp" class="linkC"><span class="linkSpan"><i class="material-icons md-25">home</i></span>&nbsp;&nbsp;Home</a>
		<a href="/Semi_LF/views/customer/MyPage.jsp" class="linkC aline"><span class="linkSpan"><i class="material-icons md-25">account_circle</i></span>&nbsp;&nbsp;My Page</a>
		<a href="#" class="linkC"><span class="linkSpan"><i class="material-icons md-25">add_shopping_cart</i></span>&nbsp;&nbsp;상품 게시판</a>
		<a href="#" class="linkC aline"><span class="linkSpan"><i class="material-icons md-25">shopping_basket</i></span>&nbsp;&nbsp;장바구니</a>
		<a href="#" class="linkC"><span class="linkSpan"><i class="material-icons md-25">shopping_cart</i></span>&nbsp;&nbsp;HOME</a>
		<a href="#" class="linkC"><span class="linkSpan"><i class="material-icons md-25">https</i></span>&nbsp;&nbsp;HOME</a>
		<a href="#" class="linkC"><span class="linkSpan"><i class="material-icons md-25">question_answer</i></span>&nbsp;&nbsp;고객센터</a>
	</div>
	
	
	
	<% if(loginUser == null) {%>
	<div class="modal fade" id="loginModal" tabindex="-1" role="dialog">
		<form id="loginForm" action="<%=request.getContextPath()%>/login.me" onsubmit="return loginValidate();" method="post">
		<div class="modal-dialog modal-dialog-centered" style="width: 400px;">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">로그인</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body" style="padding: 30px; text-align:center;">
					<!-- <form id="loginInfo"> -->
						<table class="table-borderless" style="display:inline-block">
							<tr>
								<td>아이디</td>
								<td><input type="text" class="form-control" id="loginId" name="loginId"></td>
							</tr>
							<tr>
								<td>비밀번호</td>
								<td><input type="password" class="form-control" id="loginPwd" name="loginPwd"></td>
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
	
	<!-- 회원가입 모달 -->
	<% if(loginUser == null) {%>
	<div class="modal fade" id="signupModal" tabindex="-1" role="dialog">
		<form id="signupForm" action="<%=request.getContextPath()%>/signup.me" onsubmit="return signValidate();" method="post">
		<div class="modal-dialog modal-dialog-centered modal-lg">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">회원가입</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>

				<!-- Modal body -->
				<div class="modal-body" style="padding: 10px; text-align:center;">
						<table class="table-borderless"  style="display:inline-block;">
							<tr>
								<td>아이디</td>
								<td><input type="text" class="form-control" id="signupId" name="signupId"></td>
								<td style="width:10px;"></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>비밀번호</td>
								<td><input type="password" class="form-control" id="signupPwd" name="signupPwd"></td>
							</tr>
							<tr>
								<td>비밀번호 재확인</td>
								<td><input type="password" class="form-control" id="signupPwd2" name="signupPwd2"></td>
								<td></td>
								<td colspan=2 style="font-size:15px; vertical-align:bottom;"><p style="margin-top:10px;" id="matchingPwd"></p></td>
							</tr>
							<tr>
								<td>주소</td>
								<td><input type="text" class="form-control" id="address1" name="address1" placeholder="우편번호"></td>
								<td></td>
								<td><button>주소 검색</button>
							</tr>
							<tr>
								<td></td>
								<td colspan=4><input type="text" class="form-control" id="address2" name="address2" placeholder="주소"></td>
							</tr>
							<tr>
								<td></td>
								<td colspan=4><input type="text" class="form-control" id="address3" name="address3" placeholder="상세주소"></td>
							</tr>
							<tr>
								<td>휴대전화</td>
								<td><input type="text" class="form-control" id="#" name="#" ></td>
							</tr>
							<tr>
								<td>이메일</td>
								<td><input type="text" class="form-control" id="#" name="#" ></td>
								<td>@</td>
								<!-- <td id="hiddenEmail"></td> -->
								<td style="display:inline-block">
									<select name="emailLog" id="emailLog" class="custom-select">
										<option value="" selected>-- 선택 --</option>
										<option value="naver.com">naver.com</option>
										<option value="hanmail.net">hanmail.net</option>
										<option value="gmail.com">gmail.com</option>
									</select>
							</tr>
						</table>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button id="signupConnect" type="submit" class="btn btn-success">가입</button>
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
					$("<div>").css({"width":"100%", "height":"100%", "top":"130px", "background":"lightgray","opacity":"0.5", "z-index":"1000"});
				}
			});

			// 일반회원 버튼
			
			// 판매자 버튼
			
			// 관리자 버튼
			$("#adminPage").click(function(){
				location.href="../admin/adminMainPage.jsp"
			});
			
			/* 로그인 기능 */
			// validate() 함수 작성하기(form태그가 submit되었을 때 실행 됨)
			function loginValidate(){
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
			// 회원가입 기능
			function signValidate(){
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
			
			$("#subLoginBtn").click(function(){
				$("#loginBtn").click();
			});
			
		});
		$("#matchingPwd").hide();
		// 비밀번호 일치 기능
		$("#signupPwd2").keyup(function(){
			var pwd1 = $("#signupPwd").val();
			var pwd2 = $("#signupPwd2").val();
			
			if(pwd1 != "" || pwd2 != ""){
                if(pwd1 == pwd2){
                    $("#matchingPwd").text("비밀번호가 일치합니다.").css("color","blue");
                    $("#matchingPwd").show();
                }else{
                    $("#matchingPwd").text("비밀번호가 일치하지 않습니다.").css("color","red");;
                	$("#matchingPwd").show();
                }
			}
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
	</script>
</body>
</html>