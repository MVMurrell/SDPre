import java.util.Scanner;

public class EnterPin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pin, entry2;
    String pass = "Indigo", entry1;

    pin = 12345;

    System.out.println( "WELCOME TO THE BANK OF JAVA.");
    System.out.println( "PLEASE ENTER YOUR PASSWORD: ");
    entry1 = input.next();

    while ( ! entry1.equals(pass)) {
      System.out.println("\nINCORRECT PASSWORD, TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD: ");
      entry1 = input.next();
    }


    System.out.println( "ENTER YOUR PIN: ");
    entry2 = input.nextInt();

    while ( entry2 != pin ) {
        System.out.println("\nINCORRECT PIN. TRY AGAIN.");
        System.out.println("ENTER YOUR PIN: ");
        entry2 = input.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $6,826,200.17");
  }
}
