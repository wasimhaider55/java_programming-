import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
      String name ; 
      Scanner ss = new Scanner(System.in);
      System.out.println("enter your name");
      name = ss.nextLine();
      System.out.println("the name of student is "+name.toLowerCase());/// lower case 
      System.out.println("the name of student is "+name.toUpperCase());/// uper case
      System.out.println("the name of student is "+name.length()); /// find length case
    }
    
}
