<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <a href="/home.do">home</a>
    <br>
    <a href="/command.do?name=spring&addr=서울&phone=010-1234-5678">getCommand</a>
    <br>
    <form action="command.do">
        <table border="1">
            <tr>
                <th>NAME</th>
                <th><input type="text" name="name"></th>
            </tr>
            <tr>
                <th>ADDRESS</th>
                <th><input type="text" name="addr"></th>
            </tr>
            <tr>
                <th>PHONE</th>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="postCommand">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
