import java.util.*;
class areafinder
{
   private int base ,hight;
  void  setarea()
    {
      System.out.println("enter the value for base and height");
      Scanner ss =new Scanner(System.in);
      base =ss.nextInt();
      hight=ss.nextInt();
    }
  double getarea()
  {
   return (0.5*base*hight);   
}
}
public class test {

    
    public static void main(String[] args) 
    {
        areafinder sss=new areafinder();
        sss.setarea();
        sss.getarea();
       System.out.println("the area is "+sss.getarea());
    }
    
}
