import java.util.Scanner;

class Myexception extends Exception{
   @Override
    public String toString()
    {
       // return super.toString() + " I am toString()";
        return  " I am toString()";
    }

   @Override
    public String getMessage()
    {
       // return super.getMessage() + " i am getmessage()";
        return " i am getmessage()";
    }
}
// getMessage() and toString( ) are pre existing methods of Exception class and that is why we are overriding it 
//also the super keyword is used here to invoke the original method in Exception class
//Returns a short description of this throwable. The result is the concatenation of:
// the name of the class of this object
// ": " (a colon and a space)
// the result of invoking this object's getLocalizedMessage method
// If getLocalizedMessage returns null, then just the class name is returned
public class exceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        if(a<9)
        {
            try {
               // throw new Myexception();
                throw new ArithmeticException("arithmetic exception") ;   
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();;
            }
        }
    }
}

// we can make our custom Exception in java using
//  exception class .thrwo keyword is used to      display our custom exception in the program
