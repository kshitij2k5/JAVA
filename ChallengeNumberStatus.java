import java.util.Scanner;

public class ChallengeNumberStatus {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter A number::: ");
    int n=input.nextInt();
    if(n>0){System.out.println("The Given Number Is Positive");}
    else if(n<0){System.out.println("The Give Number Is Negative");}
    else {System.out.println("The Given Number is Zero");}
  }
}
