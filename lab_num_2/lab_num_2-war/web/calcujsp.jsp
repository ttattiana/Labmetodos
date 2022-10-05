<%-- 
    Document   : calcujsp
    Created on : 4/10/2022, 03:03:43 PM
    Author     : Tatiana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <form action="Calcuservlet" method="POST"> 
            <input type="text" name="t1">
            <input type="text" name="t2">
            <input type="submit" value="=">
         
        </form>
        <form action="Calcuservlet" method="POST"> 
       
            <input type="submit" value="1" name="btn1"/>
            <input type="submit" value="2" name="btn2"/>
            <input type="submit" value="3" name="btn3"/>
           
        </form>
        
        <form action="Calcuservlet" method="POST"> 
       
            <input type="submit" value="4" name="btn4"/>
            <input type="submit" value="5" name="btn5"/>
            <input type="submit" value="6" name="btn6"/>
            
        </form>
       
        <form action="Calcuservlet" method="POST"> 
       
            <input type="submit" value="7" name="btn7"/>
            <input type="submit" value="8" name="btn8"/>
            <input type="submit" value="9" name="btn9"/>
            
        </form>
    </body>
</html>
