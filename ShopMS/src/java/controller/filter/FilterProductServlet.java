/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.filter;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Product;

/**
 *
 * @author Minh Thanh
 */
public class FilterProductServlet extends HttpServlet {

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

        CategoryDAO cDAO = new CategoryDAO();
        List<Category> listC = cDAO.getAllCategory();
        String condition = request.getParameter("condition");

        ProductDAO pDAO = new ProductDAO();
        List<Product> listP = pDAO.getAllProducts();

        switch (condition) {
            case "az":
                listP = pDAO.getAllProductsByCondition("[name] ASC");
                break;
            case "za":
                listP = pDAO.getAllProductsByCondition("[name] DESC");
                break;
            case "19":
                listP = pDAO.getAllProductsByCondition("[price] ASC");
                break;
            case "91":
                listP = pDAO.getAllProductsByCondition("[price] DESC");
                break;
            case "new":
                listP = pDAO.getAllProductsByCondition("[dateCreated] DESC");
                break;
            case "old":
                listP = pDAO.getAllProductsByCondition("[dateCreated] ASC");
                break;
            default:
                listP = pDAO.getAllProducts();
                break;
        }

        request.setAttribute("cond", condition);
        request.setAttribute("listProduct", listP);
        request.setAttribute("listCategory", listC);
        request.getRequestDispatcher("shop/home.jsp").forward(request, response);
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
