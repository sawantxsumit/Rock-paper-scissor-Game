interface bicycle
{
    int a=43;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface blowHorn
{
    void hornOld();
    void hornDigital();
}

class Avoncycle implements bicycle, blowHorn
{
    void blowHorn()
    {
        System.out.println("peeeeeeep");
    }
    //interface methods must be made public
    public void applyBrake(int decrement)
    {
        System.out.println("applying brake");
    }
    public void speedUp(int increment)
    {
        System.out.println("speeding up");
    }
    public void hornDigital()
    {
        System.out.println("jaldi waha se hato");
    }
    public void hornOld()
    {
        System.out.println("tring tring ");
    }
}


public class implement {
    public static void main(String[] args) {
        Avoncycle sumit = new Avoncycle();
        sumit.applyBrake(10);
        System.out.println(sumit.a);
        // we can create propertiesin interfaces but we cannot modify the properties
        sumit.hornDigital();
    }
}
