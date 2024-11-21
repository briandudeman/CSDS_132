package files.projects.project_1;// just because my files are in a folder

/* Brian LewConklin
 * This class is an extension of Utility that keeps track of fees to the customer relating to water. it then adds these fees to the
 * monthly charge
 */
public class WaterUtility extends Utility{
    
    // represents the number of baths of the customer
    private int numBaths = 1;

    // contains the fee for each bath
    private double bathFee = 1.0;

    // assigns all inputs to the correct instance fields, including Utility's
    public WaterUtility(double utilityRate, Date aniversaryDate, int numBaths, double bathFee) {
        super(utilityRate, aniversaryDate);
        this.numBaths = numBaths;
        this.bathFee = bathFee;
        
    }
    
    // gets the number of baths of the customer
    public int getNumBaths() {
        return this.numBaths;
    }

    // sets the number of baths of the customer
    public void setNumBaths(int newNumBaths) {
        this.numBaths = newNumBaths;
    }

    // gets the bath fee for the customer
    public double getBathFee() {
        return this.bathFee;
    }
    
    // sets the bath fee for the customer
    public void setBathFee(double newBathFee) {
        this.bathFee = newBathFee;
    }

    // overrides Utility's getMonthlyCharge and adds the fees from the baths/water
    @Override
    public double getMonthlyCharge() {
        return super.getMonthlyCharge() + (this.numBaths * this.bathFee);
    }
}
