import java.util.Scanner;

public class ReverseDigit {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter a Number::: ");
    int num=input.nextInt();
    int reverseNum=0;
    while(num!=0){
      reverseNum*=10;
      reverseNum+=num%10;
      num/=10;
    }
    System.out.println("Reverse Number is::: "+reverseNum);
  }
}
