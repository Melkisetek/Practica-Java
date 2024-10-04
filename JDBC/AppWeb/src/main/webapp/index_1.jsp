<%-- 
    Document   : index
    Created on : 23/08/2022, 12:17:43
    Author     : Melquisedec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String nombre="Melquisedec";
            int edad=21;
            String saludar="Hola "+nombre+" a tus "+edad+" años ya eres un adulto.";
            out.println(saludar);
            
         %>
    </body>
</html>
