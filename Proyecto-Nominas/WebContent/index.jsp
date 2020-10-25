<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conexion a la bbdd</title>
</head>
<body>
<%try{
Class.forName("com.mysql.jdbc.Driver");
Connection conexion=DriverManager.getConnection
("jdbc:mysql://localhost/laboral","root","");
out.println("Conexión realizada con éxito a: "+conexion.getCatalog());
conexion.close();
} catch(SQLException ex)
{ %>
<%="Se produjo una excepción durante la conexión:"+ex%>
<%} catch(Exception ex){ %>
<%="Se produjo una excepción:"+ex%>
<%}%>
</body>
</html>