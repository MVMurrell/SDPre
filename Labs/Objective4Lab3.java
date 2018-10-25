import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    int userNum;

    out.println( "Please enter a number with no decimals: ");
    userNum = input.nextInt();

    if ( userNum < 0) {
      out.println( userNum + " is LESS THAN 0.");
    }
    else if ( userNum > 0) {
      out.println( userNum + " is GREATER THAN 0.");
    }
    else {
      out.println( userNum + " is EQUAL TO 0.");
    }

    input.close();
  }
}
