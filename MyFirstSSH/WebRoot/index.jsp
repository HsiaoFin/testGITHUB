<%@ page language="java" pageEncoding="utf-8"%>
<!-- 导入struts2标签库 -->
<%@taglib uri="/struts-tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

<html> 
<head>
   <title>用户登录</title>
</head>
<body>
<center>
<div id="login">

    <s:form action="login_Action" method="post">
     <s:textfield label="用户名" name="username"></s:textfield>
     <s:password label="密码" name="password"></s:password>
     <s:submit value="登录"></s:submit>
     
    </s:form>
    </div>
</center>
</body>
</html>