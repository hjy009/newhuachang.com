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
<meta name="keywords" content="新华昌集团有限公司" />
<meta name="description" content="新华昌集团有限公司" />
<meta name="author" content="xiaohe" />
<title>新华昌集团有限公司-企业文化</title>
<link rel="stylesheet" type="text/css" href="/chinese/css/style.css" />
<!--[if lte IE 6]>
<SCRIPT src="../js/iepng.js" type="text/javascript"></SCRIPT>
 <![endif]-->
<SCRIPT src="/chinese/js/tab.js" type="text/javascript"></SCRIPT>
<script language="javascript">
	function gotoPage(pno){
		url = "/chinese/queryEjournals.do?typeId="+<%=typeId%>+"&pageNumber="+pno;
		window.location.href=url;
	}
</script>
</head>
<body>
<div class="footbg">
  <div class="wrap">
      <jsp:include flush="true" page="/chinese/head.jsp"></jsp:include>
    <!-- nav -->
    <div class="nav">
      <ul class="navlist">
       <li style="width:80px;" ><a href="/chinese/index.do" class="ahome">首页</a></li>
      <li ><a href="/chinese/introWeb.do">新华昌简介</a></li>
      <li class="hover"><a href="/chinese/cultureByVisionWeb.do?id=36">企业文化</a></li>
      <li><a href="/chinese/queryQiyeNews.do">新闻中心</a></li>
      <li><a href="/chinese/queryEmployess.do">员工与招聘</a></li>
      <li><a href="/chinese/queryProduct.do?categoryId=1">产品与客户</a></li>
      <li class="nobg" ><a href="/chinese/queryModelContact.do">联系我们</a></li>
      </ul>
      <div class="cls"></div>
      
    <div class="subnav">
     <%--
     <a href="/chinese/cultureWeb.do?id=29">集团纲领</a>   
     <a href="/chinese/cultureByDutyWeb.do?id=35">社会责任</a>      
    --%>
    <a href="/chinese/cultureByVisionWeb.do?id=36">愿景与使命</a>
    <a href="/chinese/cultureByCoreWeb.do?id=31">核心价值观</a>      
    <a href="/chinese/cultureByTargetWeb.do?id=32">企业目标</a>      
    <a href="/chinese/cultureByEnterpriseWeb.do?id=33">精神与作风</a> 
    <a href="/chinese/cultureByCustomerWeb.do?id=34">客户与员工</a>      
    <a href="queryAlbumType.do">电子画册</a>
    <a href="/chinese/queryEjournals.do?typeId=13">新华昌刊物</a>
    </div>
     <jsp:include flush="true" page="/chinese/time.jsp"></jsp:include>
    </div>
    <!-- nav end -->
    
    <div class="mban">
       <%if(columnFlashList!=null&&columnFlashList.size()>0){
				Map imageMap = (Map)columnFlashList.get(0);
			%> 
				 <img src="/<%=imageMap.get("path")%>" width="990" height="245" />
				 <%if(imageMap.get("link")!=null&&((String)imageMap.get("link")).length()>0){%>
	  				<a href="<%=imageMap.get("link")%>" target="_blank"><img src="/chinese/images/columnLink.gif" width="990" height="245" /></a>
					<%}%>
            <%}else{%>
            暂无栏目图片
			<%
			}%>
  
    </div>
    
    <!-- main -->
    <div class="mmain">
      <div class="mleft">
        <h2> <span class="sp_t1">企业文化</span>  </h2>
        <div class="mleftbox">
          <ul class="leftlist1">
              		 <%--
                    	<li ><a href="/chinese/cultureWeb.do?id=29">集团纲领</a></li>
                    	 <li><a href="/chinese/cultureByDutyWeb.do?id=35">社会责任</a></li>	 
                        --%>
                        <li><a href="/chinese/cultureByVisionWeb.do?id=36">愿景与使命</a></li>	
                        <li><a href="/chinese/cultureByCoreWeb.do?id=31">核心价值观</a></li>
                        <li><a href="/chinese/cultureByTargetWeb.do?id=32">企业目标</a></li>
                        <li><a href="/chinese/cultureByEnterpriseWeb.do?id=33">精神与作风</a></li>
                        <li><a href="/chinese/cultureByCustomerWeb.do?id=34">客户与员工</a></li>
                        <li><a href="queryAlbumType.do">电子画册</a></li>
                  		<li class="hover"><a class="hover" href="javascript:void(0);" onclick="setTab22('dd1','pp1')" id="pp1">新华昌刊物</a>
                        	<div  id="dd1" style="display:block;">
                        		<ul>
                       				<%
                       					if (mptList != null && mptList.size() > 0) {
                       				 		for (int i = 0; i < mptList.size(); i++) {
                       				 		Map mptMap = (Map) mptList.get(i);
                       				 %>
                       				 <li <%if(typeId.equals(mptMap.get("id"))){ %> class="hover" style="padding-top: 10px"<%} %> onclick="setTab22('ddd1','ppp1')" id="ppp1">
                       				 	<a  href="/chinese/queryEjournals.do?typeId=<%=mptMap.get("id") %>"><%=mptMap.get("name")%></a>
				                     </li>
                       				<%} %>
                       				<%} %>
                        		</ul>
                              </div>
                        </li>
          </ul>
        </div>
        
       		 <jsp:include flush="true" page="/chinese/left.jsp"></jsp:include>
        
      </div>
      
      <!-- mright -->
      <div class="mright">
        <div class="curr"> 您的位置-<a href="/chinese/cultureWeb.do?id=29">企业文化</a>-新华昌刊物 </div>
        <div class="mtitle">
          <h2>新华昌刊物</h2>
        </div>
        <div class="ejournals">
          <ul>
          	<%if(list!=null&&list.size()>0){ 
          		for(int i = 0 ; i<list.size() ; i++){
          			Map map = (Map)list.get(i);
          	%>
            <li <%if(i==2||i==5){ %> class="li3d" <%}%> ><a href="/chinese/queryEjournalsDetail.do?periodicalId=<%=map.get("id") %>" target="_blank"><img class="ebook" src="/<%=map.get("image_path") %>" width="179" height="244" /></a><a class="ebookname" href="/chinese/queryEjournalsDetail.do?periodicalId=<%=map.get("id") %>"><span>◇</span> <%=map.get("name") %></a></li>
            
            	<%}%>
            <%}%>
          
          </ul>
        </div>
        <div class="cls"></div>
                   
           <div class="pages" style="margin-top:15px;">
              
             <%if(pageUtil.getPageNumber()<2){%><a class="fanye fyover">上一页</a><%}else{%><a  class="fanye fyover" href="javascript:gotoPage(<%=pageUtil.getPageNumber()-1%>)" >上一页</a><%}%>
			<%if((pageUtil.getPageNumber()-2)>=1){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()-2%>)"><%=pageUtil.getPageNumber()-2%></a><%}%><%if((pageUtil.getPageNumber()-1)>=1){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()-1%>)"><%=pageUtil.getPageNumber()-1%></a><%}%>
			<span><%=pageUtil.getPageNumber()%></span>
			<%if((pageUtil.getPageNumber()+1)<=pageUtil.getPageCount()){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()+1%>)"><%=pageUtil.getPageNumber()+1%></a><%}%><%if((pageUtil.getPageNumber()+2)<=pageUtil.getPageCount()){%><a class="bl" href="javascript:gotoPage(<%=pageUtil.getPageNumber()+2%>)"><%=pageUtil.getPageNumber()+2%></a><%}%>
                            
                            <!--下一页-->	
			<%if(pageUtil.getPageCount()<pageUtil.getPageNumber()+1){%><a class="fanye fyover" >下一页</a><%}else{%><a  class="fanye fyover" href="javascript:gotoPage(<%=pageUtil.getPageNumber()+1%>)" >下一页</a><%}%> 总<%=pageUtil.getTotalCount()%>条  当前<%=pageUtil.getPageNumber()%>/<%=pageUtil.getPageCount()%>页
                      
           </div>
      </div>
      <!-- mright end --> 
      
    </div>
    <!-- main end --> 
    <!-- foot -->
    <jsp:include flush="true" page="/chinese/foot.jsp"></jsp:include>
    <!-- foot end --> 
    
  </div>
</div>
</body>
</html>
