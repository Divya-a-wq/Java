package com.example.challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp=new Employee("Divya",20,50000);
        System.out.println(emp.getEmployeeDetail());
        emp.setName("chanchal");
        System.out.println(emp.getEmployeeDetail());
    }
}
