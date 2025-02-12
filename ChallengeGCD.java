import java.util.Scanner;
import java.lang.Math;

public class ChallengeGCD {

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter The First Number::: ");
    int first=input.nextInt();
    System.out.print("Enter The Second Number::: ");
    int Second=input.nextInt();
    int gcd=1;
    int i=2;
    int least=Math.min(first,Second);
    while(i<=least){
          if(first%i==0 && Second%i==0){
            gcd=i;
            System.out.println("The GCD is::: "+gcd);
            
          }
          i++;
        }
      }
    
     
      }

