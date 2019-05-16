package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Contacto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\n");
      out.write("        <link href=\"css/master.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.2.1.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.validate.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("              $(document).ready(function () {\n");
      out.write("                $(\"frm\").validate({\n");
      out.write("                    rules:{\n");
      out.write("                        rut: \"required\", \n");
      out.write("                        nombre: \"required\",\n");
      out.write("                        email: \"required\",\n");
      out.write("                        dir: \"required\",\n");
      out.write("                        tel: \"required\",\n");
      out.write("                        act: \"required\",\n");
      out.write("                        obs: \"required\"\n");
      out.write("                    }, messages: {\n");
      out.write("                        rut: \"Ingrese rut\",\n");
      out.write("                        nombre: \"Ingrese nombre\",\n");
      out.write("                        email: \"Ingrese email\",\n");
      out.write("                        dir: \"Ingrese dirección\",\n");
      out.write("                        act: \"Seleccione opcion\",\n");
      out.write("                        obs: \"Debe ingresar una observaci&oacute;n!\"\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"fondo1\">\n");
      out.write("        <div id=\"contact fondo1\">\n");
      out.write("        <div class=\"container\" >\n");
      out.write("        <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("        <h2>Contacto</h2>\n");
      out.write("        </div>\n");
      out.write("        <form id=\"frm\" name=\"frm\" method=\"POST\" action=\"request.jsp\">\n");
      out.write("            <table class=\"table table-condensed  table-responsive\" title=\"Datos\">\n");
      out.write("                <thead>\n");
      out.write("                    \n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"1\">\n");
      out.write("                            <label>Rut</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                            <input required=\"Requerido\" class=\"form-control\" type=\"text\" id=\"rut\" name=\"rut\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"1\">\n");
      out.write("                            <label>Nombre Completo</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                            <input required=\"Requerido\" class=\"form-control\" type=\"text\" id=\"nombre\" name=\"nombre\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"1\">\n");
      out.write("                            <label>Email</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                            <input required=\"Requerido\" class=\"form-control\" type=\"email\" id=\"email\" name=\"email\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"1\">\n");
      out.write("                            <label>Número de contacto</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                            <input required=\"Requerido\" class=\"form-control\" type=\"text\" id=\"tel\" name=\"tel\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"1\">\n");
      out.write("                            <label>Direcci&oacute;n</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                            <input  required=\"Requerido\" class=\"form-control\" type=\"text\" id=\"dir\" name=\"dir\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"1\">\n");
      out.write("                            <label>Situación laboral</label>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr> \n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" value=\"1\" id=\"laboral\" name=\"act\">\n");
      out.write("                            <label>Contrato indefinido</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" value=\"2\" id=\"laboral\" name=\"act\">\n");
      out.write("                            <label>Contrato a plazo fijo</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" value=\"3\" id=\"laboral\" name=\"act\">\n");
      out.write("                            <label>Contrato a honorario</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" value=\"4\" id=\"laboral\" name=\"act\">\n");
      out.write("                            <label>Cesante/Buscando Trabajo</label>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </tbody>    \n");
      out.write("            </table>\n");
      out.write(" \n");
      out.write("            <label>Observaci&oacute;n</label><br>\n");
      out.write("            <textarea class=\"form-control\" id=\"obs\" name=\"obs\"></textarea><br>\n");
      out.write("            <div id=\"acepta\">\n");
      out.write("            <label>Acepta los términos de contacto de la página</label>\n");
      out.write("            <input  required=\"Requerido\" type=\"checkbox\" value=\"\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\"> <input required=\"Requerido\" class=\"btn btn-success\" type=\"submit\" value=\"Enviar\" name=\"ok\" /></button>\n");
      out.write("     \n");
      out.write("        </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
