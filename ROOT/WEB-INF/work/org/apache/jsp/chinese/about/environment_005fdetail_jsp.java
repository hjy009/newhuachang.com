package org.apache.jsp.chinese.about;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.com.netmovie.helper.*;
import cn.com.netmovie.util.*;
import com.newhc.admin.helper.NewStringHelper;
import java.util.*;
import java.sql.*;

public final class environment_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/chinese/head.jsp");
    _jspx_dependants.add("/chinese/foot.jsp");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	List imageList = (List)request.getAttribute("imageList");
	List list = (List)request.getAttribute("list");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"description\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司-新华昌简介</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/chinese/css/style.css\" />\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"/chinese/js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/chinese/js/jquery-1.6.4.min.js\"></script>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/chinese/js/min_contentslider.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("  ");
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
      out.write("\t\t\t\tif(name==\"\"||name==\"请输入关键字\"){\r\n");
      out.write("\t\t\t\t\talert('请输入关键字');\r\n");
      out.write("\t\t\t\t\treturn ;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(type==0)\r\n");
      out.write("\t\t\t\t\tform.action=\"/chinese/searchNews.do\";\r\n");
      out.write("\t\t\t\tif(type==1)\r\n");
      out.write("\t\t\t\t\tform.action=\"/chinese/searchProduct.do\";\r\n");
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
      out.write("    <div class=\"head_nav\"> <a onclick=\"SetHome(this,window.location)\" style=\"cursor:hand\">设为首页</a> <a href=\"/chinese/queryAid.do?id=10\" style=\"cursor:hand\">网站地图</a> <a href=\"javascript:void(0);\">English</a> </div>\r\n");
      out.write("    <div class=\"logo\"><a href=\"/chinese/index.do\"><img src=\"images/logo.png\" width=\"290\" height=\"69\" /></a></div>\r\n");
      out.write("    <div class=\"search\">\r\n");
      out.write("  \t  <form name=\"form\" id=\"form\" action=\"\">\r\n");
      out.write("  \t  \t<select id=\"type\"  class=\"slt_tyle slt_tyle2\">\r\n");
      out.write("  \t  \t\t<option value=\"0\">新闻</option>\r\n");
      out.write("  \t  \t\t<option value=\"1\">产品</option>\r\n");
      out.write("  \t  \t</select>\r\n");
      out.write("      \t<div class=\"sese\"><input name=\"name\" id=\"name\" type=\"text\" class=\"txt_search\" value=\"请输入关键字\" onmousedown=\"this.value='';\" /></div>\r\n");
      out.write("      \t<input name=\"\" type=\"button\" value=\"\" id=\"btnSearch\" class=\"btn_search\" onclick=\"javascript:Search();\"/>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>");
      out.write("\r\n");
      out.write("  <!-- nav -->\r\n");
      out.write("  <div class=\"nav\">\r\n");
      out.write("    <ul class=\"navlist\">\r\n");
      out.write("      <li style=\"width:80px;\" ><a href=\"/chinese/index.do\" class=\"ahome\">首页</a></li>\r\n");
      out.write("      <li class=\"hover\"><a href=\"/chinese/introWeb.do\">新华昌简介</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/cultureByVisionWeb.do?id=36\">企业文化</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryQiyeNews.do\">新闻中心</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryEmployess.do\">员工与招聘</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryProduct.do?categoryId=1\">产品与客户</a></li>\r\n");
      out.write("      <li class=\"nobg\"><a href=\"/chinese/queryModelContact.do\">联系我们</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"cls\"></div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"subnav\">\r\n");
      out.write("    <a href=\"/chinese/introWeb.do\">集团概况</a>      \r\n");
      out.write("    <a href=\"/chinese/queryRemeberTheBig.do\">企业荣誉</a>      \r\n");
      out.write("    <a href=\"/chinese/queryRemeberBig.do\">集团大事记</a>      \r\n");
      out.write("    <a href=\"/chinese/queryFactoryEnvironment.do\">厂区环境</a>      \r\n");
      out.write("    <a href=\"/chinese/enterprisesWeb.do\">成员企业</a>      \r\n");
      out.write("    <a href=\"/chinese/queryContact.do\">联系方式</a>\r\n");
      out.write("    <a href=\"/chinese/videoWeb.do\">集团掠影</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/time.jsp", out, true);
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
      out.write("\" target=\"_blank\"><img src=\"/chinese/images/columnLink.gif\" width=\"990\" height=\"245\" /></a>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!-- main -->\r\n");
      out.write("  <div class=\"mmain\">\r\n");
      out.write("  \t\t<div class=\"mleft\">\r\n");
      out.write("            <h2>\r\n");
      out.write("            \t<span class=\"sp_t1\">新华昌简介</span>\r\n");
      out.write("            </h2>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"mleftbox\">\r\n");
      out.write("            \t<ul class=\"leftlist\">\r\n");
      out.write("               \r\n");
      out.write("                    \t <li><a href=\"/chinese/introWeb.do\">集团概况</a></li>\r\n");
      out.write("                    <li><a href=\"/chinese/queryRemeberTheBig.do\">企业荣誉</a></li>\r\n");
      out.write("                    <li><a href=\"/chinese/queryRemeberBig.do\">集团大事记</a></li>\r\n");
      out.write("                    <li  class=\"hover\"><a href=\"/chinese/queryFactoryEnvironment.do\">厂区环境</a></li>\r\n");
      out.write("                    <li><a href=\"/chinese/enterprisesWeb.do\">成员企业</a></li>\r\n");
      out.write("                    <li><a href=\"/chinese/queryContact.do\">联系方式</a></li>\r\n");
      out.write("                \t<li><a href=\"/chinese/videoWeb.do\">集团掠影</a></li>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                </ul>\r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("             ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/left.jsp", out, true);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- mright -->\r\n");
      out.write("    \t<div class=\"mright\">\r\n");
      out.write("        \t\t <div class=\"curr\">\r\n");
      out.write("                 \t您的位置-<a href=\"/chinese/introWeb.do\">新华昌简介</a>-厂区环境\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("   </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mtitle\">\r\n");
      out.write("                 \t<h2>厂区环境</h2>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mcon3\">\r\n");
      out.write("        \r\n");
      out.write("              \r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("#focus{width:660px; height:397px;overflow:hidden;position:relative;}\r\n");
      out.write("#focus .focus_view{width:660px;height:334px;overflow: hidden;}\r\n");
      out.write("#focus .focus_view ul{position:relative;width:660px;height:334px;}\r\n");
      out.write("#focus .focus_view li{position:absolute;border:1px solid #dfdfdf; background:#f6f6f6; width:658px; height:332px; text-align:center;top:0px;left:0px;filter:alpha(opacity:0);opacity:0; overflow:hidden;}\r\n");
      out.write("#focus .focus_view img{ margin:0 auto;}\r\n");
      out.write("#focus .focus_text{position:absolute;left:0;top:310px;padding: 0 15px;background:rgba(0,0,0,0.5);filter: progid:DXImageTransform.Microsoft.gradient( GradientType = 0,startColorstr = '#50000000',endColorstr = '#50000000')\\9;width:595px;z-index:3; display:none;}\r\n");
      out.write("#focus .focus_text h3{line-height:40px;height:40px;overflow:hidden;padding-right:40px;}\r\n");
      out.write("#focus .focus_text h3 a{font-size:18px;color:#fff;font-family:\"微软雅黑\", \"黑体\", Arial, sans-serif;font-weight:normal;text-decoration:none}\r\n");
      out.write("#focus .focus_text li{display:none;}\r\n");
      out.write("#focus .focus_text li.show{display:block;}\r\n");
      out.write("#focus .focus_slider{width:660px;height:53px; margin: 0 auto;}\r\n");
      out.write("#focus .focus_slider .mask{width:616px;height:53px;overflow:hidden;float:left;margin-left:12px;display:inline;}\r\n");
      out.write("\r\n");
      out.write("#focus .focus_slider ul{width:1232px;margin-left:0px;}\r\n");
      out.write("#focus .focus_slider li{float:left; width:77px; height:43px; display:inline; overflow:hidden;}\r\n");
      out.write("#focus .focus_slider li img{WIDTH:60px; HEIGHT:39px; border:1px solid #8b8b8b;padding:1px;}\r\n");
      out.write("\r\n");
      out.write("#focus span.prev,#focus span.next{ float: left; width:14px; height:38px; cursor:pointer; margin:0;}\r\n");
      out.write("#focus span.prev{background:url(/chinese/images/scroll_left.jpg) no-repeat;}\r\n");
      out.write("#focus span.next{background:url(/chinese/images/scroll_right2.jpg) no-repeat; }\r\n");
      out.write("#focus span.prev:hover{background:url(/chinese/images/scroll_left2.jpg) no-repeat;}\r\n");
      out.write("#focus span.next:hover{background:url(/chinese/images/scroll_right.jpg) no-repeat; }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#focus li.current img{border:1px solid #db4c4c;}\r\n");
      out.write("#focus #num{position:absolute;right:10px;top:10px;color:#fff;font-size:14px;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>    \r\n");
      out.write("              \r\n");
      out.write("              <div id=\"focus\">\r\n");
      out.write("              <div id=\"focus_slider\" class=\"focus_slider\">   <!--缩略图-->\r\n");
      out.write("                            <span id=\"prev\" class=\"prev\" bossZone=\"focuspicleft\"></span>\r\n");
      out.write("                             <div class=\"mask\">\r\n");
      out.write("                                 <ul>\r\n");
      out.write("                                 \r\n");
      out.write("                                 \r\n");
      out.write("\t\t\t\t\t\t");
if(list!=null&&list.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
for(int i=0;i<list.size();i++){
							Map map = (Map)list.get(i);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li ");
if(i==0){ 
      out.write(" class=\"current\" ");
} 
      out.write("><a href=\"");
if(i==0){ 
      out.write("javascript:");
} 
      out.write("\"><img src=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t  \t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t  \t\t\t暂无\r\n");
      out.write("\t\t  \t\t\t");
}
      out.write('\r');
      out.write('\n');
      out.write("</ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span id=\"next\" class=\"next\" ></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"focus_view\" class=\"focus_view\"> <!--大图-->\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
if(list!=null&&list.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
for(int i=0;i<list.size();i++){
							Map map = (Map)list.get(i);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li ");
if(i==0){ 
      out.write(" style=\"filter:alpha(opacity:100);opacity:1;z-index:1;\" ");
} 
      out.write("><a href=\"");
if(i==1){ 
      out.write("javascript:");
} 
      out.write("\"><img src=\"\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t  \t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t  \t\t\t暂无\r\n");
      out.write("\t\t  \t\t\t");
}
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"focus_text\" class=\"focus_text\" >  <!--标题-->\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t");
if(list!=null&&list.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
for(int i=0;i<list.size();i++){
							Map map = (Map)list.get(i);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li ");
if(i==0){ 
      out.write(" class=\"show\" ");
} 
      out.write("><h3><a href=\"\" ");
if(i!=0){ 
      out.write(" target=\"_blank\" ");
} 
      out.write("></a></h3></li>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t  \t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t  \t\t\t暂无\r\n");
      out.write("\t\t  \t\t\t");
}
      out.write('\r');
      out.write('\n');
      out.write("</ul>\r\n");
      out.write("                        <div id=\"num\"> <!--计数-->\r\n");
      out.write("                    \t\t1/5\r\n");
      out.write("                    \t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                \r\n");
      out.write("              <!--code by wangchuang 2011.11.29-->\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("                 <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t \t\t(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t/*-------------------------编辑数据修改-------------------------------*/\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar data = [\r\n");
      out.write("\r\n");
      out.write(" ");
if(list!=null&&list.size()>0){
      out.write('\r');
      out.write('\n');
for(int i=0;i<list.size();i++){
	Map map = (Map)list.get(i);

      out.write("\r\n");
      out.write("{img1:'/");
      out.print(map.get("min_image")  );
      out.write("',title:'',slink:'javascript:'},\r\n");
}
      out.write('\r');
      out.write('\n');
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("]\r\n");
      out.write("\t\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t    /*-------------------------编辑数据修改-------------------------------*/\r\n");
      out.write("\t\t\t\t\t\t  \t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aImg = $('focus_view').getElementsByTagName('li');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aTxt = $('focus_text').getElementsByTagName('li');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aSmg = $('focus_slider').getElementsByTagName('li');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aaImg = $('focus_view').getElementsByTagName('img');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aaSmg = $('focus_slider').getElementsByTagName('img');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aa0 = $('focus_text').getElementsByTagName('a');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aa1 = $('focus_slider').getElementsByTagName('a');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar aa2 = $('focus_view').getElementsByTagName('a');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar oUl = $('focus_slider').getElementsByTagName('ul')[0];\r\n");
      out.write("\t\t\t\t\t\t\t\tvar oNum = $('num');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar oPrev = $('prev');\r\n");
      out.write("\t\t\t\t\t\t\t\tvar oNext = $('next');\r\n");
      out.write("\t\t\t\t\t\t\t\tfor(var i=0;i<aSmg.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\taSmg[i].index = i;  //当前添加索引\r\n");
      out.write("\t\t\t\t\t\t\t\t\taImg[i].index = i;\r\n");
      out.write("\t\t\t\t\t\t\t\t\taa0[i].href = aa1[i].href = aa2[i].href = data[i].slink;\r\n");
      out.write("\t\t\t\t\t\t\t\t\taa0[i].innerHTML = data[i].title;\r\n");
      out.write("\t\t\t\t\t\t\t\t\taaImg[i].src = aaSmg[i].src = data[i].img1;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\taSmg[i].onmouseover  = function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor(var i=0;i<aSmg.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taSmg[i].className = '';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taTxt[i].className = '';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstartMove(aImg[i],'opacity',0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taImg[i].style.zIndex = 1;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taSmg[this.index].className = 'current';\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taTxt[this.index].className = 'show';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\toNum.innerHTML = this.index+1 + '/10';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstartMove(aImg[this.index],'opacity',100);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taImg[this.index].style.zIndex = 2;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t\toNext.onclick = oPrev.onclick = function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif(parseInt(oUl.style.marginLeft)<0){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstartMove(oUl,'marginLeft',0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfor(var i=0;i<aSmg.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taTxt[i].className = '';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstartMove(aImg[i],'opacity',0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taSmg[i].className = '';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taImg[i].style.zIndex = 1;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstartMove(aImg[0],'opacity',100);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taSmg[0].className = 'current';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taTxt[0].className = 'show';\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\toNum.innerHTML = 1 + '/10';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taImg[0].style.zIndex = 2;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    \tstartMove(oUl,'marginLeft',-oUl.offsetWidth/2);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfor(var i=0;i<aSmg.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taTxt[i].className = '';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstartMove(aImg[i],'opacity',0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taSmg[i].className = '';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taImg[i].style.zIndex = 1;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstartMove(aImg[aSmg.length/2],'opacity',100);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taSmg[aSmg.length/2].className = 'current';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taTxt[aSmg.length/2].className = 'show';\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\toNum.innerHTML = (aSmg.length*0.5 + 1) + '/10';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taImg[aSmg.length/2].style.zIndex = 2;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t})();\r\n");
      out.write("\t\t\t\t\t\t function $(id){return document.getElementById(id)};\r\n");
      out.write("\t\t\t\t\t\t function startMove(obj,attr,iTarget){     //轮换动画\r\n");
      out.write("\t\t\t\t\t\t\tclearInterval(obj.timer);\r\n");
      out.write("\t\t\t\t\t\t\tobj.timer = setInterval(function(){doMove(obj,attr,iTarget);},15);\r\n");
      out.write("\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t function doMove(obj,attr,iTarget){\r\n");
      out.write("\t\t\t\t\t\t\t var iCur = 0;\r\n");
      out.write("\t\t\t\t\t\t\t if(attr == 'opacity'){\r\n");
      out.write("\t\t\t\t\t\t\t \tiCur = parseInt(100 * getStyle(obj,attr)) || 0;\r\n");
      out.write("\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t else{\r\n");
      out.write("\t\t\t\t\t\t\t \tiCur = parseInt(getStyle(obj,attr)) || 0;\r\n");
      out.write("\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t var iSpeed = (iTarget - iCur)/8;\r\n");
      out.write("\t\t\t\t\t\t\t iSpeed = (iSpeed>0) ? Math.ceil(iSpeed) : Math.floor(iSpeed);\r\n");
      out.write("\t\t\t\t\t\t\t if(iCur == iTarget){\r\n");
      out.write("\t\t\t\t\t\t\t\t clearInterval(obj.timer);\r\n");
      out.write("\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t else if(attr == 'opacity'){\r\n");
      out.write("\t\t\t\t\t\t\t\tobj.style.filter = 'alpha(opacity=' + (iCur + iSpeed) + ')';\r\n");
      out.write("\t\t\t\t\t\t\t\tobj.style.opacity = (iCur + iSpeed)/100;\r\n");
      out.write("\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t else{\r\n");
      out.write("\t\t\t\t\t\t\t \tobj.style[attr] = iCur + iSpeed + 'px';\r\n");
      out.write("\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t function getStyle(obj,attr){      //取样式\r\n");
      out.write("\t\t\t\t\t\t\t if(obj.currentStyle){\r\n");
      out.write("\t\t\t\t\t\t\t\treturn obj.currentStyle[attr]; \r\n");
      out.write("\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t else{\r\n");
      out.write("\t\t\t\t\t\t\t\treturn getComputedStyle(obj,false)[attr]; \r\n");
      out.write("\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</script><!--[if !IE]>|xGv00|ef5da8a12482a4263335b2324ba6e6dc<![endif]-->\r\n");
      out.write("              \r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("  \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    <!-- mright end -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- main end -->\r\n");
      out.write("  <!-- foot -->\r\n");
      out.write("  ");
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
      out.write("  \t\t<div class=\"footnav\"><a href=\"queryAid.do\">法律声明</a> | <a href=\"queryAid.do?id=9\">版权所有</a> | <a href=\"queryAid.do?id=13\">服务在线</a> | <a href=\"queryAid.do?id=10\">站点地图</a> | <a href=\"/admin\">管理入口</a></div>\r\n");
      out.write("        <span>Copyright 2008-2010 新华昌集团版权所有  Powered by:<a href=\"http://www.toprand.com \" target=\"_blank\">www.toprand.com</a> </span> \r\n");
      out.write("  \r\n");
      out.write("  </div>\r\n");
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
