import java.util.Scanner;

public class ChallengeCategorize {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter Your Age Here::: ");
  int age=input.nextInt();
  if(age<13){
    System.out.println("You Belong To Child Group");
  }
  else if(age<30){
    System.out.println("You Belong To Teen Group"); 
  }
  else if(age<60){
    System.out.println("You Belong To Adult Group");  
  }
  else {
    System.out.println("You Belong To Senior Group");
  }
}
}
