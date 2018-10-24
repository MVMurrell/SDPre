import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? ");
    age = input.nextInt();

    System.out.println( "You are: ");
    if ( age < 13 ) {
      System.out.println( "\ttoo young to create a Facebook account" );
    }
    if (age >= 13 ) {
      System.out.println( "\told enough to create a Facebook account ");
    }
    if ( age < 16 ) {
      System.out.println( "\ttoo young to get a driver's license" );
    }
    if (age >= 16 ) {
      System.out.println( "\told enough for a driver's license" );
    }
    if ( age < 18 ) {
      System.out.println( "\ttoo young to get a tattoo" );
    }
    if (age >= 18 ) {
      System.out.println( "\told enough to get a tattoo");
    }
    if ( age < 21 ) {
      System.out.println( "\ttoo young to drink alcohol" );
    }
    if ( age >= 21 ) {
      System.out.println( "\told enough to get a drink");
    }
    if ( age < 35 ) {
      System.out.println( "\ttoo young to run for President of the U.S." );
      System.out.println( "\t\t(How sad!)" );
    }
    if (age >= 35 ) {
      System.out.println( "\tyou're old enough to run for president!");
    }
    if (age >= 65 ) {
      System.out.println( "\tYou are old enough to retire! Congratulations!");
    }
    if (age < 65 ) {
      System.out.println( "\tdtoo young to retire" );
    }
  input.close();
  }
}

/*
1. It just prints "You are:"
*/
