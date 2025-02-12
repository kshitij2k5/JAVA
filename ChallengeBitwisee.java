import java.util.Scanner;

public class ChallengeBitwisee {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter First Number::: ");
    int num1=input.nextInt();
    System.out.print("Enter Second Number::: ");
    int num2=input.nextInt();
    System.out.println(num1&num2);
    System.out.println(num1|num2);
    System.out.println(~num1);
    System.out.println(num2<<1);
    System.out.println(num1>>1);

  }
}
