package com.basic_calculator;

class BasicCalculator
{
    static double addition(String val1, String val2)
    {
        return (Double.parseDouble(val1) + Double.parseDouble(val2));
    }

    static double subtraction(String val1, String val2)
    {
        return (Double.parseDouble(val1) - Double.parseDouble(val2));
    }

    static double divison(String val1, String val2)
    {
        return (Double.parseDouble(val1) / Double.parseDouble(val2));
    }

    static double multiplication(String val1, String val2)
    {
        return (Double.parseDouble(val1) * Double.parseDouble(val2));
    }

}
