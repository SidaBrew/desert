<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="javascript">

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
		function req() {
			$.ajax({
				url: "/test/test",
				//data: {username: 'jenny'},
				type: "POST",
				//dataType: "json",
				success: function(data) {
					// data = eval("(" + data+ ")");
					// data = jQuery.parseJSON(data);  // dataType注释了，故注意反序列化
					// $("#ret").text(data.result);
					if(data==401){
						window.location.href("login");
					}
				}
			});
		}
	</script>
</head>
<body>
<%--	<form action="${pageContext.request.contextPath}/user/formtest" method="post">--%>
<%--		username:<input type="text" name="username"/><br/>--%>
<%--		password:<input type="text" name="password"/><br/>--%>
<%--		<input type="submit" value="提交"/>--%>
<%--	</form>--%>

<input type="submit" value="提交" onclick="req()"/>
你就是邵光泽。
你就是你。
</body>

</html>
</html>