package com.bootcampexcercise.module7.sample;

public class AssertSample {


    public static void test() {
        //1 - Type assert 5 %2 and 6%2 in separate statements
        int value = 5 % 2;
        assert 6 % 2 == 1;
        assert value == 1 : "Assertion failed";


    }

    public static void main(String arg[]) {
        //2 - Call test()
        test();


    }
}
