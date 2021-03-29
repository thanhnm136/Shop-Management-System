/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dal.CategoryDAO;
import dal.ProductDAO;
import dal.SizeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;
import model.Product;
import model.Size;

/**
 *
 * @author Minh Thanh
 */
public class EditProductServlet extends HttpServlet {

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
        try {
            response.setCharacterEncoding("UTF-8");
            request.setCharacterEncoding("UTF-8");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ProductDAO pDAO = new ProductDAO();
            SizeDAO sDAO = new SizeDAO();

            //product infor
            String pid = request.getParameter("id");
            String name = request.getParameter("name");
            String cid = request.getParameter("cid");
            String image = "images/" + request.getParameter("image");
            double price = Double.parseDouble(request.getParameter("price"));
            String description = request.getParameter("description");
            String sDate = request.getParameter("dateCreated");

            Date utilDate = sdf.parse(sDate); // java.util.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            Product p = new Product(pid, name, cid, image, price, description, sqlDate);

            //size infor
            String size_name = request.getParameter("size");
            int size_quantity = Integer.parseInt(request.getParameter("quantity"));

            Size size = new Size(pid, size_name, size_quantity);

            pDAO.editProduct(p);
            sDAO.editSizeByPid(size);
            request.getRequestDispatcher("/myShop/manageProduct").forward(request, response);

        } catch (ParseException ex) {

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
