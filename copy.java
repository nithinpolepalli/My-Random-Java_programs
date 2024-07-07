import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class copy{
public static void main(String[] args) throws IOException {
    FileReader fi = new FileReader("textt");
    //BufferedReader br = new BufferedReader(new InputStreamReader(fi)); 
FileWriter fo = new FileWriter("myfile.txt",true);
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
    int ch;
    while((ch=fi.read())!=-1){
        fo.write((char)ch);
    }
    fi.close();
    fo.close();
   // bw.close();
}
}