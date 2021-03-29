package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import dal.SizeDAO;
import model.Size;
import java.util.List;

public final class manage_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/add-product.jsp");
    _jspx_dependants.add("/admin/delete-product.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Manage Product</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"images/small-logo.png\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/manage.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/manage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container-lg\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapper\">\t\t\t\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Manage <b>Product</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"search-box\">\n");
      out.write("                                    <div class=\"input-group\">\t\t\t\t\t\t\t\t\n");
      out.write("                                        <input type=\"text\" id=\"search\" class=\"form-control\" placeholder=\"Search by Name\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"material-icons\">&#xE8B6;</i></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <a href=\"/myShop/home\" class=\"btn btn-success\"><span>Back to shop</span></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">                   \n");
      out.write("                                <a href=\"#addEmployeeModal\" class=\"btn-add btn btn-success\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE147;</i> <span>Add New Product</span></a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th style=\"width: 70px\">ID</th>\n");
      out.write("                                <th style=\"width: 150px\">Name</th>\n");
      out.write("                                <th style=\"width: 60px\">Cid</th>\n");
      out.write("                                <!--                                <th style=\"width: 90px\" class=\"over-text\">Image</th>-->\n");
      out.write("                                <th style=\"width: 90px\">Image</th>\n");
      out.write("                                <th style=\"width: 100px\">Price(VNĐ)</th>\n");
      out.write("                                <th style=\"width: 160px\">Description</th>\n");
      out.write("                                <th style=\"width: 100px\">Date Created</th>\n");
      out.write("                                <th style=\"width: 70px\">Size</th>\n");
      out.write("                                <th style=\"width: 70px\">Quantity</th>\n");
      out.write("                                <th style=\"width: 80px\">Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Edit Modal HTML -->\n");
      out.write("        <div id=\"addEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"/myShop/add\" method=\"POST\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Add Product</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>ID</label>\n");
      out.write("                                <input name=\"id\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Name</label>\n");
      out.write("                                <input name=\"name\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Category ID</label><br/>\n");
      out.write("                                1-(T-Shirt) <input type=\"radio\" name = \"cid\" value=\"1\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                2-(Hoodie) <input type=\"radio\" name = \"cid\" value=\"2\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                3-(Jacket) <input type=\"radio\" name = \"cid\" value=\"3\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                4-(Pants) <input type=\"radio\" name = \"cid\" value=\"4\" required=\"\"/>\n");
      out.write("                                <!--<input name=\"cid\" class=\"form-control\" required/>-->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Image</label>\n");
      out.write("                                <input name=\"image\" type=\"file\" class=\"form-control\" onchange=\"readURL(this);\" accept=\"image/*\" required>\n");
      out.write("                                <img id=\"blah\" width=\"100px\" alt=\"image\" />\n");
      out.write("                            </div>\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <input name=\"price\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Description</label>\n");
      out.write("                                <input name=\"description\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Date Created</label>\n");
      out.write("                                <!--<p id=\"today\"> <p>-->\n");
      out.write("\n");
      out.write("                                <input name=\"dateCreated\" type=\"date\" id=\"today\" class=\"form-control\" value=\"\" readonly=\"\">\n");
      out.write("                                <script>\n");
      out.write("                                    // body...\n");
      out.write("                                    var today = new Date();\n");
      out.write("                                    var dd = today.getDate();\n");
      out.write("                                    var mm = today.getMonth() + 1; //January is 0!\n");
      out.write("                                    var yyyy = today.getFullYear();\n");
      out.write("\n");
      out.write("                                    if (dd < 10) {\n");
      out.write("                                        dd = '0' + dd;\n");
      out.write("                                    }\n");
      out.write("                                    if (mm < 10) {\n");
      out.write("                                        mm = '0' + mm;\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                    today = yyyy + '-' + mm + '-' + dd;\n");
      out.write("                                    document.getElementById('today').value = today + \"\";\n");
      out.write("\n");
      out.write("                                </script>\n");
      out.write("                            </div>\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Size</label> <br/>\n");
      out.write("                                M <input type=\"radio\" name = \"size\" value=\"M\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                L <input type=\"radio\" name = \"size\" value=\"L\" required=\"\"/> &nbsp;&nbsp;\n");
      out.write("                                XL <input type=\"radio\" name = \"size\" value=\"XL\" required=\"\"/> \n");
      out.write("                                <!--                                <input name=\"size\" type=\"text\" class=\"form-control\" required>-->\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Size Quantity</label>\n");
      out.write("                                <input name=\"quantity\" type=\"number\" min=\"1\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\n");
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
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Delete Modal HTML -->\n");
      out.write("        <div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Delete Product</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <p>Are you sure you want to delete these Product?</p>\n");
      out.write("                            <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<style>\n");
      out.write("    .btn-success{\n");
      out.write("        margin-top: 20px;\n");
      out.write("    }\n");
      out.write("    .btn-add{\n");
      out.write("        float: right;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("        $(\"#search\").on('keyup', function () {\n");
      out.write("            var term = $(this).val().toLowerCase();\n");
      out.write("            $(\"table tbody tr\").each(function () {\n");
      out.write("                $row = $(this);\n");
      out.write("                var name = $row.find(\"td:nth-child(2)\").text().toLowerCase();\n");
      out.write("                console.log(name);\n");
      out.write("                if (name.search(term) < 0) {\n");
      out.write("                    $row.hide();\n");
      out.write("                } else {\n");
      out.write("                    $row.show();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("        );\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.check == \"true\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(") {\n");
      out.write("        alert(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.isAdded}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\n");
      out.write("    }\n");
      out.write("    if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.check == \"false\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(") {\n");
      out.write("        alert(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.isAdded}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td> \n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td><img width=\"90px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.dateCreated}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <!--if productID equal size.pid -> print nameSize and calculate total quantity of each size-->\n");
          out.write("                                        ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" \n");
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalQuantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <!--#editEmployeeModal-->\n");
          out.write("                                        <a href=\"loadDataToEditForm?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" ><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Edit\">&#xE254;</i></a>\n");
          out.write("                                        <a href=\"deleteProduct?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("totalQuantity");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSize}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("s");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id == s.pid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size_quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(") <br/>\n");
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_1.setVar("totalQuantity");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalQuantity + s.size_quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }
}
