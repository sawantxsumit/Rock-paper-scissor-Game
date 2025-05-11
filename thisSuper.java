class demo{
    int a;
    demo(int y)
    {
        this.a=y;
    }
    // 
    public int geta()
    {
        return a;
    }
    public int returnnone()
    {
       return 1;
    }
}

public class thisSuper {
    public static void main(String[] args) {
        demo one= new demo(5);
        System.out.println(one.geta());

    }
}
