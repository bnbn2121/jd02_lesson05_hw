<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <div align="center">
        <h3>Result</h3>
        <%= request.getAttribute("num1") %>
        <%= request.getAttribute("operator") %>
        <%= request.getAttribute("num2") %>
        =
        <%= request.getAttribute("result") %>
        <p>to main page <a href="toMain">tap</a></p>
    </div>
</body>
</html>