package com.bootcampexcercise.module10;
import junit.framework.TestCase;
//create 2 add methods (apply method overloading - name of methods should be the same)
// create substract method
//create divide method (apply java exception and write try and catch of innnvalid inputs)
//create multiply method (apply customized exception for invalid input - compulsory to write try catch event if you use throws
// create calculatorTest class (Min 10 tests in total - please read below:
// Min 4 test cases of add method (use both overloaded methods, dont just create 4 test cases for 1 method) and min 2 cases for subtract method
//Min 2 test cases of divide method, multiply method (should have at leas 1 case of exception handling test condition)
// Optional : Run by coverage and try to get 100% of tests


public class Calculator {
    public int getSum(int a, int b) {

        return (a+b);
    }
    public int getDifference (int a, int b) {

        return (a-b);
    }
    public double getProduct (double a, double b ){

        return a*b;
    }
    //exception for multiplier

//    public void performMultiply(){
//        try {
//            int a =0;
//        } catch (Exception e) {
//            System.out.println(0);
//        }
//    }

    public double getQuotient (double a, double b) {
        try {
            return a / b;
        } catch (Exception ex) {
            System.out.println("Division error");
            throw ex;
        }
    }
}
