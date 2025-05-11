
class MySideException extends Exception
{
    @Override
    public String toString()
    {
        return "side cannot negative";
    }
    @Override
    public String getMessage()
    {
        return "side cannot be negative";
    }
}
public class throwsKey {
    public static float SqArea(int r) throws MySideException
    {
        if (r<0) {
            throw new MySideException();
        }
        float res= r*r;
        return res;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // try {
        //     int c = divide(2, 0);
        //     System.out.println(c);
        // } catch (Exception e) {
        //     System.out.println(e + " exception");
        // }

        try {
            float a= SqArea(-5);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// throws keyword is applied/written alongside a method as a warnig that this
// method may throw an error
// so while using that method we should always use try catch block to counter
// the potential error
