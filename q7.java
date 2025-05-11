abstract class pen
{
    abstract void write();
    abstract void refill();
}
class fountain_pen extends pen
{
    void write()
    {
        System.out.println("writing");
    }
    void refill()
    {
        System.out.println("refilling...");
    }
    void changeNib()
    {
        System.out.println("changing the nib ");
    }   
}
public class q7 {
    public static void main(String[] args) {
        fountain_pen f1= new fountain_pen();
        f1.changeNib();
    }
}
