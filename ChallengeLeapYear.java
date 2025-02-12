import java.util.Scanner;

public class ChallengeLeapYear {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("program to Calculate If a number is leap year or not...");
    System.out.print("Please Enter a Year::: ");
    int year=input.nextInt();
    if(year%4==0 && (year%100!=0 || year%400==0)){System.out.println("The Given Number is a Leap Year"); }
    else {System.out.println("The Given Year is Not a Leap Year");}
  }
}
