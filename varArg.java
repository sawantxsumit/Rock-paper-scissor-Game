public class varArg {

    static int sum(int ...arr)
    {
        //available as int[] arr
        int res=0;
        for(int a: arr)
        {
            res+= a;
        }
        return res;
    }
    public static void main(String[] args) {
        
        System.out.println("the sum of 4 , 5 is "+ sum(4,5));
        System.out.println("the sum of 4 , 5 , 6 is "+ sum(4,5,6));
        System.out.println("the sum of 4 , 5  , 6 ,7 is "+ sum(4,5,6,7));
        System.out.println("the sum of 4 , 5 , 7 ,8 ,9  is "+ sum(4,5,7,8,9));
        System.out.println("the sum of 4 , 5 ,1 ,2 ,3 ,6 is "+ sum(4,5,1,2,3,6));
       
    }
}
