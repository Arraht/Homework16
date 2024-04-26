package com.calculator.Homework16.service;

import com.calculator.Homework16.action.CalculateService;

@org.springframework.stereotype.Service
public class MultiplyNumbersCalculateServiceImpl implements CalculateService {
    public String calculate(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
}
