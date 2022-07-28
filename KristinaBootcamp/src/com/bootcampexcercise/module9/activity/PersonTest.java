package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;


    //TODO: create set up

    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    //for heigh and for weight


    public void testweight() {
        int testWeight1 = 15;
        person.setWeight(testWeight1);
        assertEquals(testWeight1, person.getHeight());
    }

    public void testheight() {
        float testHeight1 = 2f;
        person.setHeight(testHeight1);
        assertEquals(testHeight1, person.getWeight());


        //TODO: create unit test for getBodyMassIndex method


    }

    public void testBmi() {
        double bmi = person.bMI(100, 1.5f);
        double bmiExpected = 100 / Math.sqrt(1.5);
        assertEquals(bmiExpected, bmi);
    }
}