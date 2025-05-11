
//WAP to check whether a  number is palindrome not 
//return true if yes and false if not
public class palindrome {
    public  static boolean isPalindrome(int x) {
        int n,rev=0;
        if (x<0) {
            return false;
        }
        n=x;
        while (n>0) {
            int r= n%10;
            rev= rev*10 + r;
            n=n/10;
        }
        if (rev == x) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean a=  isPalindrome(121);
        System.out.println(a);
    }
}
