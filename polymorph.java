interface camera
{
    void takesnap();
    void recordvideo();
    private void greet()
    {
        System.out.println("hello");
    }
    default void record4kvideo()
    {
        greet();
        System.out.println("recording in 4k ...");
    }
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

public class polymorph {
    public static void main(String[] args) {
        camera cam1= new smartphone();
        //by creating an object if camera interface we can only use functions of camera class
        //i.e. this is a smartphone but we can only use it as a camera
        //cam1.getNetwork(); -> not allowed 
        cam1.record4kvideo();
        cam1.takesnap();

        smartphone s1= new smartphone();
        s1.getNetwork();
        s1.recordvideo();
        s1.callnumber(12345);
    }
}
