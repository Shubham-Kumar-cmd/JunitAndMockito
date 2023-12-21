package com.unit.test.services;

public class CalculatorServices {
    public static int addTwoNumber(int a,int b){
        return a+b;
    }
    public static int productTwoNumber(int a,int b){
        return a*b;
    }

    public static long divideTwoNumber(int a,int b ){
        return a/b;
    }

    public static int sumAnyNumbers(int ... numbers){
        int sum=0;
        for (int n:numbers) {
            sum+=n;
        }
        return sum;
    }
}
