<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
 <head>
  <title> 搜索表单</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
       <link href="../assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/page-min.css" rel="stylesheet" type="text/css" />   <!-- 下面的样式，仅是为了显示代码，而不应该在项目中使用-->
   <link href="../assets/css/prettify.css" rel="stylesheet" type="text/css" />
   <style type="text/css">
    code {
      padding: 0px 4px;
      color: #d14;
      background-color: #f7f7f9;
      border: 1px solid #e1e1e8;
    }
   </style>
 </head>
 <body>
  <div class="container">
    <div class="row">
      <form id="searchForm" class="form-horizontal span24">
        <div class="row">
          <div class="control-group span8">
            <label class="control-label">登录账号：</label>
            <div class="controls">
              <input type="text" class="control-text" name="account" value="">
            </div>
          </div>
          <div class="control-group span8">
            <label class="control-label">用户姓名：</label>
            <div class="controls">
              <input type="text" class="control-text" name="realName" value="">
            </div>
          </div>
          <div class="span3 offset2">
          	<button  type="button" id="btnSearch" class="button button-primary">搜索</button>
          </div>
        </div>
      </form>
    </div>
    <div class="search-grid-container">
      <div id="grid"></div>
    </div>
  </div>
  <script type="text/javascript" src="../assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="../assets/js/bui-min.js"></script>
  <script type="text/javascript" src="../assets/js/config-min.js"></script>
  <script type="text/javascript">
    BUI.use('common/page');
  </script>
<script type="text/javascript">
  BUI.use(['common/search','bui/overlay'],function (Search,Overlay) {
    
    var enumObj = {"1":"启用","0":"未启用"}
    var enumObj2 = {"1":"超级管理员","2":"管理员"},
    
      columns = [
    	  {title:'id',dataIndex:'id',width:80,renderer:function(v){
              return Search.createLink({
                id : 'detail' + v,
                title : 'id',
                text : v,
                href : 'detail/example.html'
              });
            }},
          	{title:'登录账号',dataIndex:'account',width:200},
            {title:'用户姓名',dataIndex:'realName',width:200},
            {title:'注册日期',dataIndex:'createDate',width:200,renderer:BUI.Grid.Format.dateRenderer},
            {title:'登录次数',dataIndex:'loginTime',},
            {title:'最后登录日期',dataIndex:'lastLoginDate',width:200},
            {title:'角色名称',dataIndex:'roleId',width:200,renderer:BUI.Grid.Format.enumRenderer(enumObj2)},
            {title:'用户状态',dataIndex:'close',width:200,renderer:BUI.Grid.Format.enumRenderer(enumObj)},
          {title:'操作',dataIndex:'',width:200,renderer : function(value,obj){
            var editStr =  Search.createLink({ //链接使用 此方式
                id : 'edit' + obj.id,
                title : '编辑用户信息',
                text : '编辑',
                href : '${pageContext.request.contextPath}/editUser?id='+obj.id
              }),
              delStr = '<span class="grid-command btn-del" title="删除用户信息">删除</span>';//页面操作不需要使用Search.createLink
            return editStr + delStr;
          }}
        ],
        
      store = Search.createStore("${pageContext.request.contextPath}/showUser"),
      gridCfg = Search.createGridCfg(columns,{
        tbar : {
          items : [
            {text : '<i class="icon-plus"></i>新建用户',btnCls : 'button button-small',handler:function(){window.location.href="${pageContext.request.contextPath}/admin/search/add.jsp";}},
            {text : '<i class="icon-remove"></i>删除用户',btnCls : 'button button-small',handler : delFunction}
          ]
        },
        plugins : [BUI.Grid.Plugins.CheckSelection] // 插件形式引入多选表格
      });

    
 
    var  search = new Search({
        store : store,
        gridCfg : gridCfg
      }),
      grid = search.get('grid');
    //删除操作
    function delFunction(){
      var selections = grid.getSelection();
      delItems(selections);
    }

    function delItems(items){
      var ids = [];
      BUI.each(items,function(item){
        ids.push(item.id);
      });

      if(ids.length){
    	
        BUI.Message.Confirm('确认要删除选中的记录么？',function(){
          $.ajax({
            url : '${pageContext.request.contextPath}/deletStudent?id='+obj.id,
           	dataType : 'json',
           	data : {ids : ids},
            //method:'get',
            success : function(data){
              if(data.success){ //删除成功
                search.load();
              }else{ //删除失败
                BUI.Message.Alert('删除失败！');
              }
            }
        });
        },'question');
      }
    }

    //监听事件，删除一条记录
    grid.on('cellclick',function(ev){
      var sender = $(ev.domTarget); //点击的Dom
      if(sender.hasClass('btn-del')){
        var record = ev.record;
        delItems([record]);
      }
    });
  });
</script>
<body>
</html>  
