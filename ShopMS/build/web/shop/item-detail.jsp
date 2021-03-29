<%-- 
    Document   : item-detail
    Created on : Mar 16, 2021, 12:36:11 AM
    Author     : Minh Thanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" type="image/png" href="images/small-logo.png"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${detail.name}</title>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div class="container flex">
            <div class="left-item">
                <img width="100%" class="image-detail" src="${detail.image}" alt=""/>
            </div>
            <div class="right-item border-detail">
                <div class="center-content">
                    <p class="orange-text title-detail font-bold">${detail.name}</p>
                    <p class="product-price price-detail"> <fmt:formatNumber type="number" value="${detail.price}"/> ₫</p>
                    <strong class="grey-text"><h3> MÔ TẢ</h3></strong>
                    <p class=" grey-text description">${detail.description}</p>
                    <strong class="grey-text"><h3>HƯỚNG DẪN BẢO QUẢN</h3></strong>
                    <p class="grey-text description">
                        – Hạn chế giặt máy, nên giặt tay<br>
                        – Lộn trái khi giặt, nên phơi nơi nắng nhẹ, tránh ánh nắng trực tiếp.<br>
                        – Không giặt máy với các sản phẩm có tag nhựa 3D</p>
                </div>

                <div class="flex box">
                    <div class="right-border-dashed"><img class="box-icon" src="images/web-icons-02-300x300.png"/>  <br/>
                        <p> Đổi trả hàng trong 7 ngày </p></div>
                    <div class="right-border-dashed"> <img class="box-icon" src="images/web-icons-03-300x300.png"/>  <br/>
                        <p> Thanh toán khi nhận hàng </p></div>
                    <div><img class="box-icon" src="images/web-icons-05-300x300.png"/>  <br/>
                        <p> Giao hàng toàn quốc </p></div>
                </div>

                <form action="/myShop/addCart" method="POST">
                    <label class="font-bold">Product ID</label> 
                    <input type="text" name="pid" value="${pid}" readonly="" /><br/><br/>
                    <label class="font-bold">Size:</label>
                    <input type="radio" class="circle" name="size" value="M" onclick="showQuantity()" required="">M 
                    <input type="radio" class="circle" name="size" value="L" onclick="showQuantity()" required="">L
                    <input type="radio" class="circle" name="size" value="XL" onclick="showQuantity()" required="">XL
                    <p  class="hidden grey-text description" id="stock1"> ${requestScope.sizeM} </p>
                    <p  class="hidden grey-text description" id="stock2"> ${requestScope.sizeL} </p>
                    <p  class="hidden grey-text description" id="stock3"> ${requestScope.sizeXL} </p>
                    

                    <div class="sub-form">
                        <label class="font-bold">Quantity:</label>
                        <input class="quantity-input" type="number" min="1" name="quantity" required=""/>
                        <button class="submit-bt" type="submit"/>Add to cart
                    </div>
                </form>
            </div>
        </div>
        <!--            <div class="container">
                        <img src="image/tee-graffity-tan-sc-09.jpg" alt=""/>
                    </div>-->

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

<script>

//    var showQuantity = function (n) {
    function showQuantity() {
        var sizeM = document.getElementById("stock1");
        var sizeL = document.getElementById("stock2");
        var sizeXL = document.getElementById("stock3");
        var radio = document.getElementsByName("size");
        for (var i = 0; i < radio.length; i++) {
            if (radio[0].checked === true) {
                sizeM.style.display = "block";
                sizeL.style.display = "none";
                sizeXL.style.display = "none";
            } else if (radio[1].checked === true) {
                sizeL.style.display = "block";
                sizeM.style.display = "none";
                sizeXL.style.display = "none";
            } else if (radio[2].checked === true) {
                sizeXL.style.display = "block";
                sizeM.style.display = "none";
                sizeL.style.display = "none";
            }
        }
    }
    ;

</script>