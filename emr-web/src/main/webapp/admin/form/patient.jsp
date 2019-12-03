<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>搜索表单</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
<link href="../assets/css/bui-min.css" rel="stylesheet" type="text/css" />
<link href="../assets/css/page-min.css" rel="stylesheet" type="text/css" />
<!-- 下面的样式，仅是为了显示代码，而不应该在项目中使用-->
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
						<label class="control-label">患者姓名：</label>
						<div class="controls">
							<input type="text" name="name" value="${patient.name}">
						</div>
					</div>
					<div class="control-group span8">
						<label class="control-label">患者年龄：</label>
						<div class="controls">
							<input type="text" name="age" value="${patient.age}">
						</div>
					</div>
					<div class="control-group span8">
						<label class="control-label">患者性别：</label>
						<div class="controls">
							<select name="sex">
								<option value="${patient.sex}">男</option>
								<option value="${patient.sex}">女</option>
								<option value="">-请选择-</option>
							</select>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="control-group span8">
						<label class="control-label">患者身份证：</label>
						<div class="controls">
							<input type="text" name="idCard" value="${patient.idCard}">
						</div>
					</div>
					<div class="control-group span8">
						<label class="control-label">患者籍贯：</label>
						<div class="controls">
							<input type="text" name="nativePlace" value="${patient.nativePlace}">
						</div>
					</div>

					<div class="control-group span8">
						<button type="button" id="btnSearch" class="button button-primary">查询</button>
						<button type="button" id="btnout" class="button button-primary">导出数据</button>
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
    
      columns = [
          {title:'编号',dataIndex:'id',width:80,renderer:function(v){
              return Search.createLink({
                id : 'detail' + v,
                title : '学生信息',
                text : v,
                href : 'detail/example.html'
              });
            }},
            {title:'姓名',dataIndex:'name',width:150},
            {title:'年龄',dataIndex:'age',width:150},
            {title:'性别',dataIndex:'sex',width:150},
            {title:'身份证',dataIndex:'idCard',width:250},
            {title:'联系电话',dataIndex:'phone',width:250},
            {title:'籍贯',dataIndex:'nativePlace',width:150},
            {title:'国籍',dataIndex:'nationality',width:150},
            {title:'婚姻状况',dataIndex:'maritalStatus',width:150},
          {title:'操作',dataIndex:'',width:150,renderer : function(value,obj){
            var editStr =  Search.createLink({ //链接使用 此方式
                id : 'editStudent' + obj.id,
                title : '编辑用户信息',
                text : '编辑',
                href : '${pageContext.request.contextPath}/editStudentServlet?id='+obj.id
              });
            var showStr =  Search.createLink({ //链接使用 此方式
                id : 'show' + obj.id,
                title : '查看用户信息',
                text : '查看',
                href : '${pageContext.request.contextPath}/getPatient?id='+obj.id
              }),
              delStr = '<span class="grid-command btn-del" title="删除用户信息" >删除</span>';//页面操作不需要使用Search.createLink
            return editStr + showStr +delStr;
          }}
        ],
        
        
      store = Search.createStore("${pageContext.request.contextPath}/showPatients"),
      gridCfg = Search.createGridCfg(columns,{
        tbar : {
          items : [
        	  {text : '<i class="icon-plus"></i>新建用户',btnCls : 'button button-small',handler:function(){window.location.href="${pageContext.request.contextPath}/admin/search/addStudent.jsp";}},
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
        BUI.Message.Confirm('确认要删除选中的记录么？',function(obj){
          $.ajax({
            url : '${pageContext.request.contextPath}/deletStudent',
            dataType : 'json',
            data : {ids : ids[0]},
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
	<!-- <script type="text/javascript">
	$("#btnSearch").click(function(){
		alert('搜索');
	})

</script> -->
</body>
</html>
