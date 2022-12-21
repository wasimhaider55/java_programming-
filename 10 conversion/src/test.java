import java.util.Scanner;
public class test 
{

    
    public static void main(String[] args)
    {
      float km,meters;
      Scanner ss = new Scanner(System.in);
      System.out.println("enter the distance in kilo meters");
      km = ss.nextFloat();
      meters= km*1000;
      System.out.println("the distance between two cities in meter are "+meters);
    }
    
}
