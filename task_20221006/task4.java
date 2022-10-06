// Write a program that adds up integers that the user enters. First the programs asks how many numbers will be added up. Then the program prompts the user for each number. Finally it prints the sum. Sample output:
// How many integers will be added?
// 5
// Enter an integer:
// 3
// Enter an integer:
// 4
// Enter an integer:
// -4
// Enter an integer:
// -3
// Enter an integer:
// 7
// Expected Output :
// The sum is 7

import java.util.Scanner;
public class task4 {
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("How many integers will be added?");
    int numbers = input.nextInt();

    int sum = 0;

    for(int i = 0; i < numbers; i++){
      
      Scanner input2 = new Scanner(System.in);
      System.out.print("Enter an integer:");
      int numbers2 = input2.nextInt();
      
      sum += numbers2;
    }
    System.out.println("The sum is " + sum);
   }
  }


