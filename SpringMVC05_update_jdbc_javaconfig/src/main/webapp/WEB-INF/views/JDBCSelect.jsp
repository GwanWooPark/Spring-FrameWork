<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>제목</th>
            <td>${dto.title }</td>
        </tr>
        <tr>
            <th>작성자</th>
            <td>${dto.writer }</td>
        </tr>
        <tr>
            <th>내용</th>
            <td><textarea rows="10" cols="60">${dto.content }</textarea></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <input type="button" value="목록으로" onclick="location.href='/list.do'">
                <input type="button" value="수정" onclick="location.href='/updateForm.do?seq=${dto.seq }'">
                <input type="button" value="삭제" onclick="location.href='/delete.do?seq=${dto.seq }'">
            </td>
        </tr>
    </table>
</body>
</html>
