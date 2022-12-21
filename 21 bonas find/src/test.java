import java.util.Scanner;
public class test {  
    public static void main(String[] args)
    {
       int jointy,currenty,serves,bons;
       Scanner ss = new Scanner(System.in);
       System.out.println("enter your current year ");
       currenty=ss.nextInt();
       System.out.println("enter your joint year ");
       jointy=ss.nextInt();
       serves = currenty-jointy;
       if (serves > 3)
       {
           bons = 3000;
           System.out.println("the bonas of employee is = "+bons);
           System.out.println("the serves of employee is "+serves);
           
       }
       
    }
    
}
