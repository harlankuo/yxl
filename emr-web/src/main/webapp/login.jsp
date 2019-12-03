<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录</title>
	<script type="text/javascript"src="${pageContext.request.contextPath}/js/jquery-1.8.1.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("img").css("cursor","pointer");
			$("img").click(function(){
				$(this).attr(
					"src",
					"${pageContext.request.contextPath}/vcode?"
							+new Date().getTime());
			})
			
			$(":submit").click(function() {
				$("#usernameTip").html("");
				$("#passwordTip").html("");
				$("#vcodeTip").html("");
	
				var username = $("input[name='username']").val();
				var password = $("input[name='password']").val();
				var vcode = $("input[name='vcode']").val();
	
				var usernameRegix = /^[a-zA-Z]\w{4,15}$/;
				var passwordRegix = /^\w{6,16}$/;
				var vcodeRegix = /^[a-zA-Z2-9]{4}$/;
	
				// 校验用户名
				if (!usernameRegix.test(username)) {
					$("#usernameTip").html("<font color='red'>用户名格式不对：4-15位字符</font>");
					$("input[name='username']").select();
					return false;
				} else {
					$("#usernameTip").html("");
				}
	
				// 校验密码
				if (!passwordRegix.test(password)) {
					$("#passwordTip").html("<font color='red'>密码格式不对：6-16位字符！</font>");
					$("input[name='password']").select();
					return false;
				} else {
					$("#passwordTip").html("");
				}
	
				// 校验验证码
				if (!vcodeRegix.test(vcode)) {
					$("#vcodeTip").html("<font color='red'>验证码格式不对！</font>");
					$("input[name='vcode']").select();
					return false;
				} else {
					$("#vcodeTip").html("");
				}
	
				return true;
			});
		});
	</script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/js/auth.css">
</head>

<body>
	<div class="lowin lowin-blue">
		<div class="lowin-wrapper">
			<div class="lowin-box lowin-login">
				<div class="lowin-box-inner">
					<form action="${pageContext.request.contextPath}/login" method="post">
						<p class="title">电子病历管理系统</p>
						<div class="lowin-group">
							<label>账号</label>
							<input type="text"  name="username" class="lowin-input" value="${map.username}">
							<span id="usernameTip"></span>
							<form:errors path="account"/>
						</div>
						<div class="lowin-group password-group">
							<label>密码</label>
							<input type="password" name="password"  class="lowin-input">
							<span id="passwordTip"></span>
							<form:errors path="password"/>
						</div>
						<div class="lowin-group password-group">
							<label>验证码</label>
							<input type="text"  name="vcode" size="4" class="lowin-code">
							<img src="${pageContext.request.contextPath }/vcode" height="33px" width="110px" border="0" align="right"><br/>
							<span id="vcodeTip"></span>
							<span class="tip">${vcodes}</span>
						</div>
						<input type="submit" value="登录" class="lowin-btn login-btn"/>
						<span class="tip">${msg}</span>
						<%session.invalidate();%>
						<div class="text-foot">
							没有账号？ <a href="" class="register-link">注册</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>