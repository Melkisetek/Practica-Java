<%-- 
    Document   : BaseMysql
    Created on : 23/08/2022, 23:51:54
    Author     : Melquisedec
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>Listado</title>
    </head>
    <body>
        <%
            Connection con=null;
            Statement st=null;
            ResultSet rs=null;
        %>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col" colspan="4" class="text-center"><h3>Empleados</h3></th>
                                <th scope="col">
                                    <a href="crearEmple.jsp"><i class="fa fa-user-plus" aria-hidden="true"></i></a>
                                </th>
                            </tr>
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Dirección</th>
                                <th scope="col">Telefono</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                try {
                                
                               
                                Class.forName("com.mysql.jdbc.Driver");
                                con=DriverManager.getConnection("jdbc:mysql://localhost/ejercicio_1?user=root&password=");
                                st=con.createStatement();
                                rs=st.executeQuery("SELECT * FROM `empledos`");
                                while (rs.next()){
                                %>
                            <tr>
                                <th scope="row"><%= rs.getString(1)%></th>
                                <td><%= rs.getString(2)%></td>
                                <td><%= rs.getString(3)%></td>
                                <td><%= rs.getString(4)%></td>
                                <td>
                                    <i class="fa fa-pencil" aria-hidden="true"></i>
                                    <i class="fa fa-trash" aria-hidden="true"></i>
                                </td>

                            </tr>
                            <%
                               }
                               
                                 } catch (Exception e){
                                    out.print("Error mysql"+e);
                                }
                            %>        
                               
                            
                            
                            
                <!--            <tr>
                                <th scope="row">2</th>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                            </tr>
                            <tr>
                                <th scope="row">3</th>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter</td>
                            </tr> -->
                        </tbody>
                    </table>
                </div>            
            </div>
        </div>     
    </body>
</html>
