public class ReadyMade {
	private String name;// used to store the name of the salad
	private String name_description;// used to store the description of the salad

	/*
	 * This constructor is used to set the values of the "name" and
	 * "name_description"
	 */
	public ReadyMade(String name, String name_description) {
		this.name = name;
		this.name_description = name_description;
	}
//a Default constructor
	public ReadyMade() {
	}
	//get methode to return the name of the salad item
	public String getName() {
		return name;
	}
	 //toString method that Returns a string representation of the salad item, including its name and description
	@Override
	public String toString() {
		return name + ": " + name_description + "\n";
	}

	
	public ReadyMade copy() {
		ReadyMade ready = new ReadyMade();
		ready.name= name;
		ready.name_description= name_description;
		return (ready);
     }

}