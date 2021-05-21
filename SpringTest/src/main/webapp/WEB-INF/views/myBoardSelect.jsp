<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>글번호</th>
        <td>${dto.myno }</td>
    </tr>
    <tr>
        <th>작성자</th>
        <td>${dto.myname }</td>
    </tr>
    <tr>
        <th>내용</th>
        <td><textarea rows="10" cols="60" readonly="readonly">${dto.mycontent }</textarea></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="button" value="글 수정" onclick="location.href='/updateForm.do?myno=${dto.myno }'">
            <input type="button" value="목록으로" onclick="location.href='/list.do'">
            <input type="button" value="삭제" onclick="location.href='/delete.do?myno=${dto.myno }'">
        </td>
    </tr>
</table>
</body>
</html>
