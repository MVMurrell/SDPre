import static java.lang.System.*;
import  java.util.Scanner;

public class Objective4Lab1 {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);

    Double num1, num2;

    out.print( "Hi, I need 2 numbers. Please enter your first number here: ");
    num1 = input.nextDouble();

    out.println( "Thank you");
    out.print( "Now, if you may, enter your second  number: ");
    num2 = input.nextDouble();

    if ( num1 > num2 ) {
      out.println( num1 + " is larger than " + num2+"." );
    }

    else if ( num2 > num1 ) {
      out.println( num2 + " is greater than " + num1+"." );
    }

    else {
      out.println( num2 + " is equal to " + num1+"." );
    }

    input.close();

  }
}
