package files.projects.project_1;// just because my files are in a folder



/* Brian LewConklin
 * this class represents a customer interacting with the different utility classes we made before
 */
public class Customer {

    // the current date for the customer
    private Date currentDate = new Date(1, 1, 2001);

    // the electric utility object of the customer
    private Utility electricUtility = new Utility(1.0, currentDate);

    // represents if the customer has an electric utility
    private boolean hasElectricUtility = false;

    // the water utility object of the customer
    private WaterUtility waterUtility = new WaterUtility(1.0, currentDate, 1, 1.0);
    
    // represents if the customer has a water utility
    private boolean hasWaterUtility = false;

    // the gas utility object of the customer
    private GasUtility gasUtility = new GasUtility(1.0, currentDate);
    
    // represents if the customer has a gas utility
    private boolean hasGasUtility = false;

    // contructor if the customer doesn't have any utilities
    public Customer(Date currentDate) {
        this.currentDate = currentDate;
    }

    // constructor if the customer has utilities
    public Customer(Date currentDate, Utility electricUtility, WaterUtility waterUtility, GasUtility gasUtility) {
        this.currentDate = currentDate;

        this.electricUtility = electricUtility;
        this.hasElectricUtility = true;

        this.waterUtility = waterUtility;
        this.hasWaterUtility = true;

        this.gasUtility = gasUtility;
        this.hasGasUtility = true;
    }

    // gets the electric utility object of the customer
    public Utility getElectricUtility() {
        if (this.hasElectricUtility){
            return this.electricUtility;
        }
        return null;
    }

    // sets the electic utility object as well as the hasUtility boolean field
    public void setElectricUtility(Utility newElectricUtility) {
        this.electricUtility = newElectricUtility;
        this.hasElectricUtility = true;
    }

    // gets the water utility object of the customer
    public WaterUtility getWaterUtility() {
        if (this.hasWaterUtility){
            return this.waterUtility;
        }
        return null;   
    }

    // sets the water utility object as well as the hasUtility boolean field
    public void setWaterUtility(WaterUtility newWaterUtility) {
        this.waterUtility = newWaterUtility;
        this.hasWaterUtility = true;
    }

    // gets the gas utility object of the customer
    public GasUtility getGasUtility() {
        if (this.hasGasUtility){
            return this.gasUtility;
        }
        return null;
    }

    // sets the gas utility object as well as the hasUtility boolean field
    public void setGasUtility(GasUtility newGasUtility) {
        this.gasUtility = newGasUtility;
        this.hasGasUtility = true;
    }

    // gets the date object of the customer
    public Date getDate() {
        return this.currentDate;
    }

    // sets the current date of the customer
    public void setDate(Date newCurrentDate) {
        this.currentDate = newCurrentDate;
    }

    // increments the current date and checks if that date is the same as the aniversary date for any utilities then executes their
    // end of month or end of year processing
    public void incrementDate() {
        this.currentDate.incrementeDate();
        if (this.currentDate.sameEffectiveDayAs(this.electricUtility.getAnniversaryDate())) {
            this.electricUtility.endOfMonthProcessing();
        }
        if (this.currentDate.sameEffectiveDayAs(this.waterUtility.getAnniversaryDate())) {
            this.waterUtility.endOfMonthProcessing();
        }
        if (this.currentDate.sameEffectiveDayAs(this.gasUtility.getAnniversaryDate())) {
            this.gasUtility.endOfMonthProcessing();
        }

        if (this.currentDate.equals(this.electricUtility.getAnniversaryDate())) {
            this.electricUtility.endOfYearProcessing();
        }
        if (this.currentDate.equals(this.waterUtility.getAnniversaryDate())) {
            this.waterUtility.endOfYearProcessing();
        }
        if (this.currentDate.equals(this.gasUtility.getAnniversaryDate())) {
            this.gasUtility.endOfYearProcessing();
        }
    }
}
