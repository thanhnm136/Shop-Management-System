<%-- 
    Document   : list-item
    Created on : Mar 16, 2021, 12:35:44 AM
    Author     : Minh Thanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" type="image/png" href="images/small-logo.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="flex-row search-filter ">
            <div class="">
                <form action="search" method="POST">
                    <div class="search-bar">
                        <input width="100px" id="txtSearch" name="txtSearch" placeholder="Search..."/>
                        <input type="submit" />
                    </div>
                </form>
            </div>
            <div class="filter">
                <i class="fas fa-filter"></i>
                <select name="filter" onchange="window.location = this.value">
                    <option value="#">Filter</option>
                    <option ${cond == "az" ? "selected" : ""} value="filter?condition=az">Product Name: a → z</option>
                    <option ${cond == "za" ? "selected" : ""} value="filter?condition=za">Product Name: z → a</option>
                    <option ${cond == "19" ? "selected" : ""} value="filter?condition=19">Price: Low To High</option>
                    <option ${cond == "91" ? "selected" : ""} value="filter?condition=91">Price: High To Low</option>
                    <option ${cond == "new" ? "selected" : ""} value="filter?condition=new">New Arrival</option>
                    <option ${cond == "old" ? "selected" : ""} value="filter?condition=old">Oldest</option>
                </select>
            </div>
        </div>
        <section class="title text-center">
            <div>
                BANNER
            </div>
        </section>
        <div class="products">
            <c:forEach items="${listProduct}" var="p">
                <div class="card">
                    <div id = "${p.id}" class="item">
                        <div class="card-title">
                            <a href="detail?pid=${p.id}"  class="in-underline"> 
                                <img width="250" height="300" src="${p.image}" alt="${p.name}"/>
                                <div class="orange-text">
                                    ${p.name}
                                </div>
                                <div class="product-price">
                                    <fmt:formatNumber type="number" value="${p.price}"/> ₫
                                </div>
                            </a> 
                        </div>
                    </div>
                </div>
            </c:forEach>

        </div>

    </body>
</html>

