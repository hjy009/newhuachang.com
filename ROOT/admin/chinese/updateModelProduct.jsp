<%@ include file="/WEB-INF/inc/common.jsp"%>
<%@ include file="/WEB-INF/inc/calendar.jsp"%>
<%@ page import="cn.com.netmovie.util.*"%>
<%@ page import="cn.com.netmovie.helper.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.newhc.admin.entity.Dictionary"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>修改</title>
<link href="/fckeditor/_samples/sample.css" rel="stylesheet" type="text/css" />
</head>
<%@ include file="/WEB-INF/inc/default.jsp"%>
<script type="text/javascript" src="/fckeditor/fckeditor.js"></script>
<script>
	function updateModelProduct(){
		var name = findById("name").value;
		if(name==""){
			alert('请输入名称');
			return ;
		}
		if(name.length>50){
			alert("标题不能超过50个字");
			return;
		}
		<ww:if test="columnsType==1">
		var content = FCKeditorAPI.GetInstance('FCKeditor1').GetXHTML(true);
		if(content==""||content.replace (/\s+/g,"")=="<html><head><title></title></head><body><p></p></body></html>"){
			alert('请输入内容');
			return ;
		}else{
			findById("content").value = content;
		}
		</ww:if>
		/**
		var initPrice = findById("initPrice").value;
		if(initPrice==""){
			alert("请输入初始价格");
			return;
		}
		if(isNaN(initPrice)){
			alert("请正确输入初始价格");
			return ;
		}
		var nowPrice = findById("nowPrice").value;
		if(nowPrice==""){
			alert("请输入现在价格");
			return;
		}
		if(isNaN(nowPrice)){
			alert("请正确输入现在价格");
			return ;
		}
		var discount = findById("discount").value;
		if(discount==""){
			alert("请输入折扣");
			return;
		}
		if(isNaN(discount)){
			alert("请正确输入折扣");
			return ;
		}
		var pubTime = findById("pubTime").value;
		if(pubTime==""){
			alert('请选择发布时间');
			return ;
		}*/
		var sequence=findById("sequence").value;
		if(sequence==""){
			alert("请输入顺序");
			return;
		}
		if(isNaN(sequence)){
			alert("请正确输入顺序");
			return ;
		}
		var form = findById("form");
		form.action = "updateModelProduct.do";
		form.submit();	
		findById("submitButton").disabled = true;
	}
	
	function init(){

	}
	
	function previewImageVideo(type,path){
		if(openDialog("previewImageVideo.do?previewType="+type+"&previewPath="+path,"预览",400,300) =="SUCCESS") refresh();
	}
