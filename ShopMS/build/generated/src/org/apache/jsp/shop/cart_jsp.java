package org.apache.jsp.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Shopping Cart</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"images/small-logo.png\"/>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"images/small-logo.png\"/>\n");
      out.write("        <link href=\"css/styleCart.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/styleCart.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                <h1>\n");
      out.write("                    <span class=\"shopper\"></span> Shopping Cart\n");
      out.write("                </h1>\n");
      out.write("                <p style=\"color: black\">(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(") items</p>\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"visibility-cart transition is-open\">X</a>    \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"cart transition is-open\">\n");
      out.write("\n");
      out.write("                <a href=\"/myShop/home\" class=\"btn btn-update\">Back To Shopping</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"table\">\n");
      out.write("                    <div class=\"layout-inline row th\">\n");
      out.write("                        <div class=\"col col-pro\">Product</div>\n");
      out.write("                        <div class=\"col col-pid align-center \"> \n");
      out.write("                            Size\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col col-pid align-center \"> \n");
      out.write("                            PID\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col col-price align-center \"> \n");
      out.write("                            Price\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col col-qty align-center\">QTY</div>\n");
      out.write("\n");
      out.write("                        <!--                        <div class=\"col\">Total</div>-->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"layout-inline row row-bg2\">\n");
      out.write("\n");
      out.write("                        <div class=\"col col-pro layout-inline\">\n");
      out.write("                            <img src=\"http://lovemeow.com/wp-content/uploads/2012/05/kitten81.jpg\" alt=\"kitten\" />\n");
      out.write("                            <p>Scared Little Kittie</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col col-pid  align-center \">\n");
      out.write("                            <input name=\"size\" type=\"text\" value=\"XL\" readonly=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col  align-center \">\n");
      out.write("                            <p>2</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col col-price col-numeric align-center \">\n");
      out.write("                            <p>£23.99</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col col-qty  layout-inline\">\n");
      out.write("                            <a href=\"#\" class=\"qty qty-minus \">-</a>\n");
      out.write("                            <input type=\"numeric\" value=\"1\" />\n");
      out.write("                            <a href=\"#\" class=\"qty qty-plus\">+</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col col-total col-numeric\">\n");
      out.write("                            <p>£25.94</p>\n");
      out.write("                        </div>      \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"layout-inline row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col col-pro layout-inline\">\n");
      out.write("                            <img src=\"http://cdn.cutestpaw.com/wp-content/uploads/2012/04/l-my-first-kitten.jpg\" alt=\"kitten\" />\n");
      out.write("                            <p>Curious Little Begger</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col col-pid  align-center \">\n");
      out.write("                            <input name=\"size\" type=\"text\" value=\"XL\" readonly=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col  align-center \">\n");
      out.write("                            <p>3</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col col-price col-numeric align-center \">\n");
      out.write("                            <p>£59.99</p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col col-qty layout-inline\">\n");
      out.write("                            <a href=\"#\" class=\"qty qty-minus\">-</a>\n");
      out.write("                            <input type=\"numeric\" value=\"3\" />\n");
      out.write("                            <a href=\"#\" class=\"qty qty-plus\">+</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col col-total col-numeric\">  \n");
      out.write("                            <p>£182.95</p>\n");
      out.write("                        </div>         \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"tf\">\n");
      out.write("                        <div class=\"row layout-inline\">\n");
      out.write("                            <div class=\"col\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row layout-inline\">\n");
      out.write("                            <div class=\"col\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row layout-inline\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <p>Total</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>         \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a href=\"#\" class=\"btn btn-update\">Update cart</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $('.visibility-cart').on('click', function () {\n");
      out.write("\n");
      out.write("        var $btn = $(this);\n");
      out.write("        var $cart = $('.cart');\n");
      out.write("        console.log($btn);\n");
      out.write("\n");
      out.write("        if ($btn.hasClass('is-open')) {\n");
      out.write("            $btn.removeClass('is-open');\n");
      out.write("            $btn.text('O')\n");
      out.write("            $cart.removeClass('is-open');\n");
      out.write("            $cart.addClass('is-closed');\n");
      out.write("            $btn.addClass('is-closed');\n");
      out.write("        } else {\n");
      out.write("            $btn.addClass('is-open');\n");
      out.write("            $btn.text('X')\n");
      out.write("            $cart.addClass('is-open');\n");
      out.write("            $cart.removeClass('is-closed');\n");
      out.write("            $btn.removeClass('is-closed');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // SHOPPING CART PLUS OR MINUS\n");
      out.write("    $('a.qty-minus').on('click', function (e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        var $this = $(this);\n");
      out.write("        var $input = $this.closest('div').find('input');\n");
      out.write("        var value = parseInt($input.val());\n");
      out.write("\n");
      out.write("        if (value > 1) {\n");
      out.write("            value = value - 1;\n");
      out.write("        } else {\n");
      out.write("            value = 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $input.val(value);\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('a.qty-plus').on('click', function (e) {\n");
      out.write("        e.preventDefault();\n");
      out.write("        var $this = $(this);\n");
      out.write("        var $input = $this.closest('div').find('input');\n");
      out.write("        var value = parseInt($input.val());\n");
      out.write("\n");
      out.write("        if (value < 100) {\n");
      out.write("            value = value + 1;\n");
      out.write("        } else {\n");
      out.write("            value = 100;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        $input.val(value);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // RESTRICT INPUTS TO NUMBERS ONLY WITH A MIN OF 0 AND A MAX 100\n");
      out.write("    $('input').on('blur', function () {\n");
      out.write("\n");
      out.write("        var input = $(this);\n");
      out.write("        var value = parseInt($(this).val());\n");
      out.write("\n");
      out.write("        if (value < 0 || isNaN(value)) {\n");
      out.write("            input.val(0);\n");
      out.write("        } else if\n");
      out.write("                (value > 100) {\n");
      out.write("            input.val(100);\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("o");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("total");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.items}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                        ");
          out.write(" \n");
          out.write("                        <div class=\"layout-inline row\">\n");
          out.write("\n");
          out.write("                            <div class=\"col col-pro layout-inline\">\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"col col-pid  align-center \">\n");
          out.write("                                <input name=\"size\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly=\"\"/>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"col col-pid  align-center \">\n");
          out.write("                                <input name=\"pid\" type=\"number\" value=\"1\" readonly=\"\"/>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"col col-price col-numeric align-center \">\n");
          out.write("                                <p> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"col col-qty layout-inline\">\n");
          out.write("                                <a href=\"#\" class=\"qty qty-minus\">-</a>\n");
          out.write("                                <input type=\"numeric\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("                                <a href=\"#\" class=\"qty qty-plus\">+</a>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"col col-total col-numeric\">\n");
          out.write("                                ");
          if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    ");
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

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_2.setVar("total");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.product.price * i.product.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }
}
