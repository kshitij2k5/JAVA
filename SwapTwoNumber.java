import java.util.Scanner;

public class SwapTwoNumber {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter First Number::: ");
    int num1=input.nextInt();
    System.out.print("Enter Second Number::: ");
    int num2=input.nextInt();
    System.out.println("The Two Number Before Swapping :: "+num1 +" and "+num2);
    int temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("The Two Number after Swapping :: "+num1 +" and "+num2);
  }
}
