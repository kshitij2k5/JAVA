import java.util.Scanner;

public class ChallengeTemperatureConverter {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Program to Convert Fahrenheit to Celsius....");
    System.out.print("Enter The Temperature in Fahrenheit::: ");
    double F=input.nextDouble();
    double C=(F-32)*5/9;
    System.out.println("The Temperature in celsius is::: "+C);  
}
}