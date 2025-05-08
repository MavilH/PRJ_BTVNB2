<%-- 
    Document   : index
    Created on : May 8, 2025, 2:35:17 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="random" method="GET">
            <select name="choose">
                <option value="1">Rock</option>
                <option value="2">Paper</option>
                <option value="3">Scissors</option>
            </select> <br>
            <input type="submit" value="Submit  " />
        </form>
    </body>
</html>
