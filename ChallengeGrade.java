import java.util.Scanner;

public class ChallengeGrade {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Your Marks Here::: ");
    int marks=input.nextInt();
    if(marks>90){
      System.out.println("You Score A Grade");
    }
    else if(marks>75){
      System.out.println("You Score B Grade");
    }
    else if(marks>60){
      System.out.println("You Score C Grade");
    }
    else if(marks>30){
      System.out.println("You Score D Grade");
    }
    else {
      System.out.println("You Score F Grade");
    }
  }
}
