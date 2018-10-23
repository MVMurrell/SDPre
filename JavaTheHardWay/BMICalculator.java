import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ){
    Scanner input = new Scanner(System.in);
    double m, kg, bmi, in, lbs, ft;

    System.out.print( "Your height (feet only): " );
    ft = input.nextDouble();

    System.out.print( "Your height (inches only): " );
    in = input.nextDouble();

    System.out.print( "Your weight in lbs: " );
    lbs = input.nextDouble();

    m = (in * 0.0254) + (ft / 3.28);
    kg = lbs / 2.2046226218;
    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi );
  }
}
