<%-- 
    Document   : addProduct
    Created on : Mar 20, 2021, 11:31:58 AM
    Author     : Minh Thanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="shortcut icon" type="image/png" href="images/small-logo.png"/>
        <link href="css/manage.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="/myShop/add" method="POST">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add Product</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>ID</label>
                                <input name="id" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input name="name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Category ID</label><br/>
                                <input type="radio" name = "cid" value="1" required=""/>1-(T-Shirt) &nbsp;&nbsp;
                                <input type="radio" name = "cid" value="2" required=""/>2-(Hoodie)  &nbsp;&nbsp;
                                <input type="radio" name = "cid" value="3" required=""/>3-(Jacket)  &nbsp;&nbsp;
                                <input type="radio" name = "cid" value="4" required=""/>4-(Pants) 
                                <!--<input name="cid" class="form-control" required/>-->
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input name="image" type="file" class="form-control" onchange="readURL(this);" accept="image/*" required>
                                <img id="blah" width="100px" alt="image" />
                            </div>		
                            <div class="form-group">
                                <label>Price</label>
                                <input name="price" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Description</label>
                                <input name="description" type="text" class="form-control" required>
                            </div>	
                            <div class="form-group">
                                <label>Date Created</label>
                                <!--<p id="today"> <p>-->

                                <input name="dateCreated" type="date" id="today" class="form-control" value="" readonly="">
                                <script>
                                    // body...
                                    var today = new Date();
                                    var dd = today.getDate();
                                    var mm = today.getMonth() + 1; //January is 0!
                                    var yyyy = today.getFullYear();

                                    if (dd < 10) {
                                        dd = '0' + dd;
                                    }
                                    if (mm < 10) {
                                        mm = '0' + mm;
                                    }

                                    today = yyyy + '-' + mm + '-' + dd;
                                    document.getElementById('today').value = today + "";

                                </script>
                            </div>	
                            <div class="form-group">
                                <label>Size</label> <br/>
                                M <input type="radio" name = "size" value="M" required=""/> &nbsp;&nbsp;
                                L <input type="radio" name = "size" value="L" required=""/> &nbsp;&nbsp;
                                XL <input type="radio" name = "size" value="XL" required=""/> 
                                <!--                                <input name="size" type="text" class="form-control" required>-->
                            </div>
                            <div class="form-group">
                                <label>Size Quantity</label>
                                <input name="quantity" type="number" min="1" class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

<script>
    function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();
            reader.onload = function (e) {
                $('#blah').attr('src', e.target.result);
            };
            reader.readAsDataURL(input.files[0]);
        }
    }
</script>
