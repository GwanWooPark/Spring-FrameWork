<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1">
    <col width="50"/>
    <col width="70"/>
    <col width="200"/>
    <col width="230"/>
    <tr>
        <th>번호</th>
        <th>작성자</th>
        <th>제목</th>
        <th>작성일</th>
    </tr>
    <c:choose>
        <c:when test="${empty list }">
            <<tr><th colspan="4">--------글이 없습니다---------</tr>
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
        <td colspan="4" align="right" ><input type="button" value="글작성" onclick="location.href='/insertForm.do'" /></td>
    </tr>
</table>

</body>
</html>
