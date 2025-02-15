<%@ include file="/WEB-INF/inc/common.jsp"%>
<%@ include file="/WEB-INF/inc/calendar.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>查看产品历史</title>
<link href="/fckeditor/_samples/sample.css" rel="stylesheet" type="text/css" />
</head>
<%@ include file="/WEB-INF/inc/default.jsp"%>
<script type="text/javascript" src="/fckeditor/fckeditor.js"></script>
<script>
	function init(){

	}
	
	function previewImageVideo(type,path){
		if(openDialog("previewImageVideo.do?previewType="+type+"&previewPath="+path,"预览",400,300) =="SUCCESS") refresh();
	}
</script>
<body>
<table width="96%" align="center" border="0"><tr><td><div class="title">查看产品历史</div></td></tr></table>
<table width="98%" border="0" align="center" cellspacing="0" cellpadding="0" class="actiontable">
<form id="form" action="" method="POST" enctype="multipart/form-data">
  <ww:hidden name="'id'"/>
  <input type="hidden" id="content" name="modelProductHistoryEn.content">
  <tr>
    <th width="15%"><font color="#FF0000">*</font>名称：</th>
    <td>&nbsp;<input id="name" name="modelProductHistoryEn.name" value="<ww:property value='modelProductHistoryEn.name'/>" size="50">&nbsp;<font color="#FF0000">(标题不能超过30个文字)</font></td>
  </tr>
  <tr>
    <th>小图片：</th>
    <td>&nbsp;<input type="file" id="fileSmallImage" name="fileSmallImage" value="<ww:property value='modelProductHistoryEn.smallImage'/>" size="30">
	<ww:if test="modelProductHistoryEn.smallImage==null">图片：暂无</ww:if><ww:elseif test="modelProductHistoryEn.smallImage!=null">图片：<ww:property value='modelProductHistoryEn.smallImage'/><input type="button" value="预览" onClick="javascript:previewImageVideo(1,'<ww:property value="modelProductHistoryEn.smallImage"/>');" /></ww:elseif>
	<br><font color="#FF0000">(上传的图片只支持jpg,gif,bmp格式,大小不能超过500k)</font></td>
  </tr>
  <tr>
    <th>大图片：</th>
    <td>&nbsp;<input type="file" id="fileBigImage" name="fileBigImage" value="<ww:property value='modelProductHistoryEn.bigImage'/>" size="30">
	<ww:if test="modelProductHistoryEn.bigImage==null">图片：暂无</ww:if><ww:elseif test="modelProductHistoryEn.bigImage!=null">图片：<ww:property value='modelProductHistoryEn.bigImage'/><input type="button" value="预览" onClick="javascript:previewImageVideo(1,'<ww:property value="modelProductHistoryEn.bigImage"/>');" /></ww:elseif>
	<br><font color="#FF0000">(上传的图片只支持jpg,gif,bmp格式,大小不能超过500k)</font></td>
  </tr>
  <tr>
    <th><font color="#FF0000">*</font>内容：</th>
    <td>&nbsp;
		<script type="text/javascript">
			var sBasePath = "/fckeditor/" ;
			var oFCKeditor = new FCKeditor( 'FCKeditor1' ) ;
			oFCKeditor.BasePath	= sBasePath ;
			oFCKeditor.Height	= 200 ;
			oFCKeditor.Value = "<ww:property value="modelProductHistoryEn.content"/>";
			oFCKeditor.Create() ;
		</script>
	</td>
  </tr>
  <tr>
    <th width="15%"><font color="#FF0000">*</font>初始价格：</th>
    <td>&nbsp;<input id="initPrice" name="modelProductHistoryEn.initPrice" value="<ww:if test='modelProductHistoryEn.initPrice==null'>0.00</ww:if><ww:elseif test='modelProductHistoryEn.initPrice!=null'><ww:property value='modelProductHistoryEn.initPrice'/></ww:elseif>" size="50">&nbsp;<font color="#FF0000">元</font></td>
  </tr>
  <tr>
    <th width="15%"><font color="#FF0000">*</font>现在价格：</th>
    <td>&nbsp;<input id="nowPrice" name="modelProductHistoryHistoryEn.nowPrice" value="<ww:if test='modelProductHistoryEn.nowPrice==null'>0.00</ww:if><ww:elseif test='modelProductHistoryEn.nowPrice!=null'><ww:property value='modelProductHistoryEn.nowPrice'/></ww:elseif>" size="50">&nbsp;<font color="#FF0000">元</font></td>
  </tr>
  <tr>
    <th width="15%"><font color="#FF0000">*</font>折扣：</th>
    <td>&nbsp;<input id="discount" name="modelProductHistoryEn.discount" value="<ww:if test='modelProductHistoryEn.discount==null'>0</ww:if><ww:elseif test='modelProductHistoryEn.discount!=null'><ww:property value='modelProductHistoryEn.discount'/></ww:elseif>" size="50">&nbsp;<font color="#FF0000">%</font></td>
  </tr>
  <tr>
    <th><font color="#FF0000">*</font>发布时间：</th>
    <td>&nbsp;<ww:textfield name="'pubTime'" id="'pubTime'" size="'11'" maxlength="10"/><img src='/images/admin/calendar.gif' alt='点击选择日期' border='0' align='absmiddle' style="cursor:hand" onClick="return showCalendar('pubTime');">&nbsp;<font color="#FF0000">(日期的输入格式为：yyyy-MM-dd 例如:2012-01-01)</font></td>
  </tr>
  <tr>
  	<th><font color="#FF0000">*</font>顺序：</th>
  	<td>&nbsp;<input id="sequence" name="modelProductHistoryEn.sequence" value="<ww:if test='modelProductHistoryEn.sequence==null'>1</ww:if><ww:elseif test='modelProductHistoryEn.sequence!=null'><ww:property value='modelProductHistoryEn.sequence'/></ww:elseif>" size="30"><font color="#FF0000">*注意:此框只能输入数字，顺序应从1开始，发布日期相同时,数字越大排越后</font></td>
  </tr>
  <tr>
    <th>备注：</th>
    <td>&nbsp;<textarea id="remark" name="modelProductHistoryEn.remark" cols="50" rows="6"><ww:property value="modelProductHistoryEn.remark"/></textarea>
	</td>
  </tr>
</form>
</table>
<table width="98%" border="0" cellspacing="0" style="border:0;">
	<tr align="center" style="border:0;">
		<td style="border:0;" align="center">
	      <br />
		  <input type="button" value="关闭窗口"  onclick="window.close();">
		</td>
	</tr>
</table>
<%@include file="/WEB-INF/inc/response.jsp"%>
<script language="javascript">resizeWindowHeightToHereTop(500);</script>
</body>
</html>
