package com.bootcampexcercise.module10;


// this class should extend Person class
// create attribute schoolName
//Create getters and setters for attribute
//Students class should extend to person class
// override method introduce of person --> "I am study in university <schoolName>"
// 2.3. Seperate class AbstractActivity
// call introduce from employee
//call introduce from student

public class Students extends Person {
    private String schoolName;




    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName (String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void introducePerson() {
        System.out.println(  "I study in university " + this.schoolName );
    }
}