</script>
<body>
<table width="96%" align="center" border="0"><tr><td><div class="title">修改<ww:property value='categoryName'/></div></td></tr></table>
<table width="98%" border="0" align="center" cellspacing="0" cellpadding="0" class="actiontable">
<form id="form" action="" method="POST" enctype="multipart/form-data">
  <ww:hidden name="'id'"/>
	<input type="hidden" id="columnsType" name="columnsType" value="<ww:property value='columnsType'/>">
  <input type="hidden" id="content" name="modelProduct.content">
  <tr>
    <th width="15%"><font color="#FF0000">*</font>名称：</th>
    <td>&nbsp;<input id="name" name="modelProduct.name" value="<ww:property value='modelProduct.name'/>" size="50">&nbsp;<font color="#FF0000">(标题不能超过30个文字)</font></td>
  </tr>
  <tr>
    <th>小图片：</th>
    <td>&nbsp;<input type="file" id="fileSmallImage" name="fileSmallImage" value="<ww:property value='modelProduct.smallImage'/>" size="30">
	<ww:if test="modelProduct.smallImage==null">图片：暂无</ww:if><ww:elseif test="modelProduct.smallImage!=null">图片：<ww:property value='modelProduct.smallImage'/><input type="button" value="预览" onClick="javascript:previewImageVideo(1,'<ww:property value="modelProduct.smallImage"/>');" /></ww:elseif>
	<br><font color="#FF0000">(上传的图片只支持jpg,gif,bmp格式,大小不能超过500k)</font></td>
  </tr>
   <ww:if test="columnsType==1">
  <tr>
    <th><font color="#FF0000">*</font>内容：</th>
    <td>&nbsp;
		<script type="text/javascript">
			var sBasePath = "/fckeditor/" ;
			var oFCKeditor = new FCKeditor( 'FCKeditor1' ) ;
			oFCKeditor.BasePath	= sBasePath ;
			oFCKeditor.Height	= 200 ;
			oFCKeditor.Value = "<ww:property value="modelProduct.content"/>";
			oFCKeditor.Create() ;
		</script>
	</td>
	</tr>
	</ww:if>
	<%-- 
  <tr>
    <th>大图片：</th>
    <td>&nbsp;<input type="file" id="fileBigImage" name="fileBigImage" value="<ww:property value='modelProduct.bigImage'/>" size="30">
	<ww:if test="modelProduct.bigImage==null">图片：暂无</ww:if><ww:elseif test="modelProduct.bigImage!=null">图片：<ww:property value='modelProduct.bigImage'/><input type="button" value="预览" onClick="javascript:previewImageVideo(1,'<ww:property value="modelProduct.bigImage"/>');" /></ww:elseif>
	<br><font color="#FF0000">(上传的图片只支持jpg,gif,bmp格式,大小不能超过500k)</font></td>
  </tr>
  <tr>
    <th width="15%"><font color="#FF0000">*</font>初始价格：</th>
    <td>&nbsp;<input id="initPrice" name="modelProduct.initPrice" value="<ww:if test='modelProduct.initPrice==null'>0.00</ww:if><ww:elseif test='modelProduct.initPrice!=null'><ww:property value='modelProduct.initPrice'/></ww:elseif>" size="50">&nbsp;<font color="#FF0000">元</font></td>
  </tr>
  <tr>
    <th width="15%"><font color="#FF0000">*</font>现在价格：</th>
    <td>&nbsp;<input id="nowPrice" name="modelProduct.nowPrice" value="<ww:if test='modelProduct.nowPrice==null'>0.00</ww:if><ww:elseif test='modelProduct.nowPrice!=null'><ww:property value='modelProduct.nowPrice'/></ww:elseif>" size="50">&nbsp;<font color="#FF0000">元</font></td>
  </tr>
  <tr>
    <th width="15%"><font color="#FF0000">*</font>折扣：</th>
    <td>&nbsp;<input id="discount" name="modelProduct.discount" value="<ww:if test='modelProduct.discount==null'>0</ww:if><ww:elseif test='modelProduct.discount!=null'><ww:property value='modelProduct.discount'/></ww:elseif>" size="50">&nbsp;<font color="#FF0000">%</font></td>
  </tr>
  <tr>
    <th><font color="#FF0000">*</font>发布时间：</th>
    <td>&nbsp;<ww:textfield name="'pubTime'" id="'pubTime'" size="'11'" maxlength="10"/><img src='/images/admin/calendar.gif' alt='点击选择日期' border='0' align='absmiddle' style="cursor:hand" onClick="return showCalendar('pubTime');">&nbsp;<font color="#FF0000">(日期的输入格式为：yyyy-MM-dd 例如:2012-01-01)</font></td>
  </tr>
  
  <tr>
    <th>备注：</th>
    <td>&nbsp;<textarea id="remark" name="modelProduct.remark" cols="50" rows="6"><ww:property value="modelProduct.remark"/></textarea>
	</td>
  </tr>
   --%>
  <tr>
  	<th><font color="#FF0000">*</font>顺序：</th>
  	<td>&nbsp;<input id="sequence" name="modelProduct.sequence" value="<ww:if test='modelProduct.sequence==null'>1</ww:if><ww:elseif test='modelProduct.sequence!=null'><ww:property value='modelProduct.sequence'/></ww:elseif>" size="30"><font color="#FF0000">*注意:此框只能输入数字，顺序应从1开始，发布日期相同时,数字越大排越后</font></td>
  </tr>
</form>
</table>
<table width="98%" border="0" cellspacing="0" style="border:0;">
	<tr align="center" style="border:0;">
		<td style="border:0;" align="center">
	      <br />
		  <input type="button" value="关闭窗口"  onclick="window.close();">
		  <input id="submitButton" type="button" value="修 改"  onclick="updateModelProduct()">
		</td>
	</tr>
</table>
<%@include file="/WEB-INF/inc/response.jsp"%>
<script language="javascript">resizeWindowHeightToHereTop(500);</script>
</body>
</html>
