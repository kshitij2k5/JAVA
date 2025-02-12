import java.util.Scanner;

public class ChallengeFactorial {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number for which You Want to find a Factorial::: ");
    int num=input.nextInt();
    int i=1;
    int factorial=1;
    while(i<=num){
      factorial*=i;
      i++;
    }
System.out.println(factorial);
  }
}
