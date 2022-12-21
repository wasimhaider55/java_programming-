import java.util.Scanner;
public class test {
 public static void main(String[] args)
 {
       int age;
       float weight;
       String name;
       Scanner ss=new Scanner(System.in);
       System.out.println("enter the name of student");
       name = ss.nextLine();
       System.out.println("enter the age of student");
       age = ss.nextInt();
       System.out.println("enter the weight of student");
       weight = ss.nextFloat();
       System.out.println("the name of student is "+name);
       System.out.println("the age of student is "+age);
       System.out.println("the weight of student is "+weight);

    }
    
}
