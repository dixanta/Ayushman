<%-- 
    Document   : inde
    Created on : May 18, 2018, 2:18:56 PM
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${title}!</h1>
        <ul>
            <c:forEach var="department" items="${departments}">
                <li>${department}</li>
            </c:forEach>
            
        </ul>
    </body>
</html>
