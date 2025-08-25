<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <div align="center">
        <form action="toController" method="get">
            <label for="number1">Number 1</label>
            <input type="number" step="any" id="number1" name="number1" required><br><br>

            <label for="number2">Number 2</label>
            <input type="number" step="any" id="number2" name="number2" required><br><br>

            <label for="action">Action:</label>
            <select id="action" name="action" required>
                <option value="">- choose action -</option>
                <option value="addition">+</option>
                <option value="subtraction">-</option>
                <option value="multiplication">*</option>
                <option value="division">/</option>
            </select><br><br>

            <input type="submit" value="Get result"><br><br>
        </form>
    </div>
</body>
</html>
