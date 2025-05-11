class mythr extends Thread
{
    public mythr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while (i<40) {
            System.out.println("i am a thread");
            i++;
        }
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        mythr r= new mythr("sumit");
        r.start();
        System.out.println("the id of the process is "+ r.threadId());
        System.out.println("the name of the thread is "+ r.getName());
    }
}
