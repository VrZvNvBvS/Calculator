package com.nguyen.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setNum1(10.5);
        calculator.setNum2(5.2);
        calculator.setOperator('+');
        calculator.performOperation();
        calculator.getResults();

    }
}
