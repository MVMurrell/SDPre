import java.util.Scanner;

public class ComparingNumbers {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: " );
    first = input.nextDouble();
    System.out.print( "Second: " );
    second = input.nextDouble();

    if ( first < second ) {
      System.out.println( first + " is LESS THAN " + second );
    }
    if ( first <= second ) {
      System.out.println( first + " is LESS THAN/EQUAL TO " + second );
    }
    if ( first == second ) {
      System.out.println( first + " is EQUAL TO " + second );
    }
    if ( first >= second ) {
      System.out.println( first + " GREATER THAN/EQUAL TO " + second );
    }
    if ( first > second ) {
      System.out.println ( first + " is GREATER THAN " + second );
    }
    if ( first != second ) {
      System.out.println ( first + " is NOT EQUAL TO " + second );
      System.out.println( "Hey." );
    }
    input.close();
  }
}
// 1. hey is not part of the body statement. It prints regardless of the user's input
