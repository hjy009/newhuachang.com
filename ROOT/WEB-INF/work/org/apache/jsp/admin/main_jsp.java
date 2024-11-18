package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<!--<frameset rows=\"100,*,22\" frameborder=\"no\" border=\"0\" framespacing=\"0\">\r\n");
      out.write("  <frame src=\"Title.asp\" name=\"topFrame\" scrolling=\"No\" noresize=\"noresize\" id=\"topFrame\" title=\"topFrame\" />\r\n");
      out.write("  <frameset cols=\"180,10,*\" frameborder=\"no\" border=\"0\" framespacing=\"0\"  id=\"showframeset\">\r\n");
      out.write("    <frame src=\"left1.asp?parentNo=00\" name=\"leftFrame\" scrolling=\"auto\" noresize=\"noresize\" id=\"leftFrame\" title=\"leftFrame\" />\r\n");
      out.write("    <frame src=\"btn.html\" name=\"CloseleftFrame\" scrolling=\"No\" noresize=\"noresize\" id=\"CloseleftFrame\" title=\"CloseleftFrame\" />\r\n");
      out.write("    <frame src=\"Main.asp\" name=\"mainFrame\" id=\"mainFrame\" title=\"mainFrame\" />\r\n");
      out.write("  </frameset>\r\n");
      out.write("  <frame src=\"buttom.html\" name=\"bottomFrame\" scrolling=\"No\" noresize=\"noresize\" id=\"bottomFrame\" title=\"bottomFrame\" />\r\n");
      out.write("</frameset>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<frameset rows=\"99,*,39\" frameborder=\"no\" border=\"0\" framespacing=\"0\">\r\n");
      out.write(" <frame src=\"top.jsp\" name=\"topFrame\" scrolling=\"no\" noresize=\"noresize\" id=\"topFrame\" />\r\n");
      out.write("  <frameset cols=\"255,8,*\" frameborder=\"no\" border=\"0\" framespacing=\"0\"  id=\"showframeset\">\r\n");
      out.write("    <frame src=\"/admin/menuList.do\" name=\"leftFrame\" scrolling=\"auto\" noresize=\"noresize\" id=\"leftFrame\" title=\"leftFrame\" />\r\n");
      out.write("    <frame src=\"btn.jsp\" name=\"CloseleftFrame\" scrolling=\"No\" noresize=\"noresize\" id=\"CloseleftFrame\" title=\"CloseleftFrame\" />\r\n");
      out.write("    <frame src=\"/admin/menuIntorList.do\" name=\"mainFrame\" id=\"mainFrame\" title=\"mainFrame\" />\r\n");
      out.write("  </frameset>\r\n");
      out.write("\r\n");
      out.write("<!--<frame src=\"center.html\" name=\"centerFrame\" id=\"centerFrame\" />-->\r\n");
      out.write("  <frame src=\"foot.jsp\" name=\"bottomFrame\" scrolling=\"No\" noresize=\"noresize\" id=\"bottomFrame\" title=\"bottomFrame\" />\r\n");
      out.write("</frameset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<noframes><body>\r\n");
      out.write("</body>\r\n");
      out.write("</noframes>\r\n");
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
