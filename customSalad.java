import java.util.ArrayList;

public class customSalad extends salad {
	private ArrayList<Object> Ingredients = new ArrayList<Object>(); // Used to store the salad ingredients

	private ArrayList<Object> Sauces = new ArrayList<Object>();// Used to store the salad sauces

	// This constructor is used to add the Ingredients and in array
	public customSalad() {
		// the ingredients
		Ingredients.add("cucumber");
		Ingredients.add("lettuce");
		Ingredients.add("chicken");
		Ingredients.add("corn");
		Ingredients.add("crunchy bread");
		Ingredients.add("beans");
		// the sauces
		Sauces.add("Ensalada suace");
		Sauces.add("ransh");
		Sauces.add("pesto");
		Sauces.add("thousand island");
	}

	// This method is used to display the ingredients of the salad
	public ArrayList<Object> displyIngredients() {
		for (int i = 0; i < Ingredients.size(); i++) {
			System.out.println((i + 1) + "-" + Ingredients.get(i));
		}
		return Ingredients;

	}
	
	// This method is used to display the Sauces of the salad
	public ArrayList<Object> displySauces() {
		for (int i = 0; i < Sauces.size(); i++) {
			System.out.println((i + 1) + "-" + Sauces.get(i));
		}
		return Sauces;
	}
//a getter for the Ingredients
	public Object bringIngre(int item) {
		return Ingredients.get(item - 1);
	}
	//a getter for the Sauces

	public Object bringSause(int item) {
		return Sauces.get(item - 1);
	}
	
}