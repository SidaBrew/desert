<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<script type="text/javascript" src="/static/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<%--	<form action="${pageContext.request.contextPath}/user/formtest" method="post">--%>
<%--		username:<input type="text" name="username"/><br/>--%>
<%--		password:<input type="text" name="password"/><br/>--%>
<%--		<input type="submit" value="提交"/>--%>
<%--	</form>--%>

你就是邵光泽。
你就是你。
</body>
<script type="text/javascript">
    console.log(1);
    $.ajax({
        url:"/test/userInfo",
        type: "POST",
        data: {"userName":"zhangsan","password":"lwsiis"},
        //async:true,
        success:function(data, textStatus, jqXHR){
            console.log(2);
            // console.log(jqXHR.status);
            // if (jqXHR.status === 401) {
            //  console.log(401);
            //  console.log(3);
            //     //t window.location.href = "/login"
            // }
        },
        error:function(xhr,textStatus,errorThrown){
            console.log(textStatus);
            console.log(xhr.status);
            window.location.href = "/login/loginJsp"
        }
    });
    //简单登录操作
    // $("#doLogin").click(function (e) {
    //     $.ajax({
    //         type : "POST",
    //         url : "/login",
    //         data : {
    //             "userName" : $("#userName").val(),
    //             "password" : $("#password").val()
    //         },
    //         dataType : "json",
    //         success : function(data) {
    //             if (data.result == "1") {
    //                 window.location.href ="/learn";
    //             } else {
    //                 alert("账号密码不能为空！");
    //             }
    //         }
    //     });
    // });


</script>

</html>