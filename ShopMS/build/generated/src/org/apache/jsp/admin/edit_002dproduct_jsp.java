package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"images/small-logo.png\"/>\n");
      out.write("        <link href=\"css/manage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/manage.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Edit Modal HTML -->\n");
      out.write("        <div id=\"editEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"/myShop/editProduct\" method=\"POST\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Edit Product</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>ID</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\" type=\"text\" class=\"form-control\"  readonly=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Name</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"name\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Category ID</label><br/>\n");
      out.write("                                    1-(T-Shirt) <input type=\"radio\" name = \"cid\" value=\"1\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                    2-(Hoodie) <input type=\"radio\" name = \"cid\" value=\"2\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                    3-(Jacket) <input type=\"radio\" name = \"cid\" value=\"3\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                    4-(Pants) <input type=\"radio\" name = \"cid\" value=\"4\" required=\"\"/>\n");
      out.write("                                    <!--<input name=\"cid\" class=\"form-control\" required/>-->\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Image</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"image\" type=\"file\" class=\"form-control\" onchange=\"readURL(this);\" accept=\"image/*\" required>\n");
      out.write("                                    <img id=\"blah\" width=\"100px\" alt=\"image\" />\n");
      out.write("                                </div>\t\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Price</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"price\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Description</label>\n");
      out.write("                                    <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"description\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                                </div>\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Date Created</label>\n");
      out.write("                                    <!--<p id=\"today\"> <p>-->\n");
      out.write("\n");
      out.write("                                    <input value=\"\" name=\"dateCreated\" type=\"date\" id=\"today\" class=\"form-control\"  readonly=\"\">\n");
      out.write("                                    <script>\n");
      out.write("                                        // body...\n");
      out.write("                                        var today = new Date();\n");
      out.write("                                        var dd = today.getDate();\n");
      out.write("                                        var mm = today.getMonth() + 1; //January is 0!\n");
      out.write("                                        var yyyy = today.getFullYear();\n");
      out.write("\n");
      out.write("                                        if (dd < 10) {\n");
      out.write("                                            dd = '0' + dd;\n");
      out.write("                                        }\n");
      out.write("                                        if (mm < 10) {\n");
      out.write("                                            mm = '0' + mm;\n");
      out.write("                                        }\n");
      out.write("\n");
      out.write("                                        today = yyyy + '-' + mm + '-' + dd;\n");
      out.write("                                        document.getElementById('today').value = today + \"\";\n");
      out.write("\n");
      out.write("                                    </script>\n");
      out.write("                                </div>\t\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Size</label> <br/>\n");
      out.write("                                    M <input type=\"radio\" name = \"size\" value=\"M\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                    L <input type=\"radio\" name = \"size\" value=\"L\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                    XL <input type=\"radio\" name = \"size\" value=\"XL\" required=\"\"/> \n");
      out.write("                                    <!--                                <input name=\"size\" type=\"text\" class=\"form-control\" required>-->\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Size Quantity</label>\n");
      out.write("                                    <input name=\"quantity\" type=\"number\" min=\"0\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function readURL(input) {\n");
      out.write("        if (input.files && input.files[0]) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("            reader.onload = function (e) {\n");
      out.write("                $('#blah').attr('src', e.target.result);\n");
      out.write("            };\n");
      out.write("            reader.readAsDataURL(input.files[0]);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
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
