<%@page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
                <td>----- 글 없----</td>
            </c:when>
            <c:otherwise>
                <c:forEach items="${list }" var="dto">
                    <tr>
                        <td>${dto.myno }</td>
                        <td>${dto.myname }</td>
                        <td><a href="/myboard/select?myno=${dto.myno }">${dto.mytitle }</a></td>
                        <td>${dto.mydate }</td>
                    </tr>
                </c:forEach>
            <tr>
                <td colspan="4" align="right">
                    <input type="button" value="글 작성" onclick="location.href='/myboard/insertForm'">
                </td>
            </tr>
            </c:otherwise>
        </c:choose>
    </table>

</body>
</html>