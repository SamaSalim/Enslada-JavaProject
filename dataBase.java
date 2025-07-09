import java.io.PrintWriter;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//the dataBase class represents a database that saves information to an output file
public class dataBase {
//constructor to initialize the output file and save the provided information
 public  dataBase(HashMap f){ String data="out.txt";
 //string variable to store the output file name
 PrintWriter outputStream = null;//object from class
 //use a try/catch block to handle possible FileNotFoundException
 try { 
     outputStream = new PrintWriter(new FileOutputStream(data,true));//true= save old data//
  
 }
//handle the exception if the output file cannot be found
 catch(FileNotFoundException e) { 
     System.out.println("Error" + data);
      System.exit(0);
 } 
 //write the information to the output file
outputStream.println(f);
//close the PrintWriter instance to free up system resources
outputStream.close();//Important
//message indicating that the information was saved to the output file

 }
}