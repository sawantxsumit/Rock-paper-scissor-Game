

//example of arithmetic exception

// public class q9 {
//     public static void main(String[] args) {
//         try {
//             int a=66/7;
//         } catch (ArithmeticException e) {
//               System.out.println("haha");
//         }
//         catch(IllegalArgumentException e){
//              System.out.println("hehe");
//         }
//     }
// }

//illegal argument exception
public class q9 {
    public static void main(String[] args) {
        // Example of IllegalArgumentException
        setAge(-5); // Passing an invalid age
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative: " + age);
        }
        System.out.println("Age is set to: " + age);
    }
}

