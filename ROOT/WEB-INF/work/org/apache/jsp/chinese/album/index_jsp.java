package org.apache.jsp.chinese.album;

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


	List columnFlashList = (List) request.getAttribute("columnFlashList");
	Pagination pageUtil = (Pagination)request.getAttribute("pages");
	List list = (List)pageUtil.getList();
	List mptList = (List) request.getAttribute("mptList");

 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"description\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司-企业文化</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/chinese/css/style.css\" />\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"/chinese/js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction gotoPage(pno){\r\n");
      out.write("\t\turl = \"/chinese/queryAlbumType.do\";\r\n");
      out.write("\t\twindow.location.href=url;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("  <div class=\"wrap\">\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/head.jsp", out, true);
      out.write("\r\n");
      out.write("    <!-- nav -->\r\n");
      out.write("    <div class=\"nav\">\r\n");
      out.write("      <ul class=\"navlist\">\r\n");
      out.write("       <li style=\"width:80px;\" ><a href=\"/chinese/index.do\" class=\"ahome\">首页</a></li>\r\n");
      out.write("      <li ><a href=\"/chinese/introWeb.do\">新华昌简介</a></li>\r\n");
      out.write("      <li class=\"hover\"><a href=\"/chinese/cultureByVisionWeb.do?id=36\">企业文化</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryQiyeNews.do\">新闻中心</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryEmployess.do\">员工与招聘</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryProduct.do?categoryId=1\">产品与客户</a></li>\r\n");
      out.write("      <li class=\"nobg\" ><a href=\"/chinese/queryModelContact.do\">联系我们</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <div class=\"cls\"></div>\r\n");
      out.write("      \r\n");
      out.write("    <div class=\"subnav\">\r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("    <a href=\"/chinese/cultureByVisionWeb.do?id=36\">愿景与使命</a>\r\n");
      out.write("    <a href=\"/chinese/cultureByCoreWeb.do?id=31\">核心价值观</a>      \r\n");
      out.write("    <a href=\"/chinese/cultureByTargetWeb.do?id=32\">企业目标</a>      \r\n");
      out.write("    <a href=\"/chinese/cultureByEnterpriseWeb.do?id=33\">精神与作风</a> \r\n");
      out.write("    <a href=\"/chinese/cultureByCustomerWeb.do?id=34\">客户与员工</a>      \r\n");
      out.write("    <a href=\"/chinese/cultureByCustomerWeb.do?id=34\">电子画册</a>      \r\n");
      out.write("    <a href=\"/chinese/queryEjournals.do?typeId=13\">新华昌刊物</a>\r\n");
      out.write("    </div>\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/time.jsp", out, true);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- nav end -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mban\">\r\n");
      out.write("     ");
if(columnFlashList!=null&&columnFlashList.size()>0){
				Map imageMap = (Map)columnFlashList.get(0);
			
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
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("            ");
}else{
      out.write("\r\n");
      out.write("            暂无栏目图片\r\n");
      out.write("\t\t\t");

			}
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- main -->\r\n");
      out.write("    <div class=\"mmain\">\r\n");
      out.write("      <div class=\"mleft\">\r\n");
      out.write("        <h2> <span class=\"sp_t1\">企业文化</span>  </h2>\r\n");
      out.write("        <div class=\"mleftbox\">\r\n");
      out.write("          <ul class=\"leftlist1\">\r\n");
      out.write("              \t\t ");
      out.write("\r\n");
      out.write("                        <li><a href=\"/chinese/cultureByVisionWeb.do?id=36\">愿景与使命</a></li>\t\r\n");
      out.write("                        <li><a href=\"/chinese/cultureByCoreWeb.do?id=31\">核心价值观</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/cultureByTargetWeb.do?id=32\">企业目标</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/cultureByEnterpriseWeb.do?id=33\">精神与作风</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/cultureByCustomerWeb.do?id=34\">客户与员工</a></li>\r\n");
      out.write("                        <li><a  class=\"hover\" href=\"queryAlbumType.do\">电子画册</a></li>\r\n");
      out.write("                  \t\t<li class=\"hover\"><a href=\"javascript:void(0);\" onclick=\"setTab22('dd1','pp1')\" id=\"pp1\">新华昌刊物</a>\r\n");
      out.write("                        \t<div  id=\"dd1\" style=\"display:none\">\r\n");
      out.write("                        \t\t<ul>\r\n");
      out.write("                       \t\t\t\t");

                       					if (mptList != null && mptList.size() > 0) {
                       				 		for (int i = 0; i < mptList.size(); i++) {
                       				 		Map mptMap = (Map) mptList.get(i);
                       				 
      out.write("\r\n");
      out.write("                       \t\t\t\t <li onclick=\"setTab22('ddd1','ppp1')\" id=\"ppp1\">\r\n");
      out.write("                       \t\t\t\t \t<a href=\"/chinese/queryEjournals.do?typeId=");
      out.print(mptMap.get("id") );
      out.write('"');
      out.write('>');
      out.print(mptMap.get("name"));
      out.write("</a>\r\n");
      out.write("\t\t\t\t                     </li>\r\n");
      out.write("                       \t\t\t\t");
} 
      out.write("\r\n");
      out.write("                       \t\t\t\t");
} 
      out.write("\r\n");
      out.write("                        \t\t</ul>\r\n");
      out.write("                              </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("       \t\t ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/left.jsp", out, true);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <!-- mright -->\r\n");
      out.write("      <div class=\"mright\">\r\n");
      out.write("        <div class=\"curr\"> 您的位置-<a href=\"/chinese/cultureWeb.do?id=29\">企业文化</a>-电子画册 </div>\r\n");
      out.write("        <div class=\"mtitle\">\r\n");
      out.write("          <h2>电子画册</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"ejournals\">\r\n");
      out.write("          <ul>\r\n");
      out.write("          \t");
