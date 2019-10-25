/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-23 11:29:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.\r\n");
      out.write("    function sample4_execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write(" \r\n");
      out.write("                // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var fullRoadAddr = data.roadAddress; // 도로명 주소 변수\r\n");
      out.write("                var extraRoadAddr = ''; // 도로명 조합형 주소 변수\r\n");
      out.write(" \r\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                    extraRoadAddr += data.bname;\r\n");
      out.write("                }\r\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                }\r\n");
      out.write("                // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                if(extraRoadAddr !== ''){\r\n");
      out.write("                    extraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("                }\r\n");
      out.write("                // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.\r\n");
      out.write("                if(fullRoadAddr !== ''){\r\n");
      out.write("                    fullRoadAddr += extraRoadAddr;\r\n");
      out.write("                }\r\n");
      out.write(" \r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById('sample4_postcode').value = data.zonecode; //5자리 새우편번호 사용\r\n");
      out.write("                document.getElementById('sample4_roadAddress').value = fullRoadAddr;\r\n");
      out.write("                document.getElementById('sample4_jibunAddress').value = data.jibunAddress;\r\n");
      out.write(" \r\n");
      out.write("                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.\r\n");
      out.write("                if(data.autoRoadAddress) {\r\n");
      out.write("                    //예상되는 도로명 주소에 조합형 주소를 추가한다.\r\n");
      out.write("                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;\r\n");
      out.write("                    document.getElementById('guide').innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';\r\n");
      out.write(" \r\n");
      out.write("                } else if(data.autoJibunAddress) {\r\n");
      out.write("                    var expJibunAddr = data.autoJibunAddress;\r\n");
      out.write("                    document.getElementById('guide').innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';\r\n");
      out.write(" \r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById('guide').innerHTML = '';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.outer{\r\n");
      out.write("\t\twidth:600px;\r\n");
      out.write("\t\theight:500px;\r\n");
      out.write("\t\tbackground:white;\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t\tmargin-left:auto;\r\n");
      out.write("\t\tmargin-right:auto;\r\n");
      out.write("\t\tmargin-top:50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.outer label, .outer td{\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t}\r\n");
      out.write("\tinput{\r\n");
      out.write("\t\tmargin-top:2px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#idCheck, #goMain, #joinBtn{\r\n");
      out.write("\t\tbackground:#999;\r\n");
      out.write("\t\tborder-radius:5px;\r\n");
      out.write("\t\twidth:80px;\r\n");
      out.write("\t\theight:25px;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\ttd{\r\n");
      out.write("\t\ttext-align:right;\r\n");
      out.write("\t}\r\n");
      out.write("\t#joinBtn{\r\n");
      out.write("\t\tbackground:#999;\r\n");
      out.write("\t}\r\n");
      out.write("\t#joinBtn, #goMain{\r\n");
      out.write("\t\tdisplay:inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"outer\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<h2 align=\"center\">회원가입</h2>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form id=\"joinForm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/insert.me\" method=\"post\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">* 아이디</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" maxlength=\"13\" name=\"userId\" required></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\"><div id=\"idCheck\">중복확인</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>* 비밀번호</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" maxlength=\"13\" name=\"userPwd\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>* 비밀번호 확인</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" maxlength=\"13\" name=\"userPwd2\" required></td>\r\n");
      out.write("\t\t\t\t\t<td><label id=\"pwdResult\"></label></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>* 이름</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" maxlength=\"5\" name=\"userName\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>* 주소</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name= \"code\" id=\"sample4_postcode\" placeholder=\"우편번호\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"sample4_execDaumPostcode()\" value=\"우편번호 찾기\"><br>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sample4_roadAddress\" name = \"find2\" placeholder=\"도로명주소\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"sample4_jibunAddress\" name = \"find3\" placeholder=\"지번주소\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<span id=\"guide\" style=\"color:#999\"></span></td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>* 연락처</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"tel\" maxlength=\"11\" name=\"phone\" placeholder=\"(-없이)01012345678\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"email\" name=\"email\"></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t<div id=\"goMain\" onclick=\"goMain();\">메인으로</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<input id=\"joinBtn\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction goMain(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//회원 가입 하기\r\n");
      out.write("\t\tfunction insertMember(){\r\n");
      out.write("\t\t\t$(\"#joinForm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t$(\"#idCheck\").click(function(){\r\n");
      out.write("\t\t\t\tvar userId = $(\"#joinForm input[name='userId']\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!userId || userId.val().length < 4){\t \r\n");
      out.write("\t\t\t\t\talert(\"아이디는 최소 4자리 이상이어야 합니다.\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\tuserId.focus();\r\n");
      out.write("\t\t\t\t}else{ \r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/idCheck.me\",\r\n");
      out.write("\t\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\t\tdata:{userId:userId.val()},\r\n");
      out.write("\t\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\t\tif(data == \"fail\"){\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"아이디가 중복됩니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t\tuserId.focus();\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"사용가능 합니다.\");\r\n");
      out.write("\t\t\t\t\t\t\t\tuserId.attr(\"readonly\",\"true\");\t\r\n");
      out.write("\t\t\t\t\t\t\t\tisUsable=true;\t\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\terror:function(data){\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(\"서버 통신 안됨\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
