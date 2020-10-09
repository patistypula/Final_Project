<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 05.10.2020
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Wylogowanie</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<form action="<c:url value="/logout"/>" method="post">
    <center><input class="fa fa-id-badge" type="submit" value="Wyloguj"></center>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

</body>
</html>
