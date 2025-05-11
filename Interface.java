interface camera
{
    void takesnap();
    void recordvideo();
}

interface wifi
{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class mycellphone{
    void callnumber(int phonenumber)
    {
       System.out.println("calling"+ phonenumber);
    }
    void pickcall(int phonenumber)
    {
       System.out.println("connecting");
    }
}
class smartphone extends mycellphone implements wifi , camera{   
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public String[] getNetwork()
    {
        System.out.println("getting list of networks");
        String[] networkList ={"harry","sumit" , "dheeraj" };
        return networkList;
    }

    public void connectToNetwork(String network)
    {
       System.out.println("connecting to "+network);
    }
    public void recordvideo()
    {
        System.out.println("recording video ");
    }
}
public class Interface {
    public static void main(String[] args) {
        smartphone m1= new smartphone();
        String[] ar= m1.getNetwork();
        for(String item :ar)
        {
            System.out.println(item);
        }
    }
}
