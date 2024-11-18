package org.apache.jsp.fckeditor.editor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fckeditor_html extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<!--\r\n");
      out.write(" * FCKeditor - The text editor for Internet - http://www.fckeditor.net\r\n");
      out.write(" * Copyright (C) 2003-2007 Frederico Caldeira Knabben\r\n");
      out.write(" *\r\n");
      out.write(" * == BEGIN LICENSE ==\r\n");
      out.write(" *\r\n");
      out.write(" * Licensed under the terms of any of the following licenses at your\r\n");
      out.write(" * choice:\r\n");
      out.write(" *\r\n");
      out.write(" *  - GNU General Public License Version 2 or later (the \"GPL\")\r\n");
      out.write(" *    http://www.gnu.org/licenses/gpl.html\r\n");
      out.write(" *\r\n");
      out.write(" *  - GNU Lesser General Public License Version 2.1 or later (the \"LGPL\")\r\n");
      out.write(" *    http://www.gnu.org/licenses/lgpl.html\r\n");
      out.write(" *\r\n");
      out.write(" *  - Mozilla Public License Version 1.1 or later (the \"MPL\")\r\n");
      out.write(" *    http://www.mozilla.org/MPL/MPL-1.1.html\r\n");
      out.write(" *\r\n");
      out.write(" * == END LICENSE ==\r\n");
      out.write(" *\r\n");
      out.write(" * Main page that holds the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>FCKeditor</title>\r\n");
      out.write("\t<meta name=\"robots\" content=\"noindex, nofollow\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"Cache-Control\" content=\"public\" />\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("// Instead of loading scripts and CSSs using inline tags, all scripts are\r\n");
      out.write("// loaded by code. In this way we can guarantee the correct processing order,\r\n");
      out.write("// otherwise external scripts and inline scripts could be executed in an\r\n");
      out.write("// unwanted order (IE).\r\n");
      out.write("\r\n");
      out.write("function LoadScript( url )\r\n");
      out.write("{\r\n");
      out.write("\tdocument.write( '<scr' + 'ipt type=\"text/javascript\" src=\"' + url + '\"><\\/scr' + 'ipt>' ) ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function LoadCss( url )\r\n");
      out.write("{\r\n");
      out.write("\tdocument.write( '<link href=\"' + url + '\" type=\"text/css\" rel=\"stylesheet\" />' ) ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Main editor scripts.\r\n");
      out.write("var sSuffix = ( /*@cc_on!@*/false ) ? 'ie' : 'gecko' ;\r\n");
      out.write("\r\n");
      out.write("LoadScript( 'js/fckeditorcode_' + sSuffix + '.js' ) ;\r\n");
      out.write("\r\n");
      out.write("// Base configuration file.\r\n");
      out.write("LoadScript( '../fckconfig.js' ) ;\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("if ( FCKBrowserInfo.IsIE )\r\n");
      out.write("{\r\n");
      out.write("\t// Remove IE mouse flickering.\r\n");
      out.write("\ttry\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.execCommand( 'BackgroundImageCache', false, true ) ;\r\n");
      out.write("\t}\r\n");
      out.write("\tcatch (e)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t// We have been reported about loading problems caused by the above\r\n");
      out.write("\t\t// line. For safety, let's just ignore errors.\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// Create the default cleanup object used by the editor.\r\n");
      out.write("\tFCK.IECleanup = new FCKIECleanup( window ) ;\r\n");
      out.write("\tFCK.IECleanup.AddItem( FCKTempBin, FCKTempBin.Reset ) ;\r\n");
      out.write("\tFCK.IECleanup.AddItem( FCK, FCK_Cleanup ) ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// The first function to be called on selection change must the the styles\r\n");
      out.write("// change checker, because the result of its processing may be used by another\r\n");
      out.write("// functions listening to the same event.\r\n");
      out.write("FCK.Events.AttachEvent( 'OnSelectionChange', function() { FCKStyles.CheckSelectionChanges() ; } ) ;\r\n");
      out.write("\r\n");
      out.write("// The config hidden field is processed immediately, because\r\n");
      out.write("// CustomConfigurationsPath may be set in the page.\r\n");
      out.write("FCKConfig.ProcessHiddenField() ;\r\n");
      out.write("\r\n");
      out.write("// Load the custom configurations file (if defined).\r\n");
      out.write("if ( FCKConfig.CustomConfigurationsPath.length > 0 )\r\n");
      out.write("\tLoadScript( FCKConfig.CustomConfigurationsPath ) ;\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("// Load configurations defined at page level.\r\n");
      out.write("FCKConfig_LoadPageConfig() ;\r\n");
      out.write("\r\n");
      out.write("FCKConfig_PreProcess() ;\r\n");
      out.write("\r\n");
      out.write("// Load the active skin CSS.\r\n");
      out.write("LoadCss( FCKConfig.SkinPath + 'fck_editor.css' ) ;\r\n");
      out.write("\r\n");
      out.write("// Load the language file.\r\n");
      out.write("FCKLanguageManager.Initialize() ;\r\n");
      out.write("LoadScript( 'lang/' + FCKLanguageManager.ActiveLanguage.Code + '.js' ) ;\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("// Initialize the editing area context menu.\r\n");
      out.write("FCK_ContextMenu_Init() ;\r\n");
      out.write("\r\n");
      out.write("FCKPlugins.Load() ;\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("// Set the editor interface direction.\r\n");
      out.write("window.document.dir = FCKLang.Dir ;\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("window.onload = function()\r\n");
      out.write("{\r\n");
      out.write("\tInitializeAPI() ;\r\n");
      out.write("\r\n");
      out.write("\tif ( FCKBrowserInfo.IsIE )\r\n");
      out.write("\t\tFCK_PreloadImages() ;\r\n");
      out.write("\telse\r\n");
      out.write("\t\tLoadToolbarSetup() ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function LoadToolbarSetup()\r\n");
      out.write("{\r\n");
      out.write("\tFCKeditorAPI._FunctionQueue.Add( LoadToolbar ) ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function LoadToolbar()\r\n");
      out.write("{\r\n");
      out.write("\tvar oToolbarSet = FCK.ToolbarSet = FCKToolbarSet_Create() ;\r\n");
      out.write("\r\n");
      out.write("\tif ( oToolbarSet.IsLoaded )\r\n");
      out.write("\t\tStartEditor() ;\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\toToolbarSet.OnLoad = StartEditor ;\r\n");
      out.write("\t\toToolbarSet.Load( FCKURLParams['Toolbar'] || 'Default' ) ;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function StartEditor()\r\n");
      out.write("{\r\n");
      out.write("\t// Remove the onload listener.\r\n");
      out.write("\tFCK.ToolbarSet.OnLoad = null ;\r\n");
      out.write("\r\n");
      out.write("\tFCKeditorAPI._FunctionQueue.Remove( LoadToolbar ) ;\r\n");
      out.write("\r\n");
      out.write("\tFCK.Events.AttachEvent( 'OnStatusChange', WaitForActive ) ;\r\n");
      out.write("\r\n");
      out.write("\t// Start the editor.\r\n");
      out.write("\tFCK.StartEditor() ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function WaitForActive( editorInstance, newStatus )\r\n");
      out.write("{\r\n");
      out.write("\tif ( newStatus == FCK_STATUS_ACTIVE )\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif ( FCKBrowserInfo.IsGecko )\r\n");
      out.write("\t\t\tFCKTools.RunFunction( window.onresize ) ;\r\n");
      out.write("\r\n");
      out.write("\t\t_AttachFormSubmitToAPI() ;\r\n");
      out.write("\r\n");
      out.write("\t\tFCK.SetStatus( FCK_STATUS_COMPLETE ) ;\r\n");
      out.write("\r\n");
      out.write("\t\t// Call the special \"FCKeditor_OnComplete\" function that should be present in\r\n");
      out.write("\t\t// the HTML page where the editor is located.\r\n");
      out.write("\t\tif ( typeof( window.parent.FCKeditor_OnComplete ) == 'function' )\r\n");
      out.write("\t\t\twindow.parent.FCKeditor_OnComplete( FCK ) ;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Gecko browsers doens't calculate well that IFRAME size so we must\r\n");
      out.write("// recalculate it every time the window size changes.\r\n");
      out.write("if ( FCKBrowserInfo.IsGecko )\r\n");
      out.write("{\r\n");
      out.write("\tfunction Window_OnResize()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif ( FCKBrowserInfo.IsOpera )\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\r\n");
      out.write("\t\tvar oCell = document.getElementById( 'xEditingArea' ) ;\r\n");
      out.write("\r\n");
      out.write("\t\tvar eInnerElement = oCell.firstChild ;\r\n");
      out.write("\t\tif ( eInnerElement )\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\teInnerElement.style.height = 0 ;\r\n");
      out.write("\t\t\teInnerElement.style.height = oCell.scrollHeight - 2 ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\twindow.onresize = Window_OnResize ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"height: 100%; table-layout: fixed\">\r\n");
      out.write("\t\t<tr id=\"xToolbarRow\" style=\"display: none\">\r\n");
      out.write("\t\t\t<td id=\"xToolbarSpace\" style=\"overflow: hidden\">\r\n");
      out.write("\t\t\t\t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr id=\"xCollapsed\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t<td id=\"xExpandHandle\" class=\"TB_Expand\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"TB_ExpandImg\" alt=\"\" src=\"images/spacer.gif\" width=\"8\" height=\"4\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr id=\"xExpanded\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t<td id=\"xTBLeftBorder\" class=\"TB_SideBorder\" style=\"width: 1px; display: none;\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"xCollapseHandle\" style=\"display: none\" class=\"TB_Collapse\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t<img class=\"TB_CollapseImg\" alt=\"\" src=\"images/spacer.gif\" width=\"8\" height=\"4\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td id=\"xToolbar\" class=\"TB_ToolbarSet\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"TB_SideBorder\" style=\"width: 1px\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td id=\"xEditingArea\" valign=\"top\" style=\"height: 100%\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
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
