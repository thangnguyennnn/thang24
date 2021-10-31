package Control;

import DAO.Dao;
import Model.Book;
import Model.UserAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class searchBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String txtSearch = request.getParameter("nameBook");
        HttpSession session = request.getSession(true);
        UserAccount u = (UserAccount) session.getAttribute("Logining");
        Dao d = new Dao();
        if(!txtSearch.equals("")){
            List<Book> listSearch = d.getListSearchByName(txtSearch);

            //request.setAttribute("listSearch", listSearch);

            PrintWriter out = response.getWriter() ;

            if(listSearch.isEmpty()){
                out.println("<div class=\"alert alert-success\">\n" +
    "                                                    Không có loại sách mà bạn tìm!\n" +
    "                                                </div>");
            }else{
                out.println("<div class=\"alert alert-success\">Đã tìm thấy "+listSearch.size()+" Kết quả</div>");
                for (Book b : listSearch) {
                    out.println("<tr>\n" +
    "                                        <td class=\"shoping__cart__item\">\n" +
    "                                            <a href=\"loadViewInfoBookPage?bookID="+b.getBookID()+"\">\n" +
    "                                                <img style=\"width: 120px;\" src=\""+b.getAnhMH()+"\" alt=\""+b.getTenSach()+"\" title=\""+b.getTenSach()+"\">\n" +
    "                                                <h5>"+b.getTenSach()+"</h5>\n" +
    "                                            </a>\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__quantity\">\n" +
    "                                            "+b.getBookID()+"\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__quantity\">\n" +
    "                                            "+b.getTacGia()+"\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__quantity\">\n" +
    "                                            "+b.getLuotMuon()+"\n" +
    "                                        </td>\n" +
    "                                        <td class=\"shoping__cart__item__close\">\n" +
    "                                            <span class=\"icon_close\"></span>\n" +
    "                                        </td>\n" +
    "                                    </tr>");
                }
            }
        }else{
            request.getRequestDispatcher("loadManagerBookPagee?indexB=1").forward(request, response);
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
