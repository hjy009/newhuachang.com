package org.apache.jsp.admin.chinese;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class playerFlash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=GBK\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/swfobject.js\"></script>\r\n");
      out.write("\t<title>Minimal Flowplayer setup</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>");
      if (_jspx_meth_ww_005fhidden_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_ww_005fhidden_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_ww_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,28,0\" width=\"600\" height=\"200\">\r\n");
      out.write("      <param name=\"movie\" value=\"/");
      if (_jspx_meth_ww_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("      <param name=\"quality\" value=\"high\" />\r\n");
      out.write("      <param name=\"wmode\" value=\"transparent\" />\r\n");
      out.write("      <embed src=\"/");
      if (_jspx_meth_ww_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("\" width=\"600\" height=\"200\" quality=\"high\" pluginspage=\"http://www.adobe.com/shockwave/download/download.cgi?P1_Prod_Version=ShockwaveFlash\" type=\"application/x-shockwave-flash\" wmode=\"transparent\" ></embed>\r\n");
      out.write("    </object>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_ww_005fhidden_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:hidden
    com.opensymphony.webwork.views.jsp.ui.HiddenTag _jspx_th_ww_005fhidden_005f0 = (com.opensymphony.webwork.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.HiddenTag.class);
    _jspx_th_ww_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fhidden_005f0.setParent(null);
    // /admin/chinese/playerFlash.jsp(15,7) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fhidden_005f0.setName("'path'");
    // /admin/chinese/playerFlash.jsp(15,7) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fhidden_005f0.setId("path");
    int _jspx_eval_ww_005fhidden_005f0 = _jspx_th_ww_005fhidden_005f0.doStartTag();
    if (_jspx_th_ww_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_ww_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_ww_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fhidden_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  ww:hidden
    com.opensymphony.webwork.views.jsp.ui.HiddenTag _jspx_th_ww_005fhidden_005f1 = (com.opensymphony.webwork.views.jsp.ui.HiddenTag) _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody.get(com.opensymphony.webwork.views.jsp.ui.HiddenTag.class);
    _jspx_th_ww_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fhidden_005f1.setParent(null);
    // /admin/chinese/playerFlash.jsp(16,3) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fhidden_005f1.setName("'imagePath'");
    // /admin/chinese/playerFlash.jsp(16,3) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fhidden_005f1.setId("imagePath");
    int _jspx_eval_ww_005fhidden_005f1 = _jspx_th_ww_005fhidden_005f1.doStartTag();
    if (_jspx_th_ww_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_ww_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fhidden_0026_005fname_005fid_005fnobody.reuse(_jspx_th_ww_005fhidden_005f1);
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
    // /admin/chinese/playerFlash.jsp(17,3) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f0.setValue("path");
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
    // /admin/chinese/playerFlash.jsp(19,34) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("path");
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
    // /admin/chinese/playerFlash.jsp(22,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("path");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
    return false;
  }
}
