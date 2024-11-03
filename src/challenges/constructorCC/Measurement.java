package challenges.constructorCC;

/* The class that represents some measurement */
public class Measurement extends Object {
    // the quantity of this measurement
    private double quantity;
    /* a constructor that creates an instance with a given quantity */
    public Measurement(double quantity) {
    this.quantity = quantity;
    }
    /* get the quantity value */
    public double getQuantity() {
    return this.quantity;
    }
    /* change the quantity value */
    public void setQuantity(double quantity) {
    this.quantity = quantity;
    }
    }