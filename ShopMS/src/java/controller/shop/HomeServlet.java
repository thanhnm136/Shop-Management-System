/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.shop;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
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
public class HomeServlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");

        CategoryDAO cDAO = new CategoryDAO();
        List<Category> listC = cDAO.getAllCategory();

        ProductDAO pDAO = new ProductDAO();
        List<Product> listP = pDAO.getAllProducts();

        request.setAttribute("listProduct", listP);
        request.setAttribute("listCategory", listC);
        request.getRequestDispatcher("shop/home.jsp").forward(request, response);

        /**
         * home - //get data from dao DAO dao = new DAO(); // List<Product>
         * listProduct = dao.getAllProduct(); List<Category> listC =
         * dao.getAllCategory(); Product last = dao.getLast();
         *
         * //paging int pageIndex = 1; final int PAGE_SIZE = 6; int cateID = 0;
         * String raw_page = request.getParameter("pageIndex"); if(raw_page !=
         * null){ pageIndex = Integer.parseInt(raw_page); } int totalPage =
         * dao.countPage(PAGE_SIZE); List<Product> listProduct =
         * dao.getProductByPage(pageIndex, PAGE_SIZE);
         *
         * //set data to jsp request.setAttribute("totalPage", totalPage);
         * request.setAttribute("pageIndex", pageIndex);
         * request.setAttribute("cateID", cateID); request.setAttribute("listP",
         * listProduct); request.setAttribute("listC", listC);
         * request.setAttribute("p", last);
         * request.getRequestDispatcher("Home.jsp").forward(request, response);
         */
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
