import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        int marks;
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the marks of student");
        marks = ss.nextInt();
        if (marks >= 90 && marks <=100)
        {
      System.out.println("the student got A+ grade");
    }
        if (marks >= 80 && marks <=89)
        {
      System.out.println("the student got A grade");
    }
        if (marks >= 60 && marks <=79)
        {
      System.out.println("the student got B grade");
    }
        if (marks >= 50 && marks <=59)
        {
      System.out.println("the student got C grade");
    }
        if (marks >= 40 && marks <=49)
        {
      System.out.println("the student got D grade");
        }
        else 
        {
            System.out.println("the student got f Grade and consider fail");
        }
    }
