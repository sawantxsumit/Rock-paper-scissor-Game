import java.util.Scanner;

public class scan
{
     public static void main(String args[])
     {
        Scanner new1 = new Scanner(System.in);

        System.out.println("what is your name ?");
        String name= new1.nextLine();
        System.out.println("what is your age ?");
        int age= new1.nextInt();
        new1.nextLine();
        System.out.println("what is your fav food?");
        String food= new1.nextLine();
        System.out.println("hello "+name);
        System.out.println("you are "+ age +" years old");
        System.out.println("your fav food is "+food);

     }
}