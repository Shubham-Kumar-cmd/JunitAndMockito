package com.unit.test.services;

import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceJUnit5Test {

    int counter=0;

//    execute the logic before all test cases
    @BeforeAll
    public static void init(){
        System.out.println("Before all test cases!!");
        System.out.println("Stated test: "+new Date());
    }

//    before each test case
    @BeforeEach //executes the method before each test case
    public void beforeEach(){
        System.out.println("Before each test case");
        counter=0;
    }

    @Test
    @DisplayName("This is addTwoNumbersTest")
    public void addTwoNumbersTest(){
        for (int i = 1; i <= 10; i++) {
            counter+=i;
        }
        System.out.println("Test for addTwoNumbersTest");
//        actual result
        int result = CalculatorServices.addTwoNumber(45, 15);
//        expected result
        int expected=60;
        System.out.println("Counter in first test case "+counter);
//        Assertions.assertEquals(expected,result);
        Assertions.assertEquals(expected,result,"Test fail!!");
    }

    @Test
    @Disabled
    public void addAnyNumbersTest() throws InterruptedException {
        for (int i = 1; i <=20; i++) {
            counter+=i;
        }
        Thread.sleep(2000);
        System.out.println("Test for addAnyNumbersTest");
//        actual result
        int result = CalculatorServices.sumAnyNumbers(45, 15,60,15);
//        expected result
        int expected=139;
        System.out.println("Counter in second test case "+counter);
//        Assertions.assertEquals(expected,result);
        Assertions.assertEquals(expected,result,"Test fail!!");
    }

//    after each test case
    @AfterEach //executes the method after each test case
    public void afterEach(){
        System.out.println("After each test case");
        System.out.println("Counter value "+counter);;
    }

//        execute the logic after all test cases
    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test cases!!");
        System.out.println("Ended test: "+new Date());
    }
}
