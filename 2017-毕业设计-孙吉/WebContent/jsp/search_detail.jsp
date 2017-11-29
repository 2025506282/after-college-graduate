<?xml version="1.0" encoding="UTF-8" ?>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="<%=request.getContextPath()%>/static/css/common_header.css"
    rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/search_detail.css"
    rel="stylesheet" />
<link href="<%=request.getContextPath()%>/static/css/common_footer.css"
    rel="stylesheet" />

<title>查找相关文件</title>
</head>
<body>
    <jsp:include page="common_header.jsp" />
    <div class="search_detail">
      <div>${asthma.authorName}</div>
      <div>${asthma.authorInformation}</div>
      <div>${asthma.thesis}</div>
      <div>${asthma.pmId}</div>
      <div>${asthma.doi}</div>
      <div>${asthma.date}</div>
      <div>${asthma.gene}</div>
    </div>
    <jsp:include page="common_footer.jsp" />
    <script src="<%=request.getContextPath()%>/static/js/jquery-2.2.0.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/common_header.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/search_detail.js"></script>
</body>
</html>