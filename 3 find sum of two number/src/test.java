import javax.swing.JOptionPane;
public class test { 
    public static void main(String[] args)
    {
        int number1,number2,sum;
        String value;
        value = JOptionPane.showInputDialog("please enter your first number");
        number1 = Integer.parseInt(value);
        value = JOptionPane.showInputDialog("please enter your second number");
        number2 = Integer.parseInt(value);
        sum = number1+number2;
        JOptionPane.showMessageDialog(null, "the sum is equal to "+sum);
        
    }
    
}
// if there is any exception in program you can solove the lecture of 21 faisal saeed sir 