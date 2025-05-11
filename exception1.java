import java.util.*;

public class exception1 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 55;
        marks[1] = 58;
        marks[2] = 45;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index :");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want the value divide with :");
        int num = sc.nextInt();
        try {
            System.out.println("the value at arrya index entered is " + marks[ind]);
            System.out.println("the value of array value divided by number is " + marks[ind] / num);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured ");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured ");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some exception occured ");
            System.out.println(e);
        }
    }
}
