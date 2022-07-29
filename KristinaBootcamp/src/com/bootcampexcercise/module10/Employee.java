package com.bootcampexcercise.module10;
import java.util.List;

//employee class should extend Person class +
// create attributes : jobTitle, company, salary+
//add different constructors
//add getters and setters
//override method introduce of person class->
// "My name is <name> and i am <age> years old
// I am work as <jobTitle> in <company>“ and my salary is <salary>


public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    public Employee (String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

//    public Employee(String jobTitle,String company,){
//
//        this("Tester", "Accenture",0);
//    }

    public Employee(){

        this("Gardener", "Shopping mall ", 200);
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introducePerson() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old");
        System.out.println("I work as " + this.jobTitle +" in " + this.company + " and my salary is " + this.salary);

    }
//gethighestpaidemplist
    public String getHighestPaidEmp(List<Employee> list) {
        Employee temp = new Employee();
        temp = list.get(0);
        double max = temp.getSalary();
        String tempName = temp.getName();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
            if (max < temp.getSalary()) {
                max = temp.getSalary();
                tempName = temp.getName();
            }
        }
        return tempName;
    }


}