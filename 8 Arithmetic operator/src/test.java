import java.util.Scanner;
public class test {

   
    public static void main(String[] args)
    {
      Scanner ss = new Scanner(System.in);
      int number1,number2,result;
      char choice;
      System.out.println("enter your first number");
      number1 = ss.nextInt();
      System.out.println("enter your second number");
      number2 = ss.nextInt();
      System.out.println("press + for addition");
       System.out.println("press - for subtraction");
        System.out.println("press * for multiplication");
         System.out.println("press / for Division");
          System.out.println("press % for remainder");
          choice=ss.next().charAt(0);
          switch(choice){

              case '+':
                  result=number1+number2;
                  System.out.println("the addition of two number = "+result);
      break;
            case '-':
                  result=number1-number2;
                  System.out.println("the subtraction of two number = "+result);
      break;
            case '*':
                  result=number1*number2;
                  System.out.println("the multiplication of two number = "+result);
      break;
            case '/':
                  result=number1/number2;
                  System.out.println("the Division of two number = "+result);
      break;
            case '%':
                  result=number1%number2;
                  System.out.println("the remainder of two number = "+result);
      break;
            default:
                System.out.println("you have pressed invaild number");
    }
    
}
