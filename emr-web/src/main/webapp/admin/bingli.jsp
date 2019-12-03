<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<!-- Bootstrap用到的HTML元素和CSS属性需要HTML5 doctype。因此每个使用Bootstrap的页面都应该包启HTML5声明。-->

<html lang="zh-CN">
<!-- lang属性表示当前文档显示的语言，在很多国际化的网站中会遇到，zh-CN定义语言为中文，en定义语言为英语 -->
<!-- html lang="zh-CN"解决Mac版Firefox中文字体显示问题，Bootstrap也建议加上 -->
<head>
<title>病人集成视图</title>
<meta charset="utf-8">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/admin/assets/img/images/logo-icon.jpg" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link type="text/css"
	href="${pageContext.request.contextPath}/admin/assets/css/blcss/bootstrap.min2.css"
	rel="stylesheet" />
<link type="text/css"
	href="${pageContext.request.contextPath}/admin/assets/css/blcss/bootstrap-switch.css"
	rel="stylesheet">
<style>
* {
	font-family: "微软雅黑", "黑体", "宋体";
}

.space_lg {
	height: 50px;
	clear: both;
	text-align: right;
}

.space_md {
	height: 30px;
	clear: both;
}

.space_sm {
	height: 10px;
	clear: both;
}

.space_demo {
	border-bottom: 1px solid black;
}

@media ( min-width : 768px) {
	.container {
		width: 750px;
	}
	#scrollDiv {
		left: 0px;
	}
}

@media ( min-width : 992px) {
	.container {
		width: 990px;
	}
	#scrollDiv {
		left: 0px;
	}
}

@media ( min-width : 1200px) {
	.container {
		width: 1200px;
	}
}

@media ( min-width : 1400px) {
	.container {
		width: 1350px;
	}
}

@media ( min-width : 1800px) {
	.container {
		width: 1750px;
	}
	#scrollDiv {
		left: 180px;
	}
}

.lnk-tools {
	position: fixed;
	bottom: 180px;
	right: 80px;
	_position: absolute;
	z-index: 999;
	_top: expression(documentElement.scrollTop);
}

.lnk-tools button {
	width: 100px;
}
</style>
</head>

