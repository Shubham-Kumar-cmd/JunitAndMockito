package com.unit.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class AssertExampleTest {

//    Assertion -> validating actual result with expected result
    @Test
    public void test(){
        System.out.println("Testing some assertion methods");
        int actual=12;
        Integer expected=12;
//        overloaded method assertEquals()
        Assertions.assertEquals(expected,actual);

//        Assertion on array
        int []actualIntArray={1,2,3,4,5,6};
        int []expectedIntArray={1,2,3,4,5,6};
        Assertions.assertArrayEquals(expectedIntArray,actualIntArray,"Array test fail!!");

//    Assertion on object
        String name=new String("Shubham");
        String expectedName=new String("Shubham");
        Assertions.assertSame(expectedName,name,"Object test fail!!");

        boolean value=true;
        Assertions.assertTrue(value);

        List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2= Arrays.asList(1,2,3,4,5,6);
        Assertions.assertIterableEquals(list1,list2);

    }

}
