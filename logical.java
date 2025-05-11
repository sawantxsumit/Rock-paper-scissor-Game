import java.util.Scanner;

public class logical {
    public static void main(String[] args)
    {
       Scanner scanner= new Scanner(System.in);
       System.out.println("you are playing a game ! press q or Q to quit ");

       String response= scanner.next();

    //    if(response.equals("q") || response.equals("Q"))
    //    {
    //       System.out.println("you quit the game");
    //    }
    //    else 
    //    {
    //       System.out.println("you are still playing the game ");
    //    }
    if(!response.equals("q") && !response.equals("Q"))
       {
           System.out.println("you are still playing the game ");
    }
    else 
    {
           System.out.println("you quit the game");
       }
    }
}
