/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.filter;

import dal.RevenueDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Revenue;

/**
 *
 * @author Minh Thanh
 */
public class FilterRevenueServlet extends HttpServlet {

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

        HttpSession session = request.getSession(true);

        Account acc = (Account) session.getAttribute("acc");
        if (acc == null) {
            PrintWriter out = response.getWriter();
            out.println("Access denied !");
        } else {
            String condition = request.getParameter("condition");
            RevenueDAO rDAO = new RevenueDAO();
            List<Revenue> listR = new ArrayList<>();

            switch (condition) {
                case "day":
                    listR = rDAO.filterRevenueWithTimeline("WHERE DAY(o.[date]) = DAY(GETDATE())");
                    break;
                case "week":
                    listR = rDAO.filterRevenueWithTimeline("WHERE DAY(o.[date]) BETWEEN DAY(GETDATE()-7) AND DAY(GETDATE())\n"
                                                            + "AND MONTH(o.[date]) = MONTH(GETDATE())\n"
                                                            + "AND YEAR(o.[date]) = YEAR(GETDATE())");
                    break;
                case "month":
                    listR = rDAO.filterRevenueWithTimeline("WHERE MONTH(o.[date]) = MONTH(GETDATE())");
                    break;
                case "year":
                    listR = rDAO.filterRevenueWithTimeline("WHERE YEAR(o.[date]) = YEAR(GETDATE())");
                    break;
                case "new":
                    listR = rDAO.filterRevenueWithTimeline("ORDER BY o.[date] DESC");
                    break;
                case "old":
                    listR = rDAO.filterRevenueWithTimeline("ORDER BY o.[date] ASC");
                    break;
                default:
                    listR = rDAO.getAllRevenue();
                    break;
            }
            double totalRevenue = 0;
            for (Revenue revenue : listR) {
                totalRevenue += revenue.getTotalMoney();
            }

            request.setAttribute("cond", condition);
            request.setAttribute("totalRevenue", totalRevenue);
            request.setAttribute("listRevenue", listR);
            request.getRequestDispatcher("admin/revenue.jsp").forward(request, response);
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
