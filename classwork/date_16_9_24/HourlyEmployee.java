package classwork.date_16_9_24;

public class HourlyEmployee extends Employee {
    
    private double hoursWorked;

    private double hourlyRate;

    public HourlyEmployee(String name){
        super(name, 0.0);
    }

    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked(){
        return this.hoursWorked;
    }

    public double getHourlyRate(){
        return this.hourlyRate;
    }

    @Override
    public double getSalary(){
        return getHoursWorked() * getHourlyRate();
    }

}
