import java.util.Scanner;

public class ChallengeOddNumberSum {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number::: ");
    int num=input.nextInt();
    int sum=0;
    int i=1;
    while(i<num){
      sum+=i;
      i+=2;
    }
    System.out.println(sum);
  }
}
