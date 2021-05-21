<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <h1>UPDATE</h1>
    <form action="/updateRes.do" method="post">
        <input type="hidden" value="${dto.myno }" name="myno">
        <table border="1">
            <tr>
                <th>작성자</th>
                <td>${dto.myname }</td>
            </tr>
            <tr>
                <th>제목</th>
                <td><input type="text" name="mytitle" value="${dto.mytitle}"></td>
            </tr>
            <tr>
                <th>내용</th>
                <td><textarea rows="10" cols="60" name="mycontent">${dto.mycontent }</textarea></td>
            </tr>
            <tr>
                <td colspan="2" align="right">
                    <input type="button" value="취소" onclick="location.href='/select.do?myno=${dto.myno }'">
                    <input type="submit" value="수정">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
