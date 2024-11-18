package org.apache.jsp.english.products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.com.netmovie.util.*;

public final class rentalbox_jsp extends org.apache.jasper.runtime.HttpJspBase
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

List imageList = (List)request.getAttribute("imageList");
List list =(List)request.getAttribute("list");
 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"description\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司-产品与客户</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/english/css/style.css\" />\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"/english/js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/head.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- nav -->\r\n");
      out.write("  <div class=\"nav\">\r\n");
      out.write("    <ul class=\"navlist\">\r\n");
      out.write("       <li ><span><a href=\"/english/indexEn.do\" class=\"ahome\">Home</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/introWebEn.do\">About CXIC</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/cultureByVisionWebEn.do?id=36\">Company Culture</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/queryQiyeNewsEn.do\">News Center</a></span></li>\r\n");
      out.write("      <li  ><span><a href=\"/english/queryEmployessEn.do\">Jobs</a></span></li>\r\n");
      out.write("      <li class=\"nlist3\"  ><span class=\"hover\" ><a href=\"/english/queryProductEn.do?categoryId=1\">Products and Customers</a></span></li>\r\n");
      out.write("       <li class=\"nobg nlist2\" ><span><a href=\"/english/queryModelContactEn.do\">Contact us</a></span></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"cls\"></div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"subnav\">\r\n");
      out.write("    <a href=\"/english/queryProductEn.do?categoryId=1\">Main Products</a>      \r\n");
      out.write("    <a href=\"/english/queryCategoryByIdEn.do?categoryId=11\">Customers</a>      \r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/time.jsp", out, true);
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- nav end -->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"mban\">\r\n");
      out.write("     ");
if(imageList!=null&&imageList.size()>0){
				Map imageMap = (Map)imageList.get(0);
			
      out.write(" \r\n");
      out.write("\t\t\t\t <img src=\"/");
      out.print(imageMap.get("path"));
      out.write("\" width=\"990\" height=\"245\" />\r\n");
      out.write("\t\t\t\t ");
if(imageMap.get("link")!=null&&((String)imageMap.get("link")).length()>0){
      out.write("\r\n");
      out.write("\t  \t\t\t\t<a href=\"");
      out.print(imageMap.get("link"));
      out.write("\" target=\"_blank\"><img src=\"/english/images/columnLink.gif\" width=\"990\" height=\"245\" /></a>\r\n");
      out.write("\t\t\t\t");
}
      out.write('\r');
      out.write('\n');
      out.write('	');
}
      out.write("\t\t\r\n");
      out.write("   </div>\r\n");
      out.write("  <!-- main -->\r\n");
      out.write("  <div class=\"mmain\">\r\n");
      out.write("  \t\t<div class=\"mleft\">\r\n");
      out.write("            <h2>\r\n");
      out.write("            \t<span class=\"sp_t1\">Products and Customers</span>\r\n");
      out.write("            </h2>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"mleftbox\">\r\n");
      out.write("            \t<ul class=\"leftlist\">\r\n");
      out.write("               \r\n");
      out.write("                    \t<li><a href=\"/english/queryProductEn.do?categoryId=1\">Main Products</a>\r\n");
      out.write("                        \r\n");
      out.write("                        \t\t<ul>\r\n");
      out.write("                                \t<li class=\"hover\" ><a href=\"/english/queryProductEn.do?categoryId=1\">ISO Standard Containers</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li ><a href=\"/english/querySpeciaIndexEn.do?categoryId=4\">Special Containers</a></li>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li ><a href=\"/english/queryPottypeIndexEn.do?categoryId=10\">Tank Containers</a></li>\r\n");
      out.write("                                \r\n");
      out.write("                                </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li  class=\"hover\"><a href=\"/english/queryCategoryByIdEn.do?categoryId=11\">Customers</a>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                                \t<li  ><a href=\"/english/queryCategoryByIdEn.do?categoryId=11\">Shipping Lines</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"hover\"><a href=\"/english/queryRentalBoxEn.do?categoryId=12\">Leasing Companies </a></li>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li ><a href=\"/english/queryOtherEn.do?categoryId=13\">Others</a></li> \r\n");
      out.write("                                \r\n");
      out.write("                                </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                     \r\n");
      out.write("                \r\n");
      out.write("                </ul>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("          \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/left.jsp", out, true);
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- mright -->\r\n");
      out.write("    \t<div class=\"mright\">\r\n");
      out.write("        \t\t <div class=\"curr\">\r\n");
      out.write("                 \tYour location-<a href=\"/english/queryCategoryByIdEn.do?categoryId=11\">Customers </a>-Leasing Companies\r\n");
      out.write("                 \r\n");
      out.write("   </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mtitle\">\r\n");
      out.write("                 \t<h2>Leasing Companies</h2>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mcon2\">\r\n");
      out.write("                   \t\t<ul class=\"shippinglist\">\r\n");
      out.write("                   \t\t\t ");
if(list!=null&&list.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t  \t\t\t\t");
for(int i=0;i<list.size();i++){
									Map map = (Map)list.get(i);
								
      out.write("\r\n");
      out.write("                        \t\t<li ");
if(i!=0&&i%2==0) {
      out.write(" style=\" margin-right:0;\" ");
      out.print(i);
} 
      out.write(">\r\n");
      out.write("                                \t<a href=\"javascript:void(0);\"><span><img src=\"/");
      out.print(map.get("small_image") );
      out.write("\" width=\"121\" height=\"53\" /></span>\r\n");
      out.write("                                \t\t<label>");
      out.print(map.get("name") );
      out.write("</label> \r\n");
      out.write("                                \t\t</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            \t");
} 
      out.write("\r\n");
      out.write("                            ");
}else{ 
      out.write("\r\n");
      out.write("                            \t暂无\r\n");
      out.write("                            ");
} 
      out.write("   \r\n");
      out.write("                               \r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                        </ul>\r\n");
      out.write("                      \r\n");
      out.write("                 </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    <!-- mright end -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- main end -->\r\n");
      out.write("  <!-- foot -->\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/foot.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- foot end -->\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
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
