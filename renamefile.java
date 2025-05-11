import java.io.*;

public class renamefile {
    public static void main(String[] args) {
        File f1= new File("file1.txt");
        File f2= new File("renamed1.txt");
        if (f1.exists()) {
            f1.renameTo(f2);
            System.out.println("renamed succesfully");
        }
        else
        {
            System.out.println("file does'nt exist ");
        }
    }
}
