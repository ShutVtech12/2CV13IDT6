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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
                    out.println("Crea tu propio art&iacute;culo</center>");
                    out.println("<form method='post' action='Resultados'>");
                    out.println("<div class='mb-3'>");
                    out.println("<label for='titulo' class='form-label'>Titulo</label>");
                    out.println("<input type='text' class='form-control' id='titulo' name='titulo'>");
                    out.println("</div>");
                    out.println("<div class='mb-3'>");
                    out.println("<label for='contenido' class='form-label'>Contenido</label>");
                    out.println("<input type='text' class='form-control' id='contenido' name='contenido'>");
                    out.println("</div>");
                    out.println("<div class='mb-3'>");
                    out.println("<label for='derechos' class='form-label'>Derechos</label>");
                    out.println("<input type='text' class='form-control' id='derechos' name='derechos'>");
                    out.println("</div>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Audio":
                    out.println("<center><h1>Etiqueta Audio</h1>");
                    out.println("Reproduce un audio</center>");
                    out.println("<form method='post' action='Resultados'>");
                    out.println("<div class='mb-3' align='center'>");
                    out.println("<input type='radio'  name='opcion' value='Risas'/> Risas");
                    out.println("<input type='radio'  name='opcion' value='Llanto'/> Llanto");
                    out.println("<input type='radio'  name='opcion' value='Awww'/> Awww");
                    out.println("</div>");
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Video":
                    out.println("<center><h1>Etiqueta Video</h1>");
                    out.println("Reproduce un video</center>");
                    out.println("<form method='post' action='Resultados'>");
                    out.println("<div class='mb-3' align='center'>");
                    out.println("<p><input type='radio'  name='opcion' value='Resumen'/> Resumen de Noticias Videojuegos</p>");
                    out.println("<p><input type='radio'  name='opcion' value='MiChamarra'/> Escena Eliminada Avengers</p>");
                    out.println("<p><input type='radio'  name='opcion' value='Halo'/> Halo Infinite Trailer</p>");
                    out.println("</div>");
                    
                    
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
                    out.println("Modifica el tamaño del video</center>");
                    out.println("<form method='post' action='Resultados'>");
                    out.println("<div class='mb-3'>");
                    out.println("<label for='ancho' class='form-label'>Ancho del video</label>");
                    out.println("<input type='number' class='form-control' id='ancho' name='ancho'>");
                    out.println("</div>");
                    out.println("<div class='mb-3'>");
                    out.println("<label for='largo' class='form-label'>Largo del video</label>");
                    out.println("<input type='number' class='form-control' id='largo' name='largo'>");
                    out.println("</div>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Img":
                    out.println("<center><h1>Etiqueta Img</h1>");
                    out.println("<H2> Ingresa la imagen gif (bob) </H2>");

                    out.println("<form name='dinamo' method='post'  action='Resultados'>");
                    out.println("<input type='text'  name='imagen'  placeholder='Ingresa bob.gif'>");
                    out.println("<H2> Ingresa el ancho y largo  </H2>");
                    out.println("<input type='number'  name='anchoi'  placeholder='Ancho Imagen'>");
                    out.println("<input type='number'  name='largoi'  placeholder='Largo Imagen'>");

                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Menu":
                    out.println("<center><h1>Etiqueta Menu</h1>");
                    out.println("<H2> Ingresa cuantas opciones va a tener el menu </H2>");
                    out.println("<form name='dinamo' method='post'  action='Resultados'>");
                    out.println("<input type='number' class='form-control' name='nopc' placeholder='Reactivos del menu'>");

                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Object":
                    out.println("<center><h1>Etiqueta Object</h1>");
                    out.println("<H2> En este caso tenemos 3 tipos selecciona el tipo que gustes   </H2>");
                    out.println(" <form method='post'  action='Resultados'>");
                    out.println("<input type=\"radio\"  name='selector' value='1' checked=\"checked\"/> imagen <br>");
                    out.println("<input type=\"radio\"  name='selector' value='2' />  html  <br>");
                    out.println("<input type=\"radio\"  name='selector' value='3'/> video ");
                    out.println("<br> ");
                    out.println("<input type='number'  name='anchoo'  placeholder='Ancho Objeto'>");
                    out.println("<input type='number'  name='largoo'  placeholder='Largo Objeto'>");

                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Progress":
                    out.println("<center><h1>Etiqueta Progress</h1>");
                    out.println("Imprime una barra de progeso con un progreso fijo");
                    out.println("<form method='post' action='Resultados'>");
                    out.println("<div class='mb-3' align='center'>");
                    out.println("¿Qué porcentaje quieres que tenga tu barra de proceso?<br>");
                    out.println("<input type='text' name='progress'/><br>");
                    out.println("</div>");
                    
                    out.println("");
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Source":
                    out.println("<center><h1>Etiqueta Source</h1>");
                    out.println("Se usa para poder abrir archivos multimedia mediante su ruta");
                    out.println("<form method='post' action='Resultados'>");
                    out.println("<div class='mb-3' align='center'>");
                    out.println("Escribe la ruta/link de una imagen para pdoer abrirla<br>");
                    out.println("<input type='text' name='source'/><br>");
                    out.println("</div>");
                    
                    out.println("");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<button type='submit' class='btn btn-primary'>Enviar</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Textarea":
                    out.println("<center><h1>Etiqueta Textarea</h1>");
                    out.println("Se usa para ingrresar texto, en su mayoria reseñas,comentarios, entre otros");
                    out.println("<form method='post' action='Resultados'>");
                    out.println("<div class='mb-3' align='center'>");
                    out.println("num filas: <input type='text' name='textFil'/><br>");
                    out.println("num columnas: <input type='text' name='textCol'/><br>");
                    out.println("</div>");
                    
                    out.println("");
                    
                    
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
