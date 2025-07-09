
import java.util.ArrayList;
public class order {
    //ArrayList to store salad items
	private  ArrayList<Object> salad = new ArrayList<Object>();
	private  ArrayList<Object> juice = new ArrayList<Object>();
	  // Declare private fields to store the order cost and item counters for salad and juice
     private int conterSalad=0;
     private int conterJuice=0;
     //declare private fields to store the price objects for juice and salad
     private juice priceJuice = new juice();
     private  salad priceSalad = new salad ();
  // Method to add a salad item to the order and return the updated ArrayList of salad items
    public ArrayList<Object> AddItemS(ReadyMade selection){
         salad.add(selection.getName());
         conterSalad = conterSalad +1;
        return salad;
    }
    // Method to add a juice item to the order and return the updated ArrayList of juice items
    public ArrayList<Object> AddItemJ(juice selection){
        getJuice().add(selection.getName());
        conterJuice = conterJuice +1;
        return getJuice();
    }
    // Method to display the items in the salad ArrayList and return the same ArrayList
    public ArrayList<Object> display(ArrayList<Object> orderList){
        for (int i =0;i<orderList.size();i++){
            System.out.println(orderList.get(i));
        }
        return orderList;
    }

    public ArrayList<Object> getSalad() {
        return salad;
    }
 // Getter and setter methods for the order cost
    
     // Method to calculate the total cost of salad items in the order
     public double calSalad(){
         double sum = priceSalad.getSaladPrice()*conterSalad;
         return sum;
     }
  // Method to calculate the total cost of juice items in the order
     public double calJuice(){
         double sum = priceJuice.getprice_juice()*conterJuice;
         return sum;
     }

    public void setConterS(int conterS) {
        this.conterSalad = conterS;
    }
    // Override the toString() method to display the order information
    public String toString(){
        double tax =(calSalad()+calJuice()+15)*0.15 ;
        return String.format("Your delivery costs = 15 SR\nYour tax = %.2fSR\nYour total is: %.2fSR", tax, (calSalad()+calJuice()+15+tax));
    
     }
    // Getter and setter methods for the juice ArrayList
	public ArrayList<Object> getJuice() {
		return juice;
	}
	public void setJuice(ArrayList<Object> juice) {
		this.juice = juice;
	}
	/*Copy constructor for the order class
	that Create a new order object with the same total cost and item counters as the provided order object
	   */
	public order copy() {
		order or = new order();
		or.conterJuice=conterJuice;
		or.conterSalad=conterSalad;
		or.priceJuice=priceJuice;
		or.priceSalad=priceSalad;
		or.salad=salad;
		or.juice =juice;
		return (or);
     }
	
	public order() {
	}
   
}