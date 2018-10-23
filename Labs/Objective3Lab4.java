import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.print( "What is your first name?: ");
    firstName = input.next();
    System.out.print( "What is your last name?: ");
    lastName = input.next();
    System.out.print( "How old are you?: ");
    age = input.nextInt();

    System.out.print( "Your first name is " + firstName + ", ");
    System.out.print( "your last name is " + lastName + ", ");
    System.out.println( "and you are " + age + " years old.");

    input.close();
  }
}
