// 3 - Multiplication Table
// Write a program that takes a number as input and prints its multiplication table up to 10. Sample Output:
// Input a number: 9
// Expected Output :
// 9 x 1 = 9
// 9 x 2 = 18
// 9 x 3 = 27
// ...
// 9 x 10 = 90

public class task3 {
  public static void main(String[] args){

    int num = 9;
    for(int i = 1; i <= 10; ++i)
    {
      System.out.printf("%d * %d = %d \n", num, i,num *i);
    }
  }
}
