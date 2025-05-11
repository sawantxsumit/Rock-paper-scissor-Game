import java.io.*;

public class filehandling {
    public static void main(String[] args) throws IOException{
        // File f= new File("file2.txt");
        // try {
        // f.createNewFile();
        // System.out.println("file created sucessfully");
        // } catch (Exception e) {
        // System.out.println("file already exists");
        // }

        // FileWriter f1 = new FileWriter("C:\\Users\\sawan\\java\\file2.txt");
        // try {
        //     f1.write("this is a file made thorugh java");
        //     System.out.println("written successfully");
        // } catch (Exception e) {
        //     System.out.println(e);
        // } 
        // finally{
        //     f1.close();
        // }
            FileReader f1 = new FileReader("C:\\Users\\sawan\\java\\file2.txt");
            int i;
            try {
                while ((i= f1.read()) != -1) {
                   System.out.print((char)i);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
