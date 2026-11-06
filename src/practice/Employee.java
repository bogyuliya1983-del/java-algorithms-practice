package practice;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    private int performanceScore;

    public Employee(String name, double salary, LocalDate hireDate, int performanceScore) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.performanceScore = performanceScore;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public LocalDate getHireDate() { return hireDate; }
    public int getPerformanceScore() { return performanceScore; }

    @Override
    public String toString() {
        return name + " (ЗП: " + salary + ", Дата найма: " + hireDate + ", Оценка: " + performanceScore + ")";
    }
}