// Write a program that asks the user to enter a word. The program will then repeat the word for as many times as its characters: Sample Output:
// Enter a word:
// > Hello
// Expected Output :
// Hello
// Hello
// Hello
// Hello
// Hello


import java.util.*;
class RepeatWord{

public class task3 {
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter word");
    String word = input.next();
    
    int num = word.length();
    System.out.println();

    for(int i = 0;i < num;i++){
    System.out.println(word);
    }
  }
}
}
