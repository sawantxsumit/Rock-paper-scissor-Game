
class A{
    public void meth2()
    {
        System.out.println("method 2 of class a");
    }
}

class B extends A 
{
    @Override //just a notation to know overriding is being performed
    public void meth2()
    {
        System.out.println("method 2 of class b");
    }
}

public class overriding {
    public static void main(String[] args) {
        A a= new A();
        a.meth2();

        B b= new B();
        b.meth2();
    }
}
