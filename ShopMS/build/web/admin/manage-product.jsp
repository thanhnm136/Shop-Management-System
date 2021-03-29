<%-- 
    Document   : manage-product-fix
    Created on : Mar 18, 2021, 12:04:14 PM
    Author     : Minh Thanh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dal.SizeDAO"%>
<%@page import="model.Size"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <script src="js/manage.js" type="text/javascript"></script>
        <link href="css/manage.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <div class="container-lg">
            <div class="table-responsive">
                <div class="table-wrapper">			
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Manage <b>Product</b></h2>
                            </div>
                            <p onload="alert(${isAdded})"></p>
                            <div class="col-sm-6">
                                <div class="search-box">
                                    <div class="input-group">								
                                        <input type="text" id="search" class="form-control" placeholder="Search by Name">
                                        <span class="input-group-addon"><i class="material-icons">&#xE8B6;</i></span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6">
                                <a href="/myShop/home" class="btn btn-success"><span>Back to shop</span></a>
                            </div>
                            <div class="col-sm-6">                   
                                <a href="#addEmployeeModal" class="btn-add btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Product</span></a>

                            </div>

                        </div>
                    </div>
                    <table class="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th style="width: 70px">ID</th>
                                <th style="width: 150px">Name</th>
                                <th style="width: 60px">Cid</th>
                                <!--                                <th style="width: 90px" class="over-text">Image</th>-->
                                <th style="width: 90px">Image</th>
                                <th style="width: 100px">Price(VNĐ)</th>
                                <th style="width: 160px">Description</th>
                                <th style="width: 100px">Date Created</th>
                                <th style="width: 70px">Size</th>
                                <th style="width: 70px">Quantity</th>
                                <th style="width: 80px">Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listProduct}" var="p" >
                                <tr>
                                    <td>${p.id}</td>
                                    <td>${p.name}</td>
                                    <td> 
                                        ${p.cid}
                                    </td>
                                    <td><img width="90px" src="${p.image}" />
                                    </td>
                                    <td>${p.price}</td>
                                    <td>${p.description}</td>
                                    <td>${p.dateCreated}</td>
                                    <td>
                                        <!--if productID equal size.pid -> print nameSize and calculate total quantity of each size-->
                                        <c:set var="totalQuantity" value="${0}" /> 

                                        <c:forEach items="${listSize}" var="s">
                                            <c:if test="${p.id == s.pid}">

                                                ${s.name} (${s.size_quantity}) <br/>

                                                <c:set var="totalQuantity" value="${totalQuantity + s.size_quantity}" />
                                            </c:if>
                                        </c:forEach>

                                    </td>
                                    <td>
                                        ${totalQuantity}
                                    </td>
                                    <td>
                                        <!--#editEmployeeModal-->
                                        <a href="loadDataToEditForm?pid=${p.id}" class="edit" ><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                        <a href="deleteProduct?pid=${p.id}" class="delete"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>        
        </div>
        <%@include file="add-product.jsp" %>
        <%@include file="delete-product.jsp" %>
    </body>
</html>
<style>
    .btn-success{
        margin-top: 20px;
    }
    .btn-add{
        float: right;
    }
</style>
<script>
    $(document).ready(function () {
        $('[data-toggle="tooltip"]').tooltip();
        $("#search").on('keyup', function () {
            var term = $(this).val().toLowerCase();
            $("table tbody tr").each(function () {
                $row = $(this);
                var name = $row.find("td:nth-child(2)").text().toLowerCase();
                console.log(name);
                if (name.search(term) < 0) {
                    $row.hide();
                } else {
                    $row.show();
                }
            });
        }
        );
    });

    if (${requestScope.check == "true"}) {
        alert(${requestScope.isAdded});
    }
    if (${requestScope.check == "false"}) {
        alert(${requestScope.isAdded});
    }

</script>



