<%@ include file="/WEB-INF/inc/common.jsp"%>
<%@ page import="com.newhc.admin.action.user.view.ModelAdvertiseView"%>
<%@ page import="com.newhc.admin.entity.Dictionary"%>
<%@ page import="com.newhc.admin.entity.ModelAdvertise"%>
<%@ page import="com.newhc.admin.cache.DictionaryCache"%>
<%@ page import="cn.com.netmovie.util.*"%>
<%@ page import="cn.com.netmovie.helper.*"%>
<%@ page import="java.util.*"%>
<%
	Pagination pages = (Pagination)request.getAttribute("pages");
	List typeList = (List)request.getAttribute("typeList");
	List statusList = (List)request.getAttribute("statusList");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>招工信息管理</title>
<%@ include file="/WEB-INF/inc/default.jsp"%>
<script language="javascript">
	function go2Page(page){
		var form = findById("form");
		form.pageNumber.value = page;
		form.action = "modelRecruitPage.do";
		form.submit();
	}
	function queryModelRecruit(id){
		if(openDialog("queryModelRecruit.do?id="+id,"查看招工信息",550,300) =="SUCCESS") refresh();
	}
	function prepareAddModelRecruit(){
	<auth:if test="/admin/prepareAddModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
		if(openDialog("prepareAddModelRecruit.do","新增招工信息",850,300) =="SUCCESS") refresh();
	}
	function prepareUpdateModelRecruit(id){
	<auth:if test="/admin/prepareUpdateModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
		if(openDialog("prepareUpdateModelRecruit.do?id="+id,"修改招工信息",850,300) =="SUCCESS") refresh();
	}
	function auditModelRecruit(id,pageId){
	<auth:if test="/admin/auditModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
		if(confirm("是否审核此动态id：["+pageId+"] ？") == false) return ;
		var params = 'id='+id;
		var url = 'auditModelRecruit.do';
		new Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });
	}
	
	function reAuditModelRecruit(id,pageId){
	<auth:if test="/admin/reAuditModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
		if(confirm("是否重审核此动态id：["+pageId+"] ？") == false) return ;
		var params = 'id='+id;
		var url = 'reAuditModelRecruit.do';
		new Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });
	}
	function deleteModelRecruit(id,pageId){
	<auth:if test="/admin/deleteModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
		if(confirm("是否删除此动态id：["+pageId+"] ？") == false) return ;
		var params = 'id='+id;
		var url = 'deleteModelRecruit.do';
		new Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });
	
	}
	
	checkit = true;
	function   SelectAll(){      
	 var  aa = document.getElementsByName("productId");      
	    if(checkit){      
	     for(i=0;i<aa.length;i++)      
	        aa.item(i).checked=true;      
	        checkit   =   false;      
	     }      
	     else{for   (i=0;i<aa.length;i++)      
	       aa.item(i).checked=false;      
	        checkit   =   true;      
	      }      
	  }
	  
	   function  shenhe(){
	   <auth:if test="/admin/updateAllModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
	   	var objs=document.getElementsByName("productId");
	   	var ary ="";
		    for(i=0;i<objs.length;i++) {
		        if(objs[i].checked) {
		            ary+=objs[i].value+",";
		       	}
		    }
		    if(ary.length<1) {
				alert("至少选择一个招工信息进行审核");
				return;
			}
			
			if(confirm("是否批量审核您所选的选项 ？") == false) return ;
			var params = 'ShenHeId='+ary;
			var url = 'updateAllModelRecruit.do';
			new Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });
	   }
	   function  reShenhe(){
	   <auth:if test="/admin/reUpdateAllModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
	   	var objs=document.getElementsByName("productId");
	   	var ary ="";
		    for(i=0;i<objs.length;i++) {
		        if(objs[i].checked) {
		            ary+=objs[i].value+",";
		       	}
		    }
		    if(ary.length<1) {
				alert("至少选择一个招工信息进行重审核");
				return;
			}
			
			if(confirm("是否批量重审核您所选的选项 ？") == false) return ;
			var params = 'ShenHeId='+ary;
			var url = 'reUpdateAllModelRecruit.do';
			new Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });
	   }
	function  deleteAll(){
	   <auth:if test="/admin/deleteAllModelRecruit.do" status="false">alert('对不起，您无此权限，请与系统管理员联系!');return;</auth:if>
	   	var objs=document.getElementsByName("productId");
	   	var ary ="";
		    for(i=0;i<objs.length;i++) {
		        if(objs[i].checked) {
		            ary+=objs[i].value+",";
		       	}
		    }
		    if(ary.length<1) {
				alert("至少选择一个招工信息进行删除");
				return;
			}
			
			if(confirm("是否批量删除您所选的选项 ？") == false) return ;
			var params = 'ShenHeId='+ary;
			var url = 'deleteAllModelRecruit.do';
			new Ajax.Request( url, { method: 'get', parameters: params, onComplete: commonReponse });
	   }
	function init(){
		doSelect('status',"<ww:property value='status'/>");
		doSelect('type',"<ww:property value='type'/>");
		highLightInit('row', 'rowover', 'rowselected');
	}
	function refresh(){
		var form = findById("form");
		form.action = "modelRecruitPage.do";
		form.submit();
	}
