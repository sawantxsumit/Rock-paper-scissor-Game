

public class finallyKey {
    public static int divide(){
        try{
            int a=9;
            int b=3;
            int c= a/b;
            return c;
        } catch (Exception e) {
          System.out.println(e);
        }
        finally{
            System.out.println("end of function");
        }
      return 0;
    }

//finally block is useful in certain cases like the divide function above
//generally when the functions return any value the further code is not executed but in case of finally the block of code inside the finally is always executed 
// we can include clean up fuctions like free() inside the finally block

    public static void main(String[] args) {
        System.out.println(divide());
        int a=18;
        int b=9;
        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
               System.out.println(e);
               break;
            }
            finally{
                System.out.println("this is finally");
            }
            b--;
        }
    }
}
//in the above while block the finally is executed even after the break is executed inside the catch block
// we can also use try and finally without catch
