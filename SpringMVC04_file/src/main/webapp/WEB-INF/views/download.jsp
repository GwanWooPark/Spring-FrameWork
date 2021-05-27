<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    file : ${fileObj.name }<br/>
    desc : ${fileObj.desc }<br/>
    <form action="download" method="post">
        <input type="hidden" name="name" value="${fileObj.name }">
        <input type="submit" value="download">
    </form>

    <!--
    mime-type (Multipurpose Internal Mail Extension)
    request header에 지정되는, 데이터가 어떤 종류의 stream인지를 나타내주는 프로토콜

    <mime-mapping>
        <extension>hwp</extension>
        <mime-type>application/unknown</mime-type>
    </mime-mapping>
    -->
</body>
</html>
