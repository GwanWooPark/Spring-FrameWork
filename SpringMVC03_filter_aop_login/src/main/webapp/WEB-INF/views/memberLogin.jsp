<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>

    <script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#loginChk").hide();
        });

        function login() {
            var memberid = $("#memberid").val.trim();
            var memberpw = $("#memberpw").val.trim();

            // 리터럴 객체
            var loginVal = {
                "memberid" : memberid,
                "memberpw" : memberpw
            }

            if (memberid === null || memberid === "" || memberpw === null || memberpw === "") {
                alert("ID와 PW 입력하시오.");
            } else {
                $.ajax({
                    type: "POST",
                    url: "ajaxlogin.do",
                    data: JSON.stringify(loginVal),
                    contentType: "application/json",
                    dataType: "json",
                    success: function (msg) {

                    },
                    error: function () {
                        alert("통신 실패");
                    }
                })
            }

        }
    </script>
</head>
<body>
<h1>LOGIN</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <td><input type="text" id="memberid"></td>
        </tr>
        <tr>
            <th>PW</th>
            <td><input type="text" id="memberpw"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="button" value="login" onclick="login();"></td>
        </tr>
        <tr>
            <td colspan="2" align="center" id="loginChk"></td>
        </tr>
    </table>
</body>
</html>
