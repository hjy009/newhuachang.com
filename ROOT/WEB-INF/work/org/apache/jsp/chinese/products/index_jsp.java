package org.apache.jsp.chinese.products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.com.netmovie.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"description\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司-产品与客户</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/chinese/css/style.css\" />\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/chinese/box/shadowbox-2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/chinese/box/shadowbox-en.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/chinese/box/skin.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/chinese/box/skin.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/chinese/box/extras.css\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction gotoPage(pno){\r\n");
      out.write("\t\turl = \"/chinese/queryProduct.do?pageNumber=\"+pno+\"&categoryId=1\";\r\n");
      out.write("\t\twindow.location.href=url;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
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
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/head.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- nav -->\r\n");
      out.write("  <div class=\"nav\">\r\n");
      out.write("    <ul class=\"navlist\">\r\n");
      out.write("       <li style=\"width:80px;\" ><a href=\"/chinese/index.do\" class=\"ahome\">首页</a></li>\r\n");
      out.write("      <li ><a href=\"/chinese/introWeb.do\">新华昌简介</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/cultureByVisionWeb.do?id=36\">企业文化</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryQiyeNews.do\">新闻中心</a></li>\r\n");
      out.write("      <li ><a href=\"/chinese/queryEmployess.do\">员工与招聘</a></li>\r\n");
      out.write("      <li  class=\"hover\"><a href=\"/chinese/queryProduct.do?categoryId=1\">产品与客户</a></li>\r\n");
      out.write("      <li class=\"nobg\" ><a href=\"/chinese/queryModelContact.do\">联系我们</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"cls\"></div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"subnav\">\r\n");
      out.write("   <a href=\"/chinese/queryProduct.do?categoryId=1\">主要产品</a>      \r\n");
      out.write("    <a href=\"/chinese/queryCategoryById.do?categoryId=11\">主要客户</a>      \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/time.jsp", out, true);
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- nav end -->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"mban\">\r\n");
      out.write("   ");
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
      out.write("\" target=\"_blank\"><img src=\"/chinese/images/columnLink.gif\" width=\"990\" height=\"245\" /></a>\r\n");
      out.write("\t\t\t\t");
}
      out.write('\r');
      out.write('\n');
      out.write('	');
}
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  <!-- main -->\r\n");
      out.write("  <div class=\"mmain\">\r\n");
      out.write("  \t\t<div class=\"mleft\">\r\n");
      out.write("            <h2>\r\n");
      out.write("            \t<span class=\"sp_t1\">产品与客户</span>\r\n");
      out.write("            </h2>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"mleftbox\"  style=\"border-collapse:collapse; \">\r\n");
      out.write("            \t<ul class=\"leftlist\">\r\n");
      out.write("               \r\n");
      out.write("                    \t<li class=\"hover\"><a href=\"/chinese/queryProduct.do?categoryId=1\">主要产品</a>\r\n");
      out.write("                        \r\n");
      out.write("                        \t\t<ul>\r\n");
      out.write("                                \t<li class=\"hover\"><a href=\"/chinese/queryProduct.do?categoryId=1\">国际标准集装箱</a></li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li ><a href=\"/chinese/querySpeciaIndex.do?categoryId=4\">特种干货集装箱</a></li>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li ><a href=\"/chinese/queryPottypeIndex.do?categoryId=10\">罐式集装箱</a></li> \r\n");
      out.write("                                \r\n");
      out.write("                                </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryCategoryById.do?categoryId=11&productName=船运公司\">主要客户</a></li>\r\n");
      out.write("                     \t\t\t\r\n");
      out.write("                     \r\n");
      out.write("                \r\n");
      out.write("                </ul>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/left.jsp", out, true);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- mright -->\r\n");
      out.write("    \t<div class=\"mright\">\r\n");
      out.write("        \t\t <div class=\"curr\">\r\n");
      out.write("                 \t您的位置-<a href=\"/chinese/queryProduct.do?categoryId=1\">主要产品</a>-国际标准集装箱\r\n");
      out.write("                 \r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mtitle\">\r\n");
      out.write("                 <h2> 国际标准集装箱</h2>\r\n");
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
      out.write("                      \t<li ");
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
      out.write(")\" >");
      out.print(map.get("name") );
      out.write("</a></p>\r\n");
      out.write("                        \r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <div id=\"");
      out.print(i);
      out.write("\" class=\"mydiv\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t <div align=\"right\"><a href=\"javascript:closeDiv('");
      out.print(i);
      out.write("')\"><strong>关闭</strong></a></div>\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t <div class=\"popbox\">\r\n");
      out.write("\t\t\t\t\t\t   <!-- <iframe id=\"ShowProduct\" src=\"/chinese/products/box.jsp\" style=\"width:100%;height:100%;\" frameborder=\"0\" scrolling=\"auto\"></iframe> -->\r\n");
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
      out.write("                       <div id=\"bg\" class=\"bgdiv\" style=\" display:none\"></div>\r\n");
      out.write("                      <div class=\"cls\"></div>\r\n");
      out.write("                      <div class=\"pages\">\r\n");
      out.write("                      ");
if(pageUtil.getPageNumber()<2){
      out.write("<a class=\"fanye fyover\">上一页</a>");
}else{
      out.write("<a  class=\"fanye\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-1);
      out.write(")\" >上一页</a>");
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
      out.write("\t \t\t\t\t\t<a class=\"fanye fyover\" >下一页</a>");
}else{
      out.write("\r\n");
      out.write("\t \t\t\t\t\t<a  class=\"fanye\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+1);
      out.write(")\" >下一页</a>\r\n");
      out.write("\t \t\t\t\t\t");
}
      out.write(" \r\n");
      out.write("\t \t\t\t\t\t总");
      out.print(pageUtil.getTotalCount());
      out.write("条  当前");
      out.print(pageUtil.getPageNumber());
      out.write('/');
      out.print(pageUtil.getPageCount());
      out.write("页\r\n");
      out.write("                      \r\n");
      out.write("                  \r\n");
      out.write("                      </div>\r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                 </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    <!-- mright end -->\r\n");
      out.write("     \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- main end -->\r\n");
      out.write("  <!-- foot -->\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/foot.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- foot end -->\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("  ");
if(list!=null&&list.size()>0){
      out.write("\r\n");
      out.write("\t\t\t  \t\t\t\t");
for(int i=0;i<list.size();i++){
								Map map = (Map)list.get(i);
							
      out.write("\r\n");
      out.write("      <div id=\"");
      out.print(i);
      out.write("\" class=\"mydiv\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t <div align=\"right\"><a href=\"javascript:closeDiv('");
      out.print(i);
      out.write("')\"><strong>关闭</strong></a></div>\r\n");
      out.write("\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t <div class=\"popbox\">\r\n");
      out.write("\t\t\t\t\t\t   <!-- <iframe id=\"ShowProduct\" src=\"/chinese/products/box.jsp\" style=\"width:100%;height:100%;\" frameborder=\"0\" scrolling=\"auto\"></iframe> -->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t <div class=\"box\">\r\n");
      out.write("\t\t\t\t\t\t\t <p style=\"text-align:center\"><img src=\"/");
      out.print(map.get("small_image") );
      out.write("\" width=\"363\" height=\"321\" /></p>\r\n");
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
      out.write("\t\t\t\t\t\t\r\n");
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
      out.write("\r\n");
      out.write("<div id=\"bg\" class=\"bg\" style=\"display:none;\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
