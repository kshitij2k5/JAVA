import java.util.Scanner;

public class NumberPalindrome {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number::: ");
    int num=input.nextInt();
    int n=num;
    int reverseNum=0;
    while(n!=0){
      reverseNum*=10;      
      reverseNum+=n%10;
      n/=10;   

    }
    if(num==reverseNum){
      System.out.println("The Given Number is Palindrome");
    }
    else {
      System.out.println("The Given Number is Not Palindrome");
    }
  }
}
