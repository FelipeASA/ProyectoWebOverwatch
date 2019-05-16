<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Contacto</title>
        <link rel="stylesheet" href="css/bootstrap.css" />
        <link href="css/master.css" rel="stylesheet" type="text/css"/>       
        <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
        <script src="js/jquery.validate.js" type="text/javascript"></script>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#frm").validate({
                    rules: {
                        rut: {required: true},
                        nombre: {required: true},
                        email: {required: true, email: true},
                        tel: {required: true},
                        sex: {required: true},
                        ed: {required: true},
                        nac: {required: true},
                        dir: {required: true},
                        act: {required: true},
                        obs: {required: true}
                    }, messages: {
                        rut: "Ingrese rut",
                        nombre: "Ingrese nombre",
                        email: "Ingrese email",
                        tel: "Ingrese teléfono",
                        sex: "Responda sexo",
                        ed: "Ingrese su edad",
                        nac: "Ingrese fecha de nacimiento",
                        dir: "Ingrese dirección",
                        act: "Seleccione opcion",
                        obs: "Debe ingresar una observaci&oacute;n!"
                    }
                });

            });
        </script>
        <style>
            #head1{
                background-color: #f7f7f7;
                color: #f0ad4e;
            }

            #fondo2{
                background-color: #f0ad4e;
            }
            .col{
                background-color: #f0ad4e;
            }
            .logo{
                width:80px;
                position: relative;
                float: right;
                padding: 10px;


            }

        </style>
        <link rel="icon" href="img/logo.png" type="image/png"/>
    </head>
    <body class="col" >
        <div class="panel container">
            <div class="panel-heading" id="head1">
                <span><img class="img-responsive logo" src="img/logo.png"/></span>
                <h2>Overwatacas</h2>

            </div>
            <div >
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href="#">Equipo de Overwatch</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li ><a href="index.html">Home</a></li>
                            <li><a href="info.html">Sobre Nosotros</a></li>
                            <li class="active"><a href="contact.jsp">Únete</a></li>
                            <li><a href="https://playoverwatch.com/es-es/" target="_blank">Compra el juego</a></li>
                        </ul>
                    </div>
                </nav>
                <div id="contact">

                    <div  >

                        <div class="panel-heading">
                            <h2>Contacto</h2>
                        </div>
                        <form id="frm" name="frm" method="POST" action="request.jsp">
                            <table class="table table-condensed  table-responsive" title="Datos">
                                <thead>

                                </thead>
                                <tbody>
                                    <tr>
                                        <td colspan="1">
                                            <label>Rut</label>
                                        </td>
                                        <td colspan="3">
                                            <input  class="form-control" type="text" id="rut" name="rut" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Nombre Completo</label>
                                        </td>
                                        <td colspan="3">
                                            <input  class="form-control" type="text" id="nombre" name="nombre" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Email</label>
                                        </td>
                                        <td colspan="3">
                                            <input  class="form-control" type="email" id="email" name="email" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Número de contacto</label>
                                        </td>
                                        <td colspan="3">
                                            <input  class="form-control" type="text" id="tel" name="tel" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Sexo</label>
                                        </td>
                                        <td colspan="3">
                                            <select class="form-control" name="sex" id="sex">
                                                <option value=""></option>
                                                <option value="1">Femenino</option>
                                                <option value="2">Masculino</option>
                                                <option value="3">Otro</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Edad</label>
                                        </td>
                                        <td colspan="3">
                                            <input  class="form-control" type="number" id="ed" name="tel" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Fecha de Nacimiento</label>
                                        </td>
                                        <td colspan="3">
                                            <input class="form-control" type="date" id="nac" name="nac" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Direcci&oacute;n</label>
                                        </td>
                                        <td colspan="3">
                                            <input   class="form-control" type="text" id="dir" name="dir" value=""/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="1">
                                            <label>Situación laboral</label>
                                        </td>
                                    </tr>
                                    <tr> 
                                        <td>
                                            <input type="radio" value="1" id="laboral" name="act">
                                            <label>Contrato indefinido</label>
                                        </td>
                                        <td>
                                            <input  type="radio" value="2" id="laboral" name="act">
                                            <label>Contrato a plazo fijo</label>
                                        </td>
                                        <td>
                                            <input  type="radio" value="3" id="laboral" name="act">
                                            <label>Contrato a honorario</label>
                                        </td>
                                        <td>
                                            <input  type="radio" value="4" id="laboral" name="act">
                                            <label>Cesante/Buscando Trabajo</label>
                                        </td>
                                    </tr>

                                </tbody>    
                            </table>

                            <label>Observaci&oacute;n</label><br>
                            <textarea class="form-control" id="obs" name="obs"></textarea><br>
                            <div id="acepta">
                                <label>Acepta los términos de contacto de la página</label>
                                <input   type="checkbox" value="">
                            </div>
                            <button type="submit"> <input  class="btn btn-success" type="submit" value="Enviar" name="ok" /></button>


                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
