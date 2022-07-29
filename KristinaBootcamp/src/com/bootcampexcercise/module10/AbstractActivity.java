package com.bootcampexcercise.module10;

//task description in Students class


public class AbstractActivity {
    public static void main(String[] args) {
        Employee newEmployee = new Employee();
        Students newStudent = new Students();

        System.out.println("Introduction from employee");
        newEmployee.introducePerson();
        System.out.println("Introduction from student");
        newStudent.introducePerson();
    }

}
