class Mythread1 extends Thread{
    @Override
    public void run()
    {
        int i =0;
        while(i<400)
        {   
            System.out.println("my thread 1 is running");
            System.out.println("konichiwa");
            i++;
        }
       
    }
}
class Mythread2 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<400)
        {
            System.out.println("my thread 2 is running");
            System.out.println("nee how");
            i++;
        }
       
    }
}


public class threading {
    public static void main(String[] args) {
        Mythread1 p1= new Mythread1();
        Mythread2 p2= new Mythread2();
        p1.start();
        p2.start();
    
}
}

