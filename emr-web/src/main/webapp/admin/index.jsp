<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
 <head>
  <title> HPEU 管理系统</title>
   <link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
  <link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
   <link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />
 </head>
 <body>

  <div class="header">
    
      <div class="dl-title">
          <span class="lp-title-port">电子病历</span><span class="dl-title-text">管理系统</span>
        </a>
      </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user">${username}</span><a href="${pageContext.request.contextPath}/login.jsp" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
  </div>
   <div class="content">
    <div class="dl-main-nav">
      <ul id="J_Nav"  class="nav-list ks-clear">
        <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">权限管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-order">患者管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-inventory">病历管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-supplier">医生信息管理</div></li>
        <li class="nav-item"><div class="nav-item-inner nav-marketing">个人信息管理</div></li>
      </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
   </div>
  <script type="text/javascript" src="assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="./assets/js/bui.js"></script>
  <script type="text/javascript" src="./assets/js/config.js"></script>

<script>
BUI.use('common/main',function(){
	var config = [{
		id:'menu', 
		homePage : 'code',
		menu:[{
			text:'系统管理',
			items:[
				{id:'code',text:'管理首页',href:'main/code.html',closeable : false},
				{id:'main-menu',text:'菜单管理',href:'main/menu.html'},
				{id:'second-menu',text:'角色管理',href:'main/second-menu.html'},
				{id:'dyna-menu',text:'用户管理',href:'main/user.jsp'}
			]
		},{
			text:'页面操作',
			items:[
				{id:'operation',text:'页面常见操作',href:'main/operation.html'},
				{id:'quick',text:'页面操作快捷方式',href:'main/quick.html'}  
			]
		},{
			text:'文件结构',
			items:[
				{id:'resource',text:'资源文件结构',href:'main/resource.html'},
				{id:'loader',text:'引入JS方式',href:'main/loader.html'}  
			]
		}]
	},{
		id:'form',
		menu:[{
			text:'患者管理',
			items:[
				{id:'code',text:'管理首页',href:'form/code.html'},
				{id:'example',text:'患者列表',href:'form/patient.jsp'},
				{id:'introduce',text:'患者导入',href:'form/introduce.html'},
				//{id:'valid',text:'表单基本验证',href:'form/basicValid.html'},
				//{id:'advalid',text:'表单复杂验证',href:'form/advalid.html'},
				//{id:'remote',text:'远程调用',href:'form/remote.html'},
				//{id:'group',text:'表单分组',href:'form/group.html'},
			]
		},{
			text:'教务管理',
			items:[
				{id:'success',text:'期次管理',href:'${pageContext.request.contextPath}/bingli/bingli.html'},
				{id:'fail',text:'方向管理',href:'form/fail.html'},
				{id:'depends',text:'班级管理',href:'form/depends.html'}
			]
		},{
			text:'就业跟踪',
			items:[
				{id:'grid',text:'就业跟踪',href:'form/grid.html'},
				{id:'form-grid',text:'就业导入',href:'form/form-grid.html'},
				{id:'dialog-grid',text:'就业验收',href:'form/dialog-grid.html'},
				//{id:'form-dialog-grid',text:'表单中使用弹出框',href:'form/form-dialog-grid.html'}
			]
		}]
	},{
		id:'search',
		menu:[{
			text:'搜索页面',
			items:[
				{id:'code',text:'搜索页面代码',href:'${pageContext.request.contextPath}/bingli/bingli.html'},
				{id:'example',text:'搜索页面示例',href:'search/example.html'},
				{id:'example-dialog',text:'搜索页面编辑示例',href:'search/example-dialog.html'},
				{id:'introduce',text:'搜索页面简介',href:'search/introduce.html'}, 
				{id:'config',text:'搜索配置',href:'search/config.html'}
			]
		},{
			text : '更多示例',
			items : [
				{id : 'tab',text : '使用tab过滤',href : 'search/tab.html'}
			]
		}]
	},{
		id:'detail',
		menu:[{
			text:'详情页面',
			items:[
				{id:'code',text:'详情页面代码',href:'detail/code.html'},
				{id:'example',text:'详情页面示例',href:'detail/example.html'},
				{id:'introduce',text:'详情页面简介',href:'detail/introduce.html'}
			]
		}]
	},{
		id : 'chart',
		menu : [{
			text : '图表',
			items:[
				{id:'code',text:'引入代码',href:'chart/code.html'},
				{id:'line',text:'折线图',href:'chart/line.html'},
				{id:'area',text:'区域图',href:'chart/area.html'},
				{id:'column',text:'柱状图',href:'chart/column.html'},
				{id:'pie',text:'饼图',href:'chart/pie.html'}, 
				{id:'radar',text:'雷达图',href:'chart/radar.html'}
			]
		}]
	}];
	new PageUtil.MainPage({
		modulesConfig : config
	});
});
</script>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>