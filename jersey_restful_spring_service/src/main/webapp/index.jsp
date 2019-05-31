<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/rest/user/register" method="POST" >

    <table>
        <tr>
            <td>用户名:</td>
            <td><input name="uname"></td>
        </tr>

        <tr>
            <td>密码:</td>
            <td><input name="pwd"></td>
        </tr>


        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>

    </table>

</form>

</body>
</html>