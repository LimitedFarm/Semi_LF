/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-21 12:06:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import LF.adminPage.model.vo.PageInfo;
import LF.member.model.vo.Customer;
import java.util.ArrayList;
import LF.member.model.vo.*;

public final class customerManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/admin/../admin/../common/menubar.jsp", Long.valueOf(1571573782001L));
    _jspx_dependants.put("/views/admin/../admin/adminMenubar.jsp", Long.valueOf(1571658904459L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("LF.member.model.vo");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("LF.member.model.vo.Customer");
    _jspx_imports_classes.add("LF.adminPage.model.vo.PageInfo");
    _jspx_imports_classes.add("java.util.ArrayList");
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

	ArrayList<Customer> cuInfo = (ArrayList<Customer>)request.getAttribute("cuInfo");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<script\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<title>회원 관리</title>\r\n");
      out.write("<style>\r\n");
      out.write(".outer{\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\tpadding: 5px;\t\r\n");
      out.write("\twidth: 1200px;\r\n");
      out.write("\theight: 700px;\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\tmargin-top:160px;\r\n");
      out.write("\tmin-width:1200px;\r\n");
      out.write("}\r\n");
      out.write(".adDiv {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tborder:1px solid black;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("}\r\n");
      out.write("#insertCustomer{\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tvertical-align : middle;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("}\r\n");
      out.write("table {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table td {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\ttext-align:center\r\n");
      out.write("}\r\n");
      out.write("table th {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\talign: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#infoTable {\r\n");
      out.write("\tborder-collapse: separate;\r\n");
      out.write("\tborder-spacing: 10px 10px;\r\n");
      out.write("}\r\n");
      out.write(".headerUnder{\r\n");
      out.write("\tmargin-top:160px\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#adminMenu{\r\n");
      out.write("\t\tmargin-top : 130px;\r\n");
      out.write("\t\twidth: 200px; \r\n");
      out.write("\t\theight: 500px;\t\r\n");
      out.write("\t\tdisplay:inline-block;\r\n");
      out.write("\t\ttext-align:center;\r\n");
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
      out.write("\t<div id=\"adminMenu\">\r\n");
      out.write("\t\t<a href=\"../admin/adminMainPage.jsp\"><span>관리자 Home</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/cuInfo.ad\"><span>회원 관리</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/selInfo.ad\"><span>판매자 관리</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/cReportInfo.ad\"><span>회원 신고 내역</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/sReportInfo.ad\"><span>물품 신고 내역</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/selList.ad\"><span>판매 물품 관리</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/category.ad\"><span>물품 목록 관리</span></a><br>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath() );
      out.write("/question.ad\"><span>1대1 문의</span></a><br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<div class=\"outer\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<h1>&nbsp;&nbsp; 회원 관리</h1>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div id=\"insertCustomer\">\r\n");
      out.write("\t\t\t\t<label for=\"customerId\">회원 아이디</label> <input type=\"text\" id=\"customerId\" name=\"customerId\">\r\n");
      out.write("\t\t\t\t<button id=\"searchCustomer\">찾기</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"insertCustomer\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"보류\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<div class=\"adDiv\">\r\n");
      out.write("\t\t\t\t<!-- 간략한 회원 정보를 출력하는 div -->\r\n");
      out.write("\t\t\t\t<div style=\"width:500px; height: 500px;\"> \r\n");
      out.write("\t\t\t\t<table id=\"cuTable\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"50px\">번호</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"150px\">아이디</th>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
 if(cuInfo.size() == 0) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">조회된 리스트가 없습니다.</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
 }else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 for(Customer c : cuInfo) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.print(c.getCid() );
      out.write("\" id=\"connectCid");
      out.print(c.getCid() );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(c.getCid() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(c.getUserId() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/cuInfo.ad?currentPage=1'\"> << </button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- 이전 페이지로(<) -->\r\n");
      out.write("\t\t\t\t\t");
if(currentPage <= 1) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button disabled> < </button>\r\n");
      out.write("\t\t\t\t\t");
} else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/cuInfo.ad?currentPage=");
      out.print(currentPage-1 );
      out.write("'\"> < </button>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- 10개의 페이지 목록 -->\r\n");
      out.write("\t\t\t\t\t");
for(int p = startPage; p<=endPage; p++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 if(p == currentPage){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<button disabled>");
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t\t");
} else{
      out.write("\r\n");
      out.write("\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/cuInfo.ad?currentPage=");
      out.print(p );
      out.write('\'');
      out.write('"');
      out.write('>');
      out.print(p );
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- 다음 페이지로(>) -->\r\n");
      out.write("\t\t\t\t\t");
if(currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button disabled> > </button>\r\n");
      out.write("\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/cuInfo.ad?currentPage=");
      out.print(currentPage+1 );
      out.write("'\"> > </button>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- 맨 끝으로(>>) -->\r\n");
      out.write("\t\t\t\t\t<button onclick=\"location.href='");
      out.print(request.getContextPath() );
      out.write("/cuInfo.ad?currentPage=");
      out.print(maxPage );
      out.write("'\"> >> </button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"adDiv\" id=\"customerInfo\">\r\n");
      out.write("\t\t\t\t<!-- 회원 상세 정보를 출력하는 div -->\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>이름</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"cuName\" readonly></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>가입일자</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"cuJoinDate\" readonly></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=3><input type=\"text\" id=\"cuEmail\" readonly></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=4>주소</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=4><input type=\"text\" id=\"cuAddress\" readonly></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t// 회원 정보 테이블에 데이터 넣기\r\n");
      out.write("\t\t\t$(document).on('mouseenter', \"#cuTable td\", function(){\r\n");
      out.write("\t\t\t\t$(this).parent().css({\"background\":\"darkgray\",\"cursor\":\"pointer\"});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(document).on('mouseout', \"#cuTable td\", function(){\r\n");
      out.write("\t\t\t\t$(this).parent().css({\"background\":\"black\"});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(document).on('click', \"#cuTable td\", function(){\r\n");
      out.write("\t\t\t\tvar cid=$(this).parent().children(\"input\").val();\r\n");
      out.write("\t\t\t\t");
 for(Customer cu : cuInfo) {
      out.write("\r\n");
      out.write("\t\t\t\t\tif(");
      out.print(cu.getCid());
      out.write(" == cid) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#cuName\").val(\"");
      out.print(cu.getUserName());
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#cuJoinDate\").val(\"");
      out.print(cu.getJoinDate());
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#cuEmail\").val(\"");
      out.print(cu.getEmail());
      out.write("\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#cuAddress\").val(\"");
      out.print(cu.getAddress());
      out.write("\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t// 찾기 기능\r\n");
      out.write("\t\t\t$(\"#searchCustomer\").click(function(){\r\n");
      out.write("\t\t\t\tvar searchId = $(\"#customerId\").val();\r\n");
      out.write("\t\t\t\tif(searchId == \"\"){\r\n");
      out.write("\t\t\t\t\t$customerTable = $(\"#cuTable\");\r\n");
      out.write("\t\t\t\t\t$customerTable.html(\"\"); // 초기화\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar $headerTr = $(\"<tr>\");\r\n");
      out.write("\t\t\t\t\tvar $headerCid = $(\"<th>\").text(\"번호\").css(\"width\", \"50px\");\r\n");
      out.write("\t\t\t\t\tvar $headerId = $(\"<th>\").text(\"아이디\").css(\"width\", \"150px\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$headerTr.append($headerCid);\r\n");
      out.write("\t\t\t\t\t$headerTr.append($headerId);\r\n");
      out.write("\t\t\t\t\t$customerTable.append($headerTr);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
 for(Customer c : cuInfo) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar $tr = $(\"<tr>\");\r\n");
      out.write("\t\t\t\t\t\tvar $hiddenInput = $(\"<input>\").attr({\"type\":\"hidden\", \"id\":\"connectCid");
      out.print(c.getCid());
      out.write("\",\"value\":\"");
      out.print(c.getCid());
      out.write("\"});\r\n");
      out.write("\t\t\t\t\t\tvar $writerTd = $(\"<td>\").text(\"");
      out.print(c.getCid());
      out.write("\").css(\"width\",\"50px\");\r\n");
      out.write("\t\t\t\t\t\tvar $contentTd = $(\"<td>\").text(\"");
      out.print(c.getUserId());
      out.write("\").css(\"width\",\"150px\");\r\n");
      out.write("\t\t\t\t\t\t\t$tr.append($hiddenInput);\r\n");
      out.write("\t\t\t\t\t\t$tr.append($writerTd);\r\n");
      out.write("\t\t\t\t\t\t$tr.append($contentTd);\r\n");
      out.write("\t\t\t\t\t\t$customerTable.append($tr);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\turl : \"/Semi_LF/searchCu.ad\",\r\n");
      out.write("\t\t\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\tsearchId : searchId\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$customerTable = $(\"#cuTable\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$customerTable.html(\"\"); // 초기화\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tfor ( var key in data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar $headerTr = $(\"<tr>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar $headerCid = $(\"<th>\").text(\"번호\").css(\"width\", \"50px\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar $headerId = $(\"<th>\").text(\"아이디\").css(\"width\", \"150px\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar $tr = $(\"<tr>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar $hiddenInput = $(\"<input>\").attr({\"type\":\"hidden\", \"id\":\"connectCid\"+data[key].cid,\"value\":data[key].cid});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar $writerTd = $(\"<td>\").text(data[key].cid).css(\"width\",\"50px\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvar $contentTd = $(\"<td>\").text(data[key].userId).css(\"width\",\"150px\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$headerTr.append($headerCid);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$headerTr.append($headerId);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$customerTable.append($headerTr);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$tr.append($hiddenInput);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$tr.append($writerTd);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$tr.append($contentTd);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$customerTable.append($tr);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>");
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