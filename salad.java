//Represents a salad item that can be added to the order
public class salad {
  private double saladPrice = 20 ;
  // set the price of a salad item
    public void setSaladPrice(double saladPrice) {
        this.saladPrice = saladPrice;
    }
  //getter to return the price of a salad item
    public double getSaladPrice() {
        return saladPrice;
    }
    /*
     * Copy constructor for the Salad class.
     * this constructor copies the value of the salad price field from the given object to the new object 
     */

    public salad copy() {
    	salad sa = new salad();
    	sa.saladPrice= saladPrice;
    	return (sa);
     }
    //Default constructor for the Salad class
	public salad() {
		// TODO Auto-generated constructor stub
	}
}
