import java.util.Scanner;
public class test { 
    static void add(int a,int b)
    {
        int s;
        s= a+b;
        System.out.println("the sum is equal to "+s);
    }
    static void subtraction(int a,int b)
    {
        int s;
        s= a-b;
        System.out.println("the subtraction is equal to "+s);
    }
    static void multiplication(int a,int b)
    {
        int s;
        s= a*b;
        System.out.println("the multiplication is equal to "+s);
    }
    static void division(float a,float  b)
    {
        float s;
        s= a/b;
        System.out.println("the Division is equal to "+s);
    }
    static void remainder(float a,float b)
    {
        float s;
        s= a*b;
        System.out.println("the remainder is equal to "+s);
    }
    public static void main(String[] args)
    {
     add(100,200);
     subtraction(500,300);
     multiplication(8,5);
     division(56,5);
     remainder(15,2);
    }
    
}
