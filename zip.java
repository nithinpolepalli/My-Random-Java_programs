import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class zip {
    public static void main(String[] args) throws IOException {
    FileInputStream fi = new FileInputStream("textt");
    //BufferedReader br = new BufferedReader(new InputStreamReader(fi)); 
FileOutputStream fo = new FileOutputStream("myfile2.txt");
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
DeflaterOutputStream dos = new DeflaterOutputStream(fo);
    int ch;
    while((ch=fi.read())!=-1){
        dos.write((char)ch);
    }
    fi.close();
    dos.close();
    // String s = "file2.txt";
    // File f = new File(s);
    // String s1 = "textt";
    // File f1 = new File(s1);
    // System.out.println(f.length());
    // System.out.println(f1.length());
}
}
