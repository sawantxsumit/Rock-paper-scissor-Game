public class method {

    static int sum(int a , int b)
    {
        //we use static keyword here because within a static class only static methods can be called
        //we can only call a static method with static method
        int c=a+b;
        return c;
    }
     public static void main(String[] args) {
        
        int r=sum(12,45);
        System.out.println(r);
     }
}
