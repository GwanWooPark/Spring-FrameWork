<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
                <td colspan="4">--------- 작성된 글 없음---------</td>
            </c:when>
            <c:otherwise>
                <c:forEach items="${list }" var="dto">
                    <tr>
                        <td>${dto.seq }</td>
                        <td>${dto.writer }</td>
                        <td><a href="/select.do?seq=${dto.seq}">${dto.title }</a></td>
                        <td>${dto.regdate }</td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="4" align="right">
                        <input type="button" value="글 작성" onclick="location.href='/insertForm.do'">
                    </td>
                </tr>
            </c:otherwise>
        </c:choose>
    </table>
</body>
</html>
