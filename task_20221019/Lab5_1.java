//Q1
// Create an ArrayList of Integers
// Fill each of the 10 slots with a random value from 1-50.
// Display those values on the screen, and then prompt the user for an integer.
// Search through the ArrayList, and if the item is present, print a message that the number is in the list.
// If the value is not in the ArrayList, print a message that the number is not in the list


package Lab5_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab5Q1 {

	public static void main(String[] args) {
     
     Random random = new Random();
     int num = random.nextInt(51);
		
	   List<Integer> list = new ArrayList<>();
	   for(int i = 0; i < 9; i++) {
      List.add(int num);
     }
    
     System.out.println(num);
     
     if(List.contains(num)) {
      System.out.println("The number is in the list.");
     }else {
      System.out.println("The number is not in the list.");
     }

    scn.close();

  }  
}
	 
    
    


