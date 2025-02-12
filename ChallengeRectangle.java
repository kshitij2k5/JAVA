import java.util.Scanner;

public class ChallengeRectangle {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Program To Calculate The Perimeter of a Rectangle.... ");
    System.out.print("Please Enter The First Side Of Rectangle::: ");
    int a1=input.nextInt();
    System.out.print("Please Enter The Second Side Of Rectangle::: ");
    int a2=input.nextInt();
    System.out.print("Please Enter The Third Side Of Rectangle::: ");
    int a3=input.nextInt();
    System.out.print("Please Enter The Fouth Side Of Rectangle::: ");
    int a4=input.nextInt();
    System.out.println("The Perimeter of the Rectangle is::: "+(a1+a2+a3+a4));
  }
}
