package main;

import java.util.Scanner;
public class Main {

  public static void main(String[] args){
    
    char operator;
    Double firstNumber, secondNumber,result;

    do{

    Scanner input = new Scanner(System.in);
    
    //User input : 1st number
    System.out.println("Please type the first number");
    firstNumber = input.nextDouble();
    
    //User input : 2nd number
    System.out.println("Please type the second number");
    secondnumber = input.nextDouble();

    //User input : operator
    System.out.println("Choose an operarion\nType +  for addition\nType - for substraction\nType * for multiplication\nType / for division");
    operator = input.next().charAt(0);

    switch(operator){
      case '+':
      result = firstNumber1 + secondNumber;
      System.out.print(firstNumber + "+" + secondNumber + "=" + result);
      break;
    
      case '-':
      result = firstNumber1 - secondNumber;
      System.out.print(firstNumber + "-" + secondNumber + "=" + result);
      break;

      case '*':
      result = firstNumber1 * secondNumber;
      System.out.print(firstNumber + "*" + secondNumber + "=" + result);
      if(firstNumber || secondNumber == 0){
        System.out.println("cannot divide by zero")};
      break;

      case '/':
      result = firstNumber1 / secondNumber;
      System.out.print(firstNumber + "/" + secondNumber + "=" + result);
      if(firstNumber || secondNumber == 0){
        System.out.println("cannot divide by zero")};
      break;
      

      //User input : countinue or quit
      System.out.println("do you want to continue or quit?");
      String inputCountinue = Scannan.nextLine();
      System.out.println(inputCountinue);

      if(inputCountinue("Countinue") || inputCountinue("countinue")){
        
      }if(inputCountinue("Quit")||inputCountinue("quit")){
        System.out.println("Bye!")};

    }while(inputCountinue("Quit")||inputCountinue("quit"));
    scan.close();
  }
 }
}


