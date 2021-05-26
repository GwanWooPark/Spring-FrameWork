<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        $(".chk").click(function () {
            $.ajax({
                url: "/"
            });
        });
    </script>
</head>
<body>
    <form action="/signUpRes.do" method="post">
        <table border="1">
            <tr>
                <th>아이디</th>
                <td><input type="text" name="memberid"></td>
                <td><input type="button" value="중복체크" class="chk"></td>
            </tr>
            <tr>
                <th>비밀번호</th>
                <td colspan="2"><input type="text" name="memberpw" ></td>
            </tr>
            <tr>
                <th>이름</th>
                <td colspan="2"><input type="text" name="membername"></td>
            </tr>
            <tr>
                <td colspan="3 ">
                    <input type="submit" value="가입하기">
                    <input type="button" value="취소" onclick="location.href='/login.do'">
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
