package com.bootcampexcercise.module7;
public class CustomExceptionActivity extends Exception {

    public String getMessage() {
        return "You are not allowed to use this program";
    }

}
