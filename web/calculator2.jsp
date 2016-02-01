<%-- 
    Document   : calculator2
    Created on : Jan 30, 2016, 11:05:10 AM
    Author     : Scott
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Calculator</title>
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/custom.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            Object result = request.getAttribute("result");
            boolean show = result == null || result.toString().equals("");
            String printResult = result == null ? "" : result.toString();
        %>
        <nav>
            <div class="nav-wrapper black">
                <a href="#" class="brand-logo">Area Calculator Version 2</a>
                <ul class="right side-nav">
                    <li><a href="calculator1.jsp">Version 1</a></li>
                    <li><a href="calculator2.jsp">Version 2</a></li>
                    <li><a href="calculator3.jsp">Version 3</a></li>
                    <li><a href="calculator4.jsp">Version 4</a></li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <form id="rectForm" method="POST" action="calc2">
                <label for="width">Width</label>
                <input type="number" name="width" id="width" required="required" placeholder="Width" />
                <label for="height">Height</label>
                <input type="number" name="height" id="height" required="required" placeholder="Height" />
                <input type="submit" value="Calculate" />
                <p id="output" style="<% if(show) out.print("visibility: hidden;"); %>">Calculated value: <% out.print(printResult); %></p>
            </form>
        </div>
        <footer class="footer">
            <div class="container">
                Created by Scott Muth
            </div>
        </footer>
    </body>
</html>
