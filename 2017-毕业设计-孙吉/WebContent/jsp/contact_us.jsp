<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>联系我们</title>
    <link href="<%=request.getContextPath() %>/static/css/common_header.css" rel="stylesheet" />
    <link href="<%=request.getContextPath() %>/static/css/contact_us.css" rel="stylesheet" />
    <link href="<%=request.getContextPath() %>/static/css/common_footer.css" rel="stylesheet" />
</head>
<body>
  <jsp:include page="common_header.jsp" />
  <div class="contact_us">
      <h2>Why we choose this title?</h2>
      <ul>
          <li>1. I am interested in this title.</li>
          <li>2. I am good at computer.</li>
          <li>3. This title can help people found  susceptibility gene.</li>
          <li>4. This is work.</li>
      </ul>
      <h2>If you want to contact us?</h2>
      <ul>
          <li>Tel: +86-0553-875126061</li>
          <li>Email: 2025506282@qq.com</li>
          <li>Address: Room 104,
              college of Life Sciences
               Center for Yuhuqu
              HNUST University
              Hunan, 100871
               P.R. China
          </li>
          <li>Website: <a href="http://www.hnust.edu.cn">HNUST</a></li>
      </ul>
      <h2>If you want to give us advice?</h2>
      <ul>
          <li>
              <label for="advice_name">Username:</label><input type="text" id="advice_name" />
          </li>
          <li>
              <label for="advice_tel">Telephone:</label><input type="text" id="advice_tel" />
          </li>
          <li>
              <label for="advice">Advice:</label><textarea id="advice"></textarea>
          </li>
      </ul>
  </div>
  <jsp:include page="common_footer.jsp" />
  <script src="<%=request.getContextPath() %>/static/js/jquery-2.2.0.js"></script>
  <script src="<%=request.getContextPath() %>/static/js/common_header.js"></script>
</body>
</html>