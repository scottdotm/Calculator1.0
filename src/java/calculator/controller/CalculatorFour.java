package calculator.controller;

import calculator.model.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Scott
 */
public class CalculatorFour extends HttpServlet {
    
    private static final String RESULT_PAGE = "/calculator4.jsp";
    private static final String ERROR_PAGE = "/error.jsp";
    private static final String ACTION_RECT = "rect";
    private static final String ACTION_CIRC = "circ";
    private static final String ACTION_TRI = "tri";

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
            out.println("<title>Servlet CalculatorThree</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatorThree at " + request.getContextPath() + "</h1>");
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
        RectangleCalculatorService rect = new RectangleCalculatorService();
        CircleCalculatorService circ = new CircleCalculatorService();
        TriangleCalculatorService tri = new TriangleCalculatorService();
        String destination = RESULT_PAGE;
        String width, height, action, result;
        try
        {
            result = "";
            action = request.getParameter("action");
            if(action.equals(ACTION_RECT))
            {
                width = request.getParameter("width");
                height = request.getParameter("height");
                result = rect.calculateArea(width, height).toPlainString();
            }
            if(action.equals(ACTION_CIRC))
            {
                width = request.getParameter("width");
                result = circ.calculateArea(width).toPlainString();
            }
            if(action.equals(ACTION_TRI))
            {
                width = request.getParameter("width");
                height = request.getParameter("height");
                result = tri.calculateArea(width, height).toPlainString();
            }
            request.setAttribute("result", result);
        }
        catch(Exception e)
        {
            destination = ERROR_PAGE;
            request.setAttribute("msg", e.getMessage());
        }
        RequestDispatcher view = request.getRequestDispatcher(destination);
        view.forward(request, response);
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