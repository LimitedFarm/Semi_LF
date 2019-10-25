<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>

    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
 
                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 도로명 조합형 주소 변수
 
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }
                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
                if(fullRoadAddr !== ''){
                    fullRoadAddr += extraRoadAddr;
                }
 
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('sample4_roadAddress').value = fullRoadAddr;
                document.getElementById('sample4_jibunAddress').value = data.jibunAddress;
 
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    //예상되는 도로명 주소에 조합형 주소를 추가한다.
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    document.getElementById('guide').innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
 
                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    document.getElementById('guide').innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
 
                } else {
                    document.getElementById('guide').innerHTML = '';
                }
            }
        }).open();
    }
</script>

<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.outer{
		width:600px;
		height:500px;
		background:white;
		color:black;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}
	.outer label, .outer td{
		color:black;
	}
	input{
		margin-top:2px;
	}
	#idCheck, #goMain, #joinBtn{
		background:#999;
		border-radius:5px;
		width:80px;
		height:25px;
		text-align:center;
	}
	td{
		text-align:right;
	}
	#joinBtn{
		background:#999;
	}
	#joinBtn, #goMain{
		display:inline-block;
	}
	
</style>

</head>
<body>

	<%-- <%@ include file="../common/menubar.jsp"  %> --%>
	
	<div class="outer">
		<br>
		<h2 align="center">회원가입</h2>
		
		<form id="joinForm" action="<%=request.getContextPath() %>/insert.me" method="post">
			<table>
				<tr>
					<td width="200px">* 아이디</td>
					<td><input type="text" maxlength="13" name="userId" required></td>
					<td width="200px"><div id="idCheck">중복확인</div></td>
				</tr>
				<tr>
					<td>* 비밀번호</td>
					<td><input type="password" maxlength="13" name="userPwd" required></td>
				</tr>
				<tr>
					<td>* 비밀번호 확인</td>
					<td><input type="password" maxlength="13" name="userPwd2" required></td>
					<td><label id="pwdResult"></label></td>
				</tr>
				<tr>
					<td>* 이름</td>
					<td><input type="text" maxlength="5" name="userName" required></td>
				</tr>
				
				<tr>
					<td>* 주소</td>
					<td><input type="text" name= "code" id="sample4_postcode" placeholder="우편번호">
					<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
					<input type="text" id="sample4_roadAddress" name = "find2" placeholder="도로명주소">
					<input type="text" id="sample4_jibunAddress" name = "find3" placeholder="지번주소">
					
					<span id="guide" style="color:#999"></span></td>
					
					
				</tr>
				<tr>
					<td>* 연락처</td>
					<td>
						<input type="tel" maxlength="11" name="phone" placeholder="(-없이)01012345678">
					</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email"></td>
					<td></td>
				</tr>
				
				
			</table>
			
			<div class="btns" align="center">
				<div id="goMain" onclick="goMain();">메인으로</div>
				
			
				<input id="joinBtn" type="submit">
				
				
			</div>
		</form>
	</div>
	
	<script>
		function goMain(){
			location.href="<%=request.getContextPath()%>/index.jsp";
		}
		
		//회원 가입 하기
		function insertMember(){
			$("#joinForm").submit();
		}
	</script>
	
	
	<script>
		
		$(function(){
		
			$("#idCheck").click(function(){
				var userId = $("#joinForm input[name='userId']");
				
				if(!userId || userId.val().length < 4){	 
					alert("아이디는 최소 4자리 이상이어야 합니다.");
				
				
					userId.focus();
				}else{ 
					$.ajax({
						url:"<%=request.getContextPath()%>/idCheck.me",
						type:"post",
						data:{userId:userId.val()},
						success:function(data){
							if(data == "fail"){
								alert("아이디가 중복됩니다.");
								userId.focus();
							}else{
								alert("사용가능 합니다.");
								userId.attr("readonly","true");	
								isUsable=true;	
							}
						},
						error:function(data){
							console.log("서버 통신 안됨");
						}
					});
				}
				
			});
			
			
		});
		
		
		
		
	</script>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>