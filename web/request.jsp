<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recibo de Formulario</title>
        <link href="css/master.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
            try {
                String rut = request.getParameter("rut");
                String nombre = request.getParameter("nombre");
                String email = request.getParameter("email");
                String direccion = request.getParameter("direccion");
                String actividad = request.getParameter("rdo-act");
                String telefono= request.getParameter("tel");
                int sex = Integer.parseInt(request.getParameter("sex"));
                int edad = Integer.parseInt(request.getParameter("ed"));
                String obs = request.getParameter("obs");
                String date = request.getParameter("nac");
            
    
            } catch (Exception ex) {
                out.print(ex.getMessage());
            }
        %>
        <div class="panel-body cen container">
            <p class="alert-success">Gracias por contactarnos</p>
            
        </div>
        <a href="index.html">Volver</a>
    </body>
</html>
