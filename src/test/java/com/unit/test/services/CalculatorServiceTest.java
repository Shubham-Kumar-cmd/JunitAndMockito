//package com.unit.test.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    int counter=0;
//
////    Before class
//    @BeforeClass //before all test cases
//    public static void init(){
//        System.out.println("Before all test cases!!");
//        System.out.println("Stated test: "+new Date());
//    }
//
//    //    before each test case
//    @Before //executes the method before each test case
//    public void beforeEach(){
//        System.out.println("Before each test case");
//        counter=0;
//    }
//
////    test method for add two numbers
//    @Test
//    public void addTwoNumbersTest(){
//        for (int i = 1; i <= 10; i++) {
//            counter+=i;
//        }
//        System.out.println("Test for addTwoNumbersTest");
////        actual result
//        int result = CalculatorServices.addTwoNumber(45, 15);
////        expected result
//        int expected=60;
//        System.out.println("Counter in first test case "+counter);
//        Assert.assertEquals(expected,result);
//    }
//
////    test method for add any numbers
//    @Test(timeout = 3000)
//    public void addAnyNumbersTest() throws InterruptedException {
//        for (int i = 1; i <=20; i++) {
//            counter+=i;
//        }
//        Thread.sleep(2000);
//        System.out.println("Test for addAnyNumbersTest");
////        actual result
//        int result = CalculatorServices.sumAnyNumbers(45, 15,60,15);
////        expected result
//        int expected=135;
//        System.out.println("Counter in second test case "+counter);
//        Assert.assertEquals(expected,result);
//    }
//
//    //    after each test case
//    @After //executes the method after each test case
//    public void afterEach(){
//        System.out.println("After each test case");
//        System.out.println("Counter value "+counter);;
//    }
//
////    After class
//    @AfterClass //after all test cases
//    public static void cleanUp(){
//        System.out.println("After all test cases!!");
//        System.out.println("Ended test: "+new Date());
//    }
//
////    BeforeClass
////    Before
////    Test
////    After
////    AfterClass
//}
