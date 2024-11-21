package files.projects.project_1;// just because my files are in a folder

/* Brian LewConklin
 * This class extends Utility and provides functionality for utilities relating to gas
 */
public class GasUtility extends Utility{
    
    // stores whether or not the customer has an installment plan
    private boolean installmentPlan = false;

    // stores the amount of the installment
    private double installmentAmount = 0.0;

    // a constructor for Utility and GasUtility
    public GasUtility(double utilityRate, Date aniversaryDate) {
        super(utilityRate, aniversaryDate);
    }
    
    // returns if there is an installment plan for the customer
    public boolean isInstallmentPlan() {
        return this.installmentPlan;
    }

    // sets if there is an installment plan
    public void setInstallmentPlan(boolean installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    // overrides Utility's endOfYearProcessing and sets the installment amount
    @Override
    public void endOfYearProcessing() {
        this.installmentAmount = this.getYearUsage() / 12;

        this.updateYearUsage(-this.getYearUsage());
    }

    // overloads Utility's getMonthlyCharge and if the customer has an installment plan it returns the installment amount
    public double getMonthlyCharge(boolean hasInstallmentPlan) {
        if (hasInstallmentPlan) {
            return this.installmentAmount;
        }
        return super.getMonthlyCharge();
    }

    // adds the installment amount times the sales tax rate to the customer's bill
    @Override
    public void endOfMonthProcessing() {
        super.endOfMonthProcessing();
        if (this.isInstallmentPlan()) {
            super.setMonthBill(this.installmentAmount * Utility.getSalesTaxRate() + this.getAmountDelinquent());
        }
    }
}
