package com.edu.less05.myapp.controller;

import com.edu.less05.myapp.logic.Calculator;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Controller extends HttpServlet {
    Calculator calculator;

    @Override
    public void init(ServletConfig config) throws ServletException {
        calculator = new Calculator();
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    private void doRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double num1 = Double.parseDouble(req.getParameter("number1"));
        double num2 = Double.parseDouble(req.getParameter("number2"));
        String typeAction = req.getParameter("action");
        double result = 0;
        String operator = null;

        switch (typeAction) {
            case "addition": {
                result = calculator.add(num1, num2);
                operator = "+";
                break;
            }
            case "subtraction": {
                result = calculator.substract(num1, num2);
                operator = "-";
                break;
            }
            case "multiplication": {
                result = calculator.multiply(num1, num2);
                operator = "*";
                break;
            }
            case "division": {
                result = calculator.divide(num1, num2);
                operator = "/";
                break;
            }
        }
        result = Math.round(result * 100) / 100.0;

        req.setAttribute("num1", num1);
        req.setAttribute("num2", num2);
        req.setAttribute("operator", operator);
        req.setAttribute("result", result);
        req.getRequestDispatcher("toResult").forward(req, resp);
    }
}
