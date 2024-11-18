package org.apache.jsp.chinese.album;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class dianzi_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String img1 = (String)request.getAttribute("img1");
	String img2 = (String)request.getAttribute("img2");
	String str1 = (String)request.getAttribute("str1");
	String str2 = (String)request.getAttribute("str2");
 
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD><TITLE>画册欣赏</TITLE>\r\n");
      out.write("<META content=\"text/html; charset=gb2312\" http-equiv=Content-Type>\r\n");
      out.write("<META content=IE=EmulateIE7 http-equiv=X-UA-Compatible><LINK rel=stylesheet type=text/css href=\"css/mian.css\"><LINK rel=stylesheet type=text/css href=\"css/white.css\">\r\n");
      out.write("<SCRIPT type=text/javascript src=\"/chinese/album/js/swfobject.js\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=text/javascript src=\"/chinese/album/js/flippingbook.js\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=text/javascript src=\"/chinese/album/js/jquery-1.4.2.min.js\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=text/javascript src=\"/chinese/album/js/scripts.js\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=text/javascript src=\"/chinese/album/js/light-box.js\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT id=__onDOMContentLoaded defer src=\"//:\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT>\r\n");
      out.write("    function OnWindowsReSize()\r\n");
      out.write("    { \r\n");
      out.write("        document.getElementById('mainbody').style.height = document.body.clientHeight;\r\n");
      out.write("    }\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<STYLE type=text/css media=screen>#fbContainer_911414844 {\r\n");
      out.write("\tVISIBILITY: hidden\r\n");
      out.write("}\r\n");
      out.write("html{overflow:hidden}\r\n");
      out.write("</STYLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY style=\"WIDTH: 100%; HEIGHT: 100%; overflow:hidden\" onload=OnWindowsReSize() onresize=OnWindowsReSize()>\r\n");
      out.write("<OBJECT style=\"VISIBILITY: visible\" id=fbContainer_911414844 classid=clsid:D27CDB6E-AE6D-11cf-96B8-444553540000 width=\"100%\" height=\"100%\"><PARAM NAME=\"_cx\" VALUE=\"37650\"><PARAM NAME=\"_cy\" VALUE=\"18150\"><PARAM NAME=\"FlashVars\" VALUE=\"allowPagesUnload=false&amp;alwaysOpened=false&amp;autoFlipSize=50&amp;backgroundColor=333A42&amp;backgroundImage=/chinese/album/images/bg.jpg&amp;backgroundImagePlacement=fit&amp;bookHeight=559&amp;bookWidth=824&amp;centerBook=true&amp;centerContent=true&amp;closeSpeed=3&amp;darkPages=false&amp;downloadComplete=Complete&amp;downloadSize=0 Kb&amp;downloadTitle=Download Book&amp;downloadURL=&amp;dropShadowEnabled=true&amp;dropShadowHideWhenFlipping=true&amp;dynamicShadowsDarkColor=0&amp;dynamicShadowsDepth=1&amp;dynamicShadowsLightColor=16777215&amp;enlargedImagesSet=");
      out.print(img2 );
      out.write("&amp;extXML=&amp;firstLastButtons=true&amp;firstPageNumber=1&amp;flipCornerAmount=70&amp;flipCornerAngle=45&amp;flipCornerPlaySound=false&amp;flipCornerPosition=top-right&amp;flipCornerRelease=true&amp;flipCornerStyle=first page only&amp;flipCornerVibrate=true&amp;flipOnClick=true&amp;flipSound=mp3/newspaper.mp3&amp;frameAlpha=100&amp;frameColor=16777215&amp;frameWidth=0&amp;freezeOnFlip=false&amp;fullscreenEnabled=false&amp;fullscreenHint=&amp;goToPageField=true&amp;gotoSpeed=3&amp;handOverCorner=true&amp;handOverPage=true&amp;hardcover=false&amp;hardcoverEdgeColor=16777215&amp;hardcoverSound=mp3/photo_album.mp3&amp;hardcoverThickness=3&amp;highlightHardcover=true&amp;loadOnDemand=true&amp;moveSpeed=2&amp;navigationBarPlacement=bottom&amp;navigationFlipOffset=30&amp;pageBackgroundColor=16777215&amp;pageLinksSet=");
      out.print(str2 );
      out.write("&amp;pagesSet=");
      out.print(img2 );
      out.write("&amp;playOnDemand=true&amp;preloaderType=Progress Bar&amp;preserveProportions=false&amp;printEnabled=true&amp;printTitle=Print pages&amp;rigidPages=false&amp;rigidPageSpeed=5&amp;scaleContent=true&amp;showUnderlyingPages=false&amp;slideshowAutoPlay=false&amp;slideshowButton=true&amp;slideshowDisplayDuration=3000&amp;smoothPages=true&amp;staticShadowsDarkColor=0&amp;staticShadowsDepth=1&amp;staticShadowsLightColor=16777215&amp;staticShadowsType=Asymmetric&amp;useCustomCursors=false&amp;zoomEnabled=true&amp;zoomHint=Double click to zoom in&amp;zoomHintEnabled=true&amp;zoomImageHeight=1347&amp;zoomImageWidth=992&amp;zoomingMethod=flash&amp;zoomOnClick=true&amp;zoomUIColor=9412262&amp;uniqueSuffix=911414844&amp;direction=LTR&amp;navigationBar=/chinese/album/swf/navigation-transparent.swf&amp;soundControlButton=true&amp;Ioader=true\"><PARAM NAME=\"Movie\" VALUE=\"/chinese/album/swf/flippingbook.swf\"><PARAM NAME=\"Src\" VALUE=\"/chinese/album/swf/flippingbook.swf\"><PARAM NAME=\"WMode\" VALUE=\"Opaque\"><PARAM NAME=\"Play\" VALUE=\"0\"><PARAM NAME=\"Loop\" VALUE=\"-1\"><PARAM NAME=\"Quality\" VALUE=\"High\"><PARAM NAME=\"SAlign\" VALUE=\"LT\"><PARAM NAME=\"Menu\" VALUE=\"-1\"><PARAM NAME=\"Base\" VALUE=\"\"><PARAM NAME=\"AllowScriptAccess\" VALUE=\"always\"><PARAM NAME=\"Scale\" VALUE=\"NoScale\"><PARAM NAME=\"DeviceFont\" VALUE=\"0\"><PARAM NAME=\"EmbedMovie\" VALUE=\"0\"><PARAM NAME=\"BGColor\" VALUE=\"333A42\"><PARAM NAME=\"SWRemote\" VALUE=\"\"><PARAM NAME=\"MovieData\" VALUE=\"\"><PARAM NAME=\"SeamlessTabbing\" VALUE=\"1\"><PARAM NAME=\"Profile\" VALUE=\"0\"><PARAM NAME=\"ProfileAddress\" VALUE=\"\"><PARAM NAME=\"ProfilePort\" VALUE=\"0\"><PARAM NAME=\"AllowNetworking\" VALUE=\"all\"><PARAM NAME=\"AllowFullScreen\" VALUE=\"true\"></OBJECT>\r\n");
      out.write("<SCRIPT language=JavaScript type=text/javascript>\r\n");
      out.write("flippingBook911414844 = new FlippingBook();\r\n");
      out.write("flippingBook911414844.pages = [\r\n");
      out.print(img1 );
      out.write("\r\n");
      out.write("];\r\n");
      out.write("\r\n");
      out.write("flippingBook911414844.enlargedImages = [\r\n");
      out.print(img1 );
      out.write("\r\n");
      out.write("];\r\n");
      out.write("\r\n");
      out.write("flippingBook911414844.pageLinks = [\r\n");
      out.print(str1 );
      out.write("\r\n");
      out.write("];\r\n");
      out.write("flippingBook911414844.settings.uniqueSuffix = \"911414844\";\r\n");
      out.write("flippingBook911414844.stageWidth = \"100%\";\r\n");
      out.write("flippingBook911414844.stageHeight = \"100%\";\r\n");
      out.write("flippingBook911414844.settings.direction = \"LTR\";\r\n");
      out.write("flippingBook911414844.settings.bookWidth = \"800\";\r\n");
      out.write("flippingBook911414844.settings.bookHeight = \"552\";\r\n");
      out.write("flippingBook911414844.settings.firstPageNumber = \"1\";\r\n");
      out.write("flippingBook911414844.settings.navigationBar = \"/chinese/album/swf/navigation-transparent.swf\";\r\n");
      out.write("flippingBook911414844.settings.navigationBarPlacement = \"bottom\";\r\n");
      out.write("flippingBook911414844.settings.pageBackgroundColor = 0xFFFFFF;\r\n");
      out.write("flippingBook911414844.settings.backgroundColor = \"333A42\";\r\n");
      out.write("flippingBook911414844.settings.backgroundImage = \"/chinese/album/images/bg.jpg\";\r\n");
      out.write("flippingBook911414844.settings.backgroundImagePlacement = \"fit\";\r\n");
      out.write("flippingBook911414844.settings.staticShadowsType = \"Asymmetric\";\r\n");
      out.write("flippingBook911414844.settings.staticShadowsDepth = \"1\";\r\n");
      out.write("flippingBook911414844.settings.autoFlipSize = \"50\";\r\n");
      out.write("flippingBook911414844.settings.centerBook = true;\r\n");
      out.write("flippingBook911414844.settings.scaleContent = true;\r\n");
      out.write("flippingBook911414844.settings.alwaysOpened = false;\r\n");
      out.write("flippingBook911414844.settings.flipCornerStyle = \"first page only\";\r\n");
      out.write("flippingBook911414844.settings.hardcover = false;\r\n");
      out.write("flippingBook911414844.settings.downloadURL = \"\";\r\n");
      out.write("flippingBook911414844.settings.downloadTitle = \"Download Book\";\r\n");
      out.write("flippingBook911414844.settings.downloadSize = \"0 Kb\";\r\n");
      out.write("flippingBook911414844.settings.allowPagesUnload = false;\r\n");
      out.write("flippingBook911414844.settings.fullscreenEnabled = false;\r\n");
      out.write("flippingBook911414844.settings.zoomEnabled = true;\r\n");
      out.write("flippingBook911414844.settings.zoomImageWidth = \"882\";\r\n");
      out.write("flippingBook911414844.settings.zoomImageHeight = \"1218\";\r\n");
      out.write("flippingBook911414844.settings.zoomUIColor = 0x8f9ea6;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("flippingBook911414844.settings.slideshowButton = true;\r\n");
      out.write("flippingBook911414844.settings.slideshowAutoPlay = false;\r\n");
      out.write("flippingBook911414844.settings.slideshowDisplayDuration = \"3000\";\r\n");
      out.write("flippingBook911414844.settings.goToPageField = true;\r\n");
      out.write("flippingBook911414844.settings.firstLastButtons = true;\r\n");
      out.write("flippingBook911414844.settings.printEnabled = true;\r\n");
      out.write("flippingBook911414844.settings.zoomingMethod = \"flash\";\r\n");
      out.write("flippingBook911414844.settings.soundControlButton = false;\r\n");
      out.write("flippingBook911414844.settings.showUnderlyingPages = false;\r\n");
      out.write("flippingBook911414844.settings.fullscreenHint = \"\";\r\n");
      out.write("flippingBook911414844.settings.zoomHintEnabled = \"true\";\r\n");
      out.write("flippingBook911414844.settings.zoomOnClick = true;\r\n");
      out.write("flippingBook911414844.settings.moveSpeed = \"2\";\r\n");
      out.write("flippingBook911414844.settings.closeSpeed = \"3\";\r\n");
      out.write("flippingBook911414844.settings.gotoSpeed = \"3\";\r\n");
      out.write("flippingBook911414844.settings.rigidPageSpeed = \"5\";\r\n");
      out.write("flippingBook911414844.settings.zoomHint = \" 请双击\\r 浏览大图\";\r\n");
      out.write("flippingBook911414844.settings.printTitle = \"Print pages\";\r\n");
      out.write("flippingBook911414844.settings.downloadComplete = \"Complete\";\r\n");
      out.write("flippingBook911414844.settings.dropShadowEnabled = true;\r\n");
      out.write("flippingBook911414844.settings.flipSound = \"mp3/newspaper.mp3\";\r\n");
      out.write("flippingBook911414844.settings.hardcoverSound = \"mp3/photo_album.mp3\";\r\n");
      out.write("flippingBook911414844.settings.preloaderType = \"Progress Bar\";\r\n");
      out.write("flippingBook911414844.settings.Ioader = true;\r\n");
      out.write("flippingBook911414844.settings.frameColor = 0xFFFFFF;\r\n");
      out.write("flippingBook911414844.settings.frameWidth = \"0\";\r\n");
      out.write("flippingBook911414844.containerId = \"fbContainer_911414844\";\r\n");
      out.write("flippingBook911414844.create(\"/chinese/album/swf/flippingbook.swf\");\r\n");
      out.write("jQuery.noConflict();\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</BODY>\r\n");
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
}
