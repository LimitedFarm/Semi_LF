/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-24 06:14:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import LF.member.model.vo.*;
import LF.member.model.vo.*;
import LF.member.model.vo.*;

public final class SellerRegist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/seller/../seller/sellerMenubar.jsp", Long.valueOf(1571897536215L));
    _jspx_dependants.put("/views/seller/../seller/../common/menubar.jsp", Long.valueOf(1571733532895L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("LF.member.model.vo");
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

      out.write('\r');
      out.write('\n');

//로그인 되어있는 계정 정보 받아오기
	/* Customer customer = (Customer)request.getAttribute("customer"); */

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<title>판매자 회원 신청 및 사업자 인증 페이지</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#idCheck{\r\n");
      out.write("\t\t\tbackground:orangered;\r\n");
      out.write("\t\t\tborder-radius:5px;\r\n");
      out.write("\t\t\twidth:80px;\r\n");
      out.write("\t\t\theight:25px;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.outer{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("   \tmargin-top: 130px;\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    height: 500px;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\th1{\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   ");
      out.write('\r');
      out.write('\n');
 
	//1. 로그인 된 유저 정보 가져와야 함.(loginUser)
	Customer customer = (Customer)session.getAttribute("loginUser");
	
	//2. 해당 유저가 판매자로 등록되어 있는지 확인해야 함. 등록되어 있으면 해당 값 가져옴 (seller)
	Seller seller = (Seller)session.getAttribute("sellerUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#sellerMenu{\r\n");
      out.write("\t\tmargin-top : 130px;\r\n");
      out.write("\t\twidth: 200px; \r\n");
      out.write("\t\theight: 500px;\t\r\n");
      out.write("\t\tdisplay:inline-block;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t.outer{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("   \tmargin-top: 130px;\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    height: 500px;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\th1{\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');

	Customer loginUser = (Customer)session.getAttribute("loginUser");
	Seller sellerUser = (Seller)session.getAttribute("sellerUser");
	Admin adminUser = (Admin)session.getAttribute("adminUser");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\"> \r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.headerNavi{\r\n");
      out.write("\t\tdisplay:inline-block;\r\n");
      out.write("\t\tborder-radius:5px;\r\n");
      out.write("\t\twidth:auto;\r\n");
      out.write("\t\theight:auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t#loginBtn{\r\n");
      out.write("\t\tbackground:url('");
      out.print(request.getContextPath());
      out.write("/images/login.png') no-repeat;\r\n");
      out.write("\t\tbackground-size: cover; \r\n");
      out.write("\t\tbackground-repeat: no-repeat; \r\n");
      out.write("\t\tbackground-position: center;\r\n");
      out.write("\t\tborder: 0px;\r\n");
      out.write("\t\theight: 75px;\r\n");
      out.write("\t\twidth : 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#menuBtn{\r\n");
      out.write("\t\tbackground:url('");
      out.print(request.getContextPath());
      out.write("/images/menubtn.png') no-repeat;\r\n");
      out.write("\t\tbackground-size: 80%; \r\n");
      out.write("\t\tbackground-repeat: no-repeat; \r\n");
      out.write("\t\tbackground-position: center;\r\n");
      out.write("\t\tborder: 0px;\r\n");
      out.write("\t\theight: 75px;\r\n");
      out.write("\t\twidth : 75px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#signUpBtn{\r\n");
      out.write("\t\tbackground:url('");
      out.print(request.getContextPath());
      out.write("/images/signup2.png') no-repeat;\r\n");
      out.write("\t\tbackground-size: cover; \r\n");
      out.write("\t\tbackground-position: center;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tborder: 0px;\r\n");
      out.write("\t\theight: 75px;\r\n");
      out.write("\t\twidth : 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#logoutBtn{\r\n");
      out.write("\t\tbackground:url('");
      out.print(request.getContextPath());
      out.write("/images/login.png') no-repeat;\r\n");
      out.write("\t\tbackground-size: cover; \r\n");
      out.write("\t\tbackground-position: center;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tborder: 0px;\r\n");
      out.write("\t\theight: 75px;\r\n");
      out.write("\t\twidth : 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#inlineUl li{\r\n");
      out.write("\t\tdisplay:inline;\r\n");
      out.write("\t}\r\n");
      out.write("\t#rightMenu{\r\n");
      out.write("\t\talign:right;\r\n");
      out.write("\t}\r\n");
      out.write("\t#menu{\r\n");
      out.write("\t\twidth: 200px; \r\n");
      out.write("\t\theight:calc(100% - 150px); \r\n");
      out.write("\t\tposition: fixed; \r\n");
      out.write("\t\ttop: 130px; \r\n");
      out.write("\t\tleft: -320px; \r\n");
      out.write("\t\tz-index: 1055; \r\n");
      out.write("\t\tborder: 1px solid red; \r\n");
      out.write("\t\tbackground-color: green; \r\n");
      out.write("\t\ttext-align: center; \r\n");
      out.write("\t\ttransition: All 0.2s ease;\r\n");
      out.write("\t\tpadding-left: 20px;\r\n");
      out.write("\t\tpadding-right: 20px;\r\n");
      out.write("\t\tpadding-top: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#menu.open{\r\n");
      out.write("\t\tleft:0px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header역할을 하며 로그인, 회원가입, 메뉴바를 열수 있는 버튼을 생성 -->\r\n");
      out.write("\t<div class=\"navbar navbar-expand-sm bg-light navbar-dark fixed-top row\" style=\"min-width: 1200px; z-index:1055; float:top;\" >\r\n");
      out.write("\t\t<div class=\"headerNavi col-sm-1\" align=\"left\" >\r\n");
      out.write("\t\t\t<input id=\"menuBtn\" type=\"button\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"headerNavi col-sm-8\" align=\"center\">\r\n");
      out.write("\t\t\t<img id=\"logo\" src=\"");
      out.print(request.getContextPath());
      out.write("/images/logo.png\" height='75' width=\"300\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"headerNavi col-sm-3\" id=\"rightMenu\" >\r\n");
      out.write("\t\t\t");
 if(loginUser == null) {
      out.write("\r\n");
      out.write("\t\t\t\t<ul id=\"inlineUl\">\r\n");
      out.write("\t\t\t\t\t<li><button id=\"loginBtn\" type=\"button\" style=\"align:right;\" data-toggle=\"modal\" data-target=\"#loginDiv\"></button></li>\r\n");
      out.write("\t\t\t\t\t<li><button id=\"signUpBtn\" type=\"button\" style=\"align:right;\" data-toggle=\"modal\" data-target=\"#loginDiv\"></button></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t<ul id=\"inlineUl\">\r\n");
      out.write("\t\t\t\t\t<li><p>");
      out.print(loginUser.getUserName() );
      out.write("님 환영합니다.</li>\r\n");
      out.write("\t\t\t\t\t<li><button id=\"logoutBtn\" type=\"button\" style=\"align:right;\"></button></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 슬라이드 형식으로 버튼 클릭시 도출되는 메뉴바 -->\r\n");
      out.write("\t<div id=\"menu\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t");
 if(loginUser == null || loginUser.getGroupNum().equals("1")) {
      out.write("\r\n");
      out.write("\t\t\t\t");
 if(loginUser == null) {
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"subLoginBtn\">로그인</button>\r\n");
      out.write("\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\">1</button>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t");
} else if(loginUser.getGroupNum().equals("2")){
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\">2</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"adminPage\">관리자페이지</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\" id=\"\"></button>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- var list = [\"Home\", \"마이페이지\", \"상품 게시판\", \"장바구니\", \"FAQ\", \"1:1 고객 문의\"];\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar list = [\"Home\", \"로그인\", \"상품 게시판\", \"장바구니\", \"FAQ\", \"1:1 고객 문의\"];\r\n");
      out.write("\t\t\t\tfor(var i=0; i<list.length; i++){\r\n");
      out.write("\t\t\t\t\tvar $btn = $(\"<button>\").css({\"width\":\"150px\", \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \"height\": \"50px\", \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t \"margin\":\"10px\"});\r\n");
      out.write("\t\t\t\t\t$btn.attr(\"id\",\"before\"+i);\r\n");
      out.write("\t\t\t\t\t$btn.addClass(\"btn btn-light\");\r\n");
      out.write("\t\t\t\t\t$btn.html(list[i]);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$menuDiv.append($btn); -->\r\n");
      out.write("\t<!-- 로그인창 만들 div -->\r\n");
      out.write("\t");
 if(loginUser == null) {
      out.write("\r\n");
      out.write("\t<div id=\"loginDiv\" class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("\t\t<form id=\"loginForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/login.me\"\r\n");
      out.write("\t\tonsubmit=\"return validate();\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"modal-dialog modal-dialog-centered\" style=\"width: 400px;\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Modal Header -->\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">로그인</h4>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Modal body -->\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\" style=\"padding: 30px;\">\r\n");
      out.write("\t\t\t\t\t<!-- <form id=\"loginInfo\"> -->\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table-borderless\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"loginId\" name=\"loginId\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"password\" id=\"loginPwd\" name=\"loginPwd\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=2 align=\"right\"><a href=\"#\">아이디/비밀번호 찾기</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("<!-- \t\t\t\t\t</form> -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Modal footer -->\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button id=\"loginConnect\" type=\"submit\" class=\"btn btn-success\">로그인</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\" data-dismiss=\"modal\" id=\"closeLogin\">닫기</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t/* 메뉴바 버튼 */\r\n");
      out.write("\t\t\t$(\"#menuBtn\").click(function() {\r\n");
      out.write("\t\t\t\tif ($(\"#menu\").hasClass(\"open\")) { //class에 open이 없을 시 open클래스 추가 있을 시 삭제\r\n");
      out.write("\t\t\t\t\t$(\"#menu\").removeClass(\"open\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#menu\").addClass(\"open\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 일반회원 버튼\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 판매자 버튼\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 관리자 버튼\r\n");
      out.write("\t\t\t$(\"#adminPage\").click(function(){\r\n");
      out.write("\t\t\t\tlocation.href=\"../admin/adminMainPage.jsp\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t/* 로그인 기능 */\r\n");
      out.write("\t\t\t// validate() 함수 작성하기(form태그가 submit되었을 때 실행 됨)\r\n");
      out.write("\t\t\tfunction validate(){\r\n");
      out.write("\t\t\t\tif($(\"#userId\").val().trim().length==0){\r\n");
      out.write("\t\t\t\t\talert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\t\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn false;\t// return값이 false면 submit이 되지 않는다.\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#userPwd\").val().trim().length==0){\r\n");
      out.write("\t\t\t\t\talert(\"비밀번호를 입력하세요\");\r\n");
      out.write("\t\t\t\t\t$(\"#userPwd\").focus();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t/* $(\"#loginConnect\").click(function() {\r\n");
      out.write("\t\t\t\tvar id = $(\"#loginId\").val();\r\n");
      out.write("\t\t\t\tvar pwd = $(\"#loginPwd\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"/Semi_LF/login.me\",\r\n");
      out.write("\t\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\tuserId : id,\r\n");
      out.write("\t\t\t\t\t\tuserPwd : pwd\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#loginModal\").modal(\"hide\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}); */\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#subLoginBtn\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#loginBtn\").click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(document).click(function(event) { // 메뉴바를 제외한 부분 클릭시 메뉴바 닫힘\r\n");
      out.write("\t\t\t\tif (!($(\"#menu\").is(event.target)|| $(\"#menuBtn\").is(event.target)\r\n");
      out.write("\t\t\t\t\t|| $(\"#menu\").children().is(event.target) || $(\r\n");
      out.write("\t\t\t\t\t\t\"#childsBtn\").children().is(event.target))) {\r\n");
      out.write("\t\t\t\t\t\tif ($(\"#menu\").hasClass(\"open\")) { //class에 open이 없을 시 open클래스 추가 있을 시 삭제\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#menu\").removeClass(\"open\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#logoutBtn\").click(function(){\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/logout.me\";\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"sellerMenu\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t  <script>\r\n");
      out.write("\t  var regist = confirm(\"아직 판매자로 등록하지 않았습니다. 판매자 등록을 하시겠습니까?\");\r\n");
      out.write("\t  if( regist == true ){\r\n");
      out.write("\t      alert(\"확인선택!\");\r\n");
      out.write("\t      $(\"#sr\").get(0).click();\r\n");
      out.write("\t   }else{\r\n");
      out.write("\t\t   //취소 선택\r\n");
      out.write("\t      alert(\"메인 페이지로 이동합니다.\");\r\n");
      out.write("\t\t  window.location.replace(\"../../views/Main/MainPage.jsp\");\r\n");
      out.write("\t\t  \r\n");
      out.write("\t   }\r\n");
      out.write("\t  </script>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t<a href=\"../Main/MainPage.jsp\"><span>LFmall HomePage</span></a><br>\r\n");
      out.write("\t\t<a if=\"sr\" href=\"");
      out.print(request.getContextPath() );
      out.write("/sellerRegist.selr?\"> <span>판매자 등록하기</span></a><br>\t<!-- sRegistServlet -->\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/sellerInfoMng.selr?\"><span>판매자 정보 관리</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/selInfo.ad\"><span>판매 상품 관리</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/cReportInfo.ad\"><span>상품 리뷰 확인</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/sReportInfo.ad\"><span>주문 관리</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/selList.ad\"><span>매출 관리</span></a><br>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"outer\">\r\n");
      out.write("\t<h1 id=\"subject\">판매자 회원 신청</h1>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t<form id=\"joinForm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/sellerRegist.selr\" method=\"post\"  encType=\"multipart/form-data\">\t \r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">사업자 이름  </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" maxlength=\"13\" name=\"bName\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">사업자 등록번호</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" maxlength=\"10\" name=\"bNum\" id=\"bNum\" required><br><div></div></td>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">법인 번호</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" maxlength=\"13\" name=\"cpNum\" required><br><div>test</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">입금계좌 은행명</td>\r\n");
      out.write("\t\t\t\t\t<td><select id=\"bankName\" name=\"bankName\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">----</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"sh\">신한은행</option>\t\t<!-- 11,2자리 -->\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"nh\">농협은행</option>\t\t<!-- 11,2자리 -->\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"nhLocal\">지역농협</option>\t\t<!-- 13,4자리 -->\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"kb\">국민은행</option>\t\t<!-- 14자리 -->\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"wr\">우리은행</option>\t\t<!-- 13자리 -->\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"ibk\">기업은행</option>\t\t<!-- 14자리 -->\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"keb\">하나은행</option>\t\t<!-- 14자리 -->\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">입금계좌 계좌번호</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" maxlength=\"14\" name=\"acNum\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">예금주</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" maxlength=\"13\" name=\"acName\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\">사업자 등록증</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"file\" id=\"sellerReg\" name=\"sellerReg\" onchange=\"LoadImg(this);\" required></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200px\"></td>\r\n");
      out.write("\t\t\t\t\t<td><div><img id=\"regImg\" width=\"120\" height=\"100\"></div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<button id=\"joinBtn\" type=\"submit\" onclick=\"check();\">신청하기</button>\t<!-- submit 버튼으로 만들어서 실행해야 input태그들의required가 발동함 -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- SellerRegistServlet으로 이동 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t//사진 등록\r\n");
      out.write(" \t$(function(){\r\n");
      out.write("\t\t/* $(\"#selReg\").hide(); */\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#regImg\").click(function(){\r\n");
      out.write("\t\t\t$(\"#sellerReg\").click();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t function LoadImg(value){\r\n");
      out.write("\t\tif(value.files[0]!=undefined){\r\n");
      out.write("\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treader.onload = function(e){\r\n");
      out.write("\t\t\t\t$(\"#regImg\").attr(\"src\",e.target.result);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treader.readAsDataURL(value.files[0]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//사업자 등록번호 체크\r\n");
      out.write("\tfunction check(){\r\n");
      out.write("\t\talert(\"button click\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//사업자 등록번호 체크\r\n");
      out.write("\t\tvar bNum = $(\"#joinForm input[name='bNum']\").val();\r\n");
      out.write("\t\tconsole.log(bNum);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif((bNum = (bNum+'').match(/\\d{1}/g)).length != 10){\r\n");
      out.write("\t\t\talert(\"사업자 등록번호가 잘못되었습니다.\");\r\n");
      out.write("\t\t\tfocus(\"$joinForm input[name='bNum']\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar sum = 0, key = [1,3,7,1,3,7,1,3,5];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i=0; i<9; i++){\r\n");
      out.write("\t\t\tsum += (key[i]*Number(bNum[i]));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tconsole.log(((10 - ((sum + Math.floor(key[8] * Number(bNum[8])/10)) % 10)) % 10) == Number(bNum[9]));\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//법인번호 체크\r\n");
      out.write("\t\tvar cpNum = $(\"#joinForm input[name='cpNum']\").val();\r\n");
      out.write("\t\tvar re = /-/g;\r\n");
      out.write("\t\tcpNum = cpNum.replace('-','');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(cpNum.length != 13){\r\n");
      out.write("\t\t\talert(false);\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar arr_regno  = cpNum.split(\"\");\r\n");
      out.write("\t\tvar arr_wt   = new Array(1,2,1,2,1,2,1,2,1,2,1,2);\r\n");
      out.write("\t\tvar iSum_regno  = 0;\r\n");
      out.write("\t\tvar iCheck_digit = 0;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(i=0 ; i<12 ; i++){\r\n");
      out.write("\t\t\tiSum_regno += eval(arr_regno[i]) * eval(arr_wt[i]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tiCheck_digit = 10 - (iSum_regno % 10);\r\n");
      out.write("\t\tiCheck_digit = iCheck_digit % 10;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif( iCheck_digit != arr_regno[12]){\r\n");
      out.write("\t\t\talert(false);\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tconsole.log(true);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//은행 선택 여부\r\n");
      out.write("\t\tvar bankName = $(\"#joinForm select[name='bankName']\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(bankName == \"\"){\r\n");
      out.write("\t\t\talert(\"항목을 선택해주세요.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tconsole.log(true);\r\n");
      out.write("\t\t\tvar acNum = $(\"#joinForm input[name='acNum']\").val();\r\n");
      out.write("\t\t\tacNum = ((acNum+'').match(/\\d{1}/g));\r\n");
      out.write("\t\t\tif(bankName == \"sh\" || bankName ==\"nh\"){\r\n");
      out.write("\t\t\t\t if(acNum.length != 11 && acNum.length != 12){\r\n");
      out.write("\t\t\t\t\t\talert(\"계좌번호가 잘못되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tconsole.log(true);\r\n");
      out.write("\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else if(bankName == \"nhLocal\"){\r\n");
      out.write("\t\t\t\tif(acNum.length != 13 && acNum.length != 14){\r\n");
      out.write("\t\t\t\t\talert(\"계좌번호가 잘못되었습니다.\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tconsole.log(true);\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else if(bankName == \"wr\"){\r\n");
      out.write("\t\t\t\tif(acNum.length != 13){\r\n");
      out.write("\t\t\t\t\talert(\"계좌번호가 잘못되었습니다.\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tconsole.log(true);\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tif(acNum.length != 14){\r\n");
      out.write("\t\t\t\t\talert(\"계좌번호가 잘못되었습니다.\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tconsole.log(true);\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//Seller + Pattachment에 각각 값 입력.\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t \r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
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
