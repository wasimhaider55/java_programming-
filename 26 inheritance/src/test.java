import java.util.*;
class A
{
    void aa()
    {
        System.out.println("the method of A called");
    }
}
class B
{
  void bb()
  {
      System.out.println("the method of B called");
     
  }
}
public class test
{
  public static void main(String[] args) 
  {
     A ss=new A();
     ss.aa();
     B sss=new B();
     sss.bb();
      
    }
    
}
