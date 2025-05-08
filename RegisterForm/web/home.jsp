<%-- 
    Document   : home
    Created on : May 8, 2025, 3:01:35 PM
    Author     : ADMIN
--%>

<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            User u = (User)request.getAttribute("user");
        %>
        <%= u.getFullName()%>
        <%= u.getUserName()%>
        <%= u.getPassword()%>
        <%= u.getEmail()%>
    </body>
</html>
