package com.bootcampexcercise.module10;

import junit.framework.TestCase;

// create calculatorTest class (Min 10 tests in total - please read below:
// Min 4 test cases of add method (use both overloaded methods, dont just create 4 test cases for 1 method) and min 2 cases for subtract method
//Min 2 test cases of divide method, multiply method (should have at leas 1 case of exception handling test condition)
// Optional : Run by coverage and try to get 100% of tests

public class CalculatorTest extends TestCase {
    private Calculator theCalculator;
    protected void setUp() throws Exception {
        super.setUp();
        theCalculator = new Calculator();
    }
    protected void tearDown() throws Exception {
        theCalculator = null;
        super.tearDown();
    }
    //checking if sum of tho positive values
    public void testGetSum() {
        int a = 2;
        int b = 5;
        assertEquals(7,(theCalculator.getSum( a ,b)));
        assertEquals(7, (theCalculator.getSum(b , a)));

        //checking if one number is negative
        a = 2;
        b= -5;
        assertEquals(-3, (theCalculator.getSum(a,b)));
        assertEquals(-3, (theCalculator.getSum(b,a)));

        //checking if both numbers are negative
        a = -2;
        b = -5;
        assertEquals(-7,(theCalculator.getSum(a,b)));
        assertEquals(-7,(theCalculator.getSum(a , b)));
    }

    public void testGetDifference() {
    int a = 2;
    int b = 5;
    //for (a-b) we use following:
        assertEquals(-3,(theCalculator.getDifference(a,b)));
        //for (b-a) we use following:
        assertEquals(3,(theCalculator.getDifference(b,a)));
    }

    //next is test of multiply method
    public void testGetProduct() {
        double a = 2;
        double b = 5;
        assertEquals(10.0,(theCalculator.getProduct(a,b)));
         a = 0;
         b = 5;
        assertEquals(0.0,(theCalculator.getProduct(a,b)));
    }



    // test of divide method
    public void testGetQuotient() {

        double a = 6;	double b = 3;
        //	Checks if b is lesser than a
        assertEquals(2.0, (theCalculator.getQuotient(a,b)));
        //	Checks if b is greater than a
        assertEquals(0.5, (theCalculator.getQuotient(b,a)));

        a = 6;	b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-2.0, (theCalculator.getQuotient(a,b)));
        //	Checks if negative value is divided with positive value
        assertEquals(-0.5, (theCalculator.getQuotient(b,a)));

        a = -10;	b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2.0, (theCalculator.getQuotient(a,b)));
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.5, (theCalculator.getQuotient(b,a)));
    }







    }



