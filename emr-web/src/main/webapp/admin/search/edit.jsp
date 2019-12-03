<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
 <head>
  <title> 编辑用户信息</title>
   <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
       <link href="../assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="../assets/css/page-min.css" rel="stylesheet" type="text/css" />   
 </head>
 <body>
  
  <div class="container">
    <form id ="J_Form" class="form-horizontal" action="${pageContext.request.contextPath}/edit" method="post">
      <h3>修改用户信息</h3>
      <div class="row">
        <div class="control-group span12">
          <label class="control-label"><s>*</s>用户姓名：</label>
          <div class="controls">
            <input name="name" type="text" class="control-text" data-rules="{required:true}">
          </div>
        </div>
      </div>
      <div class="row">
        <div class="control-group span12">
          <label class="control-label"><s>*</s>用户账号：</label>
          <div class="controls">
            <input name="userAccount" type="text" class="control-text" data-rules="{required:true}">
          </div>
        </div>
      </div>
      <div class="row">
        <div class="control-group span12">
          <label class="control-label"><s>*</s>用户密码：</label>
          <div class="controls">
            <input name="userPassword" type="text" class="control-text" data-rules="{required:true}">
          </div>
        </div>
      </div> 
      <div class="row">
        <div class="form-actions offset3">
          <button type="submit" class="button button-primary">修改</button>
          <button type="reset" class="button">重置</button>
        </div>
      </div>
    </form>
  <script type="text/javascript" src="../assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="../assets/js/bui-min.js"></script>

  <script type="text/javascript" src="../assets/js/config-min.js"></script>
  <script type="text/javascript">
    BUI.use('common/page');
  </script>
  <script type="text/javascript">
    BUI.use('bui/form',function (Form) {
      var form = new Form.HForm({
        srcNode : '#J_Form'
      }).render();
    });
  </script>

<body>
</html>  