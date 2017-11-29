<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/static/css/login.css" rel="stylesheet"/>
</head>
<body>
  <div class="login">
      <div class="login_top">
          <a href="http://www.hnust.edu.cn"  class="close"></a>
      </div>
      <div class="login_title">
          <h2>生科院毕业设计</h2>
      </div>
      <p class="login_information">
      </p>
      <form class="login_form" method="get" action="<%=request.getContextPath() %>/login">
          <div class="login_user_name">
              <input type="text" placeholder="用户名" class="user_name" name="user_name" id="user_name"/>
          </div>
          <div class="login_password">
             <input type="password" placeholder="密&nbsp;&nbsp;&nbsp;码" class="password" name="password" id="password"/>
          </div>
          <div class="login_ok">
              <input type="button" value="登&nbsp;&nbsp;&nbsp;陆" class="login_button"/>
          </div>
      </form>
      <div class="login_bottom">
          <a href="#" class="forget_password">忘&nbsp;了&nbsp;密&nbsp;码</a><a href="#" class="regist">注&nbsp;册&nbsp;新&nbsp;账&nbsp;号</a><a href="#" class="recomerdation">意&nbsp;见&nbsp;反&nbsp;馈</a>
      </div>
  </div>
<script src="<%=request.getContextPath() %>/static/js/jquery-2.2.0.js"></script>
<script src="<%=request.getContextPath() %>/static/js/login.js"></script>
</body>
</html>