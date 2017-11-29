<?xml version="1.0" encoding="UTF-8" ?>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="<%=request.getContextPath()%>/static/css/common_header.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/search.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/common_footer.css"
	rel="stylesheet" />

<title>查找相关文件</title>
</head>
<body>
	<jsp:include page="common_header.jsp" />
	<form class="search" action="<%=request.getContextPath()%>/asthmaList"
		method="get">
		<div class="search_type">
			<select id="search_type_select" name="keyWord">
				<option value="gene">Gene</option>
				<option value="thesis">Thesis</option>
				<option value="pm_id">PMID</option>
				<option value="author_name">Author</option>
				<option value="chromosome">Chromosome</option>
				<option value="disease">Disease</option>
			</select> <input type="text" class="search_type_value" name="keyWordValue" placeholder="${pagination.keyWordValue}"/> <input
				type="button" class="sure_search" value="search" />
		</div>
		<div class="list_head">
			<ul>
				<li class="id"><span>ID</span></li>
				<li class="title"><span>Title</span></li>
				<li class="author"><span>Author</span></li>
				<li class="gene"><span>Gene/Protein</span></li>
				<li class="pm_id"><span>PMID</span></li>
				<li class="operate"><span>Operate</span></li>
			</ul>
		</div>
		<div class="list_body">
			<c:forEach items="${list}" var="asthma">
				<div class="row_for">
					<ul>
						<li class="id"><span>${asthma.id}</span></li>
						<li class="title"><span title="${asthma.title}">${asthma.title}</span></li>
						<li class="author"><span title="${asthma.authorName}">${asthma.authorName}</span></li>
						<li class="gene"><span>${asthma.gene}</span></li>
						<li class="pm_id"><span>${asthma.pmId}</span></li>
						<li class="operate"><a
							href="<%=request.getContextPath()%>/getAsthma?pmId=${asthma.pmId}">detail</a></li>
					</ul>
				</div>
			</c:forEach>
		</div>
		<div class="scroll_paging">
			<ul>
				<li class="prev_page negative"><span>上一页</span></li>
				<li class="number_scroll first_page"><span>1</span></li>
				<li class="suspension"><span>...</span></li>
				<li class="number_scroll"><span>2</span></li>
				<li class="number_scroll"><span>3</span></li>
				<li class="number_scroll"><span>4</span></li>
				<li class="number_scroll"><span>5</span></li>
				<li class="number_scroll"><span>6</span></li>
				<li class="number_scroll"><span>7</span></li>
				<li class="number_scroll"><span>8</span></li>
				<li class="number_scroll"><span>9</span></li>
				<li class="number_scroll"><span>10</span></li>
				<li class="suspension"><span>...</span></li>
				<li class="number_scroll last_page"><span>${pagination.totalPage}</span></li>
				<li class="next_page"><span>下一页</span></li>
			</ul>
		</div>
		<div>
			<input type="hidden" name="activeIndex"value="${pagination.activeIndex}" id="activeIndex" />
		    <input type="hidden" name="pageIndex" value="${pagination.pageIndex}" id="currentPage" />
		    <input type="hidden" name="selectIndex" value="${pagination.keyWord}" id="selectIndex" />
		</div>
	</form>
	<jsp:include page="common_footer.jsp" />
	<script src="<%=request.getContextPath()%>/static/js/jquery-2.2.0.js"></script>
	<script src="<%=request.getContextPath()%>/static/js/common_header.js"></script>
	<script src="<%=request.getContextPath()%>/static/js/search.js"></script>
</body>
</html>