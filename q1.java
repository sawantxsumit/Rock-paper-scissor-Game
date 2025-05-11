import java.util.*;

public class q1 {
        public static void main(String[] args)
    {
       double math , c , dsa;
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter marks obtained in maths :");
       math= sc.nextDouble();
       System.out.println("Enter marks obtained in c language :");
       c= sc.nextDouble();
       System.out.println("Enter marks obtained in Data structure :");
       dsa= sc.nextDouble();
       
       double percentage= (math+c +dsa)/3;
       if(percentage > 40 && math >32 && c >32 && dsa >32)
       {
        System.out.println("congrats You have passed the exam successfully \n your percentage is "+percentage);
       }
       else
       {
          System.out.println("You have failed \n better luck next time \n Your preentage is :"+percentage);
       }

    }
}
