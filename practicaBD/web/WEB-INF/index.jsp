<%-- 
    Document   : newjsp
    Created on : 06/11/2017, 05:08:19 PM
    Author     : isaac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pratica de Base de Datos</title>
    </head>
    <body>
        <form carion="srvController" method="post">
            <table>
                <tr><td><h5>Ingrese la cedula<h5/></td><td><input type="text" name="cedula"></td><td><input type="submit" name="envio" value="Enviar"></td></tr>
            </table> 
            <table border="1">
                <thead>
                                                                                                                                                  
                    <tr>
                        <th>Cedula</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Telefono</th>
                        <th>Direccion</th>                                                                        
                        
                    </tr>    
                </thead>
                                                                                
            </table>
        </form>
        
    </body>
</html>
