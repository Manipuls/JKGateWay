<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	String path = request.getContextPath();
 %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="<%=path%>/page/bac/easyui/ui/easyui.css" />   
	<link rel="stylesheet" type="text/css" href="<%=path%>/page/bac/easyui/ui/icon.css" />   
	<script type="text/javascript" src="<%=path%>/page/bac/easyui/jquery-1.8.3.min.js"></script>   
	<script type="text/javascript" src="<%=path%>/page/bac/easyui/jquery.easyui.min.js"></script> 
	<script type="text/javascript" src="<%=path%>/page/bac/js/menu.js"></script> 
	<script type="text/javascript" src="<%=path%>/page/bac/js/publicJs.js"></script> 
	<style type="text/css">
		.datagrid-row-selected td div{color: #FFFFFF}
	</style>
	
	<script type="text/javascript">
	//获取session参数
	<%-- <%= ((SysUser)request.getSession().getAttribute("user")).userNo%> --%>
	
	
	</script>
</head>
<body class="easyui-layout">   
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>   
    <div data-options="region:'west',title:'导航',split:true" style="width:230px;">
    		<ul id="sys_menu"></ul>  
    
    </div>   
    <div data-options="region:'center'" style="padding:0px;background:#eee;">
    	<div id="tabs" class="easyui-tabs" style="height:100%">   
		</div>  
    </div>   
    
    
    
		 <div id="mm" class="easyui-menu" style="width:150px;">
	         <div id="mm-tabcloseother" data-options="iconCls:'icon-other'">关闭其他标签页</div>
	         <div id="mm-tabcloseall" data-options="iconCls:'icon-all'">关闭所有标签页</div>
	         <div class="menu-sep"></div>
	         <div id="mm-tabcloseright">当前页右侧全部关闭</div>
	         <div id="mm-tabcloseleft">当前页左侧全部关闭</div>
		 </div>
		 <!-- hide value -->
		 <div>
		 	<input id="roleNo"  type="hide"  value = "${sessionScope.user.roleNo}">
		 </div>
    
    <script type="text/javascript">
    
    $(function(){
	    $('#sys_menu').tree({
	    	url: "selectNavMenuTree.htm?roleNo="+$("#roleNo").val(),
	    	onClick: function(node){
	            if($('#sys_menu').tree("isLeaf",node.target)){
	                var tabs = $("#tabs");
	                var tab = tabs.tabs("getTab",node.text);
	                if(tab){
	                 //   tabs.tabs("select",node.text);
	                    $("#tabs").tabs("select",node.text);
	                    RefreshTab(tab,node.attributes.url);
	                    
	                }else{
	                    tabs.tabs('add',{
	                        title:node.text,
	                        href: node.attributes.url,
	                        closable:true,
	                        bodyCls:"content"
	                    });
	                }
	            }
	        }
	    });
    	
    })
    
//刷新当前标签Tabs
    function RefreshTab(currentTab , url) {
        $('#tabs').tabs('update', {
            tab: currentTab,
            options: {
                href: url
            }
        });
        currentTab.panel('refresh');
  }


    
    </script>
    
    
    
</body>  
</html>