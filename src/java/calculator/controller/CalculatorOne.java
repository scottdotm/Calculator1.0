package calculator.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import calculator.model.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Scott
 */
public class CalculatorOne extends HttpServlet {
    
    private static final String RESULT_PAGE = "/calculator2.jsp";
    private static final String ERROR_PAGE = "/error.jsp";
    private static final String GET_ERROR_MESSAGE = "This action does not support GET requests!";

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
        
            RequestDispatcher view = request.getRequestDispatcher(ERROR_PAGE);
            request.setAttribute("msg", GET_ERROR_MESSAGE);
            view.forward(request, response);
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
        
        RectangleCalculatorService calculate = new RectangleCalculatorService();
        
        String width, height;
        try
        {
            width = request.getParameter("width");
            height = request.getParameter("height");
            String result = calculate.calculateArea(width, height).toPlainString();
            
            request.setAttribute("result", result);
            
            RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
            view.forward(request, response);
        }
        catch(Exception e)
        {
            RequestDispatcher view = request.getRequestDispatcher(ERROR_PAGE);
            request.setAttribute("msg", e.getMessage());
            view.forward(request, response);
        }
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
