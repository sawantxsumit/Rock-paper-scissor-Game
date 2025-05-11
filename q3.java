public class q3 {
//to find the smallest element in an array
    static int smallest(int[] a)
    {
        int sm=0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] <= a[0]) {
                sm= a[i];    
            }
        }
        return sm;
    }
    public static void main(String[] args) {
        int[] arr={11, 3 ,45, 66 ,77};
        int[] brr=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            brr[i]=arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
           System.out.println(brr[i]);
        }
        //System.out.println("The samllest element in the given array is :"+smallest(arr));
    }
}
