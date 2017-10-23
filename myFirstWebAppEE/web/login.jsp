<%-- 
    Document   : login
    Created on : 23-oct-2017, 17:25:40
    Author     : Pepe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #00cccc; text-align: center">
        <h1>Hello World!</h1>
        <div style="margin: auto; width: 30%; border: 3px solid blue; background-color: #006699; padding-top: 20px; padding-bottom: 30px">
            <form action="login" method="post">
                <p>E-Mail: <input type="text" name="email"></p>
                <p>Password: <input type="password" name="pass"></p>
                <p><input type="submit" value="Sign In"></p>
            </form>
            <p style="background-color: azure; width: 50%; margin: auto">Usuario Correcto?: <%= request.getAttribute("validado") %></p>
        </div>
    </body>
</html>
