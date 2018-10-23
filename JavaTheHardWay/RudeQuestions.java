import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, city;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, whats you income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );

    System.out.print( "What city are you from? ");
    city = keyboard.next();
    System.out.println( "I've heard of " + city + "." + "Huge mess from what I've heard!");

    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    /*
    1. no, program does not blow up when entering and integer value for a double
    2. no, the program doesn't blow up when you enter an integer or double for
    for a string because it turns whatever you type into the field into a string.
    3.
    */
  }
}
