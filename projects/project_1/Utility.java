package projects.project_1;
import projects.project_1.Date;


public class Utility {

    private double utilityRate = 1.0;

    private Date aniversaryDate = Date(1, 1, 2000);

    private int monthUsage = 0;

    private int yearUsage = 0;

    private double monthlyBill = 0.0;

    private double balance = 0.0;
    
    public Utility(double utilityRate, Date aniversaryDate) {
        
        this.utilityRate = utilityRate;

        this.aniversaryDate = aniversaryDate;
    }
    
    public double getUtilityRate() {
        return this.utilityRate;
    }

    public void setUtilityRate(double newUtilityRate) {
        this.utilityRate = newUtilityRate;
    }

    public int getMonthUsage() {
        return this.monthUsage;
    }

    public void setMonthUsage(int newMonthUsage) {
        this.monthUsage = newMonthUsage;
    }

    public int getYearUsage() {
        return this.yearUsage;
    }

    public void updateYearUsage(int newUsage) {
        this.yearUsage += newUsage;
    }

    public double getMonthBill() {
        return this.monthlyBill;
    }

    public void setMonthBill(double newMonthlyBill) {
        this.monthlyBill = newMonthlyBill;
    }

    public double getBalance() {
        return this.balance;
    }

    public void updateBalance(double newBalanceUpdate) {
        this.balance += newBalanceUpdate;
    }

    public double getAmountPaidThisMonth() {
        a sdfa
    }

    public void updateAmountPaidThisMonth(double d) {
        
    }

    public double getAmountDelinquent() {
        
    }

    public void setAmountDelinquent(double d) {
        
    }

    public void makePayment(double d) {
        
    }

    public Date getAniversaryDate() {
        
    }

    public void setAniversaryDate(Date d) {
        
    }

    public double getSalesTaxRate() {
        
    }

    public void setSalesTaxRate(double d) {
        
    }

    public double getInterestRate() {
        
    }

    public void setInterestRate(double d) {
        
    }

    public double getMonthlyCharge() {
        
    }

    public void endOfMonthProcessing() {
        
    }

    public void endOfYearProcessing() {
        
    }
}