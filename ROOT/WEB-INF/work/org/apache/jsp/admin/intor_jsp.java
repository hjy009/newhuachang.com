package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.com.netmovie.util.*;
import cn.com.netmovie.helper.*;
import java.util.*;
import com.newhc.admin.online.*;

public final class intor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/inc/common.jsp");
    _jspx_dependants.add("/WEB-INF/auth.tld");
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
      out.write("\r\n");

	List menuChList = (List)request.getAttribute("menuChList");
	List menuEnList = (List)request.getAttribute("menuEnList");
	List menuJpList = (List)request.getAttribute("menuJpList");

      out.write('\r');
      out.write('\n');

	OnlineManager manager = new OnlineManager(request,response);
	String userName = "";
	String name = "";
	Integer userId = new Integer(0);
	Integer type = new Integer(0);
	OnlineUser onlineUser = manager.getOnlineUser();
	if(onlineUser!=null){
		userName = onlineUser.getUsername();
		name = onlineUser.getName();
		userId = onlineUser.getId();
		type = onlineUser.getType();
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
if(menuChList!=null&&menuChList.size()>0){
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"tablenotice\">\r\n");
      out.write("     <tr>\r\n");
      out.write("     <td width=\"18\">&nbsp;</td>\r\n");
      out.write("      <td style=\"border:1px solid #b8cadb; background:#f8f8fa; padding:15px; line-height:21px;\">\r\n");
      out.write("      \t<h2 style=\" margin-bottom:15px;\"><img src=\"images/can1.jpg\" /> 中文资料管理：</h2>\r\n");
      out.write("       \t<ul class=\"list2\">\r\n");
      out.write("       \t");
for(int i=0;i<menuChList.size();i++){
			Map map = (Map)menuChList.get(i);
		
      out.write("\r\n");
      out.write("        \t<li>\r\n");
      out.write("        \t  <div class=\"l\"><img src=\"images/aa.jpg\" width=\"67\" height=\"62\" /></div><div class=\"r\"><a href=\"");
      out.print(map.get("code"));
      out.write('"');
      out.write('>');
      out.print(map.get("name"));
      out.write("</a></div>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        </ul>\r\n");
      out.write("      </td>\r\n");
      out.write("     <td width=\"18\">&nbsp;</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    \r\n");
      out.write("    </table>\r\n");
      out.write("    ");
}
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   ");
if(menuEnList!=null&&menuEnList.size()>0){
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"tablenotice\">\r\n");
      out.write("     <tr>\r\n");
      out.write("     <td width=\"18\">&nbsp;</td>\r\n");
      out.write("      <td style=\"border:1px solid #b8cadb; background:#f8f8fa; padding:15px; line-height:21px;\">\r\n");
      out.write("      \t<h2 style=\" margin-bottom:15px;\"><img src=\"images/can1.jpg\" /> 英文资料管理：</h2>\r\n");
      out.write("       \t<ul class=\"list2\">\r\n");
      out.write("       \t");
for(int i=0;i<menuEnList.size();i++){
			Map map = (Map)menuEnList.get(i);
		
      out.write("\r\n");
      out.write("        \t<li>\r\n");
      out.write("        \t  <div class=\"l\"><img src=\"images/aa.jpg\" width=\"67\" height=\"62\" /></div><div class=\"r\"><a href=\"");
      out.print(map.get("code"));
      out.write('"');
      out.write('>');
      out.print(map.get("name"));
      out.write("</a></div>\r\n");
      out.write("            </li>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        </ul>\r\n");
      out.write("      </td>\r\n");
      out.write("     <td width=\"18\">&nbsp;</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    \r\n");
      out.write("    </table>\r\n");
      out.write("    ");
}
      out.write(" \r\n");
      out.write("    ");
if(type.intValue()==1){
      out.write("\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"tablenotice\">\r\n");
      out.write("     <tr>\r\n");
      out.write("     <td width=\"18\">&nbsp;</td>\r\n");
      out.write("      <td style=\"border:1px solid #b8cadb; background:#f8f8fa; padding:15px; line-height:21px;\">\r\n");
      out.write("      \t<h2 style=\" margin-bottom:15px;\"><img src=\"images/can1.jpg\" /> 用户管理：</h2>\r\n");
      out.write("       \t<ul class=\"list2\">\r\n");
      out.write("            <li>\r\n");
      out.write("        \t  <div class=\"l\"><img src=\"images/fun5.jpg\" width=\"67\" height=\"62\" /></div><div class=\"r\"><a href=\"/admin/adminUserPage.do\">用户管理</a></div>\r\n");
      out.write("            </li>\r\n");
      out.write("        \t<li>\r\n");
      out.write("        \t  <div class=\"l\"><img src=\"images/fun1.jpg\" width=\"67\" height=\"62\" /></div><div class=\"r\"><a href=\"/admin/rolePage.do\">权限管理</a></div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("        \t  <div class=\"l\"><img src=\"images/fun12.jpg\" width=\"67\" height=\"62\" /></div><div class=\"r\"><a href=\"/admin/adminGroupPage.do\">角色管理</a></div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("        \t  <div class=\"l\"><img src=\"images/fun8.jpg\" width=\"67\" height=\"62\" /></div><div class=\"r\"><a href=\"/admin/menuPage.do\">菜单管理</a></div>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("        \t  <div class=\"l\"><img src=\"images/fun9.jpg\" width=\"67\" height=\"62\" /></div><div class=\"r\"><a href=\"/admin/adminUserLogPage.do\">日志管理</a></div>\r\n");
      out.write("            </li>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        </ul>\r\n");
      out.write("      </td>\r\n");
      out.write("     <td width=\"18\">&nbsp;</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    \r\n");
      out.write("    </table> \r\n");
      out.write("\t");
}
      out.write("\r\n");
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
