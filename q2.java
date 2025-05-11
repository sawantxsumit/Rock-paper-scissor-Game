import java.util.*;
//to print all the prime numbers between two numbers
class Employee
{
    int id;
    int salary;
    String name;
    public void printdetail()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public void getSalary()
    {
        System.out.println("your salary is :"+salary);
    }
}
public class q2 {
    
    public static void main(String[] args) {
        //to print all the prime numbers between two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1=sc.nextInt();
        System.out.println("enter the first number :");
        int num2=sc.nextInt();
        int flag=0;
        for(int i=num1; i<=num2; i++)
        {
           for(int j=2; j<i;j++)
           {
             if (i%j != 0) {
                flag =1;
             }
             else {
                flag=0;
                break;
             }
           }
           if (flag==1) {
            System.out.println(i+" is a prime number ");
           }
        }
        sc.close();
    }
}
