package org.apache.jsp.english.products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.com.netmovie.util.*;

public final class specialIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
Pagination pageUtil = (Pagination)request.getAttribute("pages");
List list = (List)pageUtil.getList();
 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"CXIC GROUP CONTAINERS COMPANY LIMITED-Products and Customers\" />\r\n");
      out.write("<meta name=\"description\" content=\"CXIC GROUP CONTAINERS COMPANY LIMITED-Products and Customers\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>CXIC GROUP CONTAINERS COMPANY LIMITED-Products and Customers</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/english/css/style.css\" />\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"/english/js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction gotoPage(pno){\r\n");
      out.write("\t\turl = \"/english/querySpeciaIndexEn.do?categoryId=4&pageNumber=\"+pno;\r\n");
      out.write("\t\twindow.location.href=url;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction showDiv(n){\r\n");
      out.write("\t\tdocument.getElementById(n).style.display='block';\r\n");
      out.write("\t\tdocument.getElementById('bg').style.display='block';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction closeDiv(n){\r\n");
      out.write("\t\tdocument.getElementById(n).style.display='none';\r\n");
      out.write("\t\tdocument.getElementById('bg').style.display='none';\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/head.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- nav -->\r\n");
      out.write("    <div class=\"nav\">\r\n");
      out.write("    <ul class=\"navlist\">\r\n");
      out.write("       <li ><span><a href=\"/english/indexEn.do\" class=\"ahome\">Home</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/introWebEn.do\">About CXIC</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/cultureByVisionWebEn.do?id=36\">Company Culture</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/queryQiyeNewsEn.do\">News Center</a></span></li>\r\n");
      out.write("      <li  ><span><a href=\"/english/queryEmployessEn.do\">Join Us</a></span></li>\r\n");
      out.write("      <li class=\"nlist3\"  ><span class=\"hover\" ><a href=\"/english/queryProductEn.do?categoryId=1\">Products & Customers</a></span></li>\r\n");
      out.write("       <li class=\"nobg nlist2\" ><span><a href=\"/english/queryModelContactEn.do\">Contact Us</a></span></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"cls\"></div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"subnav\">\r\n");
      out.write("   <a href=\"/english/queryProductEn.do?categoryId=1\">Main Products</a>      \r\n");
      out.write("    <a href=\"/english/queryCategoryByIdEn.do?categoryId=11\">Customers</a>      \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/time.jsp", out, true);
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- nav end -->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"mban\">\r\n");
      out.write("    ");
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
      out.write("  \r\n");
      out.write("  \r\n");
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
      out.write("                    \t<li class=\"hover\"><a href=\"/english/queryProductEn.do?categoryId=1\">Main Products</a>\r\n");
      out.write("                        \r\n");
      out.write("                        \t\t<ul>\r\n");
      out.write("                                \t<li ><a href=\"/english/queryProductEn.do?categoryId=1\">ISO Standard Containers</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"hover\"><a href=\"/english/querySpeciaIndexEn.do?categoryId=4\">Special Containers</a></li>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li ><a href=\"/english/queryPottypeIndexEn.do?categoryId=10\">Tank Containers</a></li> \r\n");
      out.write("                                \r\n");
      out.write("                                </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"/english/queryCategoryByIdEn.do?categoryId=11\">Customers</a></li>\r\n");
      out.write("                     \t\t\t\r\n");
      out.write("                \t\t\t\t\r\n");
      out.write("                </ul>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/left.jsp", out, true);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- mright -->\r\n");
      out.write("    \t<div class=\"mright\">\r\n");
      out.write("        \t\t <div class=\"curr\">\r\n");
      out.write("                 \tYour location-<a href=\"/english/queryProductEn.do?categoryId=1\">Main Products</a>-Special Containers\r\n");
      out.write("                 \r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mtitle\">\r\n");
      out.write("                 \t<h2>Special Containers</h2>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mcon2\">\r\n");
      out.write("                      <ul class=\"prolist\">\r\n");
      out.write("                       ");
if(list!=null&&list.size()>0){
      out.write("\r\n");
      out.write("\t\t\t  \t\t\t\t");
for(int i=0;i<list.size();i++){
								Map map = (Map)list.get(i);
							
      out.write("\r\n");
      out.write("                      <li ");
if(i%3==2) {
      out.write(" class=\"noright\" ");
      out.print(i);
} 
      out.write(">\r\n");
      out.write("                        <p  class=\"pimg\"><a href=\"javascript:showDiv(");
      out.print(i);
      out.write(")\"  ><img src=\"/");
      out.print(map.get("small_image") );
      out.write("\" width=\"187\" height=\"121\" /></a></p> \r\n");
      out.write("                        \r\n");
      out.write("                        <p class=\"plist\"><a href=\"javascript:showDiv(");
      out.print(i);
      out.write(")\"  >");
      out.print(map.get("name") );
      out.write("</a></p>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                       <div id=\"");
      out.print(i);
      out.write("\" class=\"mydiv\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t <div align=\"right\"><a href=\"javascript:closeDiv('");
      out.print(i);
      out.write("')\"><strong>关闭</strong></a></div>\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t <div class=\"popbox\">\r\n");
      out.write("\t\t\t\t\t\t   <!-- <iframe id=\"ShowProduct\" src=\"/english/products/box.jsp\" style=\"width:100%;height:100%;\" frameborder=\"0\" scrolling=\"auto\"></iframe> -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t <div class=\"box\">\r\n");
      out.write("\t\t\t\t\t\t\t <p style=\"text-align:center\"><img src=\"/");
      out.print(map.get("small_image") );
      out.write("\" width=\"496\" height=\"321\" /></p>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t                    ");
      out.print(map.get("content") );
      out.write("\r\n");
      out.write("\t\t\t                    \r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t  <div align=\"right\"><a href=\"javascript:closeDiv('");
      out.print(i);
      out.write("')\"><strong>关闭</strong></a></div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div id=\"bg\" class=\"bg\" style=\"display:none;\"></div>\r\n");
      out.write("                      \t");
} 
      out.write(" \r\n");
      out.write("                      ");
}else{ 
      out.write("\r\n");
      out.write("                      \t暂无\r\n");
      out.write("                      ");
} 
      out.write("  \r\n");
      out.write("                        \r\n");
      out.write("                      \r\n");
      out.write("                      </ul>\r\n");
      out.write("                      <div class=\"cls\"></div>\r\n");
      out.write("                       <div id=\"bg\" class=\"bgdiv\" style=\" display:none\"></div>\r\n");
      out.write("                      \r\n");
      out.write("                      <div class=\"pages\">\r\n");
      out.write("                      \r\n");
      out.write("                      ");
if(pageUtil.getPageNumber()<2){
      out.write("<a class=\"fanye fyover\">Page Up</a>");
}else{
      out.write("<a  class=\"fanye\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-1);
      out.write(")\" >Page Up</a>");
}
      out.write("\r\n");
      out.write("\t \t\t\t\t\t\t");
if((pageUtil.getPageNumber()-2)>=1){
      out.write("\r\n");
      out.write("\t \t\t\t\t\t\t<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-2);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()-2);
      out.write("</a>\r\n");
      out.write("\t \t\t\t\t\t\t");
}
if((pageUtil.getPageNumber()-1)>=1){
      out.write("\r\n");
      out.write("\t \t\t\t\t\t\t<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-1);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()-1);
      out.write("</a>\r\n");
      out.write("\t \t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<span>");
      out.print(pageUtil.getPageNumber());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t");
if((pageUtil.getPageNumber()+1)<=pageUtil.getPageCount()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+1);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()+1);
      out.write("</a>");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
if((pageUtil.getPageNumber()+2)<=pageUtil.getPageCount()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+2);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()+2);
      out.write("</a>");
}
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                <!--下一页-->\t\r\n");
      out.write("\t \t\t\t\t\t");
if(pageUtil.getPageCount()<pageUtil.getPageNumber()+1){
      out.write("\r\n");
      out.write("\t \t\t\t\t\t<a class=\"fanye fyover\" >Page Down</a>");
}else{
      out.write("\r\n");
      out.write("\t \t\t\t\t\t<a  class=\"fanye\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+1);
      out.write(")\" >Page Down</a>\r\n");
      out.write("\t \t\t\t\t\t");
}
      out.write(" \r\n");
      out.write("\t \t\t\t\t\ttotal");
      out.print(pageUtil.getTotalCount());
      out.write("strip  current");
      out.print(pageUtil.getPageNumber());
      out.write('/');
      out.print(pageUtil.getPageCount());
      out.write("page\r\n");
      out.write("                      \r\n");
      out.write("                  \r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
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
      out.write("  ");
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
