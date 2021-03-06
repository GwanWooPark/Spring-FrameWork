<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <h1>LIST</h1>
    <table border="1">
        <col width="50"/>
        <col width="100"/>
        <col width="300"/>
        <col width="350"/>
        <tr>
            <th>번호</th>
            <th>작성자</th>
            <th>제목</th>
            <th>작성 날짜</th>
        </tr>
        <c:choose>
            <c:when test="${empty list }">
                <td colspan="4">---- 작성된 글 없슴 ----</td>
            </c:when>
            <c:otherwise>
                <c:forEach items="${list }" var="dto">
                    <tr>
                        <td>${dto.myno }</td>
                        <td>${dto.myname }</td>
                        <td><a href="/select.do?myno=${dto.myno }">${dto.mytitle }</a></td>
                        <td>${dto.mydate }</td>
                    </tr>
                </c:forEach>
            </c:otherwise>
        </c:choose>
        <tr>
            <td colspan="4" align="right">
                <input type="button" value="글 작성" onclick="location.href='/insertForm.do'">
            </td>
        </tr>
    </table>
</body>
</html>
