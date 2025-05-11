import java.io.*;
import java.util.Scanner;


public class hash1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter array elements :");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        
        int hash[] = new int[13];
        System.out.println("enter the no of elements you want to search :");
        int q= sc.nextInt();
        System.out.println("enter the elements :");
        while (q>0) {
            int num;
            num= sc.nextInt();
            hash[arr[num]] +=1;
            q--;
        }

        for (int j = 0; j < 13; j++) {
            System.out.println(hash[j]);
        }
       




    }
}