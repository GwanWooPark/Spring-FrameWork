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
    mime
    -->
</body>
</html>
