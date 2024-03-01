package com.calculator.Homework16.calculator;

import com.calculator.Homework16.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    private final WelcomeServiceImpl welcomeService;
    private final AddingNumbersCalculateServiceImpl addingNumbersService;
    private final SubtractNumbersCalculateServiceImpl subtractNumbersService;
    private final MultiplyNumbersCalculateServiceImpl multiplyNumbersService;

    private final DivideNumbersCalculateServiceImpl divideNumbersService;

    public Calculator(AddingNumbersCalculateServiceImpl addingNumbersService, WelcomeServiceImpl welcomeService,
                      SubtractNumbersCalculateServiceImpl subtractNumbersService,
                      MultiplyNumbersCalculateServiceImpl multiplyNumbersService,
                      DivideNumbersCalculateServiceImpl divideNumbersService) {
        this.addingNumbersService = addingNumbersService;
        this.welcomeService = welcomeService;
        this.subtractNumbersService = subtractNumbersService;
        this.multiplyNumbersService = multiplyNumbersService;
        this.divideNumbersService = divideNumbersService;
    }

    @RequestMapping
    public String hello() {
        return welcomeService.hello();
    }

    @RequestMapping(path = "/calculator")
    public String welcome() {
        return welcomeService.welcome();
    }

    @RequestMapping(path = "/calculator/plus")
    public String addingNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return addingNumbersService.calculate(num1, num2);
    }

    @RequestMapping(path = "/calculator/minus")
    public String subtractNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return subtractNumbersService.calculate(num1, num2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return multiplyNumbersService.calculate(num1, num2);
    }

    @RequestMapping(path = "/calculator/divide")
    public String divideNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return divideNumbersService.calculate(num1, num2);
    }
}