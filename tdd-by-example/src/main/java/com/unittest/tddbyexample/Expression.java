package com.unittest.tddbyexample;

public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression secondNumber);
    Expression times(int multiplier);
}
