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
public class Resultados extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            String opc = (String) session.getAttribute("opcion");
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
                    out.println("<div align='center'>");
                    out.println("<h1>Resultados de la etiqueta Area</h1></center>");
                    out.println("<img src='Figuras2.jpg' usemap='#mapa'>");
                    out.println("<map name='mapa'>");
                    out.println("<area href='https://acercadehtml.com/etiquetas-html/etiqueta-area-cuadrado.html' shape='rect' coords='"+
                            Integer.parseInt(request.getParameter("inputSIU"))+","+Integer.parseInt(request.getParameter("inputSID"))+","+
                            Integer.parseInt(request.getParameter("inputIU"))+","+Integer.parseInt(request.getParameter("inputID"))+"'>");
                    out.println("<area href='https://acercadehtml.com/etiquetas-html/etiqueta-area-circulo.html' shape='circle' coords='"+
                            Integer.parseInt(request.getParameter("inputX"))+","+Integer.parseInt(request.getParameter("inputY"))+","+
                            Integer.parseInt(request.getParameter("inputRa"))+"'>");
                    out.println("<area href='https://acercadehtml.com/etiquetas-html/etiqueta-area-poligono.html' shape='poly' coords='"+
                            Integer.parseInt(request.getParameter("inputAUX"))+","+Integer.parseInt(request.getParameter("inputAUY"))+","+
                            Integer.parseInt(request.getParameter("inputADX"))+","+Integer.parseInt(request.getParameter("inputAUY"))+","+
                            Integer.parseInt(request.getParameter("inputATX"))+","+Integer.parseInt(request.getParameter("inputATY"))+"'>");
                    out.println("</map>");
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Article":
                    out.println("<center><h1>Resultados de la etiqueta Article</h1></center>");
                    out.println("<article>");
                    out.println("<header>");
                    out.println("<h1>"+request.getParameter("titulo")+"</h1>");
                    out.println("</header>");
                    out.println("<p>"+request.getParameter("contenido")+"</p>");
                    out.println("<footer>");
                    out.println("<p>&copy"+request.getParameter("derechos")+"</p>");
                    out.println("</footer>");
                    out.println("</article>");
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Audio":
                    out.println("<center><h1>Resultados de la etiqueta Audio</h1></center>");
                    out.println("<div align='center'>");
                    out.println("<audio src='"+request.getParameter("opcion")+".mp3' controls>");
                    out.println("Este es un elemento de audio no soportado por tu navegador, prueba con otro");
                    out.println("</audio>");
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href=" + request.getContextPath() + ">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;

                case "Video":
                    out.println("<center><h1>Resultados de la etiqueta Video</h1></center>");
                    out.println("<div align='center'>");
                    out.println("<video src='"+request.getParameter("opcion")+".mp4' controls></video>");
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Cite":
                    out.println("<center><h1>Resultados de la etiqueta Cite</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Command":
                    out.println("<center><h1>Resultados de la etiqueta Command</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Div":
                    out.println("<center><h1>Resultados de la etiqueta Div</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Embed":
                    out.println("<center><h1>Resultados de la etiqueta Embed</h1></center>");
                    out.println("<div align='center'>");
                    out.println("<iframe width='"+request.getParameter("ancho")+"' height='"+request.getParameter("largo")+"' src='https://www.youtube.com/embed/EHaIrTQg-c4'"+
                            " title='YouTube video player' frameborder='0' allow='accelerometer; autoplay; clipboard-write;"+
                            "encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Img":
                    out.println("<center><h1>Resultados de la etiqueta Img</h1></center>");
                    int largo,
                     ancho;
                    String imagen;
                    largo = Integer.parseInt(request.getParameter("largoi"));
                    ancho = Integer.parseInt(request.getParameter("anchoi"));
                    imagen = request.getParameter("imagen");
                    out.println("<div align='center'>");
                    out.print("<img src= '" + imagen + "' width= '" + ancho + "' heightt= '" + largo + "' >");
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href=" + request.getContextPath() + ">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Menu":
                    out.println("<center><h1>Resultados de la etiqueta Menu</h1></center>");

                    int o,
                     x;
                    o = Integer.parseInt(request.getParameter("nopc"));
                    out.println("<div align='center'>");
                    out.println("<H2>Ejemplo de menu con los reactivos dados </H2>");
                    out.print("<menu>");
                    for (x = 1; x <= o; x++) {
                        out.print("<l1>* Elemento numero  " + x + " </li>");
                        out.print("<br>");
                    }
                    out.print("</menu>");
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href=" + request.getContextPath() + ">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Object":
                    out.println("<center><h1>Resultados de la etiqueta Object</h1></center>");

                    String selctor,
                     largoo,
                     anchoo;
                    selctor = request.getParameter("selector");
                    largoo = request.getParameter("largoo");
                    anchoo = request.getParameter("anchoo");
                    out.println("<div align='center'>");
                    if (selctor.equals("1")) {
                        out.println("<object data='bob.gif' width='" + anchoo + "' height='" + largoo + "'></object>");
                    } else {
                        if (selctor.equals("2")) {
                            out.println("<object data='a.html' width='" + anchoo + "' height='" + largoo + "'></object>");
                        } else {
                            if (selctor.equals("3")) {
                                out.println("<object data='gato.mp4' width='" + anchoo + "' height='" + largoo + "'></object>");
                            }
                        }
                    }
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href=" + request.getContextPath() + ">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Progress":
                    out.println("<center><h1>Resultados de la etiqueta Progress</h1></center>");
                    out.println("<div align='center'>");
                    out.println("<progress value='"+request.getParameter("progress")+"' max='100'> </progress>");
                    out.println("</div>");
                    
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Source":
                    out.println("<center><h1>Resultados de la etiqueta Source</h1></center>");
                    out.println("<div align='center'>");
                    out.println("<img src='"+request.getParameter("source")+"' alt=\"Imagencita\">");
                    out.println("</div>");
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Textarea":
                    out.println("<center><h1>Resultados de la etiqueta Textarea</h1></center>");
                    out.println("<div align='center'>");
                    out.println("<h2>Este es tu TextArea<br><textarea id='textito' name='Atexto' rows="+request.getParameter("textFil")+" cols="+request.getParameter("textCol")+">Text area creada Hola mundo</textarea>");
                    out.println("</div>");
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
            }
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
