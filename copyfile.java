import java.io.*;
import java.nio.channels.FileLockInterruptionException;

public class copyfile {
    public static void main(String[] args) {
        FileInputStream f1= new FileInputStream("file2.txt");
        FileInputStream r= new FileInputStream("renamed1.txt");
        int i;
        while ((i=r.read()) != -1) {
            f1.write((char)i);

        }
        System.out.println("file copied succesfully");
    }
}
