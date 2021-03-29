<%-- 
    Document   : update-product
    Created on : Mar 20, 2021, 11:32:33 AM
    Author     : Minh Thanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="shortcut icon" type="image/png" href="images/small-logo.png"/>
        <link href="css/manage.css" rel="stylesheet" type="text/css"/>
        <script src="js/manage.js" type="text/javascript"></script>
    </head>
    <body>

        <!-- Edit Modal HTML -->
        <div id="editEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="/myShop/editProduct" method="POST">
                        <div class="modal-header">						
                            <h4 class="modal-title">Edit Product</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="modal-body">					
                                <div class="form-group">
                                    <label>ID</label>
                                    <input value="${product.id}" name="id" type="text" class="form-control"  readonly="">
                                </div>
                                <div class="form-group">
                                    <label>Name</label>
                                    <input value="${product.name}" name="name" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Category ID</label><br/>
                                    1-(T-Shirt) <input type="radio" name = "cid" value="1" required=""/> &nbsp;&nbsp;
                                    2-(Hoodie) <input type="radio" name = "cid" value="2" required=""/> &nbsp;&nbsp;
                                    3-(Jacket) <input type="radio" name = "cid" value="3" required=""/> &nbsp;&nbsp;
                                    4-(Pants) <input type="radio" name = "cid" value="4" required=""/>
                                    <!--<input name="cid" class="form-control" required/>-->
                                </div>
                                <div class="form-group">
                                    <label>Image</label>
                                    <input value="${product.image}" name="image" type="file" class="form-control" onchange="readURL(this);" accept="image/*" required>
                                    <img id="blah" width="100px" alt="image" />
                                </div>		
                                <div class="form-group">
                                    <label>Price</label>
                                    <input value="${product.price}" name="price" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Description</label>
                                    <input value="${product.description}" name="description" type="text" class="form-control" required>
                                </div>	
                                <div class="form-group">
                                    <label>Date Created</label>
                                    <!--<p id="today"> <p>-->

                                    <input value="" name="dateCreated" type="date" id="today" class="form-control"  readonly="">
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
                                    <input name="quantity" type="number" min="0" class="form-control" required>
                                </div>
                            </div>				
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
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
