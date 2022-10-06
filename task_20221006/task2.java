// Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.
// Input the N:
// > 10
// Expected Output :
// The sum of 1 to 10 is 55


public class task2 {
  public static void main(String[] args){
  int N = 10;
  int sum = 0;

  for(int i = 0; i <= N; i++){
    sum = sum + i;
  }
  System.out.printf("The sum of 1 to %d is %d",N,sum);
  }
}
  