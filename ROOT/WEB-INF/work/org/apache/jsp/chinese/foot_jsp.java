package org.apache.jsp.chinese;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<script>\r\n");
      out.write("function AddFavorite(sURL, sTitle){\r\n");
      out.write("\ttry{\r\n");
      out.write("\t\twindow.external.addFavorite(sURL, sTitle);\r\n");
      out.write("\t}\r\n");
      out.write("\tcatch (e){\r\n");
      out.write("\t\ttry{\r\n");
      out.write("\t\t\twindow.sidebar.addPanel(sTitle, sURL, \"\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tcatch (e){\r\n");
      out.write("\t\t\talert(\"加入收藏失败，请使用Ctrl+D进行添加\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"foot\">\r\n");
      out.write("  \t\t<div class=\"footnav\"><a href=\"queryAid.do\">法律声明</a> | <a href=\"queryAid.do?id=9\">版权所有</a> | <a href=\"queryAid.do?id=13\">关于网站</a> | <a href=\"queryAid.do?id=10\">站点地图</a> | <a href=\"/admin\">管理入口</a></div>\r\n");
      out.write("        <span>Copyright 2008-2010 新华昌集团版权所有  Powered by:<a href=\"http://www.toprand.com \" target=\"_blank\">www.toprand.com</a> </span> \r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
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
