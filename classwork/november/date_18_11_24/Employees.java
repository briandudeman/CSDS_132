package date_18_11_24;

import date_8_11_24.Employee;
import october.date_30_10_24.LinkedListDemo;

public class Employees {
    
    public static void giveRaise(LinkedListDemo<Employee> employees, double raise) {
        employees.iterator().forEachRemaining(e -> esetSalary(e.getSalary() * (1 + raise)));
    }
}
