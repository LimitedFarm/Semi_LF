/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-28 08:43:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.Board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Popup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.text.DateFormat");
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
      out.write("    \r\n");

	 Calendar cal = Calendar.getInstance();
     cal.setTime(new Date());
     
     DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
     cal.add(Calendar.DATE, +5);
     
     String time = df.format(cal.getTime());

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/buttons.css\" />\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>기본 정보등록</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<input id=\"data\" type=\"hidden\" value=\"");
      out.print(time);
      out.write("\">\r\n");
      out.write("    <input type=\"hidden\" id=\"test\" value=\"1\">\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function setParentText(){\r\n");
      out.write("        \t\r\n");
      out.write("        \tvar pName = document.getElementById(\"cInput1\");\r\n");
      out.write("        \tvar pPrice = document.getElementById(\"cInput2\");\r\n");
      out.write("        \tvar pCount = document.getElementById(\"cInput3\");\r\n");
      out.write("        \tvar pAdd1 = document.getElementById(\"sample6_address\");\r\n");
      out.write("        \tvar pAdd2 = document.getElementById(\"sample6_detailAddress\");\r\n");
      out.write("        \tvar pDay = document.getElementById(\"cInput5\");\r\n");
      out.write("        \tvar pPeriod = document.getElementById(\"cInput6\");\r\n");
      out.write("        \tvar data1 = document.getElementById(\"data\");\r\n");
      out.write("        \t\r\n");
      out.write("        \tif(pName.value==\"\" || pPrice.value==\"\" || pCount.value==\"\" || pAdd1.value==\"\" || pAdd2.value==\"\" || pDay.value==\"\" || pPeriod.value==\"\"){\r\n");
      out.write("        \t\talert(\"입력되지 않은 항목이 있습니다.\");\r\n");
      out.write("        \t\treturn false;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(!(pPrice.value >= '0' && pPrice.value <= '9')){\r\n");
      out.write("        \t\talert(\"가격은 숫자만 입력 가능합니다.\")\r\n");
      out.write("        \t\treturn false;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(!(pCount.value >= '0' && pCount.value <= '9')){\r\n");
      out.write("        \t\talert(\"재고량은 숫자만 입력 가능합니다.\")\r\n");
      out.write("        \t\treturn false;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(pPeriod.value < (document.getElementById(\"data\").value)){\r\n");
      out.write("        \t\talert(\"유통기한은 현재 날짜로부터 5일 이후인 상품만 등록이 가능합니다. \\n\" + (document.getElementById(\"data\").value) + \"부터 설정가능합니다.\");\r\n");
      out.write("        \t\treturn false;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t\r\n");
      out.write("        \topener.document.getElementById(\"pInput1\").value = document.getElementById(\"cInput1\").value\r\n");
      out.write("            opener.document.getElementById(\"pInput2\").value = document.getElementById(\"cInput2\").value\r\n");
      out.write("            opener.document.getElementById(\"pInput3\").value = document.getElementById(\"cInput3\").value\r\n");
      out.write("            opener.document.getElementById(\"add1\").value = document.getElementById(\"sample6_address\").value\r\n");
      out.write("            opener.document.getElementById(\"add2\").value = document.getElementById(\"sample6_detailAddress\").value\r\n");
      out.write("            opener.document.getElementById(\"add3\").value = document.getElementById(\"sample6_extraAddress\").value\r\n");
      out.write("            opener.document.getElementById(\"pInput5\").value = document.getElementById(\"cInput5\").value\r\n");
      out.write("            opener.document.getElementById(\"pInput6\").value = document.getElementById(\"cInput6\").value\r\n");
      out.write("            opener.document.getElementById(\"test1\").value = document.getElementById(\"test\").value\r\n");
      out.write("            opener.document.getElementById(\"cate\").value = document.getElementById(\"cates\").value\r\n");
      out.write("            window.close();\r\n");
      out.write("   \r\n");
      out.write("        }\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function sample6_execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                var addr = ''; // 주소 변수\r\n");
      out.write("                var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                    addr = data.roadAddress;\r\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                    addr = data.jibunAddress;\r\n");
      out.write("                }\r\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                if(data.userSelectedType === 'R'){\r\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    if(extraAddr !== ''){\r\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                    }\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = extraAddr;\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"sample6_extraAddress\").value = '';\r\n");
      out.write("                }\r\n");
      out.write("                document.getElementById(\"sample6_address\").value = addr;\r\n");
      out.write("                document.getElementById(\"sample6_detailAddress\").focus();\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "button.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"margin-left: auto; margin-right:auto; border:1px dashed green; padding:0px; width: 600px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t<table style=\"margin-left: 5%\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t   \t\t\t\t\t\t<td width=\"100px\">\r\n");
      out.write("\t\t   \t\t\t\t\t\t\t카테고리\r\n");
      out.write("\t\t   \t\t\t\t\t\t</td>\r\n");
      out.write("\t\t   \t\t\t\t\t\t<td>\r\n");
      out.write("\t\t   \t\t\t\t\t\t\t<select id=\"cates\" onclick=\"ssds();\">\r\n");
      out.write("\t\t\t\t   \t\t\t\t\t\t\t<option value=\"1\" selected=\"selected\">과일</option>\r\n");
      out.write("\t\t\t\t   \t\t\t\t\t\t\t<option value=\"2\">채소</option>\r\n");
      out.write("\t\t\t\t   \t\t\t\t\t\t\t<option value=\"3\">견과류</option>\r\n");
      out.write("\t\t\t\t   \t\t\t\t\t\t\t<option value=\"4\">가공품</option>\r\n");
      out.write("\t\t\t   \t\t\t\t\t\t</select>\r\n");
      out.write("\t\t   \t\t\t\t\t\t</td>\r\n");
      out.write("\t\t   \t\t\t\t\t</tr>\r\n");
      out.write("\t   \t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100px\">판매 물품명</td> \r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"cInput1\" size=\"30\" name=\"title\" value=\"\" maxlength=\"20\" placeholder=\"최대 20자 까지  등록이 가능합니다.\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</td> \r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100px\">가격</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"number\" id=\"cInput2\" size=\"30\" name=\"title\" min=\"1000\" step=\"500\" placeholder=\"최소 1000원 \">원<br></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100px\">재고량</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"number\" id=\"cInput3\" size=\"30\" min=\"10\" name=\"title\" placeholder=\"최소 10개 \">개<br></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100px\">원산지</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"sample6_address\" placeholder=\"주소\" readonly=\"readonly\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"sample6_detailAddress\" placeholder=\"상세주소\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"sample6_extraAddress\" placeholder=\"참고항목\" readonly=\"readonly\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"button\" onclick=\"sample6_execDaumPostcode()\" value=\"우편번호 찾기\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100px\">생산일자</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"date\" id=\"cInput5\" size=\"45\" name=\"title\"><br></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"100px\">유통기한</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"date\" id=\"cInput6\" size=\"45\" name=\"title\">까지<br></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<div style=\"margin-left: 40%\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"button small green\"  onclick=\"setParentText()\">등록하기</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\tfunction ssds() {\r\n");
      out.write("\t\t\t\t\t    var ss = document.getElementById(\"cates\");\r\n");
      out.write("\t\t\t\t\t    var sssss = ss.options[ss.selectedIndex].value;\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"test\").value = sssss\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
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
