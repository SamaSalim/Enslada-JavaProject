import java.util.ArrayList;
import java.util.Scanner;

public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    	    int selection;
			//Ask info from the user://
			UserInfo();
			//display the menu to the user , and save it 
			ensaladaMenu();
			
			System.out.println("Enter '1' to confirm your order");
			selection = scan.nextInt();
			while (selection != 1) {
			    System.out.println("You need to confirm your order!");
			    selection = scan.nextInt();
			}
		
        System.out.println("YAY! Your order in the air !! ");

    }
    //method displays the menu of enSalada and allows the user to choose between custom or specialty salad
    public static void ensaladaMenu() {
        Scanner scan = new Scanner(System.in);
			order Order = new order();
			customSalad CustomSalad = new customSalad();
			userCustom Usercustom = new userCustom();
			salad Salad = new salad();
			juice Juice = new juice();
			int selection;
			
			System.out.println("********* Welcome to Ensalada***********");
			System.out.println("Enter 'C' to make you own salad and enter 'S' to pick from the specialty salad");
			String SaladType = scan.next();
			// validate the user's input for salad type
			while (!SaladType.equalsIgnoreCase("c") && !SaladType.equalsIgnoreCase("s")) {

			    System.out.println("Something went worng , try again");
			    System.out.println("Enter 'C' to make you own salad and enter 'S' to pick from the specialty salad");
			    SaladType = scan.next();
			}

			
			  // if the user chooses custom salad, display the ingredients and sauces options and let the user select them
			if (SaladType.equalsIgnoreCase("c")) {
			    System.out.println("All salads are in one size and cost " + Salad.getSaladPrice() + "Rs");
			    System.out.println("Choose from the next ingredients:");
			    System.out.println("Enter '0' to stop");
			    CustomSalad.displyIngredients();

			    System.out.println("Enter '0' to stop");
			    
			    selection = readInt();
			    while (selection > 0 || selection < 0) {
			        try {
			            if (selection > CustomSalad.displyIngredients().size()) {
			                throw new Exception("That's not available !");
			            }
			            Usercustom.AddIngredients(CustomSalad.bringIngre(selection));

			        } catch (Exception e) {
			            System.out.println(e.getMessage());
			            System.out.println("Try again!");
			        }
			        
			        selection = readInt();

			    }
			    System.out.println("Choose from the next sauces:");
			    System.out.println("The sauces:");
			    CustomSalad.displySauces();
			    selection = readInt();
			 // validate the user's selection for sauces
			    while (selection > 5 || selection < 0) {
			        try {
			            if (selection > CustomSalad.displySauces().size() || selection < 1) {
			                throw new Exception("No sauce is chosen!\nThat's not available ! \nTry again! ");
			            }
			            Usercustom.AddSauces(CustomSalad.bringSause(selection));
			        } catch (Exception e) {
			            System.out.println(e.getMessage());
			            System.out.println("Try again!");
			        }

			        selection = readInt();
			    }
			  //if the user chooses specialty salad, display the ready made salads and let the user select one
			} else if (SaladType.equalsIgnoreCase("s")) {
	             // Create an ArrayList to hold the available specialty salads
			    ArrayList<ReadyMade> madeSalad = new ArrayList<ReadyMade>();
			    ReadyMade dateSalad = new ReadyMade("DateSalad", "Date , Watercress, Veta cheese , Nuts");
			    ReadyMade balela = new ReadyMade("Balela salad", "Chickpeas , Beet, Cucumber ");
			    ReadyMade fattoush = new ReadyMade("Fattoush salad", "Iettuce , Radish, Cucumber, Crunchy bread ");
			    ReadyMade quinoa = new ReadyMade("Quinoa salad", "Quinoa , Green apple , Cucumber, Watercress ");
		          //add the specialty salads to the ArrayList
			    madeSalad.add(dateSalad);
			    madeSalad.add(balela);
			    madeSalad.add(fattoush);
			    madeSalad.add(quinoa);
	            //Display the specialty salads and prompt the user to select one
 			    System.out.println("Choose from the next salads:");
			    System.out.println("Enter '0' to stop");
			    //to display the ReadyMade menu
			    for (int i = 0; i < madeSalad.size(); i++) {
			        System.out.println((i + 1) + "-" + madeSalad.get(i));
			    }
			    selection = readInt();
			 // validate the user's selection for specialty salad
			    while (selection > 0 || selection < 0) {//edit
			        try {
			            if (selection > madeSalad.size()) {
			                throw new Exception("That's not available !");
			            }
			            // add the selected specialty salad to the order object
			            Order.AddItemS(madeSalad.get(selection - 1));
			        } catch (Exception e) {
			            System.out.println(e.getMessage());
			            System.out.println("Try again!");
			        }
			        for (int i = 0; i < madeSalad.size(); i++) {
			            System.out.println((i + 1) + "-" + madeSalad.get(i));
			        }
			        selection = readInt();
			    }
			}
			   //the end of ready made salad

	        //the beginning of ordering jucie
	        // Create an ArrayList of juice objects and add some juice option
			ArrayList<juice> juice = new ArrayList<juice>();
			juice Sunshine = new juice("Sunshine", "Strawberry,Mango,Kiwi");
			juice RainbowS = new juice("RainbowS", "Strawberry,Mango,Kiwi,Icecream");
			juice CoconutCrush = new juice("CoconutCrush", "Pineapple,Coconut,Milk");
			juice.add(Sunshine);
			juice.add(RainbowS);
			juice.add(CoconutCrush);
			System.out.println("Would like to order juice?");
			System.out.println("Enter '1' for yes and '0' for no");
			selection = readInt();
			 //validate the user's input and add the selected juice to the order
			while (selection != 0 && selection != 1) {
			    System.out.println("Enter '1' for yes and '0' for no");
			    selection = readInt();
			}
			  // Display the juice menu and allow the user to select their choice
			if (selection == 1) {
			    System.out.println("All the juice cost" + Juice.getprice_juice() + "Sr");
			    System.out.println("Choose from the next menu");
			    System.out.println("Enter '0' to stop");
			    for (int i = 0; i < juice.size(); i++) {
			        System.out.println((i + 1) + "-" + juice.get(i));
			    }
			    selection = readInt();
			    // Validate the user's selection and add the chosen juice to the order
			    while (selection != 0) {
			        try {
			            if (selection > juice.size() || selection < 0) {
			                throw new Exception("This item isn't available.\n Try again");
			            }
			            Order.AddItemJ(juice.get(selection - 1));
			        } catch (Exception e) {
			            System.out.println(e.getMessage());
			        }
			        for (int i = 0; i < juice.size(); i++) {
			            System.out.println((i + 1) + "-" + juice.get(i));
			        }

			        selection = readInt();
			    }
			}



			 // showing the order
	        System.out.println("Your order = ");
	        if (SaladType.equalsIgnoreCase("s")) {
	        	System.out.println("salad: ");
	            Order.calSalad();
	            Order.display(Order.getSalad());
	        } else if (SaladType.equalsIgnoreCase("c")) {
	            Order.setConterS(1);
	            Order.calSalad();
	            System.out.println("Your chosen ingredients : ");
	            Usercustom.displyIngredients();
	        }
	        System.out.println("Juice :");
	        Order.display(Order.getJuice());
	        System.out.println("");

	        System.out.println(Order);
		}
    
    
    public static void UserInfo (){
    	
        Scanner scan = new Scanner(System.in);
        //Ask info from the user://
			System.out.println("Enter your name: ");
			String name = scan.nextLine();
			System.out.println("Enter your phone number: ");
			long number = readLong();
			System.out.println("Enter your address or zip code : ");
			String address = scan.nextLine();

			
			System.out.println("************************");
			
			//create an object from "MainUser" named "person"+ take parameter of type (String,long,address) //
			User user = new User(name, number, address);
	        // Store the User object in a database
			dataBase data = new dataBase(user.gethashMap());
			System.out.println(user.toString());
		
    
}
    
    	// method to read an integer  from the user and handles invalid input
    	static int readInt() {
           Scanner scan = new Scanner(System.in);
				while (true) {
				int selection;
				try {
				selection = scan.nextInt();
				return selection;
				}
				catch (Exception e) {
				scan.nextLine(); // this will clear the scanner
				System.out.println("You ONLY can enter numbers \n Try again!");
				// Print error try again 
				}
				
			}
    		
    	}
    	  // method to read long value  from the user and handles invalid input
    	static long readLong() {
            Scanner scan = new Scanner(System.in);
				while (true) {
				long number;
				try {
					number = scan.nextLong();
					 return number;
				}
				catch (Exception e) {
				scan.nextLine(); // this will clear the scanner
				System.out.println("Please enter a valid phone number\n Try again!");
				// Print error try again 
				}
				
			}
    		
    	}
   
    	
    }



