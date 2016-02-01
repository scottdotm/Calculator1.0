<%-- 
    Document   : error
    Created on : Jan 30, 2016, 10:59:28 AM
    Author     : Scott
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% final String ERROR_MSG = "Unable to retrive message!"; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator Result</title>
    </head>
    <body>
        <%
            Object area = request.getAttribute("result");
            String outResult = area == null ? ERROR_MSG : area.toString();
        %>
        <h1>Result</h1>
        <p>Calculated value: <% out.println(outResult); %></p>
    </body>
</html>
