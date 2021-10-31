package Load_Page;

import DAO.Dao;
import Model.UserAccount;
import Model.UserInfo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loadManagerUserPage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(true);
        UserAccount u = (UserAccount) session.getAttribute("Logining");
        String index = request.getParameter("indexU");
        Dao d = new Dao();
        if(u != null){
            List<UserInfo> listUserInfoFull = d.getListUserInfo();
            List<UserInfo> listUserInfo = d.getListUserInfo(index);
            int sl = listUserInfoFull.size();
            int indexx = d.getIndex(listUserInfoFull);
            
            request.setAttribute("index", indexx);
            request.setAttribute("in", index);
            request.setAttribute("sl", sl);
            request.setAttribute("listUserInfo", listUserInfo);
            request.getRequestDispatcher("managerUser.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("loadLoginPage").forward(request, response);
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
