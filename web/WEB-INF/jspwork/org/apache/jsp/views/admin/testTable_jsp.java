/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-24 08:21:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"/>\r\n");
      out.write(" <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write(" <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write(" <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\tbody {\r\n");
      out.write("  font-family: 'lato', sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".container {\r\n");
      out.write("  max-width: 1000px;\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("  padding-left: 10px;\r\n");
      out.write("  padding-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("  font-size: 26px;\r\n");
      out.write("  margin: 20px 0;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  small {\r\n");
      out.write("    font-size: 0.5em;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".responsive-table {\r\n");
      out.write("  li {\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("    padding: 25px 30px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    margin-bottom: 25px;\r\n");
      out.write("  }\r\n");
      out.write("  .table-header {\r\n");
      out.write("    background-color: #95A5A6;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    letter-spacing: 0.03em;\r\n");
      out.write("  }\r\n");
      out.write("  .table-row {\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    box-shadow: 0px 0px 9px 0px rgba(0,0,0,0.1);\r\n");
      out.write("  }\r\n");
      out.write("  .col-1 {\r\n");
      out.write("    flex-basis: 10%;\r\n");
      out.write("  }\r\n");
      out.write("  .col-2 {\r\n");
      out.write("    flex-basis: 40%;\r\n");
      out.write("  }\r\n");
      out.write("  .col-3 {\r\n");
      out.write("    flex-basis: 25%;\r\n");
      out.write("  }\r\n");
      out.write("  .col-4 {\r\n");
      out.write("    flex-basis: 25%;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  @media all and (max-width: 767px) {\r\n");
      out.write("    .table-header {\r\n");
      out.write("      display: none;\r\n");
      out.write("    }\r\n");
      out.write("    .table-row{\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("    li {\r\n");
      out.write("      display: block;\r\n");
      out.write("    }\r\n");
      out.write("    .col {\r\n");
      out.write("      \r\n");
      out.write("      flex-basis: 100%;\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("    .col {\r\n");
      out.write("      display: flex;\r\n");
      out.write("      padding: 10px 0;\r\n");
      out.write("      &:before {\r\n");
      out.write("        color: #6C7A89;\r\n");
      out.write("        padding-right: 10px;\r\n");
      out.write("        content: attr(data-label);\r\n");
      out.write("        flex-basis: 50%;\r\n");
      out.write("        text-align: right;\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h2>\r\n");
      out.write("\t\t\tResponsive Tables Using LI <small>Triggers on 767px</small>\r\n");
      out.write("\t\t</h2>\r\n");
      out.write("\t\t<ul class=\"responsive-table\">\r\n");
      out.write("\t\t\t<li class=\"table-header\">\r\n");
      out.write("\t\t\t\t<div class=\"col col-1\">Job Id</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-2\">Customer Name</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-3\">Amount Due</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-4\">Payment Status</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"table-row\">\r\n");
      out.write("\t\t\t\t<div class=\"col col-1\" data-label=\"Job Id\">42235</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-2\" data-label=\"Customer Name\">John Doe</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-3\" data-label=\"Amount\">$350</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-4\" data-label=\"Payment Status\">Pending</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"table-row\">\r\n");
      out.write("\t\t\t\t<div class=\"col col-1\" data-label=\"Job Id\">42442</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-2\" data-label=\"Customer Name\">Jennifer\r\n");
      out.write("\t\t\t\t\tSmith</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-3\" data-label=\"Amount\">$220</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-4\" data-label=\"Payment Status\">Pending</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"table-row\">\r\n");
      out.write("\t\t\t\t<div class=\"col col-1\" data-label=\"Job Id\">42257</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-2\" data-label=\"Customer Name\">John Smith</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-3\" data-label=\"Amount\">$341</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-4\" data-label=\"Payment Status\">Pending</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li class=\"table-row\">\r\n");
      out.write("\t\t\t\t<div class=\"col col-1\" data-label=\"Job Id\">42311</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-2\" data-label=\"Customer Name\">John\r\n");
      out.write("\t\t\t\t\tCarpenter</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-3\" data-label=\"Amount\">$115</div>\r\n");
      out.write("\t\t\t\t<div class=\"col col-4\" data-label=\"Payment Status\">Pending</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
