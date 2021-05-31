<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>

    <form action="/myboard/updateRes" method="post">
        <input type="hidden" name="myno" value="${dto.myno }">
        <table border="1">
            <tr>
                <th>작성자</th>
                <td>${dto.myname }</td>
            </tr>
            <tr>
                <th>제목</th>
                <td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
            </tr>
            <tr>
                <th>내용</th>
                <td><textarea rows="10" cols="60" name="mycontent">${dto.mycontent}</textarea></td>
            </tr>
            <tr>
                <td colspan="2" align="right">
                    <input type="submit" value="수정">
                    <input type="button" value="취소" onclick="location.href='/myboard/select?myno=${dto.myno }'">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>