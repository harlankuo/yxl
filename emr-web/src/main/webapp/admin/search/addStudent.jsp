<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>表单中的表格</title>
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
		<form id="J_Form" class="form-horizontal" action="${pageContext.request.contextPath}/addStudent" method="post">
			<!--    -->
			<h3>基本信息</h3>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label"><s>*</s>培训期次：</label>
					<div class="controls">
						<select name="batchId" data-rules="{required:true}">
							<option value="">-请选择期次-</option>
							<option value="1">第一期</option>
							<option value="2">第二期</option>
							<option value="3">第三期</option>
							<option value="4">第四期</option>
							<option value="5">第五期</option>
						</select>
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label"><s>*</s>培训方向：</label>
					<div class="controls">
						<select name="techId" data-rules="{required:true}">
							<option value="">--选择培训方向--</option>
							<option value="1">Java开发</option>
							<option value="2">软件测试</option>
							<option value="3">Web前端</option>
							<option value="4">大数据技术</option>
							<option value="5">Java</option>
							<option value="6">定制班</option>
						</select>
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label"><s>*</s>培训班级：</label>
					<div class="controls">
						<select name="classId" id="" data-rules="{required:true}">
							<option value="">--选择班级--</option>
							<option value="463">Java1</option>
							<option value="464">Java2</option>
							<option value="465">Java3</option>
							<option value="469">Java4</option>
							<option value="473">Java5</option>
							<option value="474">Java6</option>
							<option value="479">Java7</option>
							<option value="480">Java8</option>
							<option value="485">Java9</option>
							<option value="492">Java10班</option>
							<option value="466">测试1</option>
							<option value="476">测试2</option>
							<option value="483">测试3</option>
							<option value="481">测试4</option>
							<option value="482">测试5</option>
							<option value="486">测试6</option>
							<option value="493">测试7班</option>
							<option value="467">大数据1</option>
							<option value="471">大数据2</option>
							<option value="484">大数据3</option>
							<option value="468">前端1</option>
							<option value="472">前端2</option>
							<option value="483">前端3</option>
							<option value="487">企业定制1班</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label"><s>*</s>姓名：</label>
					<div class="controls">
						<input type="text" name="name"  data-rules="{required:true}">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label"><s>*</s>学号：</label>
					<div class="controls">
						<input type="text" name="sno"  data-rules="{required:true}">
					</div>
				</div>

				<div class="control-group span8">
					<label class="control-label"><s>*</s>性别：</label>
					<div class="controls">
						<select name="sex" data-rules="{required:true}">
							<option value="">--选择--</option>
							<option value="男">男</option>
							<option value="女">女</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label"><s>*</s>民族：</label>
					<div class="controls">
						<input type="text" name="nation"  data-rules="{required:true}">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label"><s>*</s>籍贯：</label>
					<div class="controls">
						<input type="text" name="nativePlace"  data-rules="{required:true}">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label"><s>*</s>电话：</label>
					<div class="controls">
						<input type="text" name="phone"  data-rules="{required:true}">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label"><s>*</s>身份证：</label>
					<div class="controls">
						<input type="text" name="idCard"  data-rules="{required:true}">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label"><s>*</s>学历：</label>
					<div class="controls">
						<select name="education" data-rules="{required:true}">
							<option value="">--请选择--</option>
							<option value="本科">本科</option>
							<option value="专科">专科</option>
							<option value="本科以上">本科以上</option>
							<option value="专科以下">专科以下</option>
						</select>
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label"><s>*</s>是否毕业：</label>
					<div class="controls">
						<select name="graduated" data-rules="{required:true}">
							<option value="">--选择--</option>
							<option value="1">已毕业</option>
							<option value="0">未毕业</option>
						</select>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label">QQ：</label>
					<div class="controls">
						<input type="text" name="qq">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">邮箱：</label>
					<div class="controls">
						<input type="text" name="email">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">紧急联系电话：</label>
					<div class="controls">
						<input type="text" name="emergencyTelephone">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label">毕业院校：</label>
					<div class="controls">
						<input type="text" name="school">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">二级院校：</label>
					<div class="controls">
						<input type="text" name="academy">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">所学专业：</label>
					<div class="controls">
						<input type="text" name="specialty">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label">入学时间：</label>
					<div class="controls">
						<input name="admissionDate" type="text" class="calendar" value="">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">离校时间：</label>
					<div class="controls">
						<input name="leaveTime" type="text" class="calendar" value="">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">退寝时间：</label>
					<div class="controls">
						<input name="theLayTime" type="text" class="calendar"value="">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label">寝室号：</label>
					<div class="controls">
						<input type="text" name="dormitory">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">就业状态：</label>
					<div class="controls">
						<select name="studentStatus">
							<option value="">--选择--</option>
							<option value="已验收">已验收</option>
							<option value="未验收">未验收</option>
						</select>
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">社保缴纳地：</label>
					<div class="controls">
						<input type="text" name="socialSecurity">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label">紧急联系人：</label>
					<div class="controls">
						<input type="text" name="emergencyContact">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">发放毕业证：</label>
					<div class="controls">
						<select name="certificate">
							<option value="-1">--选择--</option>
							<option value="1">已发放</option>
							<option value="0">未发放</option>
						</select>
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">证书编号：</label>
					<div class="controls">
						<input type="text" name="certificateNumber">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="control-group span8">
					<label class="control-label">班级职务：</label>
					<div class="controls">
						<input type="text" name="classPosition">
					</div>
				</div>
				<div class="control-group span8">
					<label class="control-label">考勤天数：</label>
					<div class="controls">
						<input type="text" name="attendance">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-actions offset3">
					<button type="submit" class="button button-primary">添加</button>
					<button type="reset" class="button">重置</button>
				</div>
			</div>
		</form>
	</div>
  <script type="text/javascript" src="../assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="../assets/js/bui-min.js"></script>

  <script type="text/javascript" src="../assets/js/config-min.js"></script>
  <script type="text/javascript">
    BUI.use('common/page');
  </script>
  <!-- 仅仅为了显示代码使用，不要在项目中引入使用-->
  <script type="text/javascript" src="../assets/js/prettify.js"></script>
  <script type="text/javascript">
    $(function () {
      prettyPrint();
    });
  </script> 
<script type="text/javascript">
  BUI.use('bui/form',function (Form) {
    var form = new Form.HForm({
      srcNode : '#J_Form'
    });

    form.render();
  });
</script>
<body>
</html>
