<%--
  Created by IntelliJ IDEA.
  User: issuser
  Date: 2019/7/2
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>

</head>
<body>
<br><br><br>
   <h3 align = "center">登录页面</h3>
   <hr>
     <form align = "center" action="/login/dologin" method="get">
             <table align = "center" border="0">
                 <tr><td>用户名</td><td><input type="text" name="username" ></td></tr>
                 <tr><td>密码</td><td><input type="password" name="password" ></td></tr>
                 <tr><td align = "center"><input type="submit" value = "登录" style="color:blue" ></td><td align = "right"><button><a href = "register.jsp" style="color:blue" >注册</a></button></td></tr>
             </table>
      </form>
</body>
</html>
