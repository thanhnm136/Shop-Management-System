<%-- 
    Document   : header
    Created on : Mar 16, 2021, 12:35:04 AM
    Author     : Minh Thanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <script src="js/dropDownBtn.js" type="text/javascript"></script>
        <link rel="shortcut icon" type="image/png" href="images/small-logo.png"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="header-main">
            <div class="flex-row logo-center">
                <div id="logo" class="flex-col logo">
                    <a title="T-Store Clothing" href="home">
                        <img src="images/logo.png" alt="T-Store Clothing"/>
                    </a>
                </div>

                <!--empty space-->
                <div class="flex-col flex-left ">
                    <ul class="header-nav flex ">
                    </ul>
                </div>

                <div class="flex-col flex-right">
                    <ul class="header-nav flex nav-right ">

                        <c:set var="size" value="${sessionScope.numOfItems}"/>
                        <li class="cart-item ">
                            <div class="header-button">
                                <a href="/myShop/addCart" class="hover-btn cart  button is-outline" >${size}
                                    <i class="fas fa-shopping-cart fa-lg"></i>
                                </a>
                            </div>
                        </li>

                        <li class="account-item ">
                            <div class="header-button">
                                <c:if test="${sessionScope.acc == null}">
                                    <a href="login/login-signup.jsp" class="hover-btn button is-outline " title="Login-Signup">
                                        LOGIN / SIGN UP                                             
                                    </a>
                                </c:if>
                                <c:if test="${sessionScope.acc != null}">
                                    <div class="dropdown">
                                        <button onclick="myFunction()" class="hover-btn button is-outline dropbtn">${sessionScope.acc.fullName}</button>
                                        <div id="myDropdown" class="dropdown-content">
                                            <c:if test="${sessionScope.acc.role == 1}">
                                                <a href="/myShop/revenue">Revenue <i class="fas fa-hand-holding-usd"></i></a>
                                                <a href="/myShop/manageUser">Manage Users <i class="fas fa-users-cog"></i></a>
                                                <a href="/myShop/manageProduct">Manage Products <i class="fas fa-tshirt"></i></a>
                                                </c:if>
                                            <a href="#">Edit Information <i class="fas fa-user-edit"></i></a>
                                            <a href="#">Change Password <i class="fas fa-key"></i></a>
                                            <a href="/myShop/logout">Logout <i class="fas fa-sign-out-alt"></i></a>
                                        </div>
                                    </div>
                                </c:if>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>

            <%--<%@include file="category.jsp" %>--%>
            <div class="flex-row">
                <div class="flex-col flex-left">
                    <ul class="flex">
                        <li id="item-all" class="menu-item ">
                            <a href="home" class="nav-top-link">                                      
                                <img width="120px" src="images/icon-all-products.png" title="All"/>
                            </a>
                        </li>
                        <c:forEach items="${listCategory}" var="c" >
                            <li  id="" class="menu-item">
                                <a  href="category?cid=${c.id}">
                                    <img width="120px" src="${c.icon}" title="${c.name}" />                                        
                                </a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </div>
    </body>

    <%-- <c:forEach begin="1" end="${totalPage}" var="i">
        <c:choose>
            <c:when test="${pageIndex == i}">
                <li class="page-item active" aria-current="page">
                    <span class="page-link">
                        ${i}
                        <span class="sr-only">(current)</span>
                    </span>
                </li>
            </c:when>
            <c:otherwise>
                <c:if test="${cateID==0}">
                    <li class="page-item"><a class="page-link" href="home?pageIndex=${i}">${i}</a></li>
                    </c:if>
                    <c:if test="${cateID!=0}">
                    <li class="page-item"><a class="page-link" href="category?pageIndex=${i}&cid=${cateID}">${i}</a></li>
                    </c:if>
                </c:otherwise>
            </c:choose>
        </c:forEach> 
    --%>
</html>

<script>
    function show() {
        document.getElementById('txtSearch').type = "text";
    }

    function hidden() {
        document.getElementById('txtSearch').type = "hidden";
    }
</script>

