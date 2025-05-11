import java.util.Scanner;

public class pytho
{
    public static void main(String[] args)
    {
        double x,y,z;
        Scanner new1= new Scanner(System.in);

        System.out.println("enter side a :");
        x= new1.nextDouble();
        System.out.println("enter side b :");
        y= new1.nextDouble();

        z= Math.sqrt((x*x)+(y*y));

        System.out.println("the hypotenuse of the triangle is :"+z);
        new1.close();
        
    }
    
}
