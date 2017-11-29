<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="<%=request.getContextPath()%>/static/css/common_header.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/download.css"
    rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/common_footer.css"
	rel="stylesheet" />

<title>下载相关文件</title>
</head>
<body>
	<jsp:include page="common_header.jsp" />
	<div class="download">
		<h2>Download</h2>
		<div class="content">
			<h2>General annoucement</h2>
			<p>All the files are free to academic researchers world wide. Not
				for profit purposes.</p>
			<p>All the downloadable files are Tab seperated text files. The
				headline of each file gives out the information for each column.</p>
			<h2>All the pubmed_result_susceptibility genes and non-coding
				genes with basic information.</h2>
			<p>
			             <a target="_blank" href="../file/1.rar">download</a> All the
			All the files are free to academic researchers world wide. Not
				for profit purposes.</p>
			<p>All the downloadable files are Tab seperated text files. The
				headline of each file gives out the information for each column.</p>
			<h2>All the pubmed_result_ lncRNA genes and non-coding genes
				with basic information.</h2>
			<p>All the files are free to academic researchers world wide. Not
				for profit purposes.</p>
			<p>
				<a target="_blank" href="../file/2.rar">download</a> All the
				downloadable files are Tab seperated text files. The headline of
				each file gives out the information for each column.
			</p>
			<h2>All the pubmed_result_miRNA genes and non-coding genes with
				basic information.</h2>
			<p>All the files are free to academic researchers world wide. Not
				for profit purposes.</p>
			<p>
			             <a target="_blank" href="../file/3.rar">download</a> All the
			All the downloadable files are Tab seperated text files. The
				headline of each file gives out the information for each column.</p>
		</div>
	</div>
	<jsp:include page="common_footer.jsp" />
	<script src="<%=request.getContextPath()%>/static/js/jquery-2.2.0.js"></script>
	<script src="<%=request.getContextPath()%>/static/js/common_header.js"></script>
</body>
</html>