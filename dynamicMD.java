class one{
    public void name()
    {
        System.out.println("my name is java");
    }
    public void greet()
    {
        System.out.println("welcome");
    }
}

class two extends one
{
    @Override
    public void name()
    {
        System.out.println("my name is java in class two");
    }
    public void swagat()
    {
        System.out.println("swagatam");
    }
}
public class dynamicMD {
    public static void main(String[] args) {
        // one obj= new one();
        // obj.name();
        // two obj2 = new two();

        one obj= new two(); 
       // two obj2= new one(); //not allowed
        obj.greet();
        obj.name(); //this will run the name method of class two i.e. jiska object uske methods 
        
    }
}
