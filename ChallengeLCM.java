import java.util.Scanner;

public class ChallengeLCM {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter First Number::: ");
    int first=input.nextInt();
    System.out.print("Enter Second Number::: ");
    int second=input.nextInt();
    int i=1;
    while(true){
int factor=first*i;
if(factor%second==0){
  System.out.println(factor);
  break;
 }
 i++;
    }

  }
}
