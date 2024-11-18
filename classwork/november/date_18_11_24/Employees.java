package date_18_11_24;

import date_8_11_24.Employee;

public class Employees {
    
    public static void giveRaise(LinkedList<Employee> employees, double raise) {
        employees.iterator().forEachRemaining(e -> e.setSalary(e.getSalary() * (1 + raise)));
    }
    
    public static void setMinWage(LinkedList<HourlyEmployee> employees, double wage) {
        employees.iterator().forEachRemaining(e -> {if (e.getHourlyRate() < wage) e.setHourlyRate(wage); });
    }

    public static void giveBonus(LinkedList<HourlyEmployee> employees, double wage, double raise) {
        Consumer<HourlyEmployee> setMinWage = e -> { if (e.getHourlyRate() < wage) e.setHourlyRate(wage); };
        Consumer<HourlyEmployee> giveRaise = e -> e.setHourlyRate(e.getHourlyRate() * (1 + raise));
    
        employees.iterator().forEachRemaining(setMinWage.andThen(giveRaise));
    }

}
