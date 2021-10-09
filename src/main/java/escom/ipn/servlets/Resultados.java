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
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Audio":
                    out.println("<center><h1>Resultados de la etiqueta Audio</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Video":
                    out.println("<center><h1>Resultados de la etiqueta Video</h1></center>");
                    
                    
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
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Img":
                    out.println("<center><h1>Resultados de la etiqueta Img</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Menu":
                    out.println("<center><h1>Resultados de la etiqueta Menu</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Object":
                    out.println("<center><h1>Resultados de la etiqueta Object</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Progress":
                    out.println("<center><h1>Resultados de la etiqueta Progress</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Source":
                    out.println("<center><h1>Resultados de la etiqueta Source</h1></center>");
                    
                    
                    out.println("<div align='center'>");
                    out.println("<a class='btn btn-primary' href="+request.getContextPath()+">Menu Principal</button>");
                    out.println("<a class='nav-link active' aria-current='page' href='javascript: history.go(-1)'>Regresar</a>");
                    out.println("</div>");
                    break;
                case "Textarea":
                    out.println("<center><h1>Resultados de la etiqueta Textarea</h1></center>");
                    
                    
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