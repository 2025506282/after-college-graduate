<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>联系我们</title>
<link href="<%=request.getContextPath()%>/static/css/common_header.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/common_footer.css"
	rel="stylesheet" />
<style>
.header_menu .nav_browse {
	background-color: white;
	color: rgb(3, 70, 147);
}
</style>
</head>
<body>
	<jsp:include page="common_header.jsp" />

	<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
	<div id="main" style="height: 600px"></div>
	<!-- ECharts单文件引入 -->
	<script src="http://echarts.baidu.com/build/dist/echarts.js"></script>
	<script src="<%=request.getContextPath()%>/static/js/jquery-2.2.0.js"></script>
	<script type="text/javascript">
		// 路径配置

		$.getJSON("http://localhost:8080/2017-毕业设计-孙吉/GetChromosomeCount",
				function(json) {
					console.log(json);
					console.log(json[0].chromosomeType);
					console.log(json[0].number);
					console.log(json.length);
					var categoryData = new Array();
					var barDta = new Array();
					for (var i = 0; i < json.length; i++) {
						categoryData.push(json[i].chromosomeType);
						barDta.push(json[i].number);
					}

					require.config({
						paths : {
							echarts : 'http://echarts.baidu.com/build/dist'
						}
					});

					// 使用
					require([ 'echarts', 'echarts/chart/bar' // 使用柱状图就加载bar模块，按需加载
					], function(ec) {
						// 基于准备好的dom，初始化echarts图表
						var myChart = ec.init(document.getElementById('main'));
						var option = {
							tooltip : {
								show : true
							},
							legend : {
								data : [ 'number' ]
							},
							xAxis : [ {
								type : 'category',
								data : categoryData
							} ],
							yAxis : [ {
								type : 'value'
							} ],
							series : [ {
								"name" : "number",
								"type" : "bar",
								"data" : barDta
							} ]
						};

						// 为echarts对象加载数据 
						myChart.setOption(option);
						myChart.on('click', function(param) {
							window.location.href = "http://localhost:8080/2017-毕业设计-孙吉/ChromosomeList?chromosomeType="+param.name;
						});

					});
				});
	</script>
	<jsp:include page="common_footer.jsp" />
</body>


</html>