import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    double x, y;
    String go = "YES", answer;

    System.out.print( "Are you ready?!?: ");
    answer = input.next();

    while ( ! answer.toUpperCase().equals(go)){
      System.out.println( "Thats not the right answer.");
      System.out.println( "Try again: ");
      answer = input.next();
    }

    System.out.print("\nGive me a number, and I'll find it's square root.");
    System.out.print("(No negatives, please.): ");
    x = input.nextDouble();

    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = input.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
}
