import  java.util.Scanner;
public class test {
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in) ;
           int number1,number2,result;
           System.out.println("enter your first number ");
           number1 = input.nextInt();
           System.out.println("enter your second number ");
           number2 = input.nextInt();
           result=number1+number2;
           System.out.println("the sum of "+number1+" and "+number2+" 58"
                   + "is equal to "+result);
    }
    
}
