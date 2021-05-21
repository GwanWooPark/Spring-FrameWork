<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="/updateRes.do" method="post">
    <input type="hidden" value="${dto.myno }" name="myno">
    <table border="1">
        <tr>
            <th>글번호</th>
            <td>${dto.myno }</td>
        </tr>
        <tr>
            <th>작성자</th>
            <td><input type="text" name="myname" value="${dto.myname }"></td>
        </tr>
        <tr>
            <th>제목</th>
            <td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea rows="10" cols="60" name="mycontent">${dto.mycontent }</textarea></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="글 수정">
                <input type="button" value="목록으로" onclick="location.href='/list.do'">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
