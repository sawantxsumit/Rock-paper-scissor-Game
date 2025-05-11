import java.util.Scanner;

public class delArr {

static void delete(int[] a, int pos)
{
     for (int i = pos; i < 4; i++) {
        a[i]=a[i+1];
     }
}   
    public static void main(String[] args) {
        // int n;
        // System.out.println("Enter the number of elements :");
        Scanner sc= new Scanner(System.in);
      //  n=sc.nextInt();
        int[] arr= new int[25];
        System.out.println("Enter elements :");
        for (int i = 0; i < 4; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of the array are :");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i]+" ");
        }
        
        delete(arr, 2);
        System.out.println("Elements of the array after deletion are :");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]+" ");
        }
    
        
    }
}
