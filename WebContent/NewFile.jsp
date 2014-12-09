<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page
		import="com.caucho.hessian.client.HessianProxyFactory,service.HessianService"%>
	<%@page language="java"%>
	<%
		HessianProxyFactory factory = new HessianProxyFactory();
		String url = ("http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/test");
		out.println(url);
		HessianService basic = (HessianService) factory.create(HessianService.class, url);
		out.println(basic.doSomeThing());
	%>
</body>
</html>