package files.challenges.java_optional_cc;

public class AccountModified {

    private double balance;

    private double interestRate;
    
    public AccountModified() {
        balance = 0;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
