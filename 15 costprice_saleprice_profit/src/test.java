import java.util.Scanner;
public class test {
 public static void main(String[] args) 
    {
      float cost_price,profit,sale_price;
      Scanner ss = new Scanner(System.in);
      System.out.println("enter the cost_price");
      cost_price = ss.nextFloat();
       System.out.println("enter the profit");
      profit = ss.nextFloat();
      sale_price = cost_price + profit;
      System.out.println("the cost_price is "+cost_price+ "the profit is "+sale_price);
      
    }
    
}
