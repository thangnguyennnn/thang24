package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewInfoUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"description\" content=\"Ogani Template\">\n");
      out.write("    <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Th??ng tin</title>\n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Css Styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style_1.css\" type=\"text/css\">\n");
      out.write("    <style>\n");
      out.write("            .alert-warning {\n");
      out.write("                color: #856404;\n");
      out.write("                background-color: #fff3cd;\n");
      out.write("                border-color: #ffeeba;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .alert {\n");
      out.write("                position: relative;\n");
      out.write("                padding: 0.75rem 1.25rem;\n");
      out.write("                margin-bottom: 1rem;\n");
      out.write("                border: 1px solid transparent;\n");
      out.write("                border-radius: 0.25rem; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .alert-success {\n");
      out.write("                color: #155724;\n");
      out.write("                background-color: #d4edda;\n");
      out.write("                border-color: #c3e6cb;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .checkout__input {\n");
      out.write("                width: 100%;\n");
      out.write("             }\n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"font-family: sans-serif; display: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.isAdmin == \"1\" ? \"block\":\"none\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Hero Section Begin -->\n");
      out.write("    <section class=\"hero hero-normal\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-3\">\n");
      out.write("                    <div class=\"hero__categories\">\n");
      out.write("                        <div class=\"hero__categories__all\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                            <span>All departments</span>\n");
      out.write("                        </div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Fresh Meat</a></li>\n");
      out.write("                            <li><a href=\"#\">Vegetables</a></li>\n");
      out.write("                            <li><a href=\"#\">Fruit & Nut Gifts</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Berries</a></li>\n");
      out.write("                            <li><a href=\"#\">Ocean Foods</a></li>\n");
      out.write("                            <li><a href=\"#\">Butter & Eggs</a></li>\n");
      out.write("                            <li><a href=\"#\">Fastfood</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Onion</a></li>\n");
      out.write("                            <li><a href=\"#\">Papayaya & Crisps</a></li>\n");
      out.write("                            <li><a href=\"#\">Oatmeal</a></li>\n");
      out.write("                            <li><a href=\"#\">Fresh Bananas</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                    <div class=\"hero__search\">\n");
      out.write("                        <div class=\"hero__search__form\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <div class=\"hero__search__categories\">\n");
      out.write("                                    All Categories\n");
      out.write("                                    <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" placeholder=\"What do yo u need?\">\n");
      out.write("                                <button type=\"submit\" class=\"site-btn\">SEARCH</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"hero__search__phone\">\n");
      out.write("                            <div class=\"hero__search__phone__icon\">\n");
      out.write("                                <i class=\"fa fa-phone\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"hero__search__phone__text\">\n");
      out.write("                                <h5>+65 11.188.888</h5>\n");
      out.write("                                <span>support 24/7 time</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Hero Section End -->\n");
      out.write("\n");
      out.write("    <!-- Breadcrumb Section Begin -->\n");
      out.write("    <section class=\"breadcrumb-section set-bg\" data-setbg=\"img/breadcrumb.jpg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <div class=\"breadcrumb__text\">\n");
      out.write("                        <h2>Qu???n L?? Th??ng Tin Ng?????i D??ng</h2>\n");
      out.write("                        <div class=\"breadcrumb__option\">\n");
      out.write("                            <a href=\"loadHomePage\">Trang ch???</a>\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Breadcrumb Section End -->\n");
      out.write("\n");
      out.write("    <!-- Checkout Section Begin -->\n");
      out.write("    <section class=\"checkout spad\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"checkout__form\">\n");
      out.write("                <h4>TH??NG TIN CHI TI???T</h4>\n");
      out.write("                <form action=\"addAdmin\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                            <div class=\"checkout__order\">\n");
      out.write("                                <h4>TH??NG TIN</h4>\n");
      out.write("                                <div class=\"checkout__order__products\">Thu???c t??nh <span>Gi?? tr???</span></div>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\" col-lg-6\">\n");
      out.write("                                                <img style=\"width: 100%;\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.anhMH}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"rounded\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\" col-lg-6\">\n");
      out.write("                                                <img style=\"width: 100%;\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.anhMH1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"rounded\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\" col-lg-6\">\n");
      out.write("                                                <img style=\"width: 100%;\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.anhMH2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"rounded\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\" col-lg-6\">\n");
      out.write("                                                <img style=\"width: 100%;\"  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.anhMH3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"rounded\" alt=\"image\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </li>\n");
      out.write("                                    <li>T??n s??ch <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.tenSach}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                    <li>T??c gi??? <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.tacGia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                    <li>Th??? lo???i <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                    <li>Ng??y xu???t b???n <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.ngayXB}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                    <li>L?????t M?????n <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.luotMuon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                    <li>S??? ng??y m?????n <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.thoiGianMuon}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></li>\n");
      out.write("                                </ul>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                           \n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- Checkout Section End -->\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Js Plugins -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("    <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
