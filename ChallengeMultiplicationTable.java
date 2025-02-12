import java.util.Scanner;

public class ChallengeMultiplicationTable {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number For which you want to calculate the Table::: ");
    int n=input.nextInt();
    int i=1;
    while(i<=10){
       System.out.println(n+" X "+i+" = "+n*i);
       i++;
    }

  }
}
