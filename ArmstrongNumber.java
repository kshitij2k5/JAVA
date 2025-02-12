import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number::: ");
    int num=input.nextInt();
    int n=num;
    int cnt=0;
    while(n!=0){
      cnt++;
      n/=10;
    }
    int t=num;
    double sum=0;
    while(num!=0){
      int x=num%10;
         sum+=Math.pow(x,cnt);
         num/=10;
    }
    if(t==sum){System.out.println("Your Number is Armstrong");}
    else {
      System.out.println("Your Number is Not Armstrong");
    }

  }
}
