class mythread3 implements Runnable
{
    public void run()
    {
        int i=0;
        while (i<400) {
            System.out.println("i am a thread 3 not a threat 3");
            i++;
        }

    }
}

class mythread4 implements Runnable
{
    public void run()
    {
        int i=0;
        while (i<400) {
            System.out.println("i am a thread 4 not a threat 4");
            i++;
        }
        
    }
}


public class threading2 {
    public static void main(String[] args) {
        mythread3 bullet1= new mythread3();
        Thread gun1 = new Thread(bullet1);
        mythread4 bullet2= new mythread4();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
