import java.util.*;


public class rock {
    public static void main(String[] args) {
        System.out.println("Enter your choice rock= 0 , paper =1 or scissor=2 :");
        Scanner sc = new Scanner(System.in);
        int uInput= sc.nextInt();
        
        Random num= new Random();
        int cChoice= num.nextInt(3);

        if (uInput == cChoice) {
            System.out.println("Draw");
        }
        else if (uInput == 1 && cChoice==0|| uInput == 2 && cChoice==1 || uInput == 0 && cChoice==2) {
            System.out.println("You win ");
        }
        else {
            System.out.println("Computer wins");
        }
        
       // System.out.println("Computer choice : "+cChoice);
        switch (cChoice) {
            case 0:
                System.out.println("Computer choice : rock");
                break;
            case 1:
                System.out.println("Computer choice : paper");
                break;
            case 2:
                System.out.println("Computer choice : scissor");
                break; 
            default:
                break;
        }
        sc.close();
    }
}
