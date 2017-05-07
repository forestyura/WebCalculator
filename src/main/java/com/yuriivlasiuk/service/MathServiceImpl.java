package com.yuriivlasiuk.service;

import org.mariuszgromada.math.mxparser.Expression;

public class MathServiceImpl implements MathService{
    Expression expression;

    @Override
    public String calculate(String calculateExpression) {
        expression = new Expression(calculateExpression);
        return String.valueOf(expression.calculate());
    }
}
