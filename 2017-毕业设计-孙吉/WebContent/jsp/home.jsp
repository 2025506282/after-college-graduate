<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>哮喘易感分子首页</title>
    <link href="<%=request.getContextPath() %>/static/css/common_header.css" rel="stylesheet" />
    <link href="<%=request.getContextPath() %>/static/css/home.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath() %>/static/css/common_footer.css" rel="stylesheet" />
</head>
<body>
  <jsp:include page="common_header.jsp" />
  <div class="home">
      <div class="home_left">
      </div>
      <div class="home_right">
          <h3>Welcome to the asthma </h3>
          <p>
              Asthma, also known as bronchial asthma.
              Bronchial asthma is a variety of cells and cell components involved in chronic airway inflammation,
              this inflammation is often accompanied by increased airway responsiveness, resulting in recurrent wheezing,
              shortness of breath, chest tightness and (or) cough and other symptoms, Night and / or early morning,
              these symptoms are often accompanied by extensive and varied airflow obstruction, can be reversed by treatment or by treatment.
          </p>
          <h3>how to user the asthma?</h3>
          <p>
              first,click the search page.
              <br/>
              second,click the browse page.
              <br/>
              finally,input your search key value,and make sure.
          </p>
          <h3>What kind of tools are used?</h3>
          <p>
              html
              <br/>
              css
              <br/>
              js
              <br/>
              jquery
              <br/>
              jsp
              <br/>
              java
          </p>
      </div>
  </div>
  <jsp:include page="common_footer.jsp" />
  <script src="<%=request.getContextPath() %>/static/js/jquery-2.2.0.js"></script>
  <script src="<%=request.getContextPath() %>/static/js/common_header.js"></script>
</body>
</html>