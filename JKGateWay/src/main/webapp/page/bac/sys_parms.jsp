<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="easyui-layout">
		<table id="sys_parms_dg" style="width:100%;"></table>  
	
	</div>
	<script type="text/javascript">
		$(function(){
			$('#sys_parms_dg').datagrid({    
			    url:'searchSysParmsAll.htm',    
			    loadMsg : '正在玩命的为您加载。。。', //加载数据是显示的提示 
			    pagination : true, //是否显示分页工具栏
				fitColumns : true,  //真正的自动展开/收缩列的大小，以适应网格的宽度，防止水平滚动。
				rownumbers : true,  //是否显示行号
				singleSelect : true,  //只允许选择一行
				//fit:true, //自动适应高度和宽度
				striped : true,  //表格显示条纹
				pageSize:5,  //初始页面显示数据条数
				pageNumber:1, //当前页码
				pageList:[5,10,15], // 选择当页显示数据显示条数
				//scrollbarSize:0,
			    
			    
			    columns:[[    
			        {field:'sysNo',title:'枚举编号', width:100},    
			        {field:'sysKey',title:'枚举Key', width:100},    
			        {field:'sysValue',title:'枚举Value', width:100},
			        {field:'sysDesc',title:'枚举描述', width:100} ,
			        {field:'useFlag',title:'是否启用', width:100},
			        {field:'createTime',title:'创建时间', width:100},
			        {field:'updateTime',title:'更新时间', width:100}
			    ]]    
			});  
			page("sys_parms_dg");
		})
	
	
	</script>
</body>
</html>