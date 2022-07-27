package com.bootcampexcercise.module5.activity;

public class InheritanceActivity {
    public static void main(String[] args) {

        Person_I p = new Person_I();
        p.setName("Sarah Johnson");
        p.setAge(21);

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21



        System.out.println(" Person_I ");
        Employee_I e = new Employee_I();
        e.setSalary(70000.00);
        e.setTitle("Developer");
        e.setAge(32);
        e.setName("ShawnCun");
        //Create Employee object e and
        // set salary as 70000.00, title as Developer, age as 32 and name as Shawn Cun


        // Print Info using Employee object
        System.out.println("-----------------------------");
        System.out.println("Student's Name is   : " + e.getName());
        System.out.println("Student's Age is    : " + e.getAge());
        System.out.println("Student's Title is  : " + e.getTitle());
        System.out.println("Student's School is : " + e.getSalary());


        // Print Info using Person object
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());


    }

}
