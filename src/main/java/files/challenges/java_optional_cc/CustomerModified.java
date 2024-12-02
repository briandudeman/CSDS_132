package files.challenges.java_optional_cc;

import java.util.Optional;


public class CustomerModified {
    private Optional<AccountModified> savingsAccount;
    private Optional<AccountModified> checkingAccount;
    private Optional<AccountModified> investmentAccount;
    
    public CustomerModified() {
        savingsAccount = Optional.empty();
        checkingAccount = Optional.empty();
        investmentAccount = Optional.empty();
    }

    public Optional<AccountModified> getSavingsAccount() {
        return savingsAccount;
    }

    public Optional<AccountModified> getCheckingAccount() {
        return checkingAccount;
    }

    public Optional<AccountModified> getInvestmentAccount() {
        return investmentAccount;
    }

    public void setSavingsAccount(AccountModified account) {
        this.savingsAccount = Optional.ofNullable(account);
    }

    public void setCheckingAccount(AccountModified account) {
        this.checkingAccount = Optional.ofNullable(account);
    }

    public void setInvestmentAccount(AccountModified account) {
        this.investmentAccount = Optional.ofNullable(account);
    }

    public double getTotalValue() {
        double total = 0;
        total += getCheckingAccount().map(a -> a.getBalance()).orElse(0.0);
        total += getSavingsAccount().map(a -> a.getBalance()).orElse(0.0);
        total += getInvestmentAccount().map(a -> a.getBalance()).orElse(0.0);
        return total;
    }

    public void applyInterest() {
        getCheckingAccount().ifPresent(a -> a.setBalance(a.getBalance() * (1 + a.getInterestRate())));
        getSavingsAccount().ifPresent(a -> a.setBalance(a.getBalance() * (1 + a.getInterestRate())));
        getSavingsAccount().ifPresent(a -> a.setBalance(a.getBalance() * (1 + a.getInterestRate())));
    }

    public static void main(String[] args) {
        CustomerModified c = new CustomerModified();
        AccountModified a1 = new AccountModified();
        a1.setBalance(10.0);
        a1.setInterestRate(1.5);
        c.setCheckingAccount(a1);
        c.applyInterest();
        System.out.println(a1.getBalance());
    }
}


