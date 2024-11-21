package files.projects.project_1;// just because my files are in a folder

/* Brian LewConklin
 * This class represents a hypothetical utility a customer would have to pay for. it has methods that calculate the customer's bill at the end of the month and the year
 */
public class Utility {

    // stores the rate the utility charges for their service
    private double utilityRate = 1.0;

    // stores the date of an anniversary(as the Date class we created)
    private Date anniversaryDate = new Date(1, 1, 2000);

    // stores a number representing how much the customer has used the utility this month
    private int monthUsage = 0;

    // stores a number representing how much the customer has used the utility this year
    private int yearUsage = 0;

    // stores the monthly bill towards the customer
    private double monthBill = 0.0;

    // stores the balance in the customers account that they have to pay
    private double balance = 0.0;

    // represents the amount money the customer has paid to the utility this month
    private double amountPaidThisMonth = 0;

    // stores the amount the customer has failed to pay to the utility
    private double amountDeliquent = 0;

    // a class field that represents the sales tax rate of the utility company
    private static double salesTaxRate = 1.0;

    // represents the interest rate on the money that the customer owes to the utility company
    private static double interestRate = 1.0;
    

    // assigns inputs to instance fields
    public Utility(double utilityRate, Date anniversaryDate) {
        
        this.utilityRate = utilityRate;

        this.anniversaryDate = anniversaryDate;
    }
    
    // gets the rate of the utility company
    public double getUtilityRate() {
        return this.utilityRate;
    }

    // sets the rate of the utility company
    public void setUtilityRate(double newUtilityRate) {
        this.utilityRate = newUtilityRate;
    }

    // gets the monthly usage of the utility
    public int getMonthUsage() {
        return this.monthUsage;
    }

    // sets the monthly usage of the utility
    public void setMonthUsage(int newMonthUsage) {
        this.monthUsage = newMonthUsage;
    }

    // gets the yearly usage of the utility
    public int getYearUsage() {
        return this.yearUsage;
    }

    // adds to the yearly usage of the utility
    public void updateYearUsage(int newUsage) {
        this.yearUsage += newUsage;
    }

    // gets the monthly bill to the customer
    public double getMonthBill() {
        return this.monthBill;
    }

    // sets the montly bill to the customer
    public void setMonthBill(double newMonthBill) {
        this.monthBill = newMonthBill;
    }

    // gets the balance of the customer
    public double getBalance() {
        return this.balance;
    }

    // adds/updates the balance of the customer
    public void updateBalance(double newBalanceUpdate) {
        this.balance += newBalanceUpdate;
    }

    // gets the amount that the customer has paid this month
    public double getAmountPaidThisMonth() {
        return this.amountPaidThisMonth;
    }

    // updates the amount the customer has paid this month
    public void updateAmountPaidThisMonth(double newAmountPaidThisMonthUpdate) {
        this.amountPaidThisMonth += newAmountPaidThisMonthUpdate;
    }

    // gets the amount the customer has failed to pay this month
    public double getAmountDelinquent() {
        return this.amountDeliquent;
    }

    // sets the amount the customer has failed to pay this month
    public void setAmountDelinquent(double newAmountDeliquent) {
        this.amountDeliquent = newAmountDeliquent;
    }

    // makes a payment to the customers balance and updates the amount paid this month
    public void makePayment(double payment) {
        this.updateBalance(-payment);
        this.updateAmountPaidThisMonth(payment);
    }

    // gets the anniversary date
    public Date getAnniversaryDate() {
        return anniversaryDate;
    }

    // sets the anniversary date
    public void setAnniversaryDate(Date newAnniversaryDate) {
        this.anniversaryDate = newAnniversaryDate;
    }

    // gets the sales tax rate of the utility company
    public static double getSalesTaxRate() {
        return Utility.salesTaxRate;
    }

    // sets the sales tax rate of the utility company
    public static void setSalesTaxRate(double newSalesTaxRate) {
        Utility.salesTaxRate = newSalesTaxRate;
    }

    // gets the interest rate on the amount owed by the customer
    public static double getInterestRate() {
        return Utility.interestRate;
    }

    // sets the interest rate of the utility company
    public static void setInterestRate(double newInterestRate) {
        Utility.interestRate = newInterestRate;
    }

    // gets the monthly charge to the customer
    public double getMonthlyCharge() {
        return this.monthUsage * this.utilityRate;
    }

    // adds the monthly charge to the customers balance and checks if they have paid to little or to much and adjusts the customers bill and balance accordingly, with
    // interest
    public void endOfMonthProcessing() {
        this.updateBalance(this.getMonthlyCharge());
        this.updateBalance(this.getMonthlyCharge() * Utility.salesTaxRate);

        if (this.getAmountPaidThisMonth() < this.getMonthBill()) {
            this.setAmountDelinquent(this.getAmountDelinquent() + (this.getMonthBill() - this.getAmountPaidThisMonth()));
        } else if (this.getAmountPaidThisMonth() > this.getMonthBill()) {
            this.setAmountDelinquent(this.getAmountDelinquent() - (this.getAmountPaidThisMonth() - this.getMonthBill()));
        }

        if (this.getAmountDelinquent() >= 0) {
            this.setAmountDelinquent(this.getAmountDelinquent() + (this.getAmountDelinquent() * Utility.getInterestRate()));
            this.updateBalance(this.getAmountDelinquent() * Utility.getInterestRate());
        }

        this.setMonthBill(this.getBalance());
        this.updateAmountPaidThisMonth(-this.getAmountPaidThisMonth());
    }

    // sets the yearly usage to be 0
    public void endOfYearProcessing() {
        this.updateYearUsage(-this.getYearUsage());
    }
}