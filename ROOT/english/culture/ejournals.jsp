<%@ taglib prefix="ww" uri="webwork" %>
<%@ page import="java.util.*"%>
<%@ page import="cn.com.netmovie.util.*"%>
<%

	List columnFlashList = (List) request.getAttribute("columnFlashList");
	Pagination pageUtil = (Pagination)request.getAttribute("pages");
	List list = (List)pageUtil.getList();
	List mptList = (List) request.getAttribute("mptList");
	Integer typeId = (Integer) request.getAttribute("typeId");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="CXIC GROUP CONTAINERS COMPANY LIMITED-Company Culture" />
<meta name="description" content="CXIC GROUP CONTAINERS COMPANY LIMITED-Company Culture" />
<meta name="author" content="xiaohe" />
<title>CXIC GROUP CONTAINERS COMPANY LIMITED-Company Culture</title>
<link rel="stylesheet" type="text/css" href="/english/css/style.css" />
<!--[if lte IE 6]>
<SCRIPT src="../js/iepng.js" type="text/javascript"></SCRIPT>
 <![endif]-->
<SCRIPT src="/english/js/tab.js" type="text/javascript"></SCRIPT>
<script language="javascript">
	function gotoPage(pno){
		url = "/english/queryEjournalsEn.do?typeId="+<%=typeId%>+"&pageNumber="+pno;
		window.location.href=url;
	}
