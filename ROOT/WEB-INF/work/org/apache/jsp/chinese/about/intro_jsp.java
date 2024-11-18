package org.apache.jsp.chinese.about;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.newhc.admin.helper.*;

public final class intro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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

	List t1List = (List)request.getAttribute("t1List");
	List t2List = (List)request.getAttribute("t2List");
	List imageList = (List)request.getAttribute("imageList");
 
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"footbg\">\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/head.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- nav -->\r\n");
      out.write("  <div class=\"nav\">\r\n");
      out.write("    <ul class=\"navlist\">\r\n");
      out.write("        <li style=\"width:80px;\" ><a href=\"/chinese/index.do\" class=\"ahome\">首页</a></li>\r\n");
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
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/time.jsp", out, true);
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
      out.write("\" target=\"_blank\"><img src=\"/chinese/images/columnLink.gif\" width=\"990\" height=\"245\" /></a>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <!-- main -->\r\n");
      out.write("  <div class=\"mmain\">\r\n");
      out.write("  \t\t<div class=\"mleft\">\r\n");
      out.write("            <h2>\r\n");
      out.write("            \t<span class=\"sp_t1\">新华昌简介</span>\r\n");
      out.write("\r\n");
      out.write("            </h2>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"mleftbox\">\r\n");
      out.write("            \t<ul class=\"leftlist\">\r\n");
      out.write("               \r\n");
      out.write("                    \t<li class=\"hover\"><a href=\"/chinese/introWeb.do\">集团概况</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryRemeberTheBig.do\">企业荣誉</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryRemeberBig.do\">集团大事记</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryFactoryEnvironment.do\">厂区环境</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/enterprisesWeb.do\">成员企业</a></li>\r\n");
      out.write("                        <li><a href=\"/chinese/queryContact.do\">联系方式</a></li>\r\n");
      out.write("                    \t<li><a href=\"/chinese/videoWeb.do\">集团掠影</a></li>\r\n");
      out.write("                \r\n");
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
      out.write("                 \t您的位置-<a href=\"#\">新华昌简介</a>-集团纲领\r\n");
      out.write("                 \r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mtitle\">\r\n");
      out.write("                 \t<h2>集团概况</h2>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 <div class=\"mcon3\">\r\n");
      out.write("             \r\n");
      out.write("                   ");
      if (_jspx_meth_ww_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                   \r\n");
      out.write("                   <p><strong class=\"hei3\">新华昌集团有限公司下属的主要成员企业有</strong>：</p>\r\n");
      out.write("              \r\n");
      out.write("                   ");

                    
      out.write("\r\n");
      out.write("                   <div class=\"abouttab\">\r\n");
      out.write("                   \t\t<h3>控股企业:</h3>\r\n");
      out.write("                   \t<ul class=\"aboutlist\">\r\n");
      out.write("                   \t");

                    		if(t1List!=null&&t1List.size()>0){
                   				for(int i=0;i<t1List.size();i++){
                   					Map map = (Map)t1List.get(i);
                   						
      out.write("\r\n");
      out.write("                   \t\t\t\t\t\t<li ");
if(i % 2 == 0){ 
}else{ 
      out.write("class=\"noright\"");
} 
      out.write(">\r\n");
      out.write("\t\t\t\t                        <p class=\"ptitle\"><a href=\"enterprisesDetailWeb.do?enterId=");
      out.print(map.get("id") );
      out.write('"');
      out.write('>');
      out.print(map.get("name") );
      out.write("</a></p>\r\n");
      out.write("\t\t\t\t                       ");
      out.print(NewStringHelper.truncate((String)map.get("remarks"),42,"....") );
      out.write("\r\n");
      out.write("\t\t\t\t                        </li>\r\n");
      out.write("                   \t\t\t\t\t\t\r\n");
      out.write("                   \t\t\t\t\t\t");
	
                   					}
                   					
                   				}
                   		
                   		 
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    </ul>\r\n");
      out.write("                   \r\n");
      out.write("                   </div>\r\n");
      out.write("                   \r\n");
      out.write("                   <div class=\"abouttab\">\r\n");
      out.write("                   \t\t<h3>非控股企业:</h3>\r\n");
      out.write("                   \t<ul class=\"aboutlist\">\r\n");
      out.write("                    \t");

                    		if(t2List!=null&&t2List.size()>0){
                   				for(int i=0;i<t2List.size();i++){
                   					Map map = (Map)t2List.get(i);
                   						
      out.write("\r\n");
      out.write("                   \t\t\t\t\t\t<li ");
if(i % 2 == 0){ 
}else{ 
      out.write("class=\"noright\"");
} 
      out.write(">\r\n");
      out.write("\t\t\t\t                        <p class=\"ptitle\"><a href=\"enterprisesDetailWeb.do?enterId=");
      out.print(map.get("id") );
      out.write('"');
      out.write('>');
      out.print(map.get("name") );
      out.write("</a></p>\r\n");
      out.write("\t\t\t\t                       ");
      out.print(NewStringHelper.truncate((String)map.get("remarks"),42,"....") );
      out.write("\r\n");
      out.write("\t\t\t\t                        </li>\r\n");
      out.write("                   \t\t\t\t\t\t\r\n");
      out.write("                   \t\t\t\t\t\t");
	
                   					}
                   					
                   				}
                   		
                   		 
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        ");
      out.write("</ul>\r\n");
      out.write("                   \r\n");
      out.write("                   </div>\r\n");
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
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/chinese/foot.jsp", out, true);
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
    // /chinese/about/intro.jsp(112,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f0.setValue("me.content");
    int _jspx_eval_ww_005fproperty_005f0 = _jspx_th_ww_005fproperty_005f0.doStartTag();
    if (_jspx_th_ww_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
    return false;
  }
}
