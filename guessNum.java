import java.util.*;

public class guessNum {
    //guessing the number game 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random num= new Random();
        int cChoice= num.nextInt(101);
        System.out.print("Enter a number between 1 and 100 :");
        int uInput= sc.nextInt();
        
        int guess =1;
        while (guess <11) {
            if (uInput == cChoice) {
                System.out.println("correct choice You win");
                System.out.println("You took "+guess+" guesses");
                break;
            }
            else if (uInput < cChoice) {
                System.out.print("try a greater number :");
                uInput= sc.nextInt();
                guess++;
            }
            else{
                System.out.print("try a lower number :");
                uInput= sc.nextInt();
                guess++;
            }
            if (guess==10) {
                System.out.println("Game over \n the correct number is :"+cChoice);
                break;
            }
        }
    }
}
