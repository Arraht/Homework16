package com.calculator.Homework16.service;

import com.calculator.Homework16.action.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
    public String hello() {
        return "Hello!";
    }

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
}