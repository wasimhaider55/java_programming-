import java.util.Scanner;
public class test 
{

    
    public static void main(String[] args)
    {
int s1,s2,s3,s4,s5,total,percentage;
Scanner ss= new Scanner(System.in);
System.out.println("enter the  marks of first subject");
s1 = ss.nextInt();
System.out.println("enter the marks of second subject");
s2 = ss.nextInt();
System.out.println("enter the marks of third subject");
s3 = ss.nextInt();
System.out.println("enter the marks of fourth subject");
s4 = ss.nextInt();
System.out.println("enter the marks of fifth subject");
s5 = ss.nextInt();
total=s1+s2+s3+s4+s5;
percentage=total/500*100;/////////////////// problem
System.out.println("the marks of  five subjects is = "+total);
System.out.println("the percentage of  five subjects is = "+percentage);
    }
    
}
