public class q4 {
    //to find the second smallest element in an array
        static int smallest(int[] a)
        {
            int sm=10000;
            for (int i = 0; i < a.length; i++) {
    
                if (a[i] <= sm) {
                    sm= a[i];    
                }
            }
            return sm;
        }

        static int  s_smallest(int[] a)
        {
            int sm=10000;
            int sm2=10000;
            for (int i = 0; i < a.length; i++) {
    
                if (a[i] <= sm) {
                    sm= a[i];    
                }
            }
            for (int i = 0; i < a.length; i++) {
                    if (a[i] == sm) {
                        continue;    
                    }
                    else{
                        if (a[i] <= sm2) {
                            sm2=a[i];
                        }
                    }
            }
            return sm2;
        }
        public static void main(String[] args) {
            int[] arr={11, 3 ,45, 66 ,77,56, 7,88};
          
            System.out.println("The smallest element in the given array is :"+smallest(arr));
            System.out.println("The second smallest element in the given array is :"+s_smallest(arr));
        }
    }
    