import java.util.Scanner;

public class ChallengeCompoundInterest {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Program to Calculate Compound Interest... ");
    System.out.print("Enter The Principle Amount::: ");
    double P=input.nextDouble();
    System.out.print("Enter The Total Time::: ");
    double T=input.nextDouble();
    System.out.print("Enter The Rate of Interest::: ");
    double R=input.nextDouble();
    double compoundInterest=P*Math.pow((1+R/100),T);
    System.out.println("The Simple Interest is::: "+ compoundInterest);
  }
}
