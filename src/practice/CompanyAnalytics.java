package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompanyAnalytics {
    List<Employee> employees = new ArrayList<>();

    public CompanyAnalytics() {
        employees.add(new Employee("Анна", 150_000.0, LocalDate.of(2020, 5, 15), 85));
        employees.add(new Employee("Борис", 250_000.0, LocalDate.of(2015, 1, 10), 92));
        employees.add(new Employee("Виктор", 120_000.0, LocalDate.of(2023, 8, 1), 98));
        employees.add(new Employee("Дарья", 180_000.0, LocalDate.of(2018, 11, 20), 75));
        employees.add(new Employee("Настя", 280_000.0, LocalDate.of(2027, 9, 7), 100));
    }

    public Employee highSalary() {
        Employee workerSalary = null;
        for (Employee empSalary : employees) {
            if (workerSalary == null || empSalary.getSalary() > workerSalary.getSalary())
                workerSalary = empSalary;
        }
        return workerSalary;
    }

    public Employee highGrade() {
        Employee workerGrade = null;
        for (Employee grade : employees) {
            if (workerGrade == null || grade.getPerformanceScore() > workerGrade.getPerformanceScore())
                workerGrade = grade;
        }
        return workerGrade;
    }

    public Employee experience() {
        Employee practice = null;
        for (Employee workerPractice : employees) {
            if (practice == null || workerPractice.getHireDate().isBefore(practice.getHireDate()))
                practice = workerPractice;
        }
        return practice;
    }

    public static void main(String[] args) {
        CompanyAnalytics analytics = new CompanyAnalytics();
        System.out.println("Сотрудник с самой высокой зарплатой: " + analytics.highSalary());
        System.out.println("Сотрудник с самой высокой оценкой эффективности: " + analytics.highGrade());
        System.out.println("Сотрудник с самой ранней датой найма: " + analytics.experience());
    }
}