<body data-target="#scrollDiv" data-offset="0" data-spy="scroll">
	<div class="container" style="margin-top: 80px;">
		<div class="row">
			<div class="col-md-8">
				<div class="jumbotron" style="height: 120px; padding: 10px;">
					<div class="row">
						<div class="col-md-2">
							<img
								src="${pageContext.request.contextPath}/admin/assets/img/images/people.jpg"
								style="height: 100px;" class="img-thumbnail">
						</div>
						<div class="col-md-7">
							<h3 class="text-info">${patient.name}&nbsp;<span
									class="label label-warning">${patient.sex}</span>&nbsp;&nbsp;<span
									class="label label-primary">${patient.age}</span>
							</h3>
							<span class="text-info"><strong>最近一次就诊：</strong></span><span
								class="text-primary">${patient.firstClinicTime}</span>&nbsp;<strong>|</strong>&nbsp;
							<span class="text-info"><strong>最近一次诊断：</strong></span><span
								class="text-primary">${patient.recentDiagnose}</span>&nbsp;<strong>|</strong>&nbsp;
							<img
								src="${pageContext.request.contextPath}/admin/assets/img/images/sc.png"
								style="height: 30px;" title="收藏" class="img-thumbnail">
						</div>
						<div class="col-md-3">
							<p style='margin-top: 30px;'>
								<a class="btn btn-primary" role="button">自定义定制&raquo;</a>
							</p>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="panel panel-success">
					<div class="panel-heading">
						<h3 class="panel-title" style="font-family: 微软雅黑">病案摘要</h3>
					</div>
					<div class="panel-body">
						<span class="text-info"><strong>诊断：</strong></span><span
							class="text-primary">${patient.diagnose}，急需治疗</span>&nbsp;<br>
						<span class="text-info"><strong>手术：</strong></span><span
							class="text-primary">${patient.operation}</span>&nbsp;<br> <span
							class="text-info"><strong>过敏源：</strong></span><span
							class="text-primary">${patient.allergen}</span>&nbsp;
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<ul id="myTab1" class="nav nav-tabs bg-info">
					<li class="active"><a href="#myLi1" data-toggle="tab">病历概要</a></li>
					<li><a href="#myLi2" data-toggle="tab">住院信息</a></li>
					<li><a href="#myLi3" data-toggle="tab">门诊信息</a></li>
				</ul>
				<div id="myTabContent" class="tab-content">

					<!-- 第一块操作区 -->
					<div class="tab-pane fade in active" id="myLi1">
						<div id="myLi11">
							<div class="space_sm"></div>
							<div class="row">
								<div class="col-md-8">
									<div class="row">
										<div class="col-md-12">
											<div class="panel panel-warning">
												<div class="panel-heading"
													style="background-color: #fcf8e3; border-color: #faebcc; color: #8a6d3b;">
													<h3 class="panel-title"
														style="color: #8a6d3b; font-family: 微软雅黑">病人基本信息</h3>
												</div>
												<div class="panel-body">
													<span class="text-info"><strong>患者姓名：</strong></span><span
														class="text-primary">${patient.name}</span>&nbsp;<strong>|</strong>&nbsp;
													<span class="text-info"><strong>年龄：</strong></span><span
														class="text-primary">${patient.age}</span>&nbsp;<strong>|</strong>&nbsp;
													<span class="text-info"><strong>性别：</strong></span><span
														class="text-primary">${patient.sex}</span>&nbsp;<strong>|</strong>&nbsp;
													<span class="text-info"><strong>婚姻状况：</strong></span><span
														class="text-primary">${patient.maritalStatus}</span> <br>
													<span class="text-info"><strong>国籍：</strong></span><span
														class="text-primary">${patient.nationality}</span>&nbsp;<strong>|</strong>&nbsp;
													<span class="text-info"><strong>联系电话：</strong></span><span
														class="text-primary">${patient.phone}</span>&nbsp;<strong>|</strong>&nbsp;
													<span class="text-info"><strong>出生地：</strong></span><span
														class="text-primary">${patient.nativePlace}</span>&nbsp;<strong>|</strong>&nbsp;
													<span class="text-info"><strong>通讯地址：</strong></span><span
														class="text-primary">${patient.address}</span>
												</div>
											</div>
										</div>
									</div>
									<div class="space_sm"></div>
									<div class="row">
										<div class="col-md-12">
											<ul id="myTab4" class="nav nav-tabs">
												<li class="active"><a href="#reco1" data-toggle="tab">就诊记录</a></li>
												<li><a href="#reco2" data-toggle="tab">用药记录</a></li>
												<li><a href="#reco3" data-toggle="tab">手术记录</a></li>
											</ul>
											<div id="myTabContent" class="tab-content">
												<div class="tab-pane fade in active" id="reco1">
													<div class="space_md"></div>
													<table class="table">
														<caption>就诊记录</caption>
														<thead>
															<tr>
																<th>病症</th>
																<th>时间</th>
																<th>就诊医院</th>
															</tr>
														</thead>
														<tbody>
															<c:forEach items="${records}" var="sickrecord">
																<tr class="warning">
																	<td>${sickrecord.illness}</td>
																	<td>
																		<fmt:formatDate type="date" value="${sickrecord.sickTime}" dateStyle="default" />
																	</td>
																	<td>${sickrecord.hospital}</td>
																</tr>
															</c:forEach>
														</tbody>
													</table>
												</div>
												<div class="tab-pane fade" id="reco2">
													<div class="space_md"></div>
													<table class="table">
														<thead>
															<tr>
																<th>用药名称</th>
																<th>用药日期</th>
																<th>用药剂量</th>
															</tr>
														</thead>
														<tbody>
															<c:forEach items="${medicals}" var="med">
																<tr class="warning">
																	<td>${med.drugName}</td>
																	<td>
																		<fmt:formatDate type="date" value="${med.medicalTime}" dateStyle="default" />
																	</td>
																	<td>${med.dosage}</td>
																</tr>
															</c:forEach>
														</tbody>
													</table>
												</div>
												<div class="tab-pane fade" id="reco3">
													<p>jMeter 是一款开源的测试软件。它是 100% 纯 Java 应用程序，用于负载和性能测试。</p>
												</div>
											</div>
										</div>
										<!-- /.col-记录 -->
									</div>
								</div>
								<div class="col-md-4">
									<div class="panel-group" id="accordion">
										<div class="panel panel-default">
											<div class="panel-heading">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne1">主诉 </a>
												</h4>
											</div>
											<div id="collapseOne1" class="panel-collapse collapse in">
												<div class="panel-body">${patient.mainSuit}</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne2"> 现病史 </a>
												</h4>
											</div>
											<div id="collapseOne2" class="panel-collapse collapse in">
												<div class="panel-body">${patient.medicalHistory}</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne3"> 既往史 </a>
												</h4>
											</div>
											<div id="collapseOne3" class="panel-collapse collapse in">
												<div class="panel-body">${patient.pastHistory}</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne4">个人史 </a>
												</h4>
											</div>
											<div id="collapseOne4" class="panel-collapse collapse in">
												<div class="panel-body">${patient.personHistory}</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne5">家族史 </a>
												</h4>
											</div>
											<div id="collapseOne5" class="panel-collapse collapse in">
												<div class="panel-body">${patient.familyHistory}</div>
											</div>
										</div>
										<div class="panel panel-default">
											<div class="panel-heading">
												<h4 class="panel-title">
													<a data-toggle="collapse" data-parent="#accordion"
														href="#collapseOne6">婚孕史 </a>
												</h4>
											</div>
											<div id="collapseOne6" class="panel-collapse collapse in">
												<div class="panel-body">${patient.marryHistory}</div>
											</div>
										</div>
									</div>
								</div>
								<!-- /.col-历史 -->

							</div>
						</div>
					</div>

					<!-- 第二块操作区 -->
					<div class="tab-pane fade" id="myLi2">

						<div class="space_sm"></div>

						<div class="row">
							<div class="col-md-8">
								<div class="panel panel-warning">
									<div class="panel-heading"
										style="background-color: #fcf8e3; border-color: #faebcc; color: #8a6d3b;">
										<h3 class="panel-title"
											style="color: #8a6d3b; font-family: 微软雅黑">病人住院信息</h3>
									</div>
									<div class="panel-body">
										<span class="text-info"><strong>住院号：</strong></span><span
											class="text-primary">0654719001</span>&nbsp;<strong>|</strong>&nbsp;
										<span class="text-info"><strong>主管医生：</strong></span><span
											class="text-primary">陈观富/1990</span>&nbsp;<strong>|</strong>&nbsp;
										<span class="text-info"><strong>在院天数：</strong></span><span
											class="text-primary">18</span>&nbsp;<strong>|</strong>&nbsp;
										<span class="text-info"><strong>入院日期：</strong></span><span
											class="text-primary">2014-02-03</span> <br>
									</div>
								</div>
							</div>
							<div class="col-md-2">
								<p>
									展示方式切换： <input id="switch-offColor" type="checkbox"
										data-off-color="success" data-on-color="warning"
										data-on-text="时间轴" data-off-text="经典">
								</p>
							</div>
							<div class="col-md-2">
								<div class="dropdown">
									<button type="button" class="btn btn-success dropdown-toggle"
										id="dropdownMenu1" data-toggle="dropdown">
										历次住院记录 <span class="badge">3</span> <span class="caret"></span>
									</button>
									<ul class="dropdown-menu" role="menu"
										aria-labelledby="dropdownMenu1">
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">2015-12-12</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">2014-12-12</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">2012-12-12</a></li>
									</ul>
								</div>
							</div>

						</div>

						<div id="myLi21">
							<div class="row">
								<div class="col-md-10 col-md-offset-1">
									<div class="space_sm"></div>
									<form class="form-inline" role="form">
										<button type="button" class="btn btn-success active"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-qrcode"></span> <br>检验报告
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-headphones"></span> <br>检查报告
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-barcode"></span> <br>长期用药
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-inbox"></span> <br>临时用药
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-inbox"></span> <br>呼吸体温
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-inbox"></span> <br>护理记录
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-inbox"></span> <br>血压脉搏
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-inbox"></span> <br>输入液量
										</button>
										<button type="button" class="btn btn-success"
											data-toggle="modal" data-target="#modalTest"
											style="width: 10%">
											<span class="glyphicon glyphicon-inbox"></span> <br>尿量记录
										</button>
									</form>
								</div>
							</div>

							<div class="space_lg"></div>

							<div class="row">
								<div class="col-md-4">
									<div class="page-header" style="margin: 0;">
										<span class="label label-default"><span
											class="glyphicon glyphicon-qrcode"></span> 检验报告 </span>
									</div>
								</div>
								<div class="col-md-4 col-md-offset-4"></div>
							</div>

							<div class="space_md"></div>

							<div class="row">
								<div class="col-md-3">
									<div class="jumbotron"
										style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
										data-toggle="modal" data-target="#modalTest2">
										<p class="text-primary" style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
										<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
									</div>
								</div>
								<div class="col-md-3">
									<div class="jumbotron"
										style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
										data-toggle="modal" data-target="#modalTest2">
										<p class="text-primary" style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
										<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
									</div>
								</div>
								<div class="col-md-3">
									<div class="jumbotron"
										style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
										data-toggle="modal" data-target="#modalTest2">
										<p class="text-primary" style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
										<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
									</div>
								</div>
								<div class="col-md-3">
									<div class="jumbotron"
										style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
										data-toggle="modal" data-target="#modalTest2">
										<p class="text-primary" style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
										<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
									</div>
								</div>
							</div>
						</div>

						<div id="myLi22" hidden>
							<div class="space_md"></div>
							<div class="row">
								<div class="col-md-11 col-md-offset-1">
									<img src="images/zhuy.png" style="" class="img-thumbnail">
								</div>
							</div>
						</div>

					</div>

					<!-- 第三块操作区 -->
					<div class="tab-pane fade" id="myLi3">

						<div class="space_sm"></div>

						<div class="row">
							<div class="col-md-8">
								<div class="panel panel-warning">
									<div class="panel-heading"
										style="background-color: #fcf8e3; border-color: #faebcc; color: #8a6d3b;">
										<h3 class="panel-title"
											style="color: #8a6d3b; font-family: 微软雅黑">病人门诊信息</h3>
									</div>
									<div class="panel-body">
										<span class="text-info"><strong>门诊号：</strong></span><span
											class="text-primary">0654719001</span>&nbsp;<strong>|</strong>&nbsp;
										<span class="text-info"><strong>门诊医生：</strong></span><span
											class="text-primary">陈观富/1990</span>&nbsp;<strong>|</strong>&nbsp;
										<span class="text-info"><strong>门诊科室：</strong></span><span
											class="text-primary">口腔外科</span>&nbsp;<strong>|</strong>&nbsp;
										<span class="text-info"><strong>就诊日期：</strong></span><span
											class="text-primary">2014-02-03</span> <br>
									</div>
								</div>
							</div>
							<div class="col-md-2">
								<p>
									展示方式切换： <input id="switch-offColor2" type="checkbox"
										data-off-color="success" data-on-color="warning"
										data-on-text="时间轴" data-off-text="经典">
								</p>
							</div>
							<div class="col-md-2">
								<div class="dropdown">
									<button type="button" class="btn btn-success dropdown-toggle"
										id="dropdownMenu1" data-toggle="dropdown">
										历次门诊记录 <span class="badge">3</span> <span class="caret"></span>
									</button>
									<ul class="dropdown-menu" role="menu"
										aria-labelledby="dropdownMenu1">
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">2015-12-12</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">2014-12-12</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1"
											href="#">2012-12-12</a></li>
									</ul>
								</div>
							</div>
						</div>

						<div id="myLi31">
							<div class="panel-group" id="accordion">
								<div class="panel panel-default">
									<div class="panel-heading">
										<a data-toggle="collapse" data-parent="#accordion"
											href="#collapseOne"> <span
											class="glyphicon glyphicon-star"></span> 检验报告（展开）
										</a>
									</div>
									<div id="collapseOne" class="panel-collapse collapse">
										<div class="panel-body">Nihil anim keffiyeh helvetica,
											craft beer labore wes anderson cred nesciunt sapiente ea
											proident. Ad vegan excepteur butcher vice lomo.</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading">
										<a data-toggle="collapse" data-parent="#accordion"
											href="#collapseTwo"> <span
											class="glyphicon glyphicon-heart"></span> 检查报告（展开）
										</a>
									</div>
									<div id="collapseTwo" class="panel-collapse collapse">
										<div class="panel-body">Nihil anim keffiyeh helvetica,
											craft beer labore wes anderson cred nesciunt sapiente ea
											proident. Ad vegan excepteur butcher vice lomo.</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading">
										<a data-toggle="collapse" data-parent="#accordion"
											href="#collapse4"> <span class="glyphicon glyphicon-star"></span>
											长期用药（展开）
										</a>
									</div>
									<div id="collapse4" class="panel-collapse collapse">
										<div class="panel-body">Nihil anim keffiyeh helvetica,
											craft beer labore wes anderson cred nesciunt sapiente ea
											proident. Ad vegan excepteur butcher vice lomo.</div>
									</div>
								</div>
								<div class="panel panel-default">
									<div class="panel-heading">
										<a data-toggle="collapse" data-parent="#accordion"
											href="#collapseThree"> <span
											class="glyphicon glyphicon-asterisk"></span> 临时用药（展开）
										</a>
									</div>
									<div id="collapseThree" class="panel-collapse collapse in">
										<div class="space_md"></div>
										<div class="row">
											<div class="col-md-3">
												<div class="jumbotron"
													style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
													data-toggle="modal" data-target="#modalTest2">
													<p class="text-primary"
														style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
													<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
												</div>
											</div>
											<div class="col-md-3">
												<div class="jumbotron"
													style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
													data-toggle="modal" data-target="#modalTest2">
													<p class="text-primary"
														style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
													<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
												</div>
											</div>
											<div class="col-md-3">
												<div class="jumbotron"
													style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
													data-toggle="modal" data-target="#modalTest2">
													<p class="text-primary"
														style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
													<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
												</div>
											</div>
											<div class="col-md-3">
												<div class="jumbotron"
													style="background-color: #d9edf7; padding-top: 5px; padding-bottom: 0;"
													data-toggle="modal" data-target="#modalTest2">
													<p class="text-primary"
														style="font-size: 16px; height: 20px;">红细胞沉淀率测定</p>
													<p class="text-info" style="font-size: 14px; height: 20px;">&nbsp;2012-12-12</p>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div id="myLi32" hidden>
							<div class="space_md"></div>
							<div class="row">
								<div class="col-md-11 col-md-offset-1">
									<img src="images/menz.png" style="" class="img-thumbnail">
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="modalTest" tabindex="-1" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">登录平台</h4>
				</div>
				<div class="modal-body">
					<p>One fine body&hellip;</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<div class="modal fade" id="modalTest2" tabindex="-1" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">检验报告</h4>
				</div>
				<div class="modal-body">
					<p>红细胞沉淀率测定&hellip;</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/assets/js/bljs/jquery-1.11.1.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/assets/js/bljs/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/assets/js/bljs/switch-need1.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/assets/js/bljs/bootstrap-switch.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/admin/assets/js/bljs/switch-need2.js"></script>
	<script>
		$(function() {
			$('#modalTest').modal({
				backdrop : true,//true:有遮罩背景&点击可关闭modal;false:没遮罩&不可点击关闭;'static':有遮罩不可点击关闭（默认是true）
				keyboard : true,//键盘上的esc键被按下时关闭模态框（默认是true）
				show : false,//模态框初始化之后就立即显示出来（默认是true）
			});
			$('#switch-offColor').on('switchChange.bootstrapSwitch',
					function(event, state) {
						if (state) {
							$("#myLi22").show();
							$("#myLi21").hide();
						} else {
							$("#myLi21").show();
							$("#myLi22").hide();
						}
						console.log(this); // DOM element
						console.log(event); // jQuery event
						console.log(state); // true | false
					});

			$('#switch-offColor2').on('switchChange.bootstrapSwitch',
					function(event, state) {
						if (state) {
							$("#myLi32").show();
							$("#myLi31").hide();
						} else {
							$("#myLi31").show();
							$("#myLi32").hide();
						}
						console.log(this); // DOM element
						console.log(event); // jQuery event
						console.log(state); // true | false
					});
		})
	</script>
</body>
</html>
