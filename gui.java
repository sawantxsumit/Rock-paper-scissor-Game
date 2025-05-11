import javax.swing.JOptionPane;

public class gui 
{
    public static void main(String[] args)
    {
        double a = Double.parseDouble(JOptionPane.showInputDialog("enter side a :"));       
        double b = Double.parseDouble(JOptionPane.showInputDialog("enter side b :"));   
        
        double c= Math.sqrt((a*a)+(b*b));
        JOptionPane.showMessageDialog(null, "The hypotenuse of the triangle is :"+c);
    }
    
}
