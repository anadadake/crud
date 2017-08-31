<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <title>userInfo</title>
</head>
<body>
<h1>test page</h1>
<h3>用户No ：${userNo}</h3>
<h3>用户mobile ：${userInfo.mobilePhone} </h3>
<h3>用户No ：${userInfo.email} </h3>
<h3>用户No ：${userInfo.password}</h3>


</html>