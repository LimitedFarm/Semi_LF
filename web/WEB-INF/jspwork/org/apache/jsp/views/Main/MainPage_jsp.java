/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-27 22:45:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.Main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import LF.member.model.vo.*;

public final class MainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/Main/../common/menubar.jsp", Long.valueOf(1572108774945L));
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t.headerUnder{\r\n");
      out.write("\t\tmargin-top:110px;\r\n");
      out.write("\t\twidth:800px;\r\n");
      out.write("      \theight:500px;\r\n");
      out.write("      \tbackground:#f3f3f2;\r\n");
      out.write("      \tmargin-left:auto;\r\n");
      out.write("      \tmargin-right:auto;\r\n");
      out.write("      \tvertical-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("  \t/* Make the image fully responsive */\r\n");
      out.write("  \t.carousel-inner img {\r\n");
      out.write("   \t   \twidth:100%;\r\n");
      out.write("   \t   \theight:400px;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t#LF_Carousel{\r\n");
      out.write("  \t\tdisplay:inline-block;\r\n");
      out.write("  \t\twidth:100%;\r\n");
      out.write("   \t   \theight:400px;\r\n");
      out.write("   \t   \tvertical-align:middle;\r\n");
      out.write("   \t   \ttext-align:center;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.carousel-inner{\r\n");
      out.write("  \t\tdisplay:inline-block;\r\n");
      out.write("  \t\ttext-align:center;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t.carousel-item{\r\n");
      out.write("  \t\tdisplay:inline-block;\r\n");
      out.write("  \t\ttext-align:center;\r\n");
      out.write("  \t}\r\n");
      out.write("  \t\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#f3f3f2;\">\r\n");
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
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
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
      out.write("\t\twidth: 250px; \r\n");
      out.write("\t\theight:calc(100% - 110px); \r\n");
      out.write("\t\tposition: fixed; \r\n");
      out.write("\t\ttop: 110px; \r\n");
      out.write("\t\tleft: -320px; \r\n");
      out.write("\t\tz-index: 1055;\r\n");
      out.write("\t\tbackground-color: #eee; \r\n");
      out.write("\t\tfont-size:1.2em;\r\n");
      out.write("\t\ttransition: All 0.2s ease;\r\n");
      out.write("\t\toverflow-x:hidden;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#menu.open{\r\n");
      out.write("\t\tleft:0px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.material-icons.md-25{\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t\tfont-size:25px;\r\n");
      out.write("\t\tvertical-align:bottom;\r\n");
      out.write("\t}\r\n");
      out.write("\t.linkSpan{\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t    top: 1px;\r\n");
      out.write("\t    display: inline-block;\r\n");
      out.write("\t    font-style: normal;\r\n");
      out.write("   \t\tfont-weight: 400;\r\n");
      out.write("\t    line-height: 1;\r\n");
      out.write("\t}\r\n");
      out.write("\t.linkC{\r\n");
      out.write("\t\tpadding: 12px 8px 12px 16px;\r\n");
      out.write("\t    font-size: 1.1em;\r\n");
      out.write("\t    text-decoration:none;\r\n");
      out.write("\t    color: #333;\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t    transition: .3s;\r\n");
      out.write("\t}\r\n");
      out.write("\t.aline{\r\n");
      out.write("\t\tborder-bottom: 1px solid #444;\r\n");
      out.write("\t}\r\n");
      out.write("\t.table-borderless td{\r\n");
      out.write("\t\tmargin-top:5px;\r\n");
      out.write("\t\tmargin-bottom:5px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.modal-body td{\r\n");
      out.write("\t\ttext-align:left;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header역할을 하며 로그인, 회원가입, 메뉴바를 열수 있는 버튼을 생성 -->\r\n");
      out.write("\t<div class=\"navbar navbar-expand-sm bg-light navbar-dark fixed-top row\" id=\"headerDiv\"style=\"min-width: 1200px; z-index:1055; float:top;\" >\r\n");
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
      out.write("\t\t\t\t\t<li><button id=\"loginBtn\" type=\"button\" style=\"align:right;\" data-toggle=\"modal\" data-target=\"#loginModal\"></button></li>\r\n");
      out.write("\t\t\t\t\t<li><button id=\"signUpBtn\" type=\"button\" style=\"align:right;\" data-toggle=\"modal\" data-target=\"#signupModal\"></button></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t");
} else { 
      out.write("\r\n");
      out.write("\t\t\t\t<ul id=\"inlineUl\">\r\n");
      out.write("\t\t\t\t\t<li>");
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
      out.write("\t\t<a href=\"views/Main/MainPage.jsp\" class=\"linkC\"><span class=\"linkSpan\"><i class=\"material-icons md-25\">home</i></span>&nbsp;&nbsp;Home</a>\r\n");
      out.write("\t\t<a href=\"#\" class=\"linkC aline\"><span class=\"linkSpan\"><i class=\"material-icons md-25\">account_circle</i></span>&nbsp;&nbsp;My Page</a>\r\n");
      out.write("\t\t<a href=\"#\" class=\"linkC\"><span class=\"linkSpan\"><i class=\"material-icons md-25\">add_shopping_cart</i></span>&nbsp;&nbsp;상품 게시판</a>\r\n");
      out.write("\t\t<a href=\"#\" class=\"linkC aline\"><span class=\"linkSpan\"><i class=\"material-icons md-25\">shopping_basket</i></span>&nbsp;&nbsp;장바구니</a>\r\n");
      out.write("\t\t<a href=\"#\" class=\"linkC\"><span class=\"linkSpan\"><i class=\"material-icons md-25\">shopping_cart</i></span>&nbsp;&nbsp;HOME</a>\r\n");
      out.write("\t\t<a href=\"#\" class=\"linkC\"><span class=\"linkSpan\"><i class=\"material-icons md-25\">https</i></span>&nbsp;&nbsp;HOME</a>\r\n");
      out.write("\t\t<a href=\"#\" class=\"linkC\"><span class=\"linkSpan\"><i class=\"material-icons md-25\">question_answer</i></span>&nbsp;&nbsp;고객센터</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
 if(loginUser == null) {
      out.write("\r\n");
      out.write("\t<div class=\"modal fade\" id=\"loginModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("\t\t<form id=\"loginForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/login.me\" onsubmit=\"return loginValidate();\" method=\"post\">\r\n");
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
      out.write("\t\t\t\t<div class=\"modal-body\" style=\"padding: 30px; text-align:center;\">\r\n");
      out.write("\t\t\t\t\t<!-- <form id=\"loginInfo\"> -->\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table-borderless\" style=\"display:inline-block\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"form-control\" id=\"loginId\" name=\"loginId\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"password\" class=\"form-control\" id=\"loginPwd\" name=\"loginPwd\"></td>\r\n");
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
      out.write("\t\r\n");
      out.write("\t<!-- 회원가입 모달 -->\r\n");
      out.write("\t");
 if(loginUser == null) {
      out.write("\r\n");
      out.write("\t<div class=\"modal fade\" id=\"signupModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("\t\t<form id=\"signupForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/signup.me\" onsubmit=\"return signValidate();\" method=\"post\">\r\n");
      out.write("\t\t<div class=\"modal-dialog modal-dialog-centered modal-lg\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Modal Header -->\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">회원가입</h4>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Modal body -->\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\" style=\"padding: 10px; text-align:center;\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table-borderless\"  style=\"display:inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>아이디</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"form-control\" id=\"signupId\" name=\"signupId\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"width:10px;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>비밀번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"password\" class=\"form-control\" id=\"signupPwd\" name=\"signupPwd\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>비밀번호 재확인</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"password\" class=\"form-control\" id=\"signupPwd2\" name=\"signupPwd2\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=2 style=\"font-size:15px; vertical-align:bottom;\"><p style=\"margin-top:10px;\" id=\"matchingPwd\"></p></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>주소</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"form-control\" id=\"address1\" name=\"address1\" placeholder=\"우편번호\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><button>주소 검색</button>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=4><input type=\"text\" class=\"form-control\" id=\"address2\" name=\"address2\" placeholder=\"주소\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=4><input type=\"text\" class=\"form-control\" id=\"address3\" name=\"address3\" placeholder=\"상세주소\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>휴대전화</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"form-control\" id=\"#\" name=\"#\" ></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>이메일</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"text\" class=\"form-control\" id=\"#\" name=\"#\" ></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>@</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <td id=\"hiddenEmail\"></td> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"display:inline-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select name=\"emailLog\" id=\"emailLog\" class=\"custom-select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected>-- 선택 --</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"naver.com\">naver.com</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"hanmail.net\">hanmail.net</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Modal footer -->\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button id=\"signupConnect\" type=\"submit\" class=\"btn btn-success\">가입</button>\r\n");
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
      out.write("\t\r\n");
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
      out.write("\t\t\t\t\t$(\"<div>\").css({\"width\":\"100%\", \"height\":\"100%\", \"top\":\"130px\", \"background\":\"lightgray\",\"opacity\":\"0.5\", \"z-index\":\"1000\"});\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/* 로그인 기능 */\r\n");
      out.write("\t\t\t// validate() 함수 작성하기(form태그가 submit되었을 때 실행 됨)\r\n");
      out.write("\t\t\tfunction loginValidate(){\r\n");
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
      out.write("\t\t\t// 회원가입 기능\r\n");
      out.write("\t\t\tfunction signValidate(){\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"#subLoginBtn\").click(function(){\r\n");
      out.write("\t\t\t\t$(\"#loginBtn\").click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#matchingPwd\").hide();\r\n");
      out.write("\t\t// 비밀번호 일치 기능\r\n");
      out.write("\t\t$(\"#signupPwd2\").keyup(function(){\r\n");
      out.write("\t\t\tvar pwd1 = $(\"#signupPwd\").val();\r\n");
      out.write("\t\t\tvar pwd2 = $(\"#signupPwd2\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(pwd1 != \"\" || pwd2 != \"\"){\r\n");
      out.write("                if(pwd1 == pwd2){\r\n");
      out.write("                    $(\"#matchingPwd\").text(\"비밀번호가 일치합니다.\").css(\"color\",\"blue\");\r\n");
      out.write("                    $(\"#matchingPwd\").show();\r\n");
      out.write("                }else{\r\n");
      out.write("                    $(\"#matchingPwd\").text(\"비밀번호가 일치하지 않습니다.\").css(\"color\",\"red\");;\r\n");
      out.write("                \t$(\"#matchingPwd\").show();\r\n");
      out.write("                }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
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
      out.write("\t<div  class=\"headerUnder container\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"LF_Carousel\" class=\"carousel slide\" style=\"align:center; width:400px; data-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Indicators -->\r\n");
      out.write("\t\t\t<ul class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t<li data-target=\"#LF_Carousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t\t<li data-target=\"#LF_Carousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t<li data-target=\"#LF_Carousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- The slideshow -->\r\n");
      out.write("\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-item active\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../../images/tomato.png\" class=\"img-responsive center-block\" alt=\"Los Angeles\" style=\"opacity:0.7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../../images/strawberry.png\" class=\"img-responsive center-block\" alt=\"strawberry\" style=\"opacity:0.7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"carousel-item\">\r\n");
      out.write("\t\t\t\t\t<img src=\"../../images/cherry.png\" class=\"img-responsive center-block\" alt=\"New York\" style=\"opacity:0.7\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Left and right controls -->\r\n");
      out.write("\t\t\t<a class=\"carousel-control-prev\" href=\"#LF_Carousel\" data-slide=\"prev\">\r\n");
      out.write("\t\t\t\t<span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("\t\t\t</a> <a class=\"carousel-control-next\" href=\"#LF_Carousel\" data-slide=\"next\">\r\n");
      out.write("\t\t\t\t<span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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
