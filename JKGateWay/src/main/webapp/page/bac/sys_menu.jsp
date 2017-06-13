<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width:100%;height:100%">
			<!-- <table id="sys_menu_dg" style="width:100%;"></table> -->  
			
<div id="cc" class="easyui-layout" style="width:100%;height:100%">   
    <div data-options="region:'west',title:'角色列表',split:true" style="width:600px;">
			<table id="sys_role_dg" style="width:100%;"></table>  
    
    </div>   
    
    
    
    <div data-options="region:'center',title:'权限配置' "  style="padding:0px;background:#eee;">
	    <div style="width:100%;height:100%;background-color: #FFFFFF">
			
					<a id="btn" ></a>  
					

		    		<ul id="sys_menu_tree"></ul>
	    </div>
    </div>   
</div>  
			
			
			  
	</div>
	
	
	<script type="text/javascript">

	$(function(){
		$("#sys_role_dg").datagrid({    
		    url:'getSysRoleAll.htm',    
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
			onClickRow: function(index , rows){
				onloadMenuTree(rows.roleNo);
			},
		    
		    
		    columns:[[    
		        {field:'roleNo',title:'角色编号', width:100},    
		        {field:'roleName',title:'角色名称', width:100},    
		        {field:'useFlag',title:'是否启用', width:100}
		    ]]    
		});  
		page("sys_role_dg"); 
		
		$('#sys_menu_tree').tree({ 
			url: "selectSysMenuTree.htm",
			checkbox: true
			
		})
		//onloadMenuTree(null);
		
		
		$('#btn').linkbutton({   
			text:"保存",
		    iconCls: 'icon-save',
		    onClick: function(){
		    	
		    	var selectRow = $("#sys_role_dg").datagrid("getSelected");
		    	if(selectRow!=null){
		    		
			    	var reqStr = getCheckedNodes();
			    	$.ajax({
			    		   type: "POST",
			    		   url: "updateRoleRights.htm",
			    		   data: "roleNo="+selectRow.roleNo+"&rights="+reqStr,
			    		   success: function(result){
			    			   result = JSON.parse(result);
			    			   console.log(result);
			    			   console.log(result.code==200);
			    			   
			    		     if("200"==result.code){
			    		    	 alert("OK");
			    		    	 $('#sys_menu').tree("reload");
			    		     }
			    		   }
			    		});
		    	}else{
		    		$.messager.alert("提示","请选择角色在配置权限！");   
		    	}
		    	
		    }
		});  

		
	})
	
	function onloadMenuTree(roleNo){
		if(roleNo==null){
			roleNo = "";
		}
		$('#sys_menu_tree').tree({ 
			url: "selectSysMenuTree.htm?roleNo="+roleNo,
			checkbox: true
			
		})
		
	}
	
	function getCheckedNodes(){
		
		var nodes = $('#sys_menu_tree').tree("getChecked");
		var parentStr = "";
		var nodeAll = "";
		$.each(nodes,function(i){
			var t = 	$("#sys_menu_tree").tree("isLeaf",nodes[i].target);
			if(t){
				var parentNode = 	$("#sys_menu_tree").tree("getParent",nodes[i].target);
				parentStr+=parentNode.menuNo+",";
				nodeAll+=parentNode.menuNo+","+nodes[i].menuNo+"@";
				}
		})
		var len = parentStr.length-1;
		parentStr = parentStr.substring(0,len);
		
		var parentArr = uniqueArr(parentStr.split(","))
		
		var nodesArr = nodeAll.substring(0,nodeAll.length-1).split("@");
		var reqStr = "";
		
		for (var i = 0; i < parentArr.length; i++) {
			var childStr = "";
			for (var j = 0; j < nodesArr.length; j++) {
				var selectNode = nodesArr[j].split(",");
				
				//reqStr+=par_menu_no+"-";
				if(parentArr[i]==selectNode[0]){
					childStr+=selectNode[1]+",";
				}
			}
			if(childStr!=""){
				reqStr += parentArr[i]+"-"+childStr.substring(0,childStr.length-1)+"@";
			}
		} 
		return reqStr;
	}
	// 最简单数组去重法 
	function uniqueArr(array){ 
		var n = []; //一个新的临时数组 
		//遍历当前数组 
		for(var i = 0; i < array.length; i++){ 
		//如果当前数组的第i已经保存进了临时数组，那么跳过， 
		//否则把当前项push到临时数组里面 
		if (n.indexOf(array[i]) == -1) n.push(array[i]); 
		} 
		return n; 
	}
	</script>
</body>
</html>