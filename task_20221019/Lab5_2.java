//Q2
// Create an ArrayList of Integers
// Fill the ArrayList with ten random numbers (1-50)
// Copy each value from the ArrayList into another ArrayList of the same capacity
// Change the last value in the first (original) ArrayList to a -5
// Display the contents of both ArrayLists


package Lab5_2;

import java.util.ArrayList;
import java.util.Random
import java.util.Arrays;

public class Lab5Q2 {

	public static void main(String[] args) {
    
    //Random number
    Random random = new Random();
    int num = random.nextInt(51);
   
    List1<Integer> list = new ArrayList<>();
    for(int i = 0; i < 9; i++) {
     List1.add(int num);
    }


    //copy Array
    for(int i = 0; i < List1.length; i++){
      List[i] = i + 1;
    }
  
    int[] List2 = List1.clone();
    System.out.println(Arrays.toint(List1))
    System.out.println(Arrays.toint(List2))
    
    
    //Change the value
    arr = removeLastElement(arr);
    System.out.println(Arrays.toString(arr));
}  
	}
	 
    
    


