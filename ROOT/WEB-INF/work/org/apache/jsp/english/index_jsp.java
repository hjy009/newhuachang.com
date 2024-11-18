package org.apache.jsp.english;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.newhc.admin.helper.NewStringHelper;
import java.util.*;
import java.sql.Timestamp;
import cn.com.netmovie.helper.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	List columnFlashList = (List) request.getAttribute("columnFlashList");
	List qiyeList = (List) request.getAttribute("qiyeList");
	List hyeList = (List) request.getAttribute("hyeList");
	List gjList = (List) request.getAttribute("gjList");
	List tzList = (List) request.getAttribute("tzList");
	List gsList = (List) request.getAttribute("gsList");
	List enterpriseList = (List) request.getAttribute("enterpriseList");
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"CXIC GROUP CONTAINERS COMPANY LIMITED\" />\r\n");
      out.write("<meta name=\"description\" content=\"CXIC GROUP CONTAINERS COMPANY LIMITED\" />\r\n");
      out.write("<meta name=\"author\" content=\"xiaohe\" />\r\n");
      out.write("<title>CXIC GROUP CONTAINERS COMPANY LIMITED-home page</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/english/css/style.css\" />\r\n");
      out.write("\r\n");
      out.write("<!--[if lte IE 6]>\r\n");
      out.write("<SCRIPT src=\"js/iepng.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write(" <![endif]-->\r\n");
      out.write("<SCRIPT src=\"js/tab.js\" type=\"text/javascript\"></SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction showDiv(n){\r\n");
      out.write("\t\tdocument.getElementById(n).style.display='block';\r\n");
      out.write("\t\tdocument.getElementById('bg').style.display='block';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction closeDiv(n){\r\n");
      out.write("\t\tdocument.getElementById(n).style.display='none';\r\n");
      out.write("\t\tdocument.getElementById('bg').style.display='none';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("<body style=\" background:#f8f8f7 url(/english/images/bg_body.jpg) repeat-x;\">\r\n");
      out.write("<div class=\"wrap\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/head.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- nav -->\r\n");
      out.write("  <div class=\"nav\">\r\n");
      out.write("    <ul class=\"navlist\">\r\n");
      out.write("      <li ><span class=\"hover\"><a href=\"/english/indexEn.do\" class=\"ahome\">Home</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\"><span><a href=\"/english/introWebEn.do\">About CXIC</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\"><span><a href=\"/english/cultureByVisionWebEn.do?id=36\">Company Culture</a></span></li>\r\n");
      out.write("      <li class=\"nlist2\"><span><a href=\"/english/queryQiyeNewsEn.do\">News Center</a></span></li>\r\n");
      out.write("      <li><span><a href=\"/english/queryEmployessEn.do\">Join Us</a></span></li>\r\n");
      out.write("      <li class=\"nlist3\"><span><a href=\"/english/queryProductEn.do?categoryId=1\">Products & Customers</a></span></li>\r\n");
      out.write("       <li class=\"nobg nlist2\"><span><a href=\"/english/queryModelContactEn.do\">Contact Us</a></span></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"cls\"></div>\r\n");
      out.write("    <div class=\"wel\">Welcome to CXIC!</div>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/time.jsp", out, true);
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- nav end -->\r\n");
      out.write("  <div class=\"ban\">\r\n");
      out.write("   <object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,28,0\" width=\"988\" height=\"366\">\r\n");
      out.write("              ");
if(columnFlashList!=null&&columnFlashList.size()>0){
					Map imageMap = (Map)columnFlashList.get(0);
			
      out.write(" \r\n");
      out.write("                <param name=\"movie\" value=\"/");
      out.print(imageMap.get("flash"));
      out.write("\" />\r\n");
      out.write("                <param name=\"quality\" value=\"high\" />\r\n");
      out.write("                <param name=\"wmode\" value=\"transparent\" />\r\n");
      out.write("                <embed src=\"/");
      out.print(imageMap.get("flash"));
      out.write("\" width=\"991\"  height=\"366\" quality=\"high\" pluginspage=\"http://www.adobe.com/shockwave/download/download.cgi?P1_Prod_Version=ShockwaveFlash\" type=\"application/x-shockwave-flash\" wmode=\"transparent\" ></embed>\r\n");
      out.write("              </object>\r\n");
      out.write("            ");
}else{
      out.write("\r\n");
      out.write("            暂无栏目图片\r\n");
      out.write("\t\t\t");

			}
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- main -->\r\n");
      out.write("  <div class=\"main\">\r\n");
      out.write("    <div class=\"left\">\r\n");
      out.write("      <div class=\"title\">\r\n");
      out.write("        <div class=\"more\"><a href=\"/english/queryQiyeNewsEn.do\"><img src=\"/english/images/more.jpg\" width=\"32\" height=\"6\" /></a></div>\r\n");
      out.write("        <span class=\"hover\" onmouseover=\"setTab('one',1,2)\" id=\"one1\">Company News</span> <i>|</i> <span onmouseover=\"setTab('one',2,2)\" id=\"one2\">Industry News</span> </div>\r\n");
      out.write("      <div class=\"leftcon\">\r\n");
      out.write("        <div id=\"con_one_1\">\r\n");
      out.write("          <ul class=\"list1\">\r\n");
      out.write("          \t\r\n");
      out.write("             ");

          		if(null!=qiyeList&qiyeList.size()>0){
          			for(int i=0;i<qiyeList.size();i++){
          				Map map = (Map)qiyeList.get(i);
          	 
      out.write("\r\n");
      out.write("            <li><span>");
      out.print(DateHelper.toString((Timestamp)map.get("pub_time"),"yyyy-MM-dd") );
      out.write("</span><a href=\"queryQiyeNewsDetailEn.do?newsId=");
      out.print(map.get("id"));
      out.write('"');
      out.write('>');
      out.print(NewStringHelper.truncate((String)map.get("title"),30,"...") );
      out.write("</a></li>\r\n");
      out.write("            ");
}}else{ 
      out.write("\r\n");
      out.write("            \t暂无\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"con_one_2\" style=\"display:none\">\r\n");
      out.write("          <ul class=\"list1\">\r\n");
      out.write("            ");

          		if(hyeList!=null&hyeList.size()>0){
          			for(int i=0;i<hyeList.size();i++){
          				Map map = (Map)hyeList.get(i);
          	 
      out.write("\r\n");
      out.write("           <li><span>");
      out.print(DateHelper.toString((Timestamp)map.get("pub_time"),"yyyy-MM-dd") );
      out.write("</span><a href=\"queryHyeNewsDetailEn.do?newsId=");
      out.print(map.get("id"));
      out.write('"');
      out.write('>');
      out.print(NewStringHelper.truncate((String)map.get("title"),30,"...") );
      out.write("</a></li>\r\n");
      out.write("            ");
}}else{ 
      out.write("\r\n");
      out.write("            \t暂无\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"middle\">\r\n");
      out.write("      <div class=\"title\">\r\n");
      out.write("        <div class=\"more\"><a href=\"/english/queryProductEn.do?categoryId=1\"><img src=\"/english/images/more.jpg\" width=\"32\" height=\"6\" /></a></div>\r\n");
      out.write("        <span class=\"hover\">Product</span>  </div>\r\n");
      out.write("      <div class=\"middlecon_t1\">\r\n");
      out.write("        <ul class=\"middlelist\">\r\n");
      out.write("          <li class=\"hover\" onclick=\"setTab('two',1,3)\" id=\"two1\">ISO Standard</li>\r\n");
      out.write("          <li onclick=\"setTab('two',2,3)\" id=\"two2\">Special</li>\r\n");
      out.write("          <li onclick=\"setTab('two',3,3)\" id=\"two3\">Tank</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"middlecon_t2\">\r\n");
      out.write("        <div id=\"con_two_1\">\r\n");
      out.write("          <DIV class=scroll>\r\n");
      out.write("            <DIV id=arrLeft_01 class=arrLeft></DIV>\r\n");
      out.write("            <DIV id=arrCont_01 class=arrCont>\r\n");
      out.write("              <ul class=\"arrlist\">\r\n");
      out.write("              \t   ");

	          		if(gjList!=null&gjList.size()>0){
	          			for(int i=0;i<gjList.size();i++){
	          				Map map = (Map)gjList.get(i);
          		 
      out.write("\r\n");
      out.write("                <li> <span class=\"l\">");
      out.print(map.get("name") );
      out.write("</span> <span class=\"r\"><a href=\"/english/queryProductEn.do?categoryId=1\"><img src=\"/");
      out.print(map.get("small_image") );
      out.write("\" width=\"87\" height=\"58\" /></a></span> </li>\r\n");
      out.write("                \r\n");
      out.write("                 \r\n");
      out.write("            \t  ");
}}else{ 
      out.write("\r\n");
      out.write("            \t\t暂无\r\n");
      out.write("           \t\t ");
} 
      out.write("\r\n");
      out.write("              </ul>\r\n");
      out.write("            </DIV>\r\n");
      out.write("            <DIV id=arrRright_01 class=arrRright></DIV>\r\n");
      out.write("          </DIV>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"con_two_2\" style=\"display:none\">\r\n");
      out.write("          <DIV class=scroll>\r\n");
      out.write("            <DIV id=arrLeft_02 class=arrLeft></DIV>\r\n");
      out.write("            <DIV id=arrCont_02 class=arrCont>\r\n");
      out.write("              <ul class=\"arrlist\">\r\n");
      out.write("                ");

	          		if(tzList!=null&tzList.size()>0){
	          			for(int i=0;i<tzList.size();i++){
	          				Map map = (Map)tzList.get(i);
          		 
      out.write("\r\n");
      out.write("                <li> <span class=\"l\">");
      out.print(map.get("name") );
      out.write("</span> <span class=\"r\"><a href=\"/english/querySpeciaIndexEn.do?categoryId=4\"><img src=\"/");
      out.print(map.get("small_image") );
      out.write("\" width=\"87\" height=\"58\" /></a></span> </li>\r\n");
      out.write("                  \r\n");
      out.write("            \t  ");
}}else{ 
      out.write("\r\n");
      out.write("            \t\t暂无\r\n");
      out.write("           \t\t ");
} 
      out.write("\r\n");
      out.write("           \t\t</ul>\r\n");
      out.write("            </DIV>\r\n");
      out.write("            <DIV id=arrRright_02 class=arrRright></DIV>\r\n");
      out.write("          </DIV>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"con_two_3\" style=\"display:none\">\r\n");
      out.write("          <DIV class=scroll>\r\n");
      out.write("            <DIV id=arrLeft_03 class=arrLeft></DIV>\r\n");
      out.write("            <DIV id=arrCont_03 class=arrCont>\r\n");
      out.write("              <ul class=\"arrlist\">\r\n");
      out.write("                ");

	          		if(gsList!=null&gsList.size()>0){
	          			for(int i=0;i<gsList.size();i++){
	          				Map map = (Map)gsList.get(i);
          		 
      out.write("\r\n");
      out.write("                <li> <span class=\"l\">");
      out.print(map.get("name") );
      out.write("</span> <span class=\"r\"><a href=\"/english/queryPottypeIndexEn.do?categoryId=10\"><img src=\"/");
      out.print(map.get("small_image") );
      out.write("\" width=\"87\" height=\"58\" /></a></span> </li>\r\n");
      out.write("                  \r\n");
      out.write("            \t  ");
}}else{ 
      out.write("\r\n");
      out.write("            \t\t暂无\r\n");
      out.write("           \t\t ");
} 
      out.write("\r\n");
      out.write("           \t\t \r\n");
      out.write("            \r\n");
      out.write("           \t\t</ul>\r\n");
      out.write("            </DIV>\r\n");
      out.write("            <DIV id=arrRright_03 class=arrRright></DIV>\r\n");
      out.write("          </DIV>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"right\">\r\n");
      out.write("      <div class=\"title\">\r\n");
      out.write("        <div class=\"more\"><a href=\"/english/enterprisesWebEn.do\"><img src=\"/english/images/more.jpg\" width=\"32\" height=\"6\" /></a></div>\r\n");
      out.write("        <span class=\"hover\">Member  Enterprises</span> </div>\r\n");
      out.write("      <div class=\"rightcon\">\r\n");
      out.write("        <h2>Win-win Cooperation, Value Creation</h2>\r\n");
      out.write("        <img src=\"/english/images/img01.jpg\" width=\"120\" height=\"83\" class=\"imgcss\" />\r\n");
      out.write("         ");

	          if(enterpriseList!=null&enterpriseList.size()>0){
	          	for(int i=0;i<enterpriseList.size();i++){
	          	Map map = (Map)enterpriseList.get(i);
         
      out.write("\r\n");
      out.write("         ");
if(i%2==0){
      out.write("\r\n");
      out.write("         <a href=\"/english/enterprisesDetailWebEn.do?enterId=");
      out.print(map.get("id"));
      out.write('"');
      out.write('>');
      out.print(map.get("name"));
      out.write("</a>\r\n");
      out.write("         ");
}else{ 
      out.write("\r\n");
      out.write("         |<a href=\"/english/enterprisesDetailWebEn.do?enterId=");
      out.print(map.get("id"));
      out.write('"');
      out.write('>');
      out.print(map.get("name"));
      out.write("</a>|\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("         ");
}}else{ 
      out.write("\r\n");
      out.write("          \t暂无\r\n");
      out.write("         ");
} 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- main end -->\r\n");
      out.write("  <!-- foot -->\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/english/foot.jsp", out, true);
      out.write("\r\n");
      out.write("  <!-- foot end -->\r\n");
      out.write("</div>\r\n");
      out.write("<SCRIPT language=javascript src=\"js/common.js\"></SCRIPT>\r\n");
      out.write("<SCRIPT language=javascript type=text/javascript>\r\n");
      out.write("\t\t\t\t  <!--//--><![CDATA[//><!--\r\n");
      out.write("\t\t\t\t  var focusScroll_01 = new ScrollPic();\r\n");
      out.write("\t\t\t\t  focusScroll_01.scrollContId\t= \"arrCont_01\"; //内容容器ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.arrLeftId\t  = \"arrLeft_01\";//左箭头ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.arrRightId\t = \"arrRright_01\"; //右箭头ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.frameWidth\t = 214;//显示框宽度\r\n");
      out.write("\t\t\t\t  focusScroll_01.pageWidth\t  = 214; //翻页宽度\r\n");
      out.write("\t\t\t\t  focusScroll_01.upright\t\t= false; //垂直滚动\r\n");
      out.write("\t\t\t\t  focusScroll_01.speed\t\t  = 20; //移动速度(单位毫秒，越小越快)\r\n");
      out.write("\t\t\t\t  focusScroll_01.space\t\t  = 20; //每次移动像素(单位px，越大越快)\r\n");
      out.write("\t\t\t\t  focusScroll_01.autoPlay\t\t= true; //自动播放\r\n");
      out.write("\t\t\t\t  focusScroll_01.autoPlayTime\t= 5; //自动播放间隔时间(秒)\r\n");
      out.write("\t\t\t\t  focusScroll_01.initialize(); //初始化\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t  //--><!]]>\r\n");
      out.write("\t\t\t</SCRIPT>\r\n");
      out.write("<SCRIPT language=javascript type=text/javascript>\r\n");
      out.write("\t\t\t\t  <!--//--><![CDATA[//><!--\r\n");
      out.write("\t\t\t\t  var focusScroll_01 = new ScrollPic();\r\n");
      out.write("\t\t\t\t  focusScroll_01.scrollContId\t= \"arrCont_02\"; //内容容器ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.arrLeftId\t  = \"arrLeft_02\";//左箭头ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.arrRightId\t = \"arrRright_02\"; //右箭头ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.frameWidth\t = 214;//显示框宽度\r\n");
      out.write("\t\t\t\t  focusScroll_01.pageWidth\t  = 214; //翻页宽度\r\n");
      out.write("\t\t\t\t  focusScroll_01.upright\t\t= false; //垂直滚动\r\n");
      out.write("\t\t\t\t  focusScroll_01.speed\t\t  = 20; //移动速度(单位毫秒，越小越快)\r\n");
      out.write("\t\t\t\t  focusScroll_01.space\t\t  = 20; //每次移动像素(单位px，越大越快)\r\n");
      out.write("\t\t\t\t  focusScroll_01.autoPlay\t\t= true; //自动播放\r\n");
      out.write("\t\t\t\t  focusScroll_01.autoPlayTime\t= 5; //自动播放间隔时间(秒)\r\n");
      out.write("\t\t\t\t  focusScroll_01.initialize(); //初始化\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t  //--><!]]>\r\n");
      out.write("\t\t\t</SCRIPT>\r\n");
      out.write("<SCRIPT language=javascript type=text/javascript>\r\n");
      out.write("\t\t\t\t  <!--//--><![CDATA[//><!--\r\n");
      out.write("\t\t\t\t  var focusScroll_01 = new ScrollPic();\r\n");
      out.write("\t\t\t\t  focusScroll_01.scrollContId\t= \"arrCont_03\"; //内容容器ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.arrLeftId\t  = \"arrLeft_03\";//左箭头ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.arrRightId\t = \"arrRright_03\"; //右箭头ID\r\n");
      out.write("\t\t\t\t  focusScroll_01.frameWidth\t = 214;//显示框宽度\r\n");
      out.write("\t\t\t\t  focusScroll_01.pageWidth\t  = 214; //翻页宽度\r\n");
      out.write("\t\t\t\t  focusScroll_01.upright\t\t= false; //垂直滚动\r\n");
      out.write("\t\t\t\t  focusScroll_01.speed\t\t  = 20; //移动速度(单位毫秒，越小越快)\r\n");
      out.write("\t\t\t\t  focusScroll_01.space\t\t  = 20; //每次移动像素(单位px，越大越快)\r\n");
      out.write("\t\t\t\t  focusScroll_01.autoPlay\t\t= true; //自动播放\r\n");
      out.write("\t\t\t\t  focusScroll_01.autoPlayTime\t= 5; //自动播放间隔时间(秒)\r\n");
      out.write("\t\t\t\t  focusScroll_01.initialize(); //初始化\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t  //--><!]]>\r\n");
      out.write("\t\t\t</SCRIPT>\r\n");
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
