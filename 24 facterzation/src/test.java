import java.util.Scanner;
import javax.swing.JOptionPane;
public class test {
public static void main(String[] args) 
{
    int number,result=1;
    Scanner ss = new Scanner(System.in);
    System.out.println("enter the to calcualte it's factorzation");
    number = ss.nextInt();
    int i=1;
    while(i<=number)
    {
    result = result * i;
    i++;
    }
    System.out.println("the factozation of "+number+" is equal to "+result);
}
}
