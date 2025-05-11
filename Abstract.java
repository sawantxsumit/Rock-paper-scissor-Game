abstract class parent
{
    public parent()
    {
        System.out.println("constructor of parent class ");
    }
    public void sayHello()
    {
        System.out.println("hello");
    }
    abstract public void greet();

}
class derived extends parent{
     @Override
     public void greet()
     {
        System.out.println("good morning");
     }
}

abstract class derived2 extends parent
{
    public void th()
    {
        System.out.println("i am good");
    }
}

public class Abstract {
    public static void main(String[] args) {
        derived one= new derived();
        one.greet();
        //parent p= new parent();//parent is an abstract class and we cannot make its object we can make another class from parent class
        //we can do this only when we have implemented the abstract methods of the parent class

    }
}
