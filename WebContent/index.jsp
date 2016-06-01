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

    <%= 11111 %>
    <section id="login_section" class="login">
        <form name="loginForm">
            <div align="center">
                    <img style="margin-bottom:20px;" src="https://portal.daou.co.kr/resources/images/mint_theme/logo_do_login.png">
    
                    <br><input  id="id" name="id" class="login login_input" value="ID" onfocus="" />
                    <br><input id="pw" name="pw" class="login login_input" value="PASSWORD" onfocus="" />
                    <br><input  type="submit" id="login_button" value="Login" onclick="submit1()">
                    <br><a href="mail.jsp">11</a>
            </div>
         </form>
       </section>

    
    <script type="text/javascript">

    function submit1() {
    	alert("22222");
        <%
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        
        %>
        alert("<%= id %>");
        alert("<%= pw %>");
     
    	}
    </script>

</body>
</html>