package org.apache.jsp.chinese.culture;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.com.netmovie.util.*;

public final class ejournals_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");

	List list = (List)request.getAttribute("list");

 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/chinese/css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"ebookbg\">\r\n");
      out.write("<div class=\"wrap4\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"ebookcon\">\r\n");
      out.write("  <h2>新华昌简报</h2>\r\n");
      out.write("  <span></span>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"cls\"></div>\r\n");
      out.write("    <div class=\"main_pbox\">\r\n");
      out.write("        <DIV class=scroll4>\r\n");
      out.write("                <DIV id=arrLeft_02 class=arrLeft><a class=\"prev3\"></a></DIV>\r\n");
      out.write("                <DIV id=arrRright_02 class=arrRright><a class=\"next3\"></a></DIV>\r\n");
      out.write("                <p class=\"cls\"></p>\r\n");
      out.write("                <DIV id=arrCont_02 class=arrCont>\r\n");
      out.write("    <ul class=\"arrlist ip_ns_ul\">\r\n");
      out.write("    \r\n");
      out.write("    \t");

									if (list != null && list.size() > 0) {
									for (int i = 0; i < list.size(); i++) {
										Map map = (Map) list.get(i);
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"/");
      out.print(map.get("image_path"));
      out.write("\" width=\"847\" height=\"1370\" />\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t暂无\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("    </ul>\r\n");
      out.write("     </DIV>\r\n");
      out.write("     </DIV>\r\n");
      out.write("     <script type=\"text/javascript\" src=\"/chinese/js/jquery-1.7.min.js\"></script>\r\n");
      out.write("     <script type=\"text/javascript\" src=\"/chinese/js/jquery.SuperSlide.js\" language=\"javascript\"></script>\r\n");
      out.write("           <script type=\"text/javascript\" language=\"javascript\">\r\n");
      out.write("\tjQuery('.main_pbox').slide({mainCell:\".ip_ns_ul\",effect:\"leftLoop\",prevCell:\".prev3\",nextCell:\".next3\"});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
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
