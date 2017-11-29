<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>联系我们</title>
<link href="<%=request.getContextPath()%>/static/css/common_header.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/common_footer.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/search_detail.css"
	rel="stylesheet" />
<style>
.header_menu .nav_browse {
	background-color: white;
	color: rgb(3, 70, 147);
}

.container {
	width: 80%;
	margin: 10px auto;
	background-color: #F5F6FA;
	box-shadow: 1px 3px 20px #333333, 2px 2px 5px #333333;
	-moz-box-shadow: 1px 3px 20px #333333, 2px 2px 5px #333333;
	-webkit-box-shadow: 1px 3px 20px #333333, 2px 2px 5px #333333;
	padding: 2% 5%;
	border-radius: 5px;
}

li {
	float: left;
	width: 20%;
	height: 40px;
	line-height: 40px;
	list-style: none;
	text-align: center;
}

.clear {
	clear: both;
}
</style>
</head>
<body>
	<jsp:include page="common_header.jsp" />
	<div class="container">
		<div class="list_head">
			<ul>
				<li class="chromosom_type"><b>chromosomeType</b></li>
				<li class="gene_name"><b>geneName</b></li>
				<li class="tx_start"><b>txStart</b></li>
				<li class="tx_end"><b>txEnd</b></li>
				<li class="strand"><b>strand</b></li>
			</ul>
		</div>
		<div class="list_body">
			<c:forEach items="${list}" var="chromosome">
				<div class="row_for">
					<ul>
						<li class="chromosom_type"><span>${chromosome.chromosomeType}</span></li>
						<li class="gene_name"><span title="${chromosome.geneName}">${chromosome.geneName}</span></li>
						<li class="tx_start"><span title="${chromosome.txStart}">${chromosome.txStart}</span></li>
						<li class="tx_end"><span>${chromosome.txEnd}</span></li>
						<li class="strand"><span>${chromosome.strand}</span></li>
					</ul>
				</div>
			</c:forEach>
		</div>
		<div class="clear"></div>
	</div>
	<jsp:include page="common_footer.jsp" />
</body>


</html>