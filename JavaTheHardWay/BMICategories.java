import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    double bmi, lbs, in, kg, m;

    System.out.print( "Enter you height in inches: " );
    in = input.nextDouble();

    System.out.print( "Enter your weight in pounds: " );
    lbs = input.nextDouble();

    m = (in * 0.0254);
    kg = lbs / 2.2046226218;
    bmi = kg / (m*m);

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if (bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if (bmi < 25.0 ) {
      System.out.println( " normal weight" );
    }
    else if (bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if (bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if (bmi <40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
    input.close();
  }
}
