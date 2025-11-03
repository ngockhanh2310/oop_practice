package com.workspace.exercise.exam7;

public class Teacher extends Person{
    private double salary;
    private double bonus;
    private double penalty;
    private double realSalary;

    public Teacher(int id, String name, int age, String address, double salary, double bonus, double penalty) {
        super(id, name, age, address);
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.realSalary = salary + bonus - penalty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }

    @Override
    public void display() {
        System.out.println("\t\r---Teacher Information---");
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Penalty: " + penalty);
        System.out.println("Real Salary: " + realSalary);
    }
}
