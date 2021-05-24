package com.abhishek.tests;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test_TestNGCustomListener {


    @Test(priority = 0)
    public void testPass(){
        assertEquals("Pass","Pass");
    }

    @Test(priority = 1)
    public void testFailed(){
        assertEquals("Pass","Failed");
    }


    @Test(priority = 2)
    public void testSkipped(){
        throw new SkipException("Skipping test case");
    }

    @Test(priority = 3, dataProvider = "test data")
    public void testDataProvider(String data){
        assertEquals(data,"Test data 1");
    }



    @DataProvider(name ="test data")
    public Object[] dt(){
        Object[] obj = new Object[3];
        obj[0] = "Test data 1";
        obj[1] = "Test data 2";
        obj[2] = "Test data 3";

        return obj;
    }
}
