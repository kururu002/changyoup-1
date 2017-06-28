<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form method="post" action="Login">
           name:<input name="username" type="text" />                        
           password:<input name="password" type="password" />        <input
            name="Submits" type="submit" value="login" />       <input name="ReSet"
            type="reset" value="reset" />  <input type="button" 
            value="register" onclick="location.href='register.jsp'"/>
    </form>
</body>
</html>