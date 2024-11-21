package files.classwork.november.date_8_11_24;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    // name of employee
    private String name;
    
    //number of employee
    private final int number;
    
    // the salary of the employee
    private double salary;
    
    // the last employee number used
    private static int lastEmployeeNumber = 0;
    
    // constructors
    
    // a constructor that takes the name and salary of the employee and automatically gives the //employee the next available number
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.number = Employee.lastEmployeeNumber + 1;
        Employee.lastEmployeeNumber = this.number;
    }
    
    // a constructor that sets an employee’s name and number
    public Employee(int number, String name) {
        this.number = number;
        this.name = name;
        if (number > Employee.lastEmployeeNumber)
            Employee.lastEmployeeNumber = number;
    }
    
    // getter setter methods
    
    // retrieve the employee name
    public String getName() {
        return this.name;
    }
    
    // set employee name
    public void setName(String name) {
        this.name = name;
    }
    
    // retrieve the employee number
    public int getNumber() {
        return this.number;
    }
    
    // retrieve the employee salary
    public double getSalary() {
        return this.salary;
    }
    
    // change the employee salary
    public void setSalary(double salary) {
        // copy from the input variable to the field of theinstance
        this.salary = salary;
    }
    
    // change how the inherited method toString works by overriding it
    public String toString() {
        return this.getName() + "   , " + this.getNumber();
    }
    
    //change how the inherited method equals method works by saying that 2 employees are the //same if they have the same name and the same number
    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee) {
            Employee e = (Employee)o;
    return this.getName().equals(e.getName()) && this.getNumber() == e.getNumber();
    }
    return false;
    }

    public boolean earnsMoreThan(Employee e){
        return this.getSalary() > e.getSalary();
    }

    @Override
    public int compareTo(Employee e) {
        return this.getNumber() - e.getNumber();
    }

    public static Comparator<Employee> compareBySalary() {
        return new Employee.CompareBySalary();
    }

    public Comparator<Employee> compareSalaryToTheEmployee() {
        return new CompareToThisEmployee();
    }

    public Comparator<Employee> compareByName() {
        
        // anonymous class
        return new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
    }

    public static class CompareBySalary implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return ((int)(e1.getSalary() * 100 + .5) - (int)(e2.getSalary() * 100 + .5));
        }
    }

    public class CompareToThisEmployee implements Comparator<Employee> {
        
        @Override
        public int compare(Employee e1, Employee e2) {
            int thisToE1 = (int)Math.abs((int)(Employee.this.getSalary() * 100 + .5) - (int)(e1.getSalary() * 100 + .5));
            int thisToE2 = (int)Math.abs((int)(Employee.this.getSalary() * 100 + .5) - (int)(e2.getSalary() * 100 + .5));

            return thisToE1 - thisToE2;
        }
    }
    
}    