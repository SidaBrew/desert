<%--
  Created by IntelliJ IDEA.
  User: issuser
  Date: 2019/7/2
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
<%--    <title>登录页面</title>--%>

<%--</head>--%>
<%--<body>--%>
<%--<br><br><br>--%>
<%--   <h3 align = "center">登录页面</h3>--%>
<%--   <hr>--%>
<%--     <form align = "center" action="/desert/login/doLogin" method="post">--%>
<%--             <table align = "center" border="0">--%>
<%--                 <tr><td>用户名</td><td><input type="text" name="userName" ></td></tr>--%>
<%--                 <tr><td>密码</td><td><input type="password" name="password" ></td></tr>--%>
<%--                 <tr><td align = "center"><input type="submit" value = "登录" style="color:blue" ></td></tr>--%>
<%--             </table>--%>
<%--      </form>--%>
<%--</body>--%>
<%--</html>--%>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
    <link href="/static/css/style.css" rel='stylesheet' type='text/css' />
    <script type="text/javascript" src="/static/jquery-1.8.2.min.js"></script>
</head>
<body>
<script>$(document).ready(function(c) {
    $('.close').on('click', function(c){
        $('.login-form').fadeOut('slow', function(c){
            $('.login-form').remove();
        });
    });
});
</script>
<!--SIGN UP-->
<h1>klasikal Login Form</h1>
<div class="login-form">
    <div class="close"> </div>
    <div class="head-info">
        <label class="lbl-1"> </label>
        <label class="lbl-2"> </label>
        <label class="lbl-3"> </label>
    </div>
    <div class="clear"> </div>
    <div class="avtar">
        <img src="/static/images/avtar.png" />
    </div>
    <form>
        <input type="text" class="text" value="Username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" >
        <div class="key">
            <input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
        </div>
    </form>
    <div class="signin">
        <input type="submit" value="Login" >
    </div>
</div>
<div class="copy-rights">
    <p>Copyright &copy; 2015.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="??????">??????</a> - Collect from <a href="http://www.cssmoban.com/" title="??????" target="_blank">??????</a></p>
</div>

</body>
</html>