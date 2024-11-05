package date_4_11_24;

import classwork.date_16_9_24.Employee;

public class ComparableEmployee extends Employee implements Comparable<Employee> {

    public ComparableEmployee(String name, int number) {
        super(number, name);
    }

    public int compareTo(Employee e) {
        return super.getNumber() - e.getNumber();
    }
}