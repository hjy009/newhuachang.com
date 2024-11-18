package org.apache.jsp.english.contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/english/head.jsp");
    _jspx_dependants.add("/english/foot.jsp");
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
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=gbk");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	List imageList = (List)request.getAttribute("imageList");
	List list = (List)request.getAttribute("list");

      out.write("\r\n");
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"description\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司-联系我们</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/english//css/style.css\" />\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"/english/js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function SetHome(obj,vrl){\r\n");
      out.write("\ttry{\r\n");
      out.write("\t\tobj.style.behavior='url(#default#homepage)';obj.setHomePage(vrl);\r\n");
      out.write("\t}\r\n");
      out.write("\tcatch(e){\r\n");
      out.write("\t\tif(window.netscape) {\r\n");
      out.write("\t\t\ttry {\r\n");
      out.write("\t\t\t\tnetscape.security.PrivilegeManager.enablePrivilege(\"UniversalXPConnect\"); \r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\tcatch (e) { \r\n");
      out.write("\t\t\t\talert(\"此操作被浏览器拒绝！\\n请在浏览器地址栏输入“about:config”并回车\\n然后将[signed.applets.codebase_principal_support]设置为'true'\"); \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\tvar prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);\r\n");
      out.write("\t\t\t\tprefs.setCharPref('browser.startup.homepage',vrl);\r\n");
      out.write("\t   }\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("function Search(){\t\t\r\n");
      out.write("\t\tvar name = document.getElementById(\"name\").value;\r\n");
      out.write("\t\tvar type = document.getElementById(\"type\").value;\r\n");
      out.write("\t\t\t\tvar form = document.getElementById(\"form\");\r\n");
      out.write("\t\t\t\tif(name==\"\"||name==\"Please enter the keywords\"){\r\n");
      out.write("\t\t\t\t\talert('Please enter the keywords');\r\n");
      out.write("\t\t\t\t\treturn ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(type==0)\r\n");
      out.write("\t\t\t\t\tform.action=\"/chinese/searchNewsEn.do\";\r\n");
      out.write("\t\t\t\tif(type==1)\r\n");
      out.write("\t\t\t\t\tform.action=\"/chinese/searchProductEn.do\";\r\n");
      out.write("\t\t\t\tform.submit();\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("   document.onkeydown = function(){\r\n");
      out.write("   if(event.keyCode==13){\r\n");
      out.write("    Search();\r\n");
      out.write("   }\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"head\">\r\n");
      out.write("    <div class=\"head_nav\"> <a onclick=\"SetHome(this,window.location)\" style=\"cursor:hand\">Set as homepage</a> <a href=\"/chinese/queryAidEn.do?id=10\" style=\"cursor:hand\">Site Map</a> <a href=\"/chinese/index.do\">chinese</a> </div>\r\n");
      out.write("    <div class=\"logo\"><a href=\"/chinese/indexEn.do\"><img src=\"images/logo.png\" width=\"290\" height=\"69\" /></a></div>\r\n");
      out.write("    <div class=\"search\">\r\n");
      out.write("  \t  <form name=\"form\" id=\"form\" action=\"\">\r\n");
      out.write("  \t  \t<select id=\"type\"  class=\"slt_tyle slt_tyle2\">\r\n");
      out.write("  \t  \t\t<option value=\"0\">news</option>\r\n");
      out.write("  \t  \t\t<option value=\"1\">products</option>\r\n");
      out.write("  \t  \t</select>\r\n");
      out.write("      \t<div class=\"sese\"><input name=\"name\" id=\"name\" type=\"text\" class=\"txt_search\" value=\"Please enter the keywords\" onmousedown=\"this.value='';\" /></div>\r\n");
      out.write("      \t<input name=\"\" type=\"button\" value=\"\" id=\"btnSearch\" class=\"btn_search\" onclick=\"javascript:Search();\"/>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>");
      out.write("\r\n");
      out.write("  <!-- nav -->\r\n");
      out.write("  <div class=\"nav\">\r\n");
      out.write("    <ul class=\"navlist\">\r\n");
      out.write("       <li ><span><a href=\"/english/indexEn.do\" class=\"ahome\">Home</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/introWebEn.do\">About CXIC</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/cultureByVisionWebEn.do?id=36\">Company Culture</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\"><span><a href=\"/english/queryQiyeNewsEn.do\">News Center</a></span></li>\r\n");
      out.write("      <li><span><a href=\"/english/queryEmployessEn.do\">Jobs</a></span></li>\r\n");
      out.write("      <li class=\"nlist3\"><span><a href=\"/english/queryProductEn.do?categoryId=1\">Products and Customers</a></span></li>\r\n");
      out.write("       <li class=\"nobg nlist2\"  ><span class=\"hover\"><a href=\"/english/queryModelContactEn.do\">Contact us</a></span></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"cls\"></div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"subnav\">\r\n");
      out.write("    <a href=\"/english/queryModelContactEn.do\">Contact Us</a>       \r\n");
      out.write("  \r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/time.jsp", out, true);
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- nav end -->\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"mban\">\r\n");
      out.write("  ");
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
      out.write("\" target=\"_blank\"><img src=\"../images/columnLink.gif\" width=\"990\" height=\"245\" /></a>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!-- main -->\r\n");
      out.write("  <div class=\"mmain\">\r\n");
      out.write("  \t\t<div class=\"mleft\">\r\n");
      out.write("            <h2>\r\n");
      out.write("            \t<span class=\"sp_t1\">Contact Us</span>\r\n");
      out.write("            </h2>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"mleftbox\">\r\n");
      out.write("            \t<ul class=\"leftlist\">\r\n");
      out.write("               \r\n");
      out.write("                    \t<li class=\"hover\"><a href=\"/english/queryModelContactEn.do\">Contact Us</a></li>\r\n");
      out.write("                        \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                </ul>\r\n");
      out.write("            <div class=\"cls\"></div>\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/left.jsp", out, true);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- mright -->\r\n");
      out.write("    \t<div class=\"mright\">\r\n");
      out.write("        \t\t <div class=\"curr\">\r\n");
      out.write("                 \tYour location-<a href=\"/english/queryModelContactEn.do\">Contact Us</a>-Contact Us\r\n");
      out.write("                 \r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mtitle\">\r\n");
      out.write("                 \t<h2>Contact Us</h2>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mcon3\">\r\n");
      out.write("                 \r\n");
      out.write("                    ");
if(list!=null&&list.size()>0){
				Map map = (Map)list.get(0);
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print((String)map.get("content"));
      out.write("\r\n");
      out.write("\t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t暂无\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    <!-- mright end -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- main end -->\r\n");
      out.write("  <!-- foot -->\r\n");
      out.write("   ");
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
      out.write(" <div class=\"foot\">\r\n");
      out.write("    <div class=\"footnav\"><a href=\"/english/queryAidEn.do\">Legal Statement </a>| <a href=\"/english/queryAidEn.do?id=9\">Copyright Reserved </a>| <a href=\"/english/queryAidEn.do?id=13\">Online Service </a>| <a href=\"/english/queryAidEn.do?id=10\">Site Map </a>| <a href=\"/admin\">Administration</a></div>\r\n");
      out.write("    <span>Copyright Reserved by CXIC GROUP 苏ICP备05002018号-1  Powered by:<a href=\"http://www.toprand.com \" target=\"_blank\">www.toprand.com</a> </span> </div>");
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
