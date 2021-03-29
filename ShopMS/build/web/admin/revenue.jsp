<%-- 
    Document   : revenue
    Created on : Mar 29, 2021, 1:05:26 PM
    Author     : Minh Thanh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dal.SizeDAO"%>
<%@page import="model.Size"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Manage Product</title>
        <link rel="shortcut icon" type="image/png" href="images/small-logo.png"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link href="css/manage.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div class="container-lg">
            <div class="table-responsive">
                <div class="table-wrapper">			
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Revenue</h2>
                            </div>

                            <div class="col-sm-6">
                                <div class="search-box">
                                    <div class="input-group">								
                                        <select name="filter" onchange="window.location = this.value">
                                            <option value="#">Filter</option>
                                            <option ${cond == "all" ? "selected" : ""} value="filterRevenue?condition=all">All purchased</option>
                                            <option ${cond == "day" ? "selected" : ""} value="filterRevenue?condition=day">Purchased for the day</option>
                                            <option ${cond == "week" ? "selected" : ""} value="filterRevenue?condition=week">Purchased for the last 7 day</option>
                                            <option ${cond == "month" ? "selected" : ""} value="filterRevenue?condition=month">Purchased for the month</option>
                                            <option ${cond == "year" ? "selected" : ""} value="filterRevenue?condition=year">Purchased for the year</option>
                                            <option ${cond == "new" ? "selected" : ""} value="filterRevenue?condition=new">Newest purchased</option>
                                            <option ${cond == "old" ? "selected" : ""} value="filterRevenue?condition=old">Oldest purchased</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <a href="/myShop/home" class="btn btn-success"><span>Back to shop</span></a>
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-bordered">
                        <h3 style="float: right">
                            <strong>Total Revenue: <fmt:formatNumber type="number" value="${totalRevenue}"/> (VNĐ)</strong>
                        </h3>
                        <thead>
                            <tr>
                                <th style="width: 50px">No.</th>
                                <th style="width: 60px">PID</th>
                                <th style="width: 150px">Name</th>
                                <th style="width: 90px">Image</th>
                                <th style="width: 80px">Price</th>
                                <!--                                <th style="width: 90px" class="over-text">Image</th>-->
                                <th style="width: 50px">Size</th>
                                <th style="width: 70px">Quantity</th>
                                <th style="width: 70px">OrderID</th>
                                <th style="width: 100px">Customer</th>
                                <th style="width: 100px">Order Date</th>
                                <th style="width: 100px">Total Money</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:set var="No" value="0"/>
                            <c:forEach items="${listRevenue}" var="r" >
                                <c:set var="No" value="${No + 1}"/>
                                <tr>
                                    <td>${No}</td>
                                    <td>${r.pid}</td>
                                    <td>${r.productName}</td>
                                    <td><img width="90px" src="${r.image}"/></td>
                                    <td><fmt:formatNumber type="number" value="${r.price}"/></td>
                                    <td>${r.size}</td>
                                    <td>${r.quantity}</td>
                                    <td>${r.oid}</td>
                                    <td>${r.customer}</td>
                                    <td>${r.orderDate}</td>
                                    <td><fmt:formatNumber type="number" value="${r.totalMoney}"/></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>        
        </div>
        <div>

        </div>
    </body>
</html>
