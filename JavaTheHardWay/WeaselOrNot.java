import java.util.Scanner;

public class WeaselOrNot {
  public static void main ( String[] args ) {
    Scanner input = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "Type the word \"weasel\", please." );
    word = input.next();

    yep = "weasel".equals( word );
    nope = ! "weasel".equals( word );

    System.out.println( "You typed what was requested: " + yep );
    System.out.println( "You ignored polite instructions: " + nope );

    //Code still runs when weasel and word are switched

  }
}
