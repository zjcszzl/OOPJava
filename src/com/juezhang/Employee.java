package com.juezhang;

// Encapsulation: bundle the data and methods that operate on the data in a single unit
// Abstraction: reduce complexity by hiding unnecessary details

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Belong to the class, accessed by Employee.
    public static int numberOfEmployees;

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }


    // Instance method belong to the class
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public Employee(int baseSalary){
        setBaseSalary(baseSalary);
        setHourlyRate(0);
        numberOfEmployees++;
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary < 0 )    throw new IllegalArgumentException("Salary cannot be non-positive");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0) throw new IllegalArgumentException();
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return this.hourlyRate;
    }

    // Method overloading
    public int calculateWage(){
        return this.baseSalary;
    }

    public int calculateWage(int extraHours){
        return this.baseSalary + extraHours * this.hourlyRate;
    }

    // Class is a template for creating objects, an object is an instance of a class
    // Stack is used for storing primitive types(numbers, boolean, characters) and variables that store
    // references to objects in the heap. Variables in the stack are cleared when they go out of scope.
    // Objects stored in the heap get removed later on when they're no longer references. This is done by Java's
    // garbage collector.
    // Static methods are accessible via classes, not objects

}
