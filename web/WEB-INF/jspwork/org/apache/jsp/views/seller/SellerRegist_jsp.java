/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-10-22 17:53:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import LF.member.model.vo.*;

public final class SellerRegist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<title>판매자 회원 신청 및 사업자 인증 페이지</title>\r\n");
      out.write("<style>\r\n");
      out.write("#idCheck{\r\n");
      out.write("\t\tbackground:orangered;\r\n");
      out.write("\t\tborder-radius:5px;\r\n");
      out.write("\t\twidth:80px;\r\n");
      out.write("\t\theight:25px;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t<h1>판매자 회원 신청</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"outer\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t<form id=\"joinForm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/selregist.me\" method=\"post\"  encType=\"multipart/form-data\">\t \r\n");
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