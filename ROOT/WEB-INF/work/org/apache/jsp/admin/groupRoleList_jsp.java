package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.com.netmovie.util.*;
import cn.com.netmovie.helper.*;
import java.util.*;

public final class groupRoleList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/inc/common.jsp");
    _jspx_dependants.add("/WEB-INF/inc/default.jsp");
    _jspx_dependants.add("/WEB-INF/inc/response.jsp");
    _jspx_dependants.add("/WEB-INF/auth.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=gbk");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	List roleChList = (List)request.getAttribute("roleChList");
	List roleEnList = (List)request.getAttribute("roleEnList");
	List roleJpList = (List)request.getAttribute("roleJpList");
	List groupRoleList = (List)request.getAttribute("groupRoleList");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<title>权限分配</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/default.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/default.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction updateGroupRole(){\r\n");
      out.write("\t\tvar roleGroup = \"\";\r\n");
      out.write("\t\tvar roleSize = 0;\r\n");
      out.write("\t\tvar groupId = ");
      if (_jspx_meth_ww_005fproperty_005f0(_jspx_page_context))
        return;
      out.write(";\r\n");
      out.write("\t\t");
if(roleChList!=null&&roleChList.size()>0){
      out.write("\r\n");
      out.write("\t\t\troleSize = roleSize+");
      out.print(roleChList.size());
      out.write(";\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t");
if(roleEnList!=null&&roleEnList.size()>0){
      out.write("\r\n");
      out.write("\t\t\troleSize = roleSize+");
      out.print(roleEnList.size());
      out.write(";\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t");
if(roleJpList!=null&&roleJpList.size()>0){
      out.write("\r\n");
      out.write("\t\t\troleSize = roleSize+");
      out.print(roleJpList.size());
      out.write(";\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t");
if(roleChList==null&&roleEnList==null&&roleJpList==null){
      out.write("\r\n");
      out.write("\t\t\talert(\"没有菜单选择,请返回\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\tif(roleSize>0){\r\n");
      out.write("\t\t\tfor(var i=0;i<roleSize;i++){\r\n");
      out.write("\t\t\t\tif(document.getElementById(\"role\"+i).checked){\r\n");
      out.write("\t\t\t\t\tvar roleValue = document.getElementById(\"role\"+i).value;\r\n");
      out.write("\t\t\t\t\t\troleGroup += roleValue+\",\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(roleGroup==\"\"){\r\n");
      out.write("\t\t\talert('请至少选择一个权限');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar form = findById(\"form\");\r\n");
      out.write("\t\tform.action = \"updateGroupRole.do?roleGroup=\"+roleGroup;\r\n");
      out.write("\t\tform.submit();\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction checkAll(){ \r\n");
      out.write("\t\tvar code_Values = document.all['role']; \r\n");
      out.write("\t\tif(code_Values.length){ \r\n");
      out.write("\t\t\tfor(var i=0;i<code_Values.length;i++){ \r\n");
      out.write("\t\t\t\tcode_Values[i].checked = true; \r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t}else{ \r\n");
      out.write("\t\t\tcode_Values.checked = true; \r\n");
      out.write("\t\t} \r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\tfunction uncheckAll(){ \r\n");
      out.write("\t\tvar code_Values = document.all['role']; \r\n");
      out.write("\t\tif(code_Values.length){ \r\n");
      out.write("\t\t\tfor(var i=0;i<code_Values.length;i++){ \r\n");
      out.write("\t\t\t\tcode_Values[i].checked = false; \r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t}else{ \r\n");
      out.write("\t\t\tcode_Values.checked = false; \r\n");
      out.write("\t\t} \r\n");
      out.write("\t} \r\n");
      out.write("\t\r\n");
      out.write("\tfunction refresh(){\r\n");
      out.write("\t\tvar form = findById(\"form\");\r\n");
      out.write("\t\tform.action = \"groupRoleList.do\"\r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction init(){\r\n");
      out.write("\t\thighLightInit('row', 'rowover', 'rowselected');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"96%\" align=\"center\" border=\"0\"><tr><td><div class=\"title\">权限分配</div></td></tr></table>\r\n");
      out.write("<table width=\"96%\"  cellspacing=\"1\" cellpadding=\"1\" class=\"optiontable\" align=\"center\">\r\n");
      out.write("\t<form id=\"form\" action=\"\" method=\"POST\">\r\n");
      out.write("\t  ");
      if (_jspx_meth_ww_005fhidden_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t  \t<input type=\"button\" value=\"全选\" onClick=\"javascript:checkAll();\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"取消全选\" onClick=\"javascript:uncheckAll();\">\r\n");
      out.write("\t\t<input type=\"button\" value=\"修改权限\" onClick=\"javascript:updateGroupRole();\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</form>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"96%\"  class=\"tborder\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("  <tr class=\"theader\" align=\"center\">\r\n");
      out.write("  \t<th>选择</th>\r\n");
      out.write("  \t<th>权限名称</th>\r\n");
      out.write("\t<th>代码</th>\r\n");
      out.write("\t<th>说明</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("\t<td class=\"rowodd\" colspan=\"4\" align=\"left\">中文管理权限</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!-- ================ 显示各行数据 ================ -->\r\n");
      out.write("  ");

  	if(roleChList != null && roleChList.size() > 0){
  		int count = 0;
	  	for(int i=0;i<roleChList.size();i++){
	  		count++;
	  		String rowClass = (count % 2 == 0)?"roweven":"rowodd";
	
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"");
      out.print(rowClass);
      out.write("\" align=\"center\" id=\"row_");
      out.print(count-1);
      out.write("\">\r\n");
      out.write("\t\t\t  \t<td><input type=\"checkbox\" id=\"role");
      out.print(count-1);
      out.write("\" name=\"role\" value='");
      out.print((Integer)((Map)roleChList.get(i)).get("id"));
      out.write("' \r\n");
      out.write("\t\t\t\t");
if(groupRoleList!=null&&groupRoleList.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\t");
for(int j=0;j<groupRoleList.size();j++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if(((Integer)((Map)groupRoleList.get(j)).get("role_id")).intValue()==((Integer)((Map)roleChList.get(i)).get("id")).intValue()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t checked=\"checked\"\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t></td>\r\n");
      out.write("\t\t\t  \t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleChList.get(i)).get("name"))?"---":(String)((Map)roleChList.get(i)).get("name"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleChList.get(i)).get("code"))?"---":(String)((Map)roleChList.get(i)).get("code"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleChList.get(i)).get("description"))?"---":(String)((Map)roleChList.get(i)).get("description"));
      out.write("</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t");

	  	}
	
      out.write("\r\n");
      out.write("  ");

	  }else{
  
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"rowodd\" align=\"center\">\r\n");
      out.write("\t\t\t    <td colspan=\"4\" height=\"50\">无相关数据</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("  ");
	  	
	  }
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\t<td class=\"rowodd\" colspan=\"4\" align=\"left\">英文管理权限</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!-- ================ 显示各行数据 ================ -->\r\n");
      out.write("  ");

  	if(roleEnList != null && roleEnList.size() > 0){
  		int count = 0;
		if(roleChList!=null&&roleChList.size()>0){
			count = count+roleChList.size();
		}
	  	for(int i=0;i<roleEnList.size();i++){
	  		count++;
	  		String rowClass = (count % 2 == 0)?"roweven":"rowodd";
	
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"");
      out.print(rowClass);
      out.write("\" align=\"center\" id=\"row_");
      out.print(count-1);
      out.write("\">\r\n");
      out.write("\t\t\t  \t<td><input type=\"checkbox\" id=\"role");
      out.print(count-1);
      out.write("\" name=\"role\" value='");
      out.print((Integer)((Map)roleEnList.get(i)).get("id"));
      out.write("' \r\n");
      out.write("\t\t\t\t");
if(groupRoleList!=null&&groupRoleList.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\t");
for(int j=0;j<groupRoleList.size();j++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if(((Integer)((Map)groupRoleList.get(j)).get("role_id")).intValue()==((Integer)((Map)roleEnList.get(i)).get("id")).intValue()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t checked=\"checked\"\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t></td>\r\n");
      out.write("\t\t\t  \t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleEnList.get(i)).get("name"))?"---":(String)((Map)roleEnList.get(i)).get("name"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleEnList.get(i)).get("code"))?"---":(String)((Map)roleEnList.get(i)).get("code"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleEnList.get(i)).get("description"))?"---":(String)((Map)roleEnList.get(i)).get("description"));
      out.write("</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t");

	  	}
	
      out.write("\r\n");
      out.write("  ");

	  }else{
  
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"rowodd\" align=\"center\">\r\n");
      out.write("\t\t\t    <td colspan=\"4\" height=\"50\">无相关数据</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("  ");
	  	
	  }
  
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("\t<td class=\"rowodd\" colspan=\"4\" align=\"left\">日文管理权限</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!-- ================ 显示各行数据 ================ -->\r\n");
      out.write("  ");

  	if(roleJpList != null && roleJpList.size() > 0){
  		int count = 0;
		if(roleChList!=null&&roleChList.size()>0){
			count = count+roleChList.size();
		}
		if(roleEnList!=null&&roleEnList.size()>0){
			count = count+roleEnList.size();
		}
	  	for(int i=0;i<roleJpList.size();i++){
	  		count++;
	  		String rowClass = (count % 2 == 0)?"roweven":"rowodd";
	
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"");
      out.print(rowClass);
      out.write("\" align=\"center\" id=\"row_");
      out.print(count-1);
      out.write("\">\r\n");
      out.write("\t\t\t  \t<td><input type=\"checkbox\" id=\"role");
      out.print(count-1);
      out.write("\" name=\"role\" value='");
      out.print((Integer)((Map)roleJpList.get(i)).get("id"));
      out.write("' \r\n");
      out.write("\t\t\t\t");
if(groupRoleList!=null&&groupRoleList.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\t");
for(int j=0;j<groupRoleList.size();j++){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if(((Integer)((Map)groupRoleList.get(j)).get("role_id")).intValue()==((Integer)((Map)roleJpList.get(i)).get("id")).intValue()){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t checked=\"checked\"\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t></td>\r\n");
      out.write("\t\t\t  \t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleJpList.get(i)).get("name"))?"---":(String)((Map)roleJpList.get(i)).get("name"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleJpList.get(i)).get("code"))?"---":(String)((Map)roleJpList.get(i)).get("code"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty((String)((Map)roleJpList.get(i)).get("description"))?"---":(String)((Map)roleJpList.get(i)).get("description"));
      out.write("</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t");

	  	}
	
      out.write("\r\n");
      out.write("  ");

	  }else{
  
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"rowodd\" align=\"center\">\r\n");
      out.write("\t\t\t    <td colspan=\"4\" height=\"50\">无相关数据</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("  ");
	  	
	  }
  
      out.write("\r\n");
      out.write("  <!-- ================================================ -->\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"98%\" border=\"0\" cellspacing=\"0\" style=\"border:0;\">\r\n");
      out.write("\t<tr align=\"center\" style=\"border:0;\">\r\n");
      out.write("\t\t<td style=\"border:0;\" align=\"center\">\r\n");
      out.write("\t      <br />\r\n");
      out.write("\t\t  <input type=\"button\" value=\"关闭窗口\"  onclick=\"window.close();\">\r\n");
      out.write("\t\t  <input type=\"button\" value=\"修改权限\"  onclick=\"updateGroupRole()\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("  try{\r\n");
      out.write("\tif(init){init();}\r\n");
      out.write("  }catch(e){}\r\n");
      out.write("</script>\r\n");
      if (_jspx_meth_ww_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_ww_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
    // /admin/groupRoleList.jsp(20,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f0.setValue("groupId");
    int _jspx_eval_ww_005fproperty_005f0 = _jspx_th_ww_005fproperty_005f0.doStartTag();
    if (_jspx_th_ww_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fhidden_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:hidden
    com.opensymphony.webwork.views.jsp.ui.HiddenTag _jspx_th_ww_005fhidden_005f0 = (com.opensymphony.webwork.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.HiddenTag.class);
    _jspx_th_ww_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fhidden_005f0.setParent(null);
    // /admin/groupRoleList.jsp(88,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fhidden_005f0.setName("'groupId'");
    int _jspx_eval_ww_005fhidden_005f0 = _jspx_th_ww_005fhidden_005f0.doStartTag();
    if (_jspx_th_ww_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_ww_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_ww_005fhidden_005f0);
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
    // /WEB-INF/inc/response.jsp(6,0) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f0.setTest("isSuccess()");
    int _jspx_eval_ww_005fif_005f0 = _jspx_th_ww_005fif_005f0.doStartTag();
    if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script language=\"javascript\">\r\n");
        out.write("\t\tif(\"");
        if (_jspx_meth_ww_005fproperty_005f1(_jspx_th_ww_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\" == \"\"){\r\n");
        out.write("\t\t\talert(\"操作成功!\");\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\talert(\"");
        if (_jspx_meth_ww_005fproperty_005f2(_jspx_th_ww_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\");\r\n");
        out.write("\t\t}\r\n");
        out.write("\t\twindow.returnValue = \"SUCCESS\";\r\n");
        out.write("\t\twindow.close();\r\n");
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

  private boolean _jspx_meth_ww_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f1 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /WEB-INF/inc/response.jsp(8,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f1 = _jspx_th_ww_005fproperty_005f1.doStartTag();
    if (_jspx_th_ww_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
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
    // /WEB-INF/inc/response.jsp(11,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
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
    // /WEB-INF/inc/response.jsp(17,0) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f1.setTest("isFailure()");
    int _jspx_eval_ww_005fif_005f1 = _jspx_th_ww_005fif_005f1.doStartTag();
    if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script language=\"javascript\">\t\t\r\n");
        out.write("\t\tif(\"");
        if (_jspx_meth_ww_005fproperty_005f3(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\" == \"\"){\r\n");
        out.write("\t\t\talert(\"操作失败，请稍候再试!\");\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\talert(\"");
        if (_jspx_meth_ww_005fproperty_005f4(_jspx_th_ww_005fif_005f1, _jspx_page_context))
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

  private boolean _jspx_meth_ww_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f3 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /WEB-INF/inc/response.jsp(19,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f3.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f3 = _jspx_th_ww_005fproperty_005f3.doStartTag();
    if (_jspx_th_ww_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
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
    // /WEB-INF/inc/response.jsp(22,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f4.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f4 = _jspx_th_ww_005fproperty_005f4.doStartTag();
    if (_jspx_th_ww_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
    return false;
  }
}
