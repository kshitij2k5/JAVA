import java.util.Scanner;

public class ChallengeSinpleInterest {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Program to Calculate The Simple Interest....");
    System.out.print("Enter The Principle Amount::: ");
    double P=input.nextDouble();
    System.out.print("Enter The Total Time::: ");
    double T=input.nextDouble();
    System.out.print("Enter The Rate of Interest::: ");
    double R=input.nextDouble();
    double simpleInterest=(P*T*R)/100;
    System.out.println("The Simple Interest is::: "+simpleInterest);
  }
}
