import java.util.Scanner;

public class ChallengeArthmatic {
  public static void main(String[] args) {
    System.out.println("Welcome To Arithmetic Calculator....");
    Scanner input=new Scanner(System.in);
    System.out.print("Please Enter The First Number::: ");
    int num1=input.nextInt();
    System.out.print("Please Enter The Second Number::: ");
    int num2=input.nextInt();
    System.out.println("Addition is::: "+ (num1+num2));
    System.out.println("Subtraction is::: "+(num1-num2));
    System.out.println("Multiplication is::: "+num1*num2);
    System.out.println("Division is::: "+num1/num2);
    System.out.println("Remainder is::: "+num1%num2);

  }
}
