<%-- 
    Document   : login-signup
    Created on : Mar 16, 2021, 12:35:26 AM
    Author     : Minh Thanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link rel="shortcut icon" type="image/png" href="images/small-logo.png"/>
<link href="../css/loginFormStyle.css" rel="stylesheet" type="text/css"/>  
<link href="css/loginFormStyle.css" rel="stylesheet" type="text/css"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />

<!--<script src="js/loginFormJS.js" type="text/javascript"></script>-->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login / Sign Up</title>
    </head>
    <body>
        <%
            Cookie[] list = request.getCookies();
            String user = "";
            String pass = "";
            String rem = "";

            if (list.length != 0) {
                for (int i = 0; i < list.length; i++) {
                    if (list[i].getName().equals("cUser")) {
                        user = list[i].getValue();
                    }
                    if (list[i].getName().equals("cPass")) {
                        pass = list[i].getValue();
                    }
                    if (list[i].getName().equals("cRemember")) {
                        rem = list[i].getValue();
                    }
                }
            }
        %>
        
        <div class="login-page">
            <div class="form">

                <form action="/myShop/login" method="POST" class="login-form">
                    <p style="color: red" class="mess-danger"> ${err} </p>
                    <p style="color: #43A047" class="mess-danger"> ${msg} </p>
                    <table>
                        <tr>
                            <td> <i class="fas fa-user"></i> </td>
                            <td></td>
                            <td> <input value="<%= user%> "name="name"  type="text" required="" placeholder="username..."/> </td>
                            
<!--                            ${username} for sigup sucess
                            <%= user%> for cookie when choose remember me-->
                            
                        </tr>
                        <tr>
                            <td> <i class="fas fa-key"></i> </td>
                            <td></td>
                            <td> <input value="<%= pass%>" name="pass" type="password" required="" placeholder="password..."/> </td>
                        </tr>
                        <tr>
                            <td class="middle" colspan="2">
                                <input <%= "ON".equals(rem.trim()) ? "checked='checked'" : ""%> value="ON" name="remember" type="checkbox"/>
                            </td>
                            <td class="middle">Remember me</td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td colspan="2">                      
                                <button type="submit">login</button>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td colspan="2">
                                <p class="message">Not registered? <a href="#">Create an account</a></p>
                            </td>
                        </tr>
                    </table>
                </form>



                <form onsubmit="return isConfirmedPass()" action="/myShop/signup" method="POST" class="register-form">
                    <table>
                        <tr>
                            <td> <i class="fas fa-font"></i></i> </td>
                            <td></td>
                            <td> <input name="fullName" type="text" required="" placeholder="full name..."/></td>
                        </tr>
                        <tr>
                            <td> <i class="fas fa-user"></i> </td>
                            <td></td>
                            <td> <input name="name" type="text" required="" placeholder="username..."/> </td>
                        </tr>
                        <tr>
                            <td> <i class="fas fa-key"></i> </td>
                            <td></td>
                            <td> <input id="pass" name="pass" type="password" required="" placeholder="password..."/> </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td> <input id="rePass" name="rePass" type="password" required="" placeholder="re-password..."/> </td>
                        </tr>

                        <tr>
                            <td></td>
                            <td></td>
                            <td colspan="2">                      
                                <button type="submit">create</button>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td colspan="2">
                                <p class="message">Already registered? <a href="#">Sign In</a></p>
                            </td>
                        </tr>
                    </table>
                </form> 
            </div>
        </div>
    </body>
</html>

<script>
    $('.message a').click(function () {
        $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
    });

    function isExistedUsername() {

    }

    function isConfirmedPass() {

        var pass = document.getElementById("pass");
        var rePass = document.getElementById("rePass");
        if (pass.value === rePass.value) {
            return true;
        }
        alert("re-password not match to password. Please re-enter!");
        return false;
    }
</script>


