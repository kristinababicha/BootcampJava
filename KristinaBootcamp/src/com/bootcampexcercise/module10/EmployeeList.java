package com.bootcampexcercise.module10;
import java.util.List;
import java.util.ArrayList;

//create 5 employee objects using constructor of the Employee class (created in the Activity 2)
// Object should have 3 details : job Title, Company, Salary;
//
// Create list (List<Employee>empList=new ArrayList <Employee>(); of Employees and add all the employee objects in the list
// Create method which return the name of the employee whose salary is highest among the 5 : getHighestPaidEmp() [This method should be in Employee Class created in activity 2]

// Print statement : "The Employee whose salary is the highest is :" +getHighestPaidEmp();
//[This call should be done in EmployeeList class]
//Note, for this activity you will be using Employee Class defined in Activity 2 by adding additional methods or change constructor


public class EmployeeList extends Employee {
    public static void main (String[] args) {

        Employee e1 = new Employee("gardener", "Garden", 200.00);
        Employee e2 = new Employee("manager", "Accenture", 1200.00);
        Employee e3 = new Employee("tester", " Apple ", 2000.00);
        Employee e4 = new Employee("developer", "Google ", 3000.00);
        Employee e5 = new Employee("sailor", " Riga Port", 5000.00);

        e1.setName("Disha");
        e2.setName("Kristina");
        e3.setName("Markus");
        e4.setName("Laima");
        e5.setName("Korzik");

        List<Employee> empList = new ArrayList<Employee>();
//adding to the list
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        Employee obj = new Employee();
        System.out.println("The Employee with highest salary : " + obj.getHighestPaidEmp(empList));


    }
}