</script>
</head>
<body>
<div class="footbg">
  <div class="wrap">
      <jsp:include flush="true" page="/english/head.jsp"></jsp:include>
    <!-- nav -->
    <div class="nav">
      <ul class="navlist">
        <li ><span><a href="/english/indexEn.do" class="ahome">Home</a></span></li>
      <li class="nlist2" ><span><a href="/english/introWebEn.do">About CXIC</a></span></li>
      <li class="nlist2"   ><span class="hover"><a href="/english/cultureByVisionWebEn.do?id=36">Company Culture</a></span></li>
      <li class="nlist2"><span><a href="/english/queryQiyeNewsEn.do">News Center</a></span></li>
      <li><span><a href="/english/queryEmployessEn.do">Join Us</a></span></li>
      <li class="nlist3"><span><a href="/english/queryProductEn.do?categoryId=1">Products & Customers</a></span></li>
       <li class="nobg nlist2" ><span><a href="/english/queryModelContactEn.do">Contact Us</a></span></li>
      </ul>
      <div class="cls"></div>
      
    <div class="subnav">
     <%--
     <a href="/english/cultureWeb.do?id=29">集团纲领</a>   
     <a href="/english/cultureByDutyWeb.do?id=35">社会责任</a>      
    --%>
     <a href="/english/cultureByVisionWebEn.do?id=36">Vision and Mission </a>
    <a href="/english/cultureByCoreWebEn.do?id=38">Core Values</a>      
    <a href="/english/cultureByTargetWebEn.do?id=39">Business Goals</a>      
    <a href="/english/cultureByEnterpriseWebEn.do?id=33">Spirit and Attitude</a> 
    <a href="/english/cultureByCustomerWebEn.do?id=34">Customers and Employees</a>  
    <a href="queryAlbumTypeEn.do">E-Brochure</a>    
    <a href="/english/queryEjournalsEn.do?typeId=13">CXIC Publications</a>
    </div>
     <jsp:include flush="true" page="/english/time.jsp"></jsp:include>
    </div>
    <!-- nav end -->
    
    <div class="mban">
       <%if(columnFlashList!=null&&columnFlashList.size()>0){
				Map imageMap = (Map)columnFlashList.get(0);
			%> 
				 <img src="/<%=imageMap.get("path")%>" width="990" height="245" />
				 <%if(imageMap.get("link")!=null&&((String)imageMap.get("link")).length()>0){%>
	  				<a href="<%=imageMap.get("link")%>" target="_blank"><img src="/english/images/columnLink.gif" width="990" height="245" /></a>
					<%}%>
            <%}else{%>
            暂无栏目图片
			<%
			}%>
  
    </div>
    
    <!-- main -->
    <div class="mmain">
      <div class="mleft">
        <h2> <span class="sp_t1">Company Culture</span>  </h2>
        <div class="mleftbox">
          <ul class="leftlist1">
              		 <%--
                    	<li ><a href="/english/cultureWeb.do?id=29">集团纲领</a></li>
                    	 <li><a href="/english/cultureByDutyWeb.do?id=35">社会责任</a></li>	 
                        --%>
                          <li><a href="/english/cultureByVisionWebEn.do?id=36">Vision and Mission</a></li>	
                        <li><a  href="/english/cultureByCoreWebEn.do?id=38">Core Values</a></li>
                        <li><a href="/english/cultureByTargetWebEn.do?id=39">Business Goals</a></li>
                        <li><a href="/english/cultureByEnterpriseWebEn.do?id=33">Spirit and Attitude</a></li>
                        <li><a href="/english/cultureByCustomerWebEn.do?id=34">Customers and Employees</a></li>
                        <li><a href="queryAlbumTypeEn.do">E-Brochure</a></li>
                  		<li class="hover"><a href="javascript:void(0);" onclick="setTab22('dd1','pp1')" id="pp1">CXIC Publications</a>
                        	<div  id="dd1" style="display:block;">
                        		<ul>
                       				<%
                       					if (mptList != null && mptList.size() > 0) {
                       				 		for (int i = 0; i < mptList.size(); i++) {
                       				 		Map mptMap = (Map) mptList.get(i);
                       				 %>
                       				 <li <%if(typeId.equals(mptMap.get("id"))){ %> class="hover" style="padding-top: 10px"<%} %> onclick="setTab22('ddd1','ppp1')" id="ppp1">
                       				 	<a  href="/english/queryEjournalsEn.do?typeId=<%=mptMap.get("id") %>"><%=mptMap.get("name")%></a>
				                     </li>
                       				<%} %>
                       				<%} %>
                        		</ul>
                              </div>
                        </li>
          </ul>
        </div>
        
       		 <jsp:include flush="true" page="/english/left.jsp"></jsp:include>
        
      </div>
      
      <!-- mright -->
      <div class="mright">
        <div class="curr"> Your location-<a href="/english/cultureWebEn.do?id=29">Company Culture</a>-CXIC Publications </div>
        <div class="mtitle">
          <h2>CXIC Publications</h2>
        </div>
        <div class="ejournals">
          <ul>
          	<%if(list!=null&&list.size()>0){ 
          		for(int i = 0 ; i<list.size() ; i++){
          			Map map = (Map)list.get(i);
          	%>
            <li <%if(i==2||i==5){ %> class="li3d" <%}%> ><a href="/english/queryEjournalsDetailEn.do?periodicalId=<%=map.get("id") %>" target="_blank"><img class="ebook" src="/<%=map.get("image_path") %>" width="179" height="244" /></a><a class="ebookname" href="/english/queryEjournalsDetailEn.do?periodicalId=<%=map.get("id") %>"><span>◇</span> <%=map.get("name") %></a></li>
            
            	<%}%>
            <%}%>
          
          </ul>
        </div>
        <div class="cls"></div>
                   
           <div class="pages" style="margin-top:15px;">
              
             <%if(pageUtil.getPageNumber()<2){%><a class="fanye fyover">Page Up</a><%}else{%><a  class="fanye fyover" href="javascript:gotoPage(<%=pageUtil.getPageNumber()-1%>)" >Page Up</a><%}%>
			<%if((pageUtil.getPageNumber()-2)>=1){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()-2%>)"><%=pageUtil.getPageNumber()-2%></a><%}%><%if((pageUtil.getPageNumber()-1)>=1){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()-1%>)"><%=pageUtil.getPageNumber()-1%></a><%}%>
			<span><%=pageUtil.getPageNumber()%></span>
			<%if((pageUtil.getPageNumber()+1)<=pageUtil.getPageCount()){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()+1%>)"><%=pageUtil.getPageNumber()+1%></a><%}%><%if((pageUtil.getPageNumber()+2)<=pageUtil.getPageCount()){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()+2%>)"><%=pageUtil.getPageNumber()+2%></a><%}%>
                            
                            <!--下一页-->	
			<%if(pageUtil.getPageCount()<pageUtil.getPageNumber()+1){%><a class="fanye fyover" >Page Down</a><%}else{%><a  class="fanye fyover" href="javascript:gotoPage(<%=pageUtil.getPageNumber()+1%>)" >Page Down</a><%}%> total<%=pageUtil.getTotalCount()%>strip  current<%=pageUtil.getPageNumber()%>/<%=pageUtil.getPageCount()%>page
                      
           </div>
      </div>
      <!-- mright end --> 
      
    </div>
    <!-- main end --> 
    <!-- foot -->
    <jsp:include flush="true" page="/english/foot.jsp"></jsp:include>
    <!-- foot end --> 
    
  </div>
</div>
</body>
</html>
