<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/insertRes.do" method="post">
    <table border="1">
        <tr>
            <th>작성자</th>
            <td><input type="text" name="writer"></td>
        </tr>
        <tr>
            <th>제목</th>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea rows="10" cols="60" name="content"></textarea></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="작성">
                <input type="button" value="취소" onclick="location.href='/list.do'">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
