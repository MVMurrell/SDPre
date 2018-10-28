import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int selection;

    while(true) {
      printMenue();
      selection = input.nextInt();
      if (selection == 1) {
        System.out.println( "Hello Human");
      }
      else if (selection == 2) {
        System.out.println( "Icecream, Icecream.....and Icecream");
      }
      else if (selection == 3) {
        break;
      }
      else {
        System.out.println( "That's isn't and option, try again");
      }



    }

    input.close();

  }
  public static void printMenue() {
    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
