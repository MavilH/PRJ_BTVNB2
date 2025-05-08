<%-- 
    Document   : index
    Created on : May 8, 2025, 3:01:23 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="process" method="POST">
            <input type="text" name="fullname" value="" placeholder="Input name"/><br>
            <input type="text" name="username" value="" placeholder="Input username"/><br>
            <input type="password" name="password" value="" placeholder="Input password"/><br>
            <input type="text" name="email" value="" placeholder="Input email"/><br>
            <input type="submit" value="Submit" />
        </form>
        
        <%
            String msg = (String)request.getAttribute("message");
        %>
        <% if(msg != null) { %>
        <%= msg%>
        <% } %>
        
    </body>
</html>
