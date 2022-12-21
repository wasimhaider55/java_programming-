import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
     float faranheit,celcius;
     Scanner ss = new Scanner(System.in);
     System.out.println("enter the value for faranhiet");
     faranheit = ss.nextFloat();
     celcius= (faranheit - 32) * 5/9;
     System.out.println("the temprature in celcius is equal to "+celcius);
    }
    
}
