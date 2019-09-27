<%--
  Created by IntelliJ IDEA.
  User: ren
  Date: 2019/9/27
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        用户名：<input type="text" name="username" placeholder="输入用户名"><br>
        密码：<input type="password" name="password" placeholder="输入密码"><br>
        性别：<input type="radio" name="sex" checked>男 <input type="radio" name="sex">女<br>
        年龄：<input type="text" name="age" placeholder="输入年龄"><br>
        生日：<input type="text" name="date"><br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
