<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>上传基因</title>
<link href="<%=request.getContextPath()%>/static/css/common_header.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/upload.css"
	rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/common_footer.css"
	rel="stylesheet" />
</head>
<body>
	<jsp:include page="common_header.jsp" />
	<form action="" method="get">
		<div class="upload">
			<div class="upload_pm_id">
                <label for="pm_id">PMID</label> <input type="text" id="pm_id" /> <span>*</span>
            </div>
			<div class="upload_gene">
				<label for="gene">Gene</label> <input type="text" id="gene" /> <span>*</span>
			</div>
			<div class="upload_title">
				<label for="title">Title</label>
				<input type="text" id="title" />
				<span>*</span>
			</div>
			<div class="upload_thesis">
				<label for="thesis">Thesis</label>
				<textarea id="thesis"></textarea>
			</div>
			<div class="upload_author_information">
                <label for="author_information">Author Information</label> <input
                    type="text" id="author_information" /> 
            </div>
			<div class="upload_author_name">
                <label for="author_name">Author Name</label> 
                <input type="text" id="author_name" />
                <label for="disease" class="label_disease">Disease</label>
                <input type="text" id="disease" />
            </div>
			
			<div class="upload_doi">
				<label for="doi">DOI</label>
				<input type="text" id="doi" /> 
				<label for="chromosome" class="label_chromosome">Chromosome</label>
			    <input type="text" id="chromosome" />
			</div>
			<div class="upload_submit">
				<input type="button" id="submit" value="submit" /> <input
					type="reset" id="reset" value="reset" />
			</div>
		</div>
	</form>
	<jsp:include page="common_footer.jsp" />
	<script src="<%=request.getContextPath()%>/static/js/jquery-2.2.0.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/common_header.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/upload.js"></script>
</body>
</html>