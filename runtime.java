import java.util.*;

public class runtime {
    public static void main(String[] args) {
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k:");
        k=sc.nextInt();
        try {
            System.out.println("integer part of 1000 divided by k is "+ 1000/k);
            
        }
        catch (Exception e) {
            // TODO: handle exception
            System.out.println("cannot divide reason :");
            System.out.println(e);
        }

        // if an exception error occurs during the compilation. The java program does'nt execute the further line of commands 
        //try catch is used to avoid this issue
        // the block of code under try will always execute and incase it faces an error it will move ahead to execute the catch block
        // System.out.println("integer part of 1000 divided by k is "+ 1000/k);
        // this program cannot handle the error when 1000 is divided by 0 
        // this is an arithmetic exception

    }
}
