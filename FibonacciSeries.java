import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number::: ");
    int num=input.nextInt();
    int first=1;
    int second=1;
    int sum=0;
    while(sum<=num){
      System.out.println(first);
      sum=first+second;
      first=second;
      second=sum;
    }
  }
}
