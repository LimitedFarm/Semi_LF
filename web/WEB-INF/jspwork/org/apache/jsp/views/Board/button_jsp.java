/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-28 10:39:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.Board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class button_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.button{\r\n");
      out.write("\tfont:15px Calibri, Arial, sans-serif;\r\n");
      out.write("\r\n");
      out.write("\t/* A semi-transparent text shadow */\r\n");
      out.write("\ttext-shadow:1px 1px 0 rgba(255,255,255,0.4);\r\n");
      out.write("\t\r\n");
      out.write("\t/* Overriding the default underline styling of the links */\r\n");
      out.write("\ttext-decoration:none !important;\r\n");
      out.write("\twhite-space:nowrap;\r\n");
      out.write("\t\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\tvertical-align:baseline;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tpadding:10px 20px;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-repeat:no-repeat;\r\n");
      out.write("\r\n");
      out.write("\t/* The following two rules are fallbacks, in case\r\n");
      out.write("\t   the browser does not support multiple backgrounds. */\r\n");
      out.write("\r\n");
      out.write("\tbackground-position:bottom left;\r\n");
      out.write("\tbackground-image:url('button_bg.png');\r\n");
      out.write("\t\r\n");
      out.write("\t/* Multiple backgrounds version. The background images\r\n");
      out.write("\t   are defined individually in color classes */\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-position:bottom left, top right, 0 0, 0 0;\r\n");
      out.write("\tbackground-clip:border-box;\r\n");
      out.write("\t\r\n");
      out.write("\t/* Applying a default border raidus of 8px */\r\n");
      out.write("\t\r\n");
      out.write("\t-moz-border-radius:8px;\r\n");
      out.write("\t-webkit-border-radius:8px;\r\n");
      out.write("\tborder-radius:8px;\r\n");
      out.write("\t\r\n");
      out.write("\t/* A 1px highlight inside of the button */\r\n");
      out.write("\t\r\n");
      out.write("\t-moz-box-shadow:0 0 1px #fff inset;\r\n");
      out.write("\t-webkit-box-shadow:0 0 1px #fff inset;\r\n");
      out.write("\tbox-shadow:0 0 1px #fff inset;\r\n");
      out.write("\t\r\n");
      out.write("\t/* Animating the background positions with CSS3 */\r\n");
      out.write("\t/* Currently works only in Safari/Chrome */\r\n");
      out.write("\t\r\n");
      out.write("\t-webkit-transition:background-position 1s;\r\n");
      out.write("\t-moz-transition:background-position 1s;\r\n");
      out.write("\ttransition:background-position 1s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:hover{\r\n");
      out.write("\t\r\n");
      out.write("\t/* The first rule is a fallback, in case the browser\r\n");
      out.write("\t   does not support multiple backgrounds\r\n");
      out.write("\t*/\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-position:top left;\r\n");
      out.write("\tbackground-position:top left, bottom right, 0 0, 0 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:active{\r\n");
      out.write("\t/* Moving the button 1px to the bottom when clicked */\r\n");
      out.write("\tbottom:-1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The three buttons sizes */\r\n");
      out.write("\r\n");
      out.write(".button.big\t\t{ font-size:30px;}\r\n");
      out.write(".button.medium\t{ font-size:18px;}\r\n");
      out.write(".button.small\t{ font-size:13px;}\r\n");
      out.write("\r\n");
      out.write("/* A more rounded button */\r\n");
      out.write("\r\n");
      out.write(".button.rounded{\r\n");
      out.write("\t-moz-border-radius:4em;\r\n");
      out.write("\t-webkit-border-radius:4em;\r\n");
      out.write("\tborder-radius:4em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* Defining four button colors */\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* BlueButton */\r\n");
      out.write("\r\n");
      out.write(".blue.button{\r\n");
      out.write("\tcolor:#0f4b6d !important;\r\n");
      out.write("\t\r\n");
      out.write("\tborder:1px solid #84acc3 !important;\r\n");
      out.write("\t\r\n");
      out.write("\t/* A fallback background color */\r\n");
      out.write("\tbackground-color: #48b5f2;\r\n");
      out.write("\t\r\n");
      out.write("\t/* Specifying a version with gradients according to */\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:\turl('button_bg.png'), url('button_bg.png'),\r\n");
      out.write("\t\t\t\t\t\t-moz-radial-gradient(\tcenter bottom, circle,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\trgba(89,208,244,1) 0,rgba(89,208,244,0) 100px),\r\n");
      out.write("\t\t\t\t\t\t-moz-linear-gradient(#4fbbf7, #3faeeb);\r\n");
      out.write("\r\n");
      out.write("\tbackground-image:\turl('button_bg.png'), url('button_bg.png'),\r\n");
      out.write("\t\t\t\t\t\t-webkit-gradient(\tradial, 50% 100%, 0, 50% 100%, 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfrom(rgba(89,208,244,1)), to(rgba(89,208,244,0))),\r\n");
      out.write("\t\t\t\t\t\t-webkit-gradient(linear, 0% 0%, 0% 100%, from(#4fbbf7), to(#3faeeb));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".blue.button:hover{\r\n");
      out.write("\tbackground-color:#63c7fe;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:\turl('button_bg.png'), url('button_bg.png'),\r\n");
      out.write("\t\t\t\t\t\t-moz-radial-gradient(\tcenter bottom, circle,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\trgba(109,217,250,1) 0,rgba(109,217,250,0) 100px),\r\n");
      out.write("\t\t\t\t\t\t-moz-linear-gradient(#63c7fe, #58bef7);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\tbackground-image:\turl('button_bg.png'), url('button_bg.png'),\r\n");
      out.write("\t\t\t\t\t\t-webkit-gradient(\tradial, 50% 100%, 0, 50% 100%, 100,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfrom(rgba(109,217,250,1)), to(rgba(109,217,250,0))),\r\n");
      out.write("\t\t\t\t\t\t-webkit-gradient(linear, 0% 0%, 0% 100%, from(#63c7fe), to(#58bef7));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Green Button */\r\n");
      out.write("\r\n");
      out.write(".green.button{\r\n");
      out.write("\tcolor:#345903 !important;\r\n");
      out.write("\tborder:1px solid #96a37b !important;\t\r\n");
      out.write("\tbackground-color: #79be1e;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -moz-radial-gradient(center bottom, circle, rgba(162,211,30,1) 0,rgba(162,211,30,0) 100px),-moz-linear-gradient(#82cc27, #74b317);\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -webkit-gradient(radial, 50% 100%, 0, 50% 100%, 100, from(rgba(162,211,30,1)), to(rgba(162,211,30,0))),-webkit-gradient(linear, 0% 0%, 0% 100%, from(#82cc27), to(#74b317));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".green.button:hover{\r\n");
      out.write("\tbackground-color:#89d228;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -moz-radial-gradient(center bottom, circle, rgba(183,229,45,1) 0,rgba(183,229,45,0) 100px),-moz-linear-gradient(#90de31, #7fc01e);\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -webkit-gradient(radial, 50% 100%, 0, 50% 100%, 100, from(rgba(183,229,45,1)), to(rgba(183,229,45,0))),-webkit-gradient(linear, 0% 0%, 0% 100%, from(#90de31), to(#7fc01e));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Orange Button */\r\n");
      out.write("\r\n");
      out.write(".orange.button{\r\n");
      out.write("\tcolor:#693e0a !important;\r\n");
      out.write("\tborder:1px solid #bea280 !important;\t\r\n");
      out.write("\tbackground-color: #e38d27;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -moz-radial-gradient(center bottom, circle, rgba(232,189,45,1) 0,rgba(232,189,45,0) 100px),-moz-linear-gradient(#f1982f, #d4821f);\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -webkit-gradient(radial, 50% 100%, 0, 50% 100%, 100, from(rgba(232,189,45,1)), to(rgba(232,189,45,0))),-webkit-gradient(linear, 0% 0%, 0% 100%, from(#f1982f), to(#d4821f));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".orange.button:hover{\r\n");
      out.write("\tbackground-color:#ec9732;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -moz-radial-gradient(center bottom, circle, rgba(241,192,52,1) 0,rgba(241,192,52,0) 100px),-moz-linear-gradient(#f9a746, #e18f2b);\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -webkit-gradient(radial, 50% 100%, 0, 50% 100%, 100, from(rgba(241,192,52,1)), to(rgba(241,192,52,0))),-webkit-gradient(linear, 0% 0%, 0% 100%, from(#f9a746), to(#e18f2b));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gray.button{\r\n");
      out.write("\tcolor:#525252 !important;\r\n");
      out.write("\tborder:1px solid #a5a5a5 !important;\t\r\n");
      out.write("\tbackground-color: #a9adb1;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -moz-radial-gradient(center bottom, circle, rgba(197,199,202,1) 0,rgba(197,199,202,0) 100px),-moz-linear-gradient(#c5c7ca, #92989c);\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -webkit-gradient(radial, 50% 100%, 0, 50% 100%, 100, from(rgba(197,199,202,1)), to(rgba(197,199,202,0))),-webkit-gradient(linear, 0% 0%, 0% 100%, from(#c5c7ca), to(#92989c));\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".gray.button:hover{\r\n");
      out.write("\tbackground-color:#b6bbc0;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -moz-radial-gradient(center bottom, circle, rgba(202,205,208,1) 0,rgba(202,205,208,0) 100px),-moz-linear-gradient(#d1d3d6, #9fa5a9);\r\n");
      out.write("\tbackground-image:url('button_bg.png'), url('button_bg.png'), -webkit-gradient(radial, 50% 100%, 0, 50% 100%, 100, from(rgba(202,205,208,1)), to(rgba(202,205,208,0))),-webkit-gradient(linear, 0% 0%, 0% 100%, from(#d1d3d6), to(#9fa5a9));\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
