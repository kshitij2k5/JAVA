import java.util.Scanner;

public class AddTwoNumberChallenge {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the First Number Here::: ");
    int num1=input.nextInt();
    System.out.print("Enter the Second Number Here::: ");
    int num2=input.nextInt();
    int sum=num1+num2;
    System.out.println("The sum of Two NUMber is ::: "+sum);
  }
}
