package com.unittest.tddbyexample;

public class Sum implements Expression{
    Expression firstNumber;
    Expression secondNumber;

    public Sum(Expression firstNumber, Expression secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = firstNumber.reduce(bank, to).amount + secondNumber.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression secondNumber) {
        return new Sum(this, secondNumber);
    }
    @Override
    public Expression times(int multiplier) {
        return new Sum(firstNumber.times(multiplier), secondNumber.times(multiplier));
    }
}
