<%-- 
    Document   : calculator1
    Created on : Jan 30, 2016, 10:55:14 AM
    Author     : Scott
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/materialize.css" type="text/css"/>
        <link href="css/custom.css" rel="stylesheet" type="text/css"/>
        <title>Rectangle Calculator</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
            <div class="nav-wrapper black">
                <a href="#" class="brand-logo">Area Calculator Version 1</a>
                <ul class="right side-nav">
                    <li><a href="calculator1.jsp">Version 1</a></li>
                    <li><a href="calculator2.jsp">Version 2</a></li>
                    <li><a href="calculator3.jsp">Version 3</a></li>
                    <li><a href="calculator4.jsp">Version 4</a></li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <form id="rectForm" method="POST" action="calc1">
                <label for="width">Width</label>
                <input type="number" name="width" id="width" required="required" placeholder="Width" />
                <label for="height">Height</label>
                <input type="number" name="height" id="height" required="required" placeholder="Height" />
                <input type="submit" value="Calculate" />
            </form>
        <div>
        <footer class="footer">
            <div class="container">
                Created by Scott Muth
            </div>
        </footer>
    </body>
</html>
