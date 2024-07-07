import java.io.*;


public class file1 {
    public static void main(String[] args) throws IOException{
        String s = "file2.txt";
  File f = new File(s);
    String s1 = "textt";
    File f1 = new File(s1);
    System.out.println(f.length());
    System.out.println(f1.length());
    }
}