</script>
</head>
<body>
<table width="96%" align="center" border="0"><tr><td><div class="title">招工信息管理</div></td></tr></table>
<table width="96%" cellspacing="1" cellpadding="1" align="center">
	<form id='form' action="" method="POST">
	  <ww:hidden name="'pageNumber'" />
	  <tr>
		<td style="border:0;" >
			职位：<input id="name" name="name" size="11" value="<ww:property value='name'/>">
			&nbsp;状态：<select id="status" name="status">
							<%if(statusList!=null&&statusList.size()>0){%>
							<option value="">全部</option>
								<%for(Iterator it = statusList.iterator();it.hasNext();){
									Dictionary dic = (Dictionary)it.next();
								%>
									<option value="<%=dic.getCode()%>"><%=dic.getValue()%></option>
								<%}%>
							<%}%>
						 </select>
			&nbsp;&nbsp;<input type="button" name="search" value=" 查 询 " class="mainoption" onClick="javascript:go2Page(1);">
			&nbsp;&nbsp;<input type="button" name="add" value="新增招工信息..." class="mainoption" onClick="javascript:prepareAddModelRecruit();">
			&nbsp;&nbsp; <input type="button" value="批量审核" class="tjan" onClick="javascript:shenhe();"/>
			&nbsp;&nbsp; <input type="button" value="批量重审核" class="tjan" onClick="javascript:reShenhe();"/>
			&nbsp;&nbsp; <input type="button" value="批量删除" class="tjan" onClick="javascript:deleteAll();"/>
		</td>
	  </tr>
	</form>
</table>
<table width="96%"  class="tborder" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr class="theader" align="center">
   <th> 
  	 	<input type="checkbox"      onclick="javascript:SelectAll();">
  	 </th>
  	<th>编号</th>
  	<th>职位</th>
  	<th>公司名称</th>
  	<th>工作地点</th>
	<th>联系人</th>
	<th>状态</th>
	<th>创建时间</th>
	<th>创建者</th>
	<th>操作</th>
  </tr>
  <!-- ================ 显示各行数据 ================ -->
  <%
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
	  		ModelAdvertiseView uv = (ModelAdvertiseView)it.next();
	  		String rowClass = (count % 2 == 0)?"roweven":"rowodd";
	  		
	%>
			  <tr class="<%=rowClass%>" align="center" id="row_<%=count-1%>">
			     <td width="3%"><input type="checkbox" name="productId" value="<%=uv.getId()%>"></td>
			  	<td><%=count%></td>
				<td><%=StringHelper.isEmpty(uv.getName() )?"---":uv.getName() %></td>
				<td><%=StringHelper.isEmpty(uv.getCompany() )?"---":uv.getCompany() %></td>
				<td><%=StringHelper.isEmpty(uv.getWorkingPlace() )?"---":uv.getWorkingPlace() %></td>
               	<td><%=StringHelper.isEmpty(uv.getLinkman() )?"---":uv.getLinkman() %></td>
               	<%-- <td><%=DictionaryCache.getValueByCode(Dictionary.ADVERTISE_INFO_TYPE,uv.getType()+"")%></td> --%>
				<td><%if(uv.getStatus().intValue()==0){%>
				<%=DictionaryCache.getValueByCode(Dictionary.AUDIT_STATUS,uv.getStatus()+"")%>
				<input type="button" id="update" name="update" value="审核..." class="mainoption" 
				onClick="javascript:auditModelRecruit(<%=uv.getId()%>,<%=count %>);"><%}else{%><font 
				color="#FF0000"><%=DictionaryCache.getValueByCode(Dictionary.AUDIT_STATUS,uv.getStatus()+"")%>
				<input type="button" id="update" name="update" value="重审核..." class="mainoption" 
				onClick="javascript:reAuditModelRecruit(<%=uv.getId()%>,<%=count %>);"></font><%}%>&nbsp;</td>
				<td><%=uv.getCreateTime()%></td>
				<td><%=StringHelper.isEmpty(uv.getCreator() )?"---":uv.getCreator() %></td>
				<td align="left">
				<input type="button" value="查看招工信息..." onClick="javascript:queryModelRecruit(<%=uv.getId()%>);">
				<input type="button" value="修改..." onClick="javascript:prepareUpdateModelRecruit(<%=uv.getId()%>);">
				<input type="button" value="删除..." onClick="javascript:deleteModelRecruit(<%=uv.getId()%>,<%=count %>);">
				</td>
			  </tr>
	<%
	  	}
	%>
  <%
	  }else{
  %>
			  <tr class="rowodd" align="center">
			    <td colspan="8" height="50">无相关数据</td>
			  </tr>
  <%	  	
	  }
  %>
  <!-- ================================================ -->
</table>
<table width="96%" border="0" align="center"><tr><td><%@include file="/WEB-INF/inc/page.jsp"%></td></tr></table>
<script language="javascript">resizeWindowHeightToHereTop(500);</script>
<%@include file="/WEB-INF/inc/response.jsp"%>
</body>
</html>