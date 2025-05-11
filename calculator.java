import java.util.*;


public class calculator {
    public static void main(String[] args) {
        int a,b;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :"); 
        a=sc.nextInt();
        System.out.println("Enter other number :");
        b=sc.nextInt();
        System.out.println("Enter the operation you want to perform \n 1 for addition \n 2 for subtraction \n 3 for product \n 4 for division \n 5 for modulus");
        choice= sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("the addition of "+a+" and "+b+" is "+ (a+b));
                break;
            case 2:
                System.out.println("the difference between "+a+" and "+b+" is "+ (a-b));
                break;
            case 3:
                System.out.println("the product of "+a+" and "+b+" is "+ (a*b));
                break;
            case 4:
            if (b==0) {
                System.out.println("denominator cannot be zero");
            }
            else{
                System.out.println("the diviion of "+a+" and "+b+" is "+ (double)(a/b));
            }
                break;
            case 5:
                System.out.println("the modulus of "+a+" and "+b+" is "+ (a%b));
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
