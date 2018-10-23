import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double num1, num2, sum;

    System.out.print( "Please enter a number: ");
    num1 = input.nextInt();

    System.out.print( "Please enter another number: ");
    num2 = input.nextInt();

    sum = num1 + num2;

    System.out.println( " The sum of " + num1 + " + " + num2 + " = " + sum );

    input.close();
  }
}
