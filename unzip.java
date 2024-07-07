import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class unzip {
    public static void main(String[] args) throws IOException {
    FileInputStream fi = new FileInputStream("myfile2.txt");
    //BufferedReader br = new BufferedReader(new InputStreamReader(fi)); 
FileOutputStream fo = new FileOutputStream("myfile3.txt");
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
InflaterInputStream ios = new InflaterInputStream(fi);
    int ch;
    while((ch=ios.read())!=-1){
        fo.write((char)ch);
    }
    fi.close();
    ios.close();
}
}