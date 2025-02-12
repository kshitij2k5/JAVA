import java.util.Scanner;

public class ChallenegOddEven {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter A number::: ");
    int num=input.nextInt();
    if((num&1)==1){
         System.out.println("The Given Number is Odd");
    }
    else {
      System.out.println("The Given Number is Even");
    }
  }
}
