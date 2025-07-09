import java.util.ArrayList;

public class userCustom extends customSalad {
	private ArrayList<Object> Ingredients = new ArrayList<Object>();// Used to store the user-selected salad ingredients
	private ArrayList<Object> Sauces = new ArrayList<Object>();// Used to store the user-selected salad sauces
	
	// This method is used to add a new ingredient
	public ArrayList<Object> AddIngredients(Object ingredient_Name) {
		Ingredients.add(ingredient_Name);
		return Ingredients;
	}
	// This method is used to add a new Sauces
	public ArrayList<Object> AddSauces(Object sauce_Name) {
		Sauces.add(sauce_Name);
		return Sauces;
	}
	// This method is used to display the user-selected salad Ingredients
	public ArrayList<Object> displyIngredients() {
		for (int i = 0; i < Ingredients.size(); i++) {
			System.out.println(Ingredients.get(i));
		}
		return Ingredients;
	}
	// This method is used to display the user-selected salad Sauces
	public ArrayList<Object> displySauces() {
		for (int i = 0; i < Sauces.size(); i++) {
			System.out.println(Sauces.get(i));
		}
		return Sauces;
	}
	 
}