if(list!=null&&list.size()>0){ 
          		for(int i = 0 ; i<list.size() ; i++){
          			Map map = (Map)list.get(i);
          	
      out.write("\r\n");
      out.write("            <li ");
if(i==2||i==5){ 
      out.write(" class=\"li3d\" ");
}
      out.write(" ><a href=\"queryAlbum.do?typeId=");
      out.print(map.get("id") );
      out.write("\" target=\"_blank\">\r\n");
      out.write("           \t <img class=\"ebook\" src=\"/");
      out.print(map.get("image_path") );
      out.write("\" width=\"179\" height=\"244\" /></a><a class=\"ebookname\" href=\"queryAlbum.do?typeId=");
      out.print(map.get("id") );
      out.write("\" target=\"_blank\"><span>◇</span> ");
      out.print(map.get("name") );
      out.write("</a></li>\r\n");
      out.write("            \r\n");
      out.write("            \t");
}
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"cls\"></div>\r\n");
      out.write("                   \r\n");
      out.write("           <div class=\"pages\" style=\"margin-top:15px;\">\r\n");
      out.write("              \r\n");
      out.write("             ");
if(pageUtil.getPageNumber()<2){
      out.write("<a class=\"fanye fyover\">上一页</a>");
}else{
      out.write("<a  class=\"fanye fyover\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-1);
      out.write(")\" >上一页</a>");
}
      out.write("\r\n");
      out.write("\t\t\t");
if((pageUtil.getPageNumber()-2)>=1){
      out.write("<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-2);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()-2);
      out.write("</a>");
}
if((pageUtil.getPageNumber()-1)>=1){
      out.write("<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-1);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()-1);
      out.write("</a>");
}
      out.write("\r\n");
      out.write("\t\t\t<span>");
      out.print(pageUtil.getPageNumber());
      out.write("</span>\r\n");
      out.write("\t\t\t");
if((pageUtil.getPageNumber()+1)<=pageUtil.getPageCount()){
      out.write("<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+1);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()+1);
      out.write("</a>");
}
if((pageUtil.getPageNumber()+2)<=pageUtil.getPageCount()){
      out.write("<a class=\"bl\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+2);
      out.write(')');
      out.write('"');
      out.write('>');
      out.print(pageUtil.getPageNumber()+2);
      out.write("</a>");
}
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <!--下一页-->\t\r\n");
      out.write("\t\t\t");
if(pageUtil.getPageCount()<pageUtil.getPageNumber()+1){
      out.write("<a class=\"fanye fyover\" >下一页</a>");
}else{
      out.write("<a  class=\"fanye fyover\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+1);
      out.write(")\" >下一页</a>");
}
      out.write(' ');
      out.write('总');
      out.print(pageUtil.getTotalCount());
      out.write("条  当前");
      out.print(pageUtil.getPageNumber());
      out.write('/');
      out.print(pageUtil.getPageCount());
      out.write("页\r\n");
      out.write("                      \r\n");
      out.write("           </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mright end --> \r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- main end --> \r\n");
      out.write("    <!-- foot -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/foot.jsp", out, true);
      out.write("\r\n");
      out.write("    <!-- foot end --> \r\n");
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
