<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 18.09.2020
  Time: 08:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formularz dodawania nowego planu treningowego</title>
    <style>
        .error {
            color:red;
        }
    </style>
</head>
<body>
<h2><center>FORMULARZ DODAWANIA NOWEGO PLANU TRENINGOWEGO</center></h2>
<form:form method="post" modelAttribute="exercises">
    <form:hidden path="id"/>
    <form:hidden path="person"/>
    <table border="1" width="100%">
        <tr>
            <td><center>PONIEDZIAŁEK</center></td>
            <td><center>WTOREK</center></td>
            <td><center>ŚRODA</center></td>
            <td><center>CZWARTEK</center></td>
            <td><center>PIĄTEK</center></td>
            <td><center>SOBOTA</center></td>
            <td><center>NIEDZIELA</center></td>
        </tr>
        <tr>
            <td><form:textarea rows="6" cols="24" path="monday"/></td>
            <td><form:textarea rows="6" cols="24" path="tuesday"/></td>
            <td><form:textarea rows="6" cols="24" path="wednesday"/></td>
            <td><form:textarea rows="6" cols="24" path="thursday"/></td>
            <td><form:textarea rows="6" cols="24" path="friday"/></td>
            <td><form:textarea rows="6" cols="24" path="saturday"/></td>
            <td><form:textarea rows="6" cols="24" path="sunday"/></td>
        </tr>
    </table><br>
    <input type="submit" value="Zapisz"/>
</form:form>

<br>
<a href="/personDetails/all">Lista pacjentów</a>

</body>
</html>
