package com.calculator.Homework16.service;

import com.calculator.Homework16.action.CalculateService;

@org.springframework.stereotype.Service
public class DivideNumbersCalculateServiceImpl implements CalculateService {
    public String calculate(int num1, int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        } else return "На 0 делить нельзя!";
    }
}
