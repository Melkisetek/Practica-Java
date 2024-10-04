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
        <title>Saludar Humano</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form action="Ejercicio_1.jsp" method="post">
                        <div class="form-group">
                            <label >Humano escribe tu nombre</label>
                            <input type="text" class="form-control" name="nombreDelHumano" placeholder="Nombre">
                        </div>
                        <div class="form-group">   
                            <label >Ahora humano escribe cuantos ciclos humanoides tines(edad)</label>
                            <input type="text" class="form-control" name="edadDelHumano" placeholder="Nombre">
                        </div>
                        <button type="submit" class="btn btn-primary">Envar</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="container mt-1">
            <div class="row">
                <div class="col-sm">
                    <div class="alert alert-primary" role="alert">
                        <%
                           String nombre=request.getParameter("nombreDelHumano");
                           String edad=request.getParameter("edadDelHumano");
                           if (nombre!=null && edad!=null){
                                int edadNumero=Integer.parseInt(edad);
                                String mensajeEdad=" ";
                                if (edadNumero>=1 && edadNumero<=18){
                                    mensajeEdad="Eres una persona inexperto";
                            }
                                if (edadNumero>18 && edadNumero<=30){
                                    mensajeEdad="Eres joven y inexperto";
                            }
                                if (edadNumero>30){
                                mensajeEdad="Eres una persona adulto";
                            }
                           
                                String saludarAlHumano="Hola "+nombre+" a tus "+edad+" años "+mensajeEdad;
                                out.println(saludarAlHumano);
                            }
                            else{
                                out.println("Los campos no pueden, estar vacío");
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
