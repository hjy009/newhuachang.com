package org.apache.jsp.chinese;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class time_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=GBK");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"time\"><span id=\"aaa\" ></span> </div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showLocale(objD)\r\n");
      out.write("{\r\n");
      out.write("var str,colorhead,colorfoot;\r\n");
      out.write("var yy = objD.getYear();\r\n");
      out.write("if(yy<1900) yy = yy+1900;\r\n");
      out.write("var MM = objD.getMonth()+1;\r\n");
      out.write("if(MM<10) MM = '0' + MM;\r\n");
      out.write("var dd = objD.getDate();\r\n");
      out.write("if(dd<10) dd = '0' + dd;\r\n");
      out.write("var hh = objD.getHours();\r\n");
      out.write("if(hh<10) hh = '0' + hh;\r\n");
      out.write("var mm = objD.getMinutes();\r\n");
      out.write("if(mm<10) mm = '0' + mm;\r\n");
      out.write("var ss = objD.getSeconds();\r\n");
      out.write("if(ss<10) ss = '0' + ss;\r\n");
      out.write("\r\n");
      out.write("var nm;\r\n");
      out.write("if(hh<=12){\r\n");
      out.write("\tnm=\"AM\";\r\n");
      out.write("}else{\r\n");
      out.write("\tnm=\"PM\";\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("var ww = objD.getDay();\r\n");
      out.write("if  ( ww==0 )  colorhead=\"<font color=\\\"#FF0000\\\">\";\r\n");
      out.write("if  ( ww > 0 && ww < 6 )  colorhead=\"<font color=\\\"#373737\\\">\";\r\n");
      out.write("if  ( ww==6 )  colorhead=\"<font color=\\\"#008000\\\">\";\r\n");
      out.write("if  (ww==0)  ww=\"星期日\";\r\n");
      out.write("if  (ww==1)  ww=\"星期一\";\r\n");
      out.write("if  (ww==2)  ww=\"星期二\";\r\n");
      out.write("if  (ww==3)  ww=\"星期三\";\r\n");
      out.write("if  (ww==4)  ww=\"星期四\";\r\n");
      out.write("if  (ww==5)  ww=\"星期五\";\r\n");
      out.write("if  (ww==6)  ww=\"星期六\";\r\n");
      out.write("colorfoot=\"</font>\"\r\n");
      out.write("str = \"今天是\" + yy + \"年\" + MM + \"月\" + dd + \"日\"+\"&nbsp;<span class='red'>\"+ ww+\"</span>&nbsp;\"+ hh + \":\" + mm;\r\n");
      out.write("return(str);\r\n");
      out.write("}\r\n");
      out.write("function tick()\r\n");
      out.write("{\r\n");
      out.write("var today;\r\n");
      out.write("today = new Date();\r\n");
      out.write("document.getElementById(\"aaa\").innerHTML = showLocale(today);\r\n");
      out.write("window.setTimeout(\"tick()\", 1000);\r\n");
      out.write("}\r\n");
      out.write("tick();\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
