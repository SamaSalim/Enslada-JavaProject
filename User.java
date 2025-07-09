import java.util.HashMap;

public class User {
	//This class represents a user with a name, a phone number, an address and a hashmap
    private String name;
    private long number;
    private String address;
    private HashMap<String, Object> hashMap;

    public User(String name, long number, String address) {
        //assign Like setters//
        this.name = name;
        this.number = number;
        this.address = address;
        this.hashMap = new HashMap<>();
        hashMap.put("Name", name);//"Name", name
        hashMap.put("Phone Number", number);
        hashMap.put("Address", address);
    }
    public User() {
		// TODO Auto-generated constructor stub
	}
  //getter for vaiable name
    public String getName() {
        return name;
    }
     public void setName(String name) {
        this.name = name;;
    }
     //getter for variable phoneNumber
    public long getPhoneNumber() {
        return number;
    }
     public void setPhoneNumber(long number ) {
        this.number = number;
    }

     //getter for variable address
    public String getAddress() {
        return address;
    }
     public void setAddress(String address) {
        this.address= address;
    }
    //getter for hashmap
    public HashMap gethashMap() {
        return hashMap;
    }
    // override the toString method to return a string representation of the user object 
    public String toString() {
        
    	return String.format(" Name: " + hashMap.get("Name")+"\n Phone Number: " + 
       hashMap.get("Phone Number") + "\n Address: " + hashMap.get("Address"));
      
    }

}