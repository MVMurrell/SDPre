import java.util.Scanner;

public class SelfPractice1 {
  public static void main( String[] args) {
    Scanner input = new Scanner (System.in);
    String response;
    boolean affirmative, negative;

    System.out.println( " Type the word \"Java\" ");
    response = input.next();


    affirmative = response.equals("Java");
    negative = ! response.equals("Java");

    System.out.println( " You can follow basic instructions: " + affirmative );
    System.out.println( " You're stubborn AF: " + negative );

    input.close();

  }
}
