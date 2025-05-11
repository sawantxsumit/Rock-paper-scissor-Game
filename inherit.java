
class base
{
    int x;

    public int getx()
    {
        return x;
    }

    public void setx(int x)
    {
        System.out.println("base class");
        this.x=x;
    }

    base()
    {
        System.out.println("i am a base class constructor");
    }
    //constructor overloading
    base(int a)
    {
        System.out.println("base class constructor with value :"+a);
    }
    base(int a,int b)
    {
        System.out.println("base class constructor with value a= "+a+" and b ="+b);
    }
}

class derived extends base
{
    int y;

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    derived()
    {
        //to access the base class constructor with an argument we use the super keyword 
        //  super(5,6);
        System.out.println("i am a derived class constructor");
    }

    derived(int a)
    {
        super(9);
        System.out.println("derived class overloaded constructor with value :"+a);
    }
} 

class derived2 extends derived
{
    derived2()
    {
        System.out.println("child of derived class constructor ");
    }
    derived2(int x , int y)
    {
        super(x);
        System.out.println("overloaded constructor of child of  derived class x= "+x +"y="+y);
    }
}

public class inherit {
    public static void main(String[] args) {
        derived2 b = new derived2(5,9);
        // base b = new base();
        // b can derive the getter setter and all the accesible methods of base class
        b.setx(10);
        System.out.println(b.getx());
    }
}




//derived class objects will execute the constructors of the base class as well as their own constructors 

// the constructor of the base class is derived first