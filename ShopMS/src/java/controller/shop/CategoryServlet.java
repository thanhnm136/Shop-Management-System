/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.shop;

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
public class CategoryServlet extends HttpServlet {

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
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String cid = request.getParameter("cid");
        CategoryDAO cate = new CategoryDAO();
        List<Category> listC = cate.getAllCategory();

        ProductDAO product = new ProductDAO();
        List<Product> listP = product.groupProductByCategoryId(cid);

        request.setAttribute("listProduct", listP);
        request.setAttribute("listCategory", listC);

        request.getRequestDispatcher("shop/home.jsp").forward(request, response);
        
        /**-category - //lay cateID
        String cateId = request.getParameter("cid");
        DAO dao = new DAO();
//        List<Product> list = dao.getProductByCateID(cateId);

        //paging
        int pageIndex = 1;
        final int PAGE_SIZE = 6;
        String raw_page = request.getParameter("pageIndex");
        if (raw_page != null) {
            pageIndex = Integer.parseInt(raw_page);
        }
        int totalPage = dao.countPageWithCategory(PAGE_SIZE,cateId);
        List<Product> list = dao.getProductByCategoryWithPaging(Integer.parseInt(cateId), pageIndex, PAGE_SIZE);

        //move it to keep (category and last product) still display
        List<Category> listC = dao.getAllCategory();
        Product last = dao.getLast();
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("pageIndex", pageIndex);
        request.setAttribute("listC", listC);
        request.setAttribute("p", last);
        //to show which category is chosen
        request.setAttribute("cateID", cateId);

        request.setAttribute("listP", list);
        request.getRequestDispatcher("Home.jsp").forward(request, response);*/
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
