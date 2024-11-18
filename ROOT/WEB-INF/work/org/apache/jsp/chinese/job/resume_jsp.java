package org.apache.jsp.chinese.job;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.com.netmovie.helper.*;
import cn.com.netmovie.util.*;
import com.newhc.admin.helper.NewStringHelper;
import java.util.*;
import java.sql.*;

public final class resume_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/chinese/head.jsp");
    _jspx_dependants.add("/chinese/foot.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.release();
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
      out.write("\r\n");

	List imageList = (List)request.getAttribute("imageList");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"description\" content=\"新华昌集团有限公司\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>新华昌集团有限公司-员工与招聘</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/chinese/css/style.css\" />\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"../js/iepng.js\" type=\"stext/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"/chinese/js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/default.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("window.onload=function()//用window的onload事件，窗体加载完毕的时候\r\n");
      out.write("{\r\n");
      out.write("\t  var m = document.getElementById(\"memberEnterprises\");\r\n");
      out.write("\t for(i=0;i<m.options.length;i++){\r\n");
      out.write("\t  if(m.options[i].value==\"");
      if (_jspx_meth_ww_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\")\r\n");
      out.write("\t  {     \r\n");
      out.write("\t  \t m.options[i].selected=true;  \r\n");
      out.write("\t   \t\tbreak;\r\n");
      out.write("\t  }\t\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\r\n");
      out.write("\tvar emailStatus = false;\r\n");
      out.write("\tvar usernameStatus = false;\r\n");
      out.write("\tvar nameStatus=false;\r\n");
      out.write("\tvar birthStatus=false;\r\n");
      out.write("\tvar certificateStatus=false;\r\n");
      out.write("\tfunction checkUsername(){\r\n");
      out.write("\t if(document.getElementById(\"phoneStr\").value==''){\r\n");
      out.write("\t\t document.getElementById(\"usernamecheck\").innerHTML = \"<font color='red'>联系手机不能为空</font>\";\r\n");
      out.write("\t }else{\r\n");
      out.write("\t\t var patrn = /(^0{0,1}1[3|4|5|6|7|8|9][0-9]{9}$)/;\r\n");
      out.write("\t\t if(!patrn.exec(document.getElementById(\"phoneStr\").value)){\r\n");
      out.write("\t\t\t document.getElementById(\"usernamecheck\").innerHTML = \"<font color='red'>联系手机格式不正确</font>\";\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t           \t document.getElementById(\"usernamecheck\").innerHTML = \"\";\r\n");
      out.write("\t          \t usernameStatus = true;\r\n");
      out.write("\t             }  \r\n");
      out.write("\t }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkEmail(){\r\n");
      out.write("\t if(document.getElementById(\"emailStr\").value==''){\r\n");
      out.write("\t\t document.getElementById(\"emailcheck\").innerHTML = \"<font color='red'>电子邮箱不能为空</font>\";\r\n");
      out.write("\t }else{\r\n");
      out.write("\t\t var myreg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;\r\n");
      out.write("\t\t if(!myreg.test(document.getElementById(\"emailStr\").value)){\r\n");
      out.write("\t\t\t document.getElementById(\"emailcheck\").innerHTML = \"<font color='red'>电子邮箱格式不正确</font>\";\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t            \t document.getElementById(\"emailcheck\").innerHTML = \"\";\r\n");
      out.write("\t \t\t\t\temailStatus = true;\r\n");
      out.write("\t           \r\n");
      out.write("\t}\r\n");
      out.write("\t }\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("function  checkname(){\r\n");
      out.write("\tif(document.getElementById(\"uname\").value==''){\r\n");
      out.write("\t\t document.getElementById(\"namecheck\").innerHTML = \"<font color='red'>姓名不能为空</font>\";\r\n");
      out.write("\t }else{\r\n");
      out.write("\t\t document.getElementById(\"namecheck\").innerHTML = \"\";\r\n");
      out.write("\t\t nameStatus=true;\r\n");
      out.write("\t }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function  checkbirth(){\r\n");
      out.write("\tif(document.getElementById(\"birth\").value==''){\r\n");
      out.write("\t\t document.getElementById(\"birthcheck\").innerHTML = \"<font color='red'>出生日期不能为空</font>\";\r\n");
      out.write("\t }else{\r\n");
      out.write("\t\t document.getElementById(\"birthcheck\").innerHTML = \"\";\r\n");
      out.write("\t\t birthStatus=true;\r\n");
      out.write("\t }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function  checkcertificate(){\r\n");
      out.write("\tif(document.getElementById(\"certificate\").value==''){\r\n");
      out.write("\t\t document.getElementById(\"certificatecheck\").innerHTML = \"<font color='red'>身份证不能为空</font>\";\r\n");
      out.write("\t }else{\r\n");
      out.write("\t\t document.getElementById(\"certificatecheck\").innerHTML = \"\";\r\n");
      out.write("\t\t certificateStatus=true;\r\n");
      out.write("\t }\r\n");
      out.write("}\r\n");
      out.write("\tfunction addAdvertiseInfo(){\r\n");
      out.write("\tcheckUsername();\r\n");
      out.write("\t checkEmail();\r\n");
      out.write("\t checkname();\r\n");
      out.write("\t checkbirth();\r\n");
      out.write("\t checkcertificate();\r\n");
      out.write("\t   var sex = document.getElementsByName('sex');\r\n");
      out.write("        for(var i = 0; i< sex.length; i++)\r\n");
      out.write("           if(sex[i].checked) { \r\n");
      out.write("            sex=sex[i].value; \r\n");
      out.write("        } \r\n");
      out.write("\t\t if(emailStatus&&usernameStatus&&nameStatus&&birthStatus&&certificateStatus){\r\n");
      out.write("\t\t\t\tvar aform = findById(\"aform\");\r\n");
      out.write("\t\t\t\taform.action = \"addModelApplyfor.do?applyfor.sex=\"+sex;\r\n");
      out.write("\t\t\t\taform.submit();\r\n");
      out.write("\t\t\t\tfindById(\"button\").disabled = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction goHistory(){\r\n");
      out.write("\t\twindow.history.go(-1);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("  <div class=\"wrap\">\r\n");
      out.write("    ");
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
      out.write("    <div class=\"head_nav\"> <a onclick=\"SetHome(this,window.location)\" style=\"cursor:hand\">设为首页</a> <a href=\"/chinese/queryAid.do?id=10\" style=\"cursor:hand\">网站地图</a> <a href=\"/english/indexEn.do\">English</a> </div>\r\n");
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
      out.write("    <!-- nav -->\r\n");
      out.write("    <div class=\"nav\">\r\n");
      out.write("      <ul class=\"navlist\">\r\n");
      out.write("        <li ><a href=\"/chinese/introWeb.do\">新华昌简介</a></li>\r\n");
      out.write("      <li ><a href=\"/chinese/cultureByVisionWeb.do?id=36\">企业文化</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryQiyeNews.do\">新闻中心</a></li>\r\n");
      out.write("      <li class=\"hover\"><a href=\"/chinese/queryEmployess.do\">员工与招聘</a></li>\r\n");
      out.write("      <li><a href=\"/chinese/queryProduct.do?categoryId=1\">产品与客户</a></li>\r\n");
      out.write("      <li class=\"nobg\" ><a href=\"/chinese/queryModelContact.do\">联系我们</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <div class=\"cls\"></div>\r\n");
      out.write("      <div class=\"subnav\">\r\n");
      out.write("\t\t<a href=\"/chinese/queryEmployess.do\">权力与义务</a>      \r\n");
      out.write("    \t<a href=\"/chinese/queryXinc.do\">薪酬与福利</a>   \r\n");
      out.write("    \t<a href=\"/chinese/queryRenl.do\">人力资源策略</a>      \r\n");
      out.write("    \t<a href=\"/chinese/queryZhaop.do\">招聘信息</a>   \r\n");
      out.write("    \t<a href=\"/chinese/queryRecruit.do\">招工信息</a>   \r\n");
      out.write(" \t</div>\r\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/time.jsp", out, true);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- nav end -->\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mban\">");
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
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- main -->\r\n");
      out.write("    <div class=\"mmain\">\r\n");
      out.write("      <div class=\"mleft\">\r\n");
      out.write("        <h2> <span class=\"sp_t1\" >员工与招聘</span>  </h2>\r\n");
      out.write("        <div class=\"mleftbox\">\r\n");
      out.write("          <ul class=\"leftlist\">\r\n");
      out.write("            <li ><a href=\"/chinese/queryEmployess.do\">权力与义务</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryXinc.do\">薪酬与福利</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryRenl.do\">人力资源策略</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryZhaop.do\">招聘信息</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryRecruit.do\">招工信息</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/left.jsp", out, true);
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("       <form name=\"aform\" id=\"aform\"  method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("      <!-- mright -->\r\n");
      out.write("      <div class=\"mright\">\r\n");
      out.write("        <div class=\"curr\"> 您的位置-<a href=\"/chinese/queryEmployess.do\">员工与招聘</a>-招聘信息 </div>\r\n");
      out.write("        <div class=\"mtitle\">\r\n");
      out.write("          <h2>员工与招聘</h2>\r\n");
      out.write("         </div>\r\n");
      out.write("          \r\n");
      out.write("         \r\n");
      out.write("        <div class=\"resume\">\r\n");
      out.write("        \r\n");
      out.write("          <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"70\">应聘职位：</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.appliedPosition\"  value=\"");
      if (_jspx_meth_ww_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>招聘企业：</td>\r\n");
      out.write("              <td class=\"input\"><select id=\"memberEnterprises\" name=\"applyfor.memberEnterprises\">\r\n");
      out.write("                 <option value=\"\">请选择分公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"常州新华昌国际集装箱有限公司\">常州新华昌国际集装箱有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"宁波新华昌运输设备有限公司\">宁波新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"惠州新华昌运输设备有限公司\">惠州新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"天津新华昌运输设备有限公司\">天津新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"江苏万隆特种货柜有限公司\">江苏万隆特种货柜有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"嘉善新华昌运输设备有限公司\">嘉善新华昌运输设备有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"嘉善新华昌集装箱有限公司\">嘉善新华昌集装箱有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"青岛交运新华昌集装箱有限公司\">青岛交运新华昌集装箱有限公司</option>\r\n");
      out.write("\t\t                 \t\t<option value=\"新华昌集团有限公司\">新华昌集团有限公司</option>\r\n");
      out.write("                </select></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>姓&nbsp;&nbsp;&nbsp;&nbsp;名：</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" value=\"\" id=\"uname\"  name=\"applyfor.name\"/><div id=\"namecheck\"><font color='red'>*</font></div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"30%\">性&nbsp;&nbsp;&nbsp;&nbsp;别：</td>\r\n");
      out.write("              <td class=\"sex\"><input type=\"radio\" name=\"sex\" checked=\"checked\" value=\"1\" /> 男\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"2\" /> 女\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>出生日期：</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.dateOfBirth\" id=\"birth\" value=\"\" /><div id=\"birthcheck\"><font color='red'>*</font></div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>身&nbsp;份&nbsp;证：</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.certificate\" id=\"certificate\" value=\"\" /><div id=\"certificatecheck\"><font color='red'>*</font></div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>现住地址：</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.address\" value=\"\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>籍&nbsp;&nbsp;&nbsp;&nbsp;贯：</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.nativePlace\" value=\"\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>联系电话：</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" id=\"phoneStr\" name=\"applyfor.phone\" value=\"\" /><div id=\"usernamecheck\"></div><font color='red'>*</font></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>E - mail:</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.email\" id=\"emailStr\" value=\"\" /><div id=\"emailcheck\"><font color='red'>*</font></div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>工作年限:</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.workLife\" value=\"\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>学&nbsp;&nbsp;&nbsp;&nbsp;历:</td>\r\n");
      out.write("              <td class=\"input\">\r\n");
      out.write("                <select name=\"applyfor.degree\">\r\n");
      out.write("                 <option value=\"\">请选择学历类别</option>\r\n");
      out.write("                  <option value=\"初中\">初中</option>\r\n");
      out.write("                  <option value=\"中专\">中专</option>\r\n");
      out.write("                  <option value=\"高中\">高中</option>\r\n");
      out.write("                  <option value=\"大专\">大专</option>\r\n");
      out.write("                   <option value=\"本科\">本科</option>\r\n");
      out.write("                  <option value=\"硕士\">硕士</option>\r\n");
      out.write("                   <option value=\"博士\">博士</option>\r\n");
      out.write("                </select></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>专&nbsp;&nbsp;&nbsp;&nbsp;业:</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.professional\" value=\"\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>外&nbsp;&nbsp;&nbsp;&nbsp;语:</td>\r\n");
      out.write("              <td class=\"input\"><input type=\"text\" name=\"applyfor.english\" value=\"\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"115\">教育经历:</td>\r\n");
      out.write("              <td class=\"textarea\"><textarea cols=\"30\" rows=\"5\" name=\"applyfor.educationExperience\"></textarea>\r\n");
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"115\">工作经历:</td>\r\n");
      out.write("              <td class=\"textarea\"><textarea cols=\"30\" rows=\"5\" name=\"applyfor.workExperience\"></textarea></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"115\">自我评价:</td>\r\n");
      out.write("              <td class=\"textarea\"><textarea cols=\"30\" rows=\"5\" name=\"applyfor.selfEvaluation\"></textarea></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>表格上传：</td>\r\n");
      out.write("            <td class=\"input\">\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"file\" id=\"fileImage\" name=\"fileImage\" size=\"30\"/>\r\n");
      out.write("            <a class=\"down\" href=\"downloadAdvertise.do\">下载新华昌应聘表</a>\r\n");
      out.write("            </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("          <div class=\"tijiao\"><input type=\"button\" id=\"button\" onclick=\"addAdvertiseInfo()\" class=\"btn_tjiao\" value=\"提交\"/><a href=\"javascript:goHistory();\">返回</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- mright end --> \r\n");
      out.write("         </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- main end --> \r\n");
      out.write("    <!-- foot -->\r\n");
      out.write("     ");
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
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_ww_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_ww_005fif_005f1(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_ww_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f0 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f0.setParent(null);
    // /chinese/job/resume.jsp(38,27) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /chinese/job/resume.jsp(206,91) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("name");
    int _jspx_eval_ww_005fproperty_005f1 = _jspx_th_ww_005fproperty_005f1.doStartTag();
    if (_jspx_th_ww_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    com.opensymphony.webwork.views.jsp.IfTag _jspx_th_ww_005fif_005f0 = (com.opensymphony.webwork.views.jsp.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(com.opensymphony.webwork.views.jsp.IfTag.class);
    _jspx_th_ww_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f0.setParent(null);
    // /chinese/job/resume.jsp(316,4) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f0.setTest("isSuccess()");
    int _jspx_eval_ww_005fif_005f0 = _jspx_th_ww_005fif_005f0.doStartTag();
    if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script language=\"javascript\">\r\n");
        out.write("\t\tif(\"");
        if (_jspx_meth_ww_005fproperty_005f2(_jspx_th_ww_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\" == \"\"){\r\n");
        out.write("\t\t\talert(\"操作成功!\");\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\talert(\"");
        if (_jspx_meth_ww_005fproperty_005f3(_jspx_th_ww_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\");\r\n");
        out.write("\t\t}\r\n");
        out.write("\t\twindow.returnValue = \"SUCCESS\";\r\n");
        out.write("\t</script>\r\n");
        int evalDoAfterBody = _jspx_th_ww_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f2 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /chinese/job/resume.jsp(318,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f3 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /chinese/job/resume.jsp(321,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f3.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f3 = _jspx_th_ww_005fproperty_005f3.doStartTag();
    if (_jspx_th_ww_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    com.opensymphony.webwork.views.jsp.IfTag _jspx_th_ww_005fif_005f1 = (com.opensymphony.webwork.views.jsp.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(com.opensymphony.webwork.views.jsp.IfTag.class);
    _jspx_th_ww_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f1.setParent(null);
    // /chinese/job/resume.jsp(326,0) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f1.setTest("isFailure()");
    int _jspx_eval_ww_005fif_005f1 = _jspx_th_ww_005fif_005f1.doStartTag();
    if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script language=\"javascript\">\t\t\r\n");
        out.write("\t\tif(\"");
        if (_jspx_meth_ww_005fproperty_005f4(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\" == \"\"){\r\n");
        out.write("\t\t\talert(\"操作失败，请稍候再试!\");\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\talert(\"");
        if (_jspx_meth_ww_005fproperty_005f5(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\");\r\n");
        out.write("\t\t}\t\t\r\n");
        out.write("\t</script>\r\n");
        int evalDoAfterBody = _jspx_th_ww_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f4 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /chinese/job/resume.jsp(328,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f4.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f4 = _jspx_th_ww_005fproperty_005f4.doStartTag();
    if (_jspx_th_ww_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f5 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /chinese/job/resume.jsp(331,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f5.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f5 = _jspx_th_ww_005fproperty_005f5.doStartTag();
    if (_jspx_th_ww_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
    return false;
  }
}
