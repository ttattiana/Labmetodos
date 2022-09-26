<%-- 
    Document   : response
    Created on : 21/09/2022, 12:47:18 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandle" />
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="fecha" />
        <h1><jsp:getProperty name="mybean" property="name" /> , veo que tienes <jsp:getProperty name="mybean" property="fecha" /> años!</h1> 
    </body>
</html>
