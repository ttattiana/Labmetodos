/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionbean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tatiana
 */
public class Calcuservlet extends HttpServlet {

    @EJB
    private calcubeanLocal calcubean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calcuservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int a = Integer.parseInt(request.getParameter("t1"));
            int b = Integer.parseInt(request.getParameter("t2"));
            int c = Integer.parseInt(request.getParameter("t1"));
            int d = Integer.parseInt(request.getParameter("t2"));
            int e = Integer.parseInt(request.getParameter("t1"));
            int f = Integer.parseInt(request.getParameter("t2"));
            int g = Integer.parseInt(request.getParameter("t1"));
            int h = Integer.parseInt(request.getParameter("t2"));
            int i = Integer.parseInt(request.getParameter("t1"));
            int j = Integer.parseInt(request.getParameter("t2"));
            out.println("<h1> SUMA = " + calcubean.suma(a, b) + "</h1>");
            out.println("<h1> RESTA = " + calcubean.resta(c, d) + "</h1>");
            out.println("<h1> MULTIPICACI??N = " + calcubean.multiplicacion(e, f) + "</h1>");
            out.println("<h1> DIVISI??N = " + calcubean.division(g, h) + "</h1>");
            out.println("<h1> POTENCIACI??N = " + calcubean.potenciacion(i, j) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
