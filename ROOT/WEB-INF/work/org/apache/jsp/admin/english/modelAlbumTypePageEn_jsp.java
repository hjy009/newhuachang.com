package org.apache.jsp.admin.english;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.newhc.admin.action.user.view.en.ModelAlbumTypeEnView;
import com.newhc.admin.entity.Dictionary;
import com.newhc.admin.cache.DictionaryCache;
import cn.com.netmovie.util.*;
import cn.com.netmovie.helper.*;
import java.util.*;

public final class modelAlbumTypePageEn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/inc/common.jsp");
    _jspx_dependants.add("/WEB-INF/inc/calendar.jsp");
    _jspx_dependants.add("/WEB-INF/inc/default.jsp");
    _jspx_dependants.add("/WEB-INF/inc/page.jsp");
    _jspx_dependants.add("/WEB-INF/inc/response.jsp");
    _jspx_dependants.add("/WEB-INF/auth.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.release();
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
      out.write('\r');
      out.write('\n');
      out.write("<link rel=\"StyleSheet\" type=\"text/css\" href=\"/css/calendar.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/calendar.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/calendar/calendar.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/calendar/calendar-zh.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Pagination pages = (Pagination)request.getAttribute("pages");
	List modelProductCategoryStatus = (List)request.getAttribute("modelProductCategoryStatus");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("<title>电子画册类型管理</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/default.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/default.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction go2Page(page){\r\n");
      out.write("\t\tvar form = findById(\"form\");\r\n");
      out.write("\t\tform.pageNumber.value = page;\r\n");
      out.write("\t\tform.action = \"modelAlbumTypeEnPage.do\";\r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction prepareUpdateModelAlbumTypeView(id){\r\n");
      out.write("\t\t");
      if (_jspx_meth_auth_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\tif(openDialog(\"prepareUpdateModelAlbumTypeEn.do?id=\"+id+\"&typeName=");
      if (_jspx_meth_ww_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\",\"修改电子画册分类\",650,300) ==\"SUCCESS\") refresh();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction prepareAddModelPeriodica(){\r\n");
      out.write("\t\t");
      if (_jspx_meth_auth_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\tif(openDialog(\"prepareAddModelAlbumTypeEn.do\",\"新增电子画册分类\",650,200)==\"SUCCESS\")refresh();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction deleteModelAlbumTypeView(id,pageId){\r\n");
      out.write("\t\t");
      if (_jspx_meth_auth_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\tif(confirm('是否删除此ID：['+pageId+']?')==false){\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar params = '';\r\n");
      out.write("\t\tvar url =\"deleteModelAlbumTypeEn.do?id=\"+id;\r\n");
      out.write("\t\tnew Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction auditModelAlbumTypeView(id,pageId){\r\n");
      out.write("\t\t");
      if (_jspx_meth_auth_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\tif(confirm(\"是否审核此动态ID：[\"+pageId+\"] ？\") == false) return ;\r\n");
      out.write("\t\tvar params = 'id='+id;\r\n");
      out.write("\t\tvar url = 'auditModelAlbumTypeEn.do';\r\n");
      out.write("\t\tnew Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction reAuditModelAlbumTypeView(id,pageId){\r\n");
      out.write("\t\t");
      if (_jspx_meth_auth_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\tif(confirm(\"是否重审核此动态ID：[\"+pageId+\"] ？\") == false) return ;\r\n");
      out.write("\t\tvar params = 'id='+id;\r\n");
      out.write("\t\tvar url = 'reAuditModelAlbumTypeEn.do';\r\n");
      out.write("\t\tnew Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction init(){\r\n");
      out.write("\t\tdoSelect('status',\"");
      if (_jspx_meth_ww_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("\t\thighLightInit('row', 'rowover', 'rowselected');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction refresh(){\r\n");
      out.write("\t\tvar form = findById(\"form\");\r\n");
      out.write("\t\tform.action = \"modelAlbumTypeEnPage.do\";\r\n");
      out.write("\t\tform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tcheckit = true;\r\n");
      out.write("\tfunction   SelectAll(){      \r\n");
      out.write("\t var  aa = document.getElementsByName(\"productId\");      \r\n");
      out.write("\t    if(checkit){      \r\n");
      out.write("\t     for(i=0;i<aa.length;i++)      \r\n");
      out.write("\t        aa.item(i).checked=true;      \r\n");
      out.write("\t        checkit   =   false;      \r\n");
      out.write("\t     }      \r\n");
      out.write("\t     else{for   (i=0;i<aa.length;i++)      \r\n");
      out.write("\t       aa.item(i).checked=false;      \r\n");
      out.write("\t        checkit   =   true;      \r\n");
      out.write("\t      }      \r\n");
      out.write("\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t   function  shenhe(){\r\n");
      out.write("\t   ");
      if (_jspx_meth_auth_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t   \tvar objs=document.getElementsByName(\"productId\");\r\n");
      out.write("\t   \tvar ary =\"\";\r\n");
      out.write("\t\t    for(i=0;i<objs.length;i++) {\r\n");
      out.write("\t\t        if(objs[i].checked) {\r\n");
      out.write("\t\t            ary+=objs[i].value+\",\";\r\n");
      out.write("\t\t       \t}\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    if(ary.length<1) {\r\n");
      out.write("\t\t\t\talert(\"至少选择一个电子画册类型进行审核\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(confirm(\"是否批量审核您所选的选项 ？\") == false) return ;\r\n");
      out.write("\t\t\tvar params = '';\r\n");
      out.write("\t\t\tvar url = 'auditAllModelAlbumTypeEn.do?ShenHeId='+ary;\r\n");
      out.write("\t\t\tnew Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });\r\n");
      out.write("\t   }\r\n");
      out.write("\t   \r\n");
      out.write("\t   function  reShenhe(){\r\n");
      out.write("\t   ");
      if (_jspx_meth_auth_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t   \tvar objs=document.getElementsByName(\"productId\");\r\n");
      out.write("\t   \tvar ary =\"\";\r\n");
      out.write("\t\t    for(i=0;i<objs.length;i++) {\r\n");
      out.write("\t\t        if(objs[i].checked) {\r\n");
      out.write("\t\t            ary+=objs[i].value+\",\";\r\n");
      out.write("\t\t       \t}\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    if(ary.length<1) {\r\n");
      out.write("\t\t\t\talert(\"至少选择一个电子画册类型进行重审核\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(confirm(\"是否批量重审核您所选的选项 ？\") == false) return ;\r\n");
      out.write("\t\t\tvar params = '';\r\n");
      out.write("\t\t\tvar url = 'reAuditAllModelAlbumTypeEn.do?ShenHeId='+ary;\r\n");
      out.write("\t\t\tnew Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });\r\n");
      out.write("\t   }\r\n");
      out.write("\t    function  deleteAll(){\r\n");
      out.write("\t   ");
      if (_jspx_meth_auth_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t   \tvar objs=document.getElementsByName(\"productId\");\r\n");
      out.write("\t   \tvar ary =\"\";\r\n");
      out.write("\t\t    for(i=0;i<objs.length;i++) {\r\n");
      out.write("\t\t        if(objs[i].checked) {\r\n");
      out.write("\t\t            ary+=objs[i].value+\",\";\r\n");
      out.write("\t\t       \t}\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    if(ary.length<1) {\r\n");
      out.write("\t\t\t\talert(\"至少选择一个电子画册类型进行删除\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(confirm(\"是否批量删除您所选的选项 ？\") == false) return ;\r\n");
      out.write("\t\t\tvar params = 'ShenHeId='+ary;\r\n");
      out.write("\t\t\tvar url = 'deleteAllModelAlbumTypeEn.do';\r\n");
      out.write("\t\t\tnew Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });\r\n");
      out.write("\t   }\r\n");
      out.write("\t   function modelProductPage(categoryId){\r\n");
      out.write("\t\t");
      if (_jspx_meth_auth_005fif_005f8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\tif(openDialog(\"modelAlbumEnPage.do?typeId=\"+categoryId,\"电子画册管理\",950,300) ==\"SUCCESS\") refresh();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"96%\" align=\"center\" border=\"0\"><tr><td><div class=\"title\">电子画册类型管理</div></td></tr></table>\r\n");
      out.write("<table width=\"96%\" cellspacing=\"1\" cellpadding=\"1\" align=\"center\">\r\n");
      out.write("\t<form id='form' action=\"\" method=\"POST\">\r\n");
      out.write("\t  ");
      if (_jspx_meth_ww_005fhidden_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t\t<td style=\"border:0;\" >\r\n");
      out.write("\t\t\t&nbsp;名称：<input id=\"name\" name=\"name\" size=\"30\" value=\"");
      if (_jspx_meth_ww_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t&nbsp;状态：<select id=\"status\" name=\"status\">\r\n");
      out.write("\t\t\t\t\t\t\t");
if(modelProductCategoryStatus!=null&&modelProductCategoryStatus.size()>0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\">全部</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
for(Iterator it = modelProductCategoryStatus.iterator();it.hasNext();){
									Dictionary dic = (Dictionary)it.next();
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(dic.getCode());
      out.write('"');
      out.write('>');
      out.print(dic.getValue());
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t </select>\t\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<input type=\"button\" name=\"search\" value=\" 查 询 \" class=\"mainoption\" onClick=\"javascript:go2Page(1);\">\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<input type=\"button\" name=\"addmp\" value=\"新增电子画册\" class=\"mainoption\" onClick='javascript:prepareAddModelPeriodica()'>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<input type=\"button\" value=\"批量审核\" class=\"tjan\" onClick=\"javascript:shenhe();\"/>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;<input type=\"button\" value=\"批量重审核\" class=\"tjan\" onClick=\"javascript:reShenhe();\"/>\r\n");
      out.write("\t\t\t&nbsp;&nbsp; <input type=\"button\" value=\"批量删除\" class=\"tjan\" onClick=\"javascript:deleteAll();\"/>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</form>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"96%\"  class=\"tborder\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("  <tr class=\"theader\" align=\"center\">\r\n");
      out.write("  <th><input type=\"checkbox\"      onclick=\"javascript:SelectAll();\"></th>\r\n");
      out.write("  \t<th>编号</th>\r\n");
      out.write("  \t<th>名称</th>\r\n");
      out.write("  \t<th>图片路径</th>\r\n");
      out.write("\t<th>状态</th>\r\n");
      out.write("\t<th>顺序</th>\r\n");
      out.write("\t<th>创建时间</th>\r\n");
      out.write("\t<th>创建者</th>\r\n");
      out.write("\t<th>操作</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <!-- ================ 显示各行数据 ================ -->\r\n");
      out.write("  ");

  	if(pages != null && pages.getTotalCount() > 0){
  		int pageNumber = pages.getPageNumber();int pageMaxSize = pages.getPageMaxSize();
		int count = 0;
		int showCount = 0;
		if(pageNumber>1){
			if(pages.getPageCount()>1&&pages.getPageCount()>=pageNumber){
				count = (pageNumber-1)*pageMaxSize;
			}else{
				count = (pageNumber-2)*pageMaxSize;
			}
		}
	  	for(Iterator it = pages.iterator();it.hasNext();){
	  	    count++;
			showCount++;
	  		ModelAlbumTypeEnView mpv = (ModelAlbumTypeEnView)it.next();
	  		String rowClass = (count % 2 == 0)?"roweven":"rowodd";
	  		
	
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"");
      out.print(rowClass);
      out.write("\" align=\"center\" id=\"row_");
      out.print(showCount-1);
      out.write("\">\r\n");
      out.write("\t\t\t    <td width=\"3%\"><input type=\"checkbox\" name=\"productId\" value=\"");
      out.print(mpv.getId());
      out.write("\"></td>\r\n");
      out.write("\t\t\t  \t<td>");
      out.print(count);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty(mpv.getName())?"---":mpv.getName());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(StringHelper.isEmpty(mpv.getImagePath())?"---":mpv.getImagePath());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
if(mpv.getStatus().intValue()==0){
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.print(DictionaryCache.getValueByCode(Dictionary.AUDIT_STATUS,mpv.getStatus()+""));
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"update\" name=\"update\" value=\"审核...\" class=\"mainoption\" \r\n");
      out.write("\t\t\t\tonClick=\"javascript:auditModelAlbumTypeView(");
      out.print(mpv.getId());
      out.write(',');
      out.print(count);
      out.write(");\">");
}else{
      out.write("<font \r\n");
      out.write("\t\t\t\tcolor=\"#FF0000\">");
      out.print(DictionaryCache.getValueByCode(Dictionary.AUDIT_STATUS,mpv.getStatus()+""));
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"update\" name=\"update\" value=\"重审核...\" class=\"mainoption\" \r\n");
      out.write("\t\t\t\tonClick=\"javascript:reAuditModelAlbumTypeView(");
      out.print(mpv.getId());
      out.write(',');
      out.print(count);
      out.write(");\"></font>");
}
      out.write("&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(mpv.getSequence() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(mpv.getCreateTime());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(mpv.getCreator());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"修改...\" onClick=\"javascript:prepareUpdateModelAlbumTypeView(");
      out.print(mpv.getId());
      out.write(");\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"删除...\" onClick=\"javascript:deleteModelAlbumTypeView(");
      out.print(mpv.getId());
      out.write(',');
      out.print(count);
      out.write(");\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"进入编辑...\" onClick=\"javascript:modelProductPage(");
      out.print(mpv.getId());
      out.write(");\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("\t");

	  	}
	
      out.write("\r\n");
      out.write("  ");

	  }else{
  
      out.write("\r\n");
      out.write("\t\t\t  <tr class=\"rowodd\" align=\"center\">\r\n");
      out.write("\t\t\t    <td colspan=\"9\" height=\"50\">无相关数据</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("  ");
	  	
	  }
  
      out.write("\r\n");
      out.write("  <!-- ================================================ -->\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"96%\" border=\"0\" align=\"center\"><tr><td>");
      out.write('\r');
      out.write('\n');
if(pages != null && !pages.isEmpty()){
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>&nbsp;&nbsp;共");
      out.print(pages.getTotalCount());
      out.write('条');
      out.write('/');
      out.print(pages.getPageCount());
      out.write("页    </td>\r\n");
      out.write("    <td align=\"right\">\r\n");
      out.write("    \t");

    		PaginationCounter counter = new PaginationCounter(pages.getPageCount(),pages.getPageNumber(),9);
    		if(counter.hasPrevious()){ out.println("<a class='page' href='javascript:go2Page(1);'>1</a> ..."); }
    		for(int i = counter.getStart(); i<=counter.getEnd();i++){
    			if(i == pages.getPageNumber()){
    				out.println("<span class='currentPage'>"+i+"</span>");
    			}else{
    				out.println("<a class='page' href='javascript:go2Page("+i+");'>"+i+"</a>");
    			}
    		}
    		if(counter.hasNext()){ out.println("... <a class='page' href='javascript:go2Page("+pages.getPageCount()+");'>"+pages.getPageCount()+"</a>"); }
    	
      out.write("\r\n");
      out.write("    &nbsp;跳到：<input type=\"text\" size=\"");
      out.print(String.valueOf(pages.getPageCount()).length());
      out.write("\" maxlength=\"");
      out.print(String.valueOf(pages.getPageCount()).length());
      out.write("\" onKeypress=\"if (event.keyCode < 48 || event.keyCode > 57) event.returnValue = false;\" onKeyDown=\"if(event.keyCode == 13){ go2Page(this.value); }\" value=\"");
      out.print(pages.getPageNumber());
      out.write("\">页\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
}
      out.write('\r');
      out.write('\n');
      out.write("</td></tr></table>\r\n");
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

  private boolean _jspx_meth_auth_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f0 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f0.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(27,2) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f0.setTest("/admin/prepareUpdateModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(27,2) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f0.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f0 = _jspx_th_auth_005fif_005f0.doStartTag();
      if (_jspx_eval_auth_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f0.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f0 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f0.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(28,69) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f0.setValue("typeName");
    int _jspx_eval_ww_005fproperty_005f0 = _jspx_th_ww_005fproperty_005f0.doStartTag();
    if (_jspx_th_ww_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f1 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f1.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(32,2) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f1.setTest("/admin/prepareAddModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(32,2) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f1.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f1 = _jspx_th_auth_005fif_005f1.doStartTag();
      if (_jspx_eval_auth_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f1.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f2 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f2.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(37,2) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f2.setTest("/admin/deleteModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(37,2) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f2.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f2 = _jspx_th_auth_005fif_005f2.doStartTag();
      if (_jspx_eval_auth_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f2.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f3 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f3.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(47,2) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f3.setTest("/admin/auditModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(47,2) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f3.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f3 = _jspx_th_auth_005fif_005f3.doStartTag();
      if (_jspx_eval_auth_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f3.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f4 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f4.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(55,2) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f4.setTest("/admin/reAuditModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(55,2) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f4.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f4 = _jspx_th_auth_005fif_005f4.doStartTag();
      if (_jspx_eval_auth_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f4.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f4);
    }
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
    // /admin/english/modelAlbumTypePageEn.jsp(63,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("status");
    int _jspx_eval_ww_005fproperty_005f1 = _jspx_th_ww_005fproperty_005f1.doStartTag();
    if (_jspx_th_ww_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f5 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f5.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(87,4) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f5.setTest("/admin/auditAllModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(87,4) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f5.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f5 = _jspx_th_auth_005fif_005f5.doStartTag();
      if (_jspx_eval_auth_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f5.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f6 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f6.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(107,4) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f6.setTest("/admin/reAuditAllModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(107,4) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f6.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f6 = _jspx_th_auth_005fif_005f6.doStartTag();
      if (_jspx_eval_auth_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f6.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f7 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f7.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(126,4) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f7.setTest("/admin/deleteAllModelAlbumTypeEn.do");
    // /admin/english/modelAlbumTypePageEn.jsp(126,4) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f7.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f7 = _jspx_th_auth_005fif_005f7.doStartTag();
      if (_jspx_eval_auth_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f7.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_auth_005fif_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  auth:if
    com.newhc.admin.tag.IfTag _jspx_th_auth_005fif_005f8 = (com.newhc.admin.tag.IfTag) _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.get(com.newhc.admin.tag.IfTag.class);
    _jspx_th_auth_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_auth_005fif_005f8.setParent(null);
    // /admin/english/modelAlbumTypePageEn.jsp(145,2) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f8.setTest("/admin/modelAlbumEnPage.do");
    // /admin/english/modelAlbumTypePageEn.jsp(145,2) name = status type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_auth_005fif_005f8.setStatus("false");
    int[] _jspx_push_body_count_auth_005fif_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_auth_005fif_005f8 = _jspx_th_auth_005fif_005f8.doStartTag();
      if (_jspx_eval_auth_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("alert('对不起，您无此权限，请与系统管理员联系!');return;");
          int evalDoAfterBody = _jspx_th_auth_005fif_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_auth_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_auth_005fif_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_auth_005fif_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_auth_005fif_005f8.doFinally();
      _005fjspx_005ftagPool_005fauth_005fif_0026_005ftest_005fstatus.reuse(_jspx_th_auth_005fif_005f8);
    }
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
    // /admin/english/modelAlbumTypePageEn.jsp(154,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fhidden_005f0.setName("'pageNumber'");
    int _jspx_eval_ww_005fhidden_005f0 = _jspx_th_ww_005fhidden_005f0.doStartTag();
    if (_jspx_th_ww_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_ww_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fnobody.reuse(_jspx_th_ww_005fhidden_005f0);
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
    // /admin/english/modelAlbumTypePageEn.jsp(158,58) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("name");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
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
        if (_jspx_meth_ww_005fproperty_005f3(_jspx_th_ww_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\" == \"\"){\r\n");
        out.write("\t\t\talert(\"操作成功!\");\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\talert(\"");
        if (_jspx_meth_ww_005fproperty_005f4(_jspx_th_ww_005fif_005f0, _jspx_page_context))
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

  private boolean _jspx_meth_ww_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f3 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /WEB-INF/inc/response.jsp(8,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f3.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f3 = _jspx_th_ww_005fproperty_005f3.doStartTag();
    if (_jspx_th_ww_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f4 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /WEB-INF/inc/response.jsp(11,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f4.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f4 = _jspx_th_ww_005fproperty_005f4.doStartTag();
    if (_jspx_th_ww_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
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
        if (_jspx_meth_ww_005fproperty_005f5(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\" == \"\"){\r\n");
        out.write("\t\t\talert(\"操作失败，请稍候再试!\");\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\talert(\"");
        if (_jspx_meth_ww_005fproperty_005f6(_jspx_th_ww_005fif_005f1, _jspx_page_context))
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

  private boolean _jspx_meth_ww_005fproperty_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f5 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /WEB-INF/inc/response.jsp(19,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f5.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f5 = _jspx_th_ww_005fproperty_005f5.doStartTag();
    if (_jspx_th_ww_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    com.opensymphony.webwork.views.jsp.PropertyTag _jspx_th_ww_005fproperty_005f6 = (com.opensymphony.webwork.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(com.opensymphony.webwork.views.jsp.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f6.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /WEB-INF/inc/response.jsp(22,10) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f6.setValue("responseMessage");
    int _jspx_eval_ww_005fproperty_005f6 = _jspx_th_ww_005fproperty_005f6.doStartTag();
    if (_jspx_th_ww_005fproperty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f6);
    return false;
  }
}
