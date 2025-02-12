import java.util.Scanner;

public class ChallengeTriangle {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Program To Calculate The Area Of Triangle.... ");
    System.out.print("Enter The Height Of the Triangle::: ");
    int height=input.nextInt();
    System.out.print("Enter The Base Of the Triangle::: ");
    int base=input.nextInt();
    double Area=0.5*base*height;
    System.out.println("The Area of The Triangle is::: "+Area);
  }
}
