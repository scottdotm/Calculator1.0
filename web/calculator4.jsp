<%-- 
    Document   : calculator4
    Created on : Jan 30, 2016, 11:47:49 AM
    Author     : Scott
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
        <link href="css/custom.css" rel="stylesheet" type="text/css"/>
        <title>Calculator 4</title>
    </head>
    <body>
        <nav>
            <div class="nav-wrapper black">
                <a href="#" class="brand-logo">Area Calculator Version 4</a>
                <ul class="right side-nav">
                    <li><a href="calculator1.jsp">Version 1</a></li>
                    <li><a href="calculator2.jsp">Version 2</a></li>
                    <li><a href="calculator3.jsp">Version 3</a></li>
                    <li><a href="calculator4.jsp">Version 4</a></li>
                </ul>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <form id="rectForm" method="POST" action="calc4?action=rect" name="calc1">
                    <h4 class="col m4">Rectangle</h4>
                    <div class="input-field col m4">
                        <label for="width">Width</label>
                        <input type="number" name="width" id="width" required="required" />
                    </div>
                    <div class="input-field col m4">
                        <label for="height">Height</label>
                        <input type="number" name="height" id="height" required="required" />
                    </div>
                    <button class="btn right waves-effect" type="submit">Calculate</button>
                </form>
            </div>
            <div class="row">
                <form id="circForm" method="POST" action="calc4?action=circ" name="calc2">
                    <h4 class="col m4">Circle</h4>
                    <div class="input-field offset-m4 col m4">
                        <label for="width">Radius</label>
                        <input type="number" name="width" id="width" required="required" />
                    </div>
                    <button class="btn right waves-effect" type="submit">Calculate</button>
                </form>
            </div>
            <div class="row">
                <form id="triForm" method="POST" action="calc4?action=tri" name="calc3">
                    <h4 class="col m4">Triangle</h4>
                    <div class="input-field col m4">
                        <label for="width">Width</label>
                        <input type="number" name="width" id="width" required="required" />
                    </div>
                    <div class="input-field col m4">
                        <label for="height">Height</label>
                        <input type="number" name="height" id="height" required="required" />
                    </div>
                    <button class="btn right waves-effect" type="submit">Calculate</button>
                </form>
            </div>
                <h3 id="output">Calculated value: ${result}</h3>
            </div>
            <footer class="footer">
                <div class="container">
                    Created by Scott Muth
                </div>
            </footer>
            <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
            <script type="text/javascript" src="js/custom.js"></script>
        </div>
    </body>
</html>