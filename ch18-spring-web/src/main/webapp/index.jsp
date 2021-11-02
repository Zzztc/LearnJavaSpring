<%--
  Created by IntelliJ IDEA.
  User: 10490
  Date: 2021/11/2
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
    <div align="center">
        <form action="add" method="post">
            姓名：<input type="text" name="name"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="注册学生">
        </form>
    </div>

<br/>
<br/>
    <p>查询：</p>
<form action="query" method="post">
    学生id：<input type="text" name="stuid"><br/>
    <input type="submit" value="查询">
</form>
</body>
</html>
