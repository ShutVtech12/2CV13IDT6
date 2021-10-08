/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escom.ipn.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jemil
 */
public class Dinamismo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String opc = "";
            opc = request.getParameter("opcion");
            HttpSession session = request.getSession();
            session.setAttribute("opcion", opc);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css' rel='stylesheet'>");
            out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js'></script>");
            out.println("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js'></script>");
            out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js'></script>");
            out.println("<title>Dinamismo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            switch(opc){
                case "Area":
                    out.println("<center><h1>Etiqueta area</h1>");
                    out.println("<img src='Figuras2.jpg'></center>");
                    out.println("<form class='row g-3' method='post' action='Resultados'>");
                    
                    
                    out.println("<h3>Coordenadas del Cuadrado</h3>");
                    out.println("<label>Esquina Superior Izquierda</label>");
                    out.println("<div class='col-4'>");
                    out.println("<label for='inputSIU' class='form-label'>Coordenada X</label>");
                    out.println("<input type='number' name='inputSIU' class='form-control' id='inputSIU' value='2'>");
                    out.println("</div>");
                    out.println("<div class='col-md-4'>");
                    out.println("<label for='inputSID' class='form-label'>Coordenada Y</label>");
                    out.println("<input type='number' name='inputSID' class='form-control' id='inputSID' value='2'>");
                    out.println("</div>");
                    out.println("<label>Esquina Inferior Derecha</label>");
                    out.println("<div class='col-4'>");
                    out.println("<label for='inputIU' class='form-label'>Coordenada X</label>");
                    out.println("<input type='number' name='inputIU' class='form-control' id='inputIU' value='72'>");
                    out.println("</div>");
                    out.println("<div class='col-md-4'>");
                    out.println("<label for='inputID' class='form-label'>Coordenada Y</label>");
                    out.println("<input type='number' name='inputID' class='form-control' id='inputID' value='96'>");
                    out.println("</div>");
                    
                    
                    out.println("<h3>Coordenadas del Circulo</h3>");
                    out.println("<div class='col-4'>");
                    out.println("<label for='inputX' class='form-label'>Coordenada X del centro</label>");
                    out.println("<input type='number' name='inputX' class='form-control' id='inputX' value='145'>");
                    out.println("</div>");
                    out.println("<div class='col-md-4'>");
                    out.println("<label for='inputY' class='form-label'>Coordenada Y del centro</label>");
                    out.println("<input type='number' name='inputY' class='form-control' id='inputY' value='45'>");
                    out.println("</div>");
                    out.println("<div class='col-md-4'>");
                    out.println("<label for='inputRa' class='form-label'>Radio del circulo</label>");
                    out.println("<input type='number' name='inputRa' class='form-control' id='inputRa' value='35'>");
                    out.println("</div>");
                    
                    
                    out.println("<h3>Coordenadas del Triangulo</h3>");
                    out.println("<label>Arista 1</label>");
                    out.println("<div class='col-4'>");
                    out.println("<label for='inputAUX' class='form-label'>Coordenada X</label>");
                    out.println("<input type='number' name='inputAUX' class='form-control' id='inputAUX' value='246'>");
                    out.println("</div>");
                    out.println("<div class='col-md-4'>");
                    out.println("<label for='inputAUY' class='form-label'>Coordenada Y</label>");
                    out.println("<input type='number' name='inputAUY' class='form-control' id='inputAUY' value='3'>");
                    out.println("</div>");
                    out.println("<label>Arista 2</label>");
                    out.println("<div class='col-4'>");
                    out.println("<label for='inputADX' class='form-label'>Coordenada X</label>");
                    out.println("<input type='number' name='inputADX' class='form-control' id='inputADX' value='206'>");
                    out.println("</div>");
                    out.println("<div class='col-md-4'>");
                    out.println("<label for='inputAUY' class='form-label'>Coordenada Y</label>");
                    out.println("<input type='number' name='inputAUY' class='form-control' id='inputAUY' value='95'>");
                    out.println("</div>");
                    out.println("<label>Arista 3</label>");
                    out.println("<div class='col-4'>");
                    out.println("<label for='inputATX' class='form-label'>Coordenada X</label>");
                    out.println("<input type='number' name='inputATX' class='form-control' id='inputATX' value='286'>");
                    out.println("</div>");
                    out.println("<div class='col-md-4'>");
                    out.println("<label for='inputATY' class='form-label'>Coordenada Y</label>");
                    out.println("<input type='number' name='inputATY' class='form-control' id='inputATY' value='95'>");
                    out.println("</div>");

                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Article":
                    out.println("<center><h1>Etiqueta Article</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Audio":
                    out.println("<center><h1>Etiqueta Audio</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Video":
                    out.println("<center><h1>Etiqueta Video</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Cite":
                    out.println("<center><h1>Etiqueta Cite</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Command":
                    out.println("<center><h1>Etiqueta Command</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Div":
                    out.println("<center><h1>Etiqueta Div</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Embed":
                    out.println("<center><h1>Etiqueta Embed</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Img":
                    out.println("<center><h1>Etiqueta Img</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Menu":
                    out.println("<center><h1>Etiqueta Menu</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Object":
                    out.println("<center><h1>Etiqueta Object</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Progress":
                    out.println("<center><h1>Etiqueta Progress</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Source":
                    out.println("<center><h1>Etiqueta Source</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Textarea":
                    out.println("<center><h1>Etiqueta Textarea</h1>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
            }
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
