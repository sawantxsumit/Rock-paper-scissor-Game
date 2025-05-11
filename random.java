import java.util.Random;

public class random 
{
   public static void main(String[] args)
   {
        Random random= new Random();
        //int x = random.nextInt(6);
        // this will give numbers betwenn 0-5

        int x = random.nextInt(6)+1;
        //this will generate numbers between 1-6

        double y= random.nextDouble();
        //will generate a number between 0 and 1

        boolean z= random.nextBoolean();
        System.out.println(z);
   } 
}
