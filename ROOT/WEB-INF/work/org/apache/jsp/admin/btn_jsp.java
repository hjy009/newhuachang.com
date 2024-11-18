package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class btn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/inc/common.jsp");
    _jspx_dependants.add("/WEB-INF/auth.tld");
  }

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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("<SCRIPT language=javascript> \r\n");
      out.write("\tvar getScreen=true;i=0;width=0;\r\n");
      out.write("\tfunction  shiftwindow()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(getScreen==false)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tparent.document.getElementById(\"showframeset\").setAttribute(\"cols\",\"0,8,*\");\r\n");
      out.write("\t\t\tgetScreen=true;\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(getScreen==true)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tparent.document.getElementById(\"showframeset\").setAttribute(\"cols\",\"255,8,*\");\r\n");
      out.write("\t\t\tgetScreen=false;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write(" \r\n");
      out.write("<body onLoad=\"shiftwindow()\" id=\"btnPage\">\r\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td onClick=shiftwindow() title=全屏/半屏 bgcolor=\"#390832\"><div align=\"center\"><a href=\"#\"><img src=\"images/main_41.gif\" alt=\"点击收起侧边栏\" name=\"Image1\" border=\"0\"></a></div></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
