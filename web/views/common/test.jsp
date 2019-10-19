<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body style="height:1500px">
	<!-- header역할을 하며 로그인, 회원가입, 메뉴바를 열수 있는 버튼을 생성 -->
	<div class="navbar navbar-expand-sm bg-light navbar-dark fixed-top row" style="z-index:1055; float:top;" >
		<div class="headerNavi col-sm-1" align="left" >
			<input id="menuBtn" type="button">
		</div>
		<div class="headerNavi col-sm-8" align="center">
			<img id="logo" src="<%=request.getContextPath()%>/images/logo.png" height='75' width="300">
		</div>
		<div class="headerNavi col-sm-3" id="rightMenu" >
			<ul id="inlineUl">
				<li><button id="loginBtn" type="button" style="align:right;" data-toggle="modal" data-target="#loginDiv"></button></li>
				<li><button id="signUpBtn" type="button" style="align:right;" data-toggle="modal" data-target="#loginDiv"></button></li>
			</ul>
		</div>
		<hr>
	</div>
	<!-- 슬라이드 형식으로 버튼 클릭시 도출되는 메뉴바 -->
	<div id="menu">
		<div >
			<ul class="list-group" id="childsBtn">
  				<li class="list-group-item">First item</li>
 				<li class="list-group-item">Second item</li>
  				<li class="list-group-item">Third item</li>
			</ul>
		</div>
	</div>
	<!-- 로그인창 만들 div -->
	<div id="loginDiv" class="modal" >
		<div class="modal-dialog modal-dialog-centered" style="width:400px;">
      		<div class="modal-content">
      
     	    <!-- Modal Header -->
        	<div class="modal-header">
          	<h4 class="modal-title">로그인</h4>
          	<button type="button" class="close" data-dismiss="modal">&times;</button>
        	</div>
        	
       		<!-- Modal body -->
        	<div class="modal-body" style="padding:30px;">
        		<form id="loginInfo">
          			<table class="table-borderless" >
          				<tr>
          					<td>아이디</td>
          					<td><input type="text" id="loginId" name="loginId"></td>
          				</tr>
          				<tr>
          					<td>비밀번호</td>
          					<td><input type="text" id="loginId" name="loginId"></td>
          				</tr>
          				<tr>
          					<td colspan=2 align="right"><a href="#">아이디/비밀번호 찾기</a></td>
          				</tr>
          			</table>
          		</form>
        	</div>
        
        	<!-- Modal footer -->
        	<div class="modal-footer">
        	<button type="button" class="btn btn-success">로그인</button>
          	<button type="button" class="btn btn-success" data-dismiss="modal">닫기</button>
        	</div>
        
      </div>
    </div>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<script>
		$(function(){
			/* 메뉴바 버튼 */
			$("#menuBtn").click(function(){
				if($("#menu").hasClass("open")){ //class에 open이 없을 시 open클래스 추가 있을 시 삭제
					$("#menu").removeClass("open");
				}else{
					$("#menu").addClass("open");
				}
			});
			$menuDiv = $("#childsBtn");
			if(false){	// 로그인 시 메뉴바 구성 변경
				var list = ["Home", "마이페이지", "상품 게시판", "장바구니", "FAQ", "1:1 고객 문의"];
			}else{
				var list = ["Home", "로그인", "상품 게시판", "장바구니", "FAQ", "1:1 고객 문의"];
				for(var i=0; i<list.length; i++){
					var $btn = $("<button>").css({"width":"150px", 
													 "height": "50px", 
													 "margin":"10px"});
					$btn.attr("id","before"+i);
					$btn.addClass("btn btn-light");
					$btn.html(list[i]);
					
					$menuDiv.append($btn);
				}
			}
			// 나중에 수정 부분
			$("#before0").click(function(){
				alert($(this).attr("id"));
			});
			$("#before1").click(function(){
				alert($(this).attr("id"));
			});
			$("#before2").click(function(){
				alert($(this).attr("id"));
			});
			$("#before3").click(function(){
				alert($(this).attr("id"));
			});
			$("#before4").click(function(){
				alert($(this).attr("id"));
			});
			$("#before5").click(function(){
				alert($(this).attr("id"));
			});
			
			/* 로그인 버튼 */
			$("#login").click(function(){
				var heightDiv = $("#header").css("height");
				alert(heightDiv);
				var $div = $("#loginDiv");
				
				
				
				
				
				
			});
		});
		
		$(document).click(function(event){	// 메뉴바를 제외한 부분 클릭시 메뉴바 닫힘
			if(!($("#menu").is(event.target) || $("#menuBtn").is(event.target)
					|| $("#menu").children().is(event.target) || $("#childsBtn").children().is(event.target))){
				if($("#menu").hasClass("open")){ //class에 open이 없을 시 open클래스 추가 있을 시 삭제
					$("#menu").removeClass("open");
				}
			}
		});

	</script>
</body>
</html>