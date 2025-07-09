public class juice {

	private String name;// Used to store the name of the juice

	private String name_description;// Used to store the description of the juice

	private Double price_juice = 10.0;// Used to store the price of the juice

	/*
	 * This constructor is used to set the values of the "name" and
	 * "name_description"
	 */
	public juice(String name, String name_description) {
		this.name = name;
		this.name_description = name_description;
	}

	public juice() {

	}
	
	// This method is used to return the name of the juice
	public String getName() {

		return name;
	}
	
	// This method is used to return the price of the juice
	public Double getprice_juice() {
		return price_juice;
	}

	@Override
	public String toString() {
		return name + ": " + name_description;
	}
	
	// This constructor is used to create a copy of the object
	public juice(juice copyObj) {
		name = copyObj.name;
		name_description = copyObj.name_description;
		price_juice = copyObj.price_juice;
	}

	public juice copy() {
		juice ju = new juice();
		ju.name= name;
		ju.name_description =name_description;
		ju.price_juice= price_juice;
		return (ju);
     }

}