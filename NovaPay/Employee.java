package com.assign.emp.entity;

public class Employee {
    private int id;
    private  String name;
    private Double Salary;
    private int rating;

    public Employee(int id, String name, Double salary, int rating) {
        this.id = id;
        this.name = name;
        Salary = salary;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
