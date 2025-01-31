package com.example.challenge79;

public class Employee {
    private String name;
    private int Age;
    private double Salary;

     Employee(String name, int age, double salary) {
        this.name = name;
        Age = age;
        Salary = salary;
    }
    String getEmployeeDetail(){
         return "EmployeeDetail:name:"+name
                 +",age:"+Age
                 +",salary:"+Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
