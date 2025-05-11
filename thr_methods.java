class mythr2 extends Thread
{
    public void run()
    {
        while (true) {
            System.out.println("thankyou");
        }
    }
}

public class thr_methods {
    public static void main(String[] args) {
        mythr2 r1= new mythr2();
        mythr2 r2 = new mythr2();
        r1.start();
        try {
            r1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        r2.start();
    }
}
