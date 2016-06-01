
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Test do page</title>


<link rel="stylesheet" type="text/css" href="resources/index_style.css">

</head>
<body>

    <section id="login_section" class="login">
        <form action="/test/api/login" method="get">
            <div align="center">
                <img style="margin-bottom: 20px;"
                    src="https://portal.daou.co.kr/resources/images/mint_theme/logo_do_login.png">

                <br>
                <input type="text" name="ID" class="login login_input"
                    value="ID" /> <br>
                <input type="text" name="PASSWORD" class="login login_input"
                    value="PASSWORD" /> <br>
                <input type="submit" id="login_button" value="Login" />
            </div>
        </form>
    </section>

</body>
</html>
