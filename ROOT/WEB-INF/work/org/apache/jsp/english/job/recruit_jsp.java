package org.apache.jsp.english.job;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.com.netmovie.helper.*;
import cn.com.netmovie.util.*;
import com.newhc.admin.helper.NewStringHelper;
import java.util.*;
import java.sql.*;

public final class recruit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/english/head.jsp");
    _jspx_dependants.add("/english/foot.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.release();
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
	Pagination pageUtil = (Pagination)request.getAttribute("pages");
	List list = (List)pageUtil.getList();
	List nameList = (List)request.getAttribute("nameList");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"description\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司-员工与招聘</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/english/css/style.css\" />\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"/english/js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/default.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction gotoPage(pno){\r\n");
      out.write("\t\turl = \"/english/queryZhaopEn.do?pageNumber=\"+pno+\"&company=");
      if (_jspx_meth_ww_005fproperty_005f0(_jspx_page_context))
        return;
      out.write(" &adName=");
      if (_jspx_meth_ww_005fproperty_005f1(_jspx_page_context))
        return;
      out.write(" &dataName=");
      if (_jspx_meth_ww_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\twindow.location.href=url;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction addAdvertiseInfo(){\r\n");
      out.write("\t\tvar sfrom = findById(\"sfrom\");\r\n");
      out.write("\t\tsfrom.action = \"queryRecruitEn.do\";\r\n");
      out.write("\t\tsfrom.submit();\r\n");
      out.write("\t\tfindById(\"button\").disabled = true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
      out.write("        <li ><span><a href=\"/english/indexEn.do\" class=\"ahome\">Home</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/introWebEn.do\">About CXIC</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\" ><span><a href=\"/english/cultureByVisionWebEn.do?id=36\">Company Culture</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\"><span><a href=\"/english/queryQiyeNewsEn.do\">News Center</a></span></li>\r\n");
      out.write("      <li   ><span class=\"hover\" ><a href=\"/english/queryEmployessEn.do\">Jobs</a></span></li>\r\n");
      out.write("      <li class=\"nlist3\"><span><a href=\"/english/queryProductEn.do?categoryId=1\">Products and Customers</a></span></li>\r\n");
      out.write("       <li class=\"nobg nlist2\" ><span><a href=\"/english/queryModelContactEn.do\">Contact us</a></span></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"cls\"></div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"subnav\">\r\n");
      out.write("   <a href=\"/english/queryEmployessEn.do\">Rights and Duties</a>      \r\n");
      out.write("    <a href=\"/english/queryXincEn.do\">Compensation and Benefits</a>   \r\n");
      out.write("    <a href=\"/english/queryRenlEn.do\">HR Strategy</a>      \r\n");
      out.write("    <a href=\"/english/queryZhaopEn.do\">Job Opportunities</a>   \r\n");
      out.write("    <a href=\"/english/queryRecruitEn.do\">Job Opportunity</a>  \r\n");
      out.write("    \r\n");
      out.write("  <!-- <a href=\"/english/queryRecruitEn.do\">Job Opportunity</a>  -->\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("      ");
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
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!-- main -->\r\n");
      out.write("  <div class=\"mmain\">\r\n");
      out.write("  \t\t<div class=\"mleft\">\r\n");
      out.write("            <h2>\r\n");
      out.write("            \t<span class=\"sp_t1\" >Staffs and Recruitment</span>\r\n");
      out.write("            </h2>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"mleftbox\">\r\n");
      out.write("            \t<ul class=\"leftlist\">\r\n");
      out.write("               \r\n");
      out.write("                    \t<li  ><a href=\"/english/queryEmployessEn.do\">Rights and Duties</a></li>\r\n");
      out.write("                        <li><a href=\"/english/queryXincEn.do\">Compensation and Benefits</a></li>\r\n");
      out.write("                        <li ><a href=\"/english/queryRenlEn.do\">HR Strategy</a></li>\r\n");
      out.write("                        <li><a href=\"/english/queryZhaopEn.do\">Job Opportunities</a></li>\r\n");
      out.write("                        <li class=\"hover\"><a href=\"/english/queryRecruitEn.do\">Job Opportunity</a></li>\r\n");
      out.write("                           \r\n");
      out.write("                \r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
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
      out.write("                 \tYour location-<a href=\"/english/queryEmployessEn.do\">Staffs and Recruitment</a>-Job Opportunity\r\n");
      out.write("                 \r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mtitle\">\r\n");
      out.write("                 \t<h2>Job Opportunity</h2>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("             \r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mcon3\">\r\n");
      out.write("                   <p><strong>按职位搜索：</strong></p>\r\n");
      out.write("                   \r\n");
      out.write("                    <form id=\"sfrom\"  name=\"sfrom\" method=\"post\">\r\n");
      out.write("                 <div class=\"search2\">\r\n");
      out.write("                 \t\t<select name=\"company\" id=\"company\" class=\"sltshen\">\r\n");
      out.write("                 \t\t\r\n");
      out.write("                 \t\t\t\t<option value=\"\">请选择分公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"常州新华昌国际集装箱有限公司\">常州新华昌国际集装箱有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"宁波新华昌运输设备有限公司\">宁波新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"惠州新华昌运输设备有限公司\">惠州新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"天津新华昌运输设备有限公司\">天津新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"江苏万隆特种货柜有限公司\">江苏万隆特种货柜有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"嘉善新华昌运输设备有限公司\">嘉善新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"嘉善新华昌木业有限公司\">嘉善新华昌木业有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"青岛交运新华昌集装箱有限公司\">青岛交运新华昌集装箱有限公司</option>\r\n");
      out.write("                 \t\t\t\t</select>\r\n");
      out.write("                 \t\t<script language=\"JavaScript\"> \r\n");
      out.write("        \t\t\t\t\t document.getElementById(\"company\").value=\"");
      if (_jspx_meth_ww_005fproperty_005f3(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("                 \t\t\r\n");
      out.write("                        <select name=\"adName\" id=\"adName\" class=\"sltshen\">\r\n");
      out.write("                        \t <option value=\"\">请选择职位分类</option>\r\n");
      out.write("                        \t ");
if(nameList!=null&&nameList.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t  \t\t\t\t");
for(int i=0;i<nameList.size();i++){
									Map map = (Map)nameList.get(i);
								
      out.write("\r\n");
      out.write("\t\t                    \t  <option value=\"");
      out.print(map.get("name"));
      out.write('"');
      out.write('>');
      out.print(map.get("name"));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t  \t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t\t\t  \t\t\t");
}
      out.write("\r\n");
      out.write("                        \t\r\n");
      out.write("                        </select>\r\n");
      out.write("                         <script language=\"JavaScript\"> \r\n");
      out.write("        \t\t\t\t\t document.getElementById(\"adName\").value=\"");
      if (_jspx_meth_ww_005fproperty_005f4(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("                        \r\n");
      out.write("                        <select  name=\"dataName\" id=\"dataName\" class=\"sltshen\">\r\n");
      out.write("                        <option value=\"\">请选择时间范围</option>\r\n");
      out.write("                        <option value=\"所有时间\">所有时间</option>\r\n");
      out.write("                        <option value=\"今天\">今天</option>\r\n");
      out.write("                        <option value=\"最近三天\">最近三天</option>\r\n");
      out.write("                         <option value=\"最近一周\">最近一周</option>\r\n");
      out.write("                          <option value=\"最近一个月\">最近一个月</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                          <script language=\"JavaScript\"> \r\n");
      out.write("        \t\t\t\t\t document.getElementById(\"dataName\").value=\"");
      if (_jspx_meth_ww_005fproperty_005f5(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("                        <input name=\"\" type=\"button\" value=\"\"  onclick=\"addAdvertiseInfo()\" class=\"btn_search2\" />\r\n");
      out.write("                 </div>\r\n");
      out.write("                \r\n");
      out.write("                  </form>\r\n");
      out.write("                  <div class=\"hrtitle\">\r\n");
      out.write("                    \r\n");
      out.write("                  \t<h2>所有职位</h2>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"cls\"></div>\r\n");
      out.write("                  <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"hrtable\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th width=\"36%\">职位名称</th>\r\n");
      out.write("    <th width=\"31%\">公司</th>\r\n");
      out.write("    <th width=\"17%\">工作地点</th>\r\n");
      out.write("    <th width=\"16%\">发布时间</th>\r\n");
      out.write("  </tr>\r\n");
      out.write(" \t   ");
if(list!=null&&list.size()>0){
      out.write("\r\n");
      out.write("\t\t  \t\t\t\t");
for(int i=0;i<list.size();i++){
							Map map = (Map)list.get(i);
						
      out.write("\r\n");
      out.write("                    \t  <tr>\r\n");
      out.write("\t\t\t\t\t\t    <td class=\"td1\">·<a href=\"queryAdvertiseDetailEn.do?advertiseId=");
      out.print(map.get("id"));
      out.write('"');
      out.write('"');
      out.write('>');
      out.print(map.get("name"));
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t    <td>");
      out.print(map.get("company"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t    <td>");
      out.print(map.get("working_place"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t    <td>");
      out.print(DateHelper.toString(DateHelper.toDate((Timestamp)map.get("pub_time")),"yyyy-MM-dd"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t  \t\t\t");
}else{
      out.write("\r\n");
      out.write("\t\t  \t\t\t");
}
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"cls\"></div>\r\n");
      out.write("                   \r\n");
      out.write("                   <div class=\"pages\" style=\"margin-top:15px;\">\r\n");
      out.write("                      \r\n");
      out.write("                      ");
if(pageUtil.getPageNumber()<2){
      out.write("<a class=\"fanye fyover\">Page Up</a>");
}else{
      out.write("<a  class=\"fanye fyover\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()-1);
      out.write(")\" >Page Up</a>");
}
      out.write("\r\n");
      out.write("\t \t\t\t\t\t\t");
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
      out.write("\t\t\t\t\t\t\t<span>");
      out.print(pageUtil.getPageNumber());
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t");
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
      out.write("                                \r\n");
      out.write("                                <!--下一页-->\t\r\n");
      out.write("\t \t\t\t\t\t");
if(pageUtil.getPageCount()<pageUtil.getPageNumber()+1){
      out.write("<a class=\"fanye fyover\" >Page Down</a>");
}else{
      out.write("<a  class=\"fanye fyover\" href=\"javascript:gotoPage(");
      out.print(pageUtil.getPageNumber()+1);
      out.write(")\" >Page Down</a>");
}
      out.write(" total");
      out.print(pageUtil.getTotalCount());
      out.write("strip  current");
      out.print(pageUtil.getPageNumber());
      out.write('/');
      out.print(pageUtil.getPageCount());
      out.write("page\r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                      </div>\r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
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
      out.write(" ");
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

  private boolean _jspx_meth_ww_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f0 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f0.setParent(null);
    // /english/job/recruit.jsp(36,61) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f0.setValue("company");
    int _jspx_eval_ww_005fproperty_005f0 = _jspx_th_ww_005fproperty_005f0.doStartTag();
    if (_jspx_th_ww_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f1 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f1.setParent(null);
    // /english/job/recruit.jsp(36,100) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("adName");
    int _jspx_eval_ww_005fproperty_005f1 = _jspx_th_ww_005fproperty_005f1.doStartTag();
    if (_jspx_th_ww_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f2 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f2.setParent(null);
    // /english/job/recruit.jsp(36,140) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("dataName");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f3 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f3.setParent(null);
    // /english/job/recruit.jsp(157,56) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f3.setValue("company");
    int _jspx_eval_ww_005fproperty_005f3 = _jspx_th_ww_005fproperty_005f3.doStartTag();
    if (_jspx_th_ww_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f4 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f4.setParent(null);
    // /english/job/recruit.jsp(173,55) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f4.setValue("adName");
    int _jspx_eval_ww_005fproperty_005f4 = _jspx_th_ww_005fproperty_005f4.doStartTag();
    if (_jspx_th_ww_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f5 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f5.setParent(null);
    // /english/job/recruit.jsp(185,57) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f5.setValue("dataName");
    int _jspx_eval_ww_005fproperty_005f5 = _jspx_th_ww_005fproperty_005f5.doStartTag();
    if (_jspx_th_ww_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
    return false;
  }
}
