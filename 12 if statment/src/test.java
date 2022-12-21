import java.util.Scanner;
public class test {  
    public static void main(String[] args) 
    {
     int no;
     Scanner ss = new Scanner(System.in);
     System.out.print("enter the value for number");
     no = ss.nextInt();
     if (no>100)
          System.out.println("the number is grater than 100");
    }
}
