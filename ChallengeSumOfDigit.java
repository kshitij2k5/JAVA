import java.util.Scanner;

public class ChallengeSumOfDigit {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter A Number::: ");
    int num=input.nextInt();
    int sum=0;
    while(num!=0){
      sum+=num%10;
      num/=10;
    }
    System.out.println("The sum of the number digit is::: "+sum);
  }
}
