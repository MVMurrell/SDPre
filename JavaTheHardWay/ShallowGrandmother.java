import java.util.Scanner;

public class ShallowGrandmother {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    int age;
    double income, cute, happy;
    boolean allowed, allowed2;

    System.out.print( "Enter your age: " );
    age = input.nextInt();

    System.out.print( "Enter your yearly incomel: " );
    income = input.nextDouble();

    System.out.print( "How cute are you on a scale from 0.0 to 10.0? " );
    cute = input.nextDouble();

    System.out.print( "How happy do you make them?: ");
    happy = input.nextDouble();


    //allowed = ( age > 25 && age < 40 && ( income > 50000 || cute > 8.5 ) );
    allowed2 = ( age > 25 && age < 40 && ( happy > 7));
    System.out.println( "Allowed to date my grandchild? " + allowed2 );
  }
}
