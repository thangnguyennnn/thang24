/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.Dao;
import Model.Book;
import Model.UserInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class ADSearchUser extends HttpServlet {

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
        String txtSearch = request.getParameter("userName");
        
        Dao d = new Dao();
        if(!txtSearch.equals("")){
            List<UserInfo> listSearch = d.getListSearchUserByName(txtSearch);

            //request.setAttribute("listSearch", listSearch);

            PrintWriter out = response.getWriter();

            if(listSearch.isEmpty()){
                out.println("<div class=\"alert alert-success\">\n" +
    "                                                    Không có tên người dùng mà bạn tìm!\n" +
    "                                                </div>");
            }else{
                out.println("<div class=\"alert alert-success\">Đã tìm thấy "+listSearch.size()+" Kết quả</div>");
                for (UserInfo u : listSearch) {
                    out.println("<tr>\n" +
    "                                        <td class=\"shoping__cart__item\">\n" +
    "                                            <a href=\"loadViewInfoUserPage?usernameview="+u.getTk()+"\">\n" +
    "                                                <img style=\"width: 120px;\" src=\""+u.getAnhCMND()+"\" alt=\""+u.getTk()+"\" title=\""+u.getHoten()+"\">\n" +
    "                                                <h5>"+u.getHoten()+"</h5>\n" +
    "                                            </a>\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__quantity\">\n" +
    "                                            "+u.getSdt()+"\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__quantity\">\n" +
    "                                            "+u.getDiaChi()+"\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__quantity\">\n" +
    "                                            "+u.getEmail()+"\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__item__close\">\n" +
    "                                            <span class=\"icon_close\"></span>\n" +
    "                                        </td>\n" +
    "                                    </tr>");
                }
            }
        }else{
            request.getRequestDispatcher("loadManagerUserPagee?indexU=1").forward(request, response);
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
