import java.util.InputMismatchException;
import java.util.Scanner;

public class nestedtry {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 55;
        marks[1] = 58;
        marks[2] = 45;
        boolean flag= true;
        boolean flag2= true;

        int num=1;
        Scanner sc = new Scanner(System.in);
        
        while (flag2) {
            try {
                System.out.println("welcome ");
                System.out.println();
                try {
                    System.out.print("input index :");
                    num = sc.nextInt();
                    flag= false;
                }
                catch (InputMismatchException e) {
                    System.out.println("wrong input");
                    System.out.println(e);
                    sc.next();
                }
             
            try {
                System.out.println(marks[num]);
                flag2= false;
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this index does'nt exist");
                System.out.println("exception in level 2");

            }
        } 
        catch (Exception e) {
            System.out.println("exceptoin in level 1 ");
        }
    }
    System.out.println("thanks");
        }
        
}
