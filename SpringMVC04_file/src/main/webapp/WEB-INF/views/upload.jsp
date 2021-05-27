<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!-- Spring Framework 버전의 form 태그 -->
    <!-- enctype="multipart/form-data" 모든 문자를 인코딩하지 않음을 명시.(주로 이미지나 파일을 전송할 때 사용) -->
    <!--  modelAttribute : 보낸 파일 데이터를 바인딩할 객체를 지정 -->
    <form:form method="post" enctype="multipart/form-data" modelAttribute="uploadFile" action="upload">
        <h1>UPLOAD FORM</h1>
        file<br/>
        <input type="file" name="mpfile"/><br/>
        <p style="color: red; font-weight: bold;">
            <!-- 에러코드에 따른 Message 출력 -->
            <form:errors path="mpfile"/>
        </p>
        <br/>
        <!-- 파일 부연설명 -->
        description<br/>
        <textarea rows="10" cols="60" name="desc"></textarea>
        <input type="submit" value="send">
    </form:form>

    <!--
    form 태그의 속성
        1. application/www-form-urlencoded : 문자들이 encoding됨 (default)
        2. multipart/form-data : file upload시 (post)
        3. text/plain : encoding 하지 않은

    Spring form tag
        form:errors -> Errors, BindingResult를 사용할 때, command 객체의 특정 field에서 발생하는 에러 메시지 출력 가능

     -->
</body>
</html>
