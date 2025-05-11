import java.util.Scanner;

public class q10 {
    public static void arr()
    {
        boolean flag = true;
        int[] marks= new int[3];
        marks[0]=9;
        marks[1]=5;
        marks[2]=3;
        Scanner sc= new Scanner(System.in);
        int count=0,i;
        while (flag && count<5) {
            try {
                System.out.println("enter the value of index :");
                 i= sc.nextInt();
                System.out.println("the value of marks[index] is " + marks[i]); 
                break;
            } catch (Exception e) {
                System.out.println("invalid index");
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int i;
        arr();
    }
}
