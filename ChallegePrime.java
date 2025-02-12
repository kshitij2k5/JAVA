import java.util.Scanner;

public class ChallegePrime {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number::: ");
    int num=input.nextInt();
    int i=2;
    int cnt=0;
    while(i<num){
      if(num%i==0){cnt++;}
      i++;
    }
    if(cnt==0){System.out.println("Prime Number");}
    else {System.out.println("Not a Prime Number");}
  }
}
