public class Objective6Lab4{
  public static void main( String[] args){
    int sum=1, counter=1;

    while( counter <= 20 ){
      sum = sum + (counter + 1);
      counter += 1;
      if (counter == 20){
        System.out.println(sum);
      }
    }
  }
}
