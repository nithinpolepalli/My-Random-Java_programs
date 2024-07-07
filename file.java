import java.io.*;
public class file {
    public static void main(String[] args) throws IOException{
        char ch;
        //int a=0;
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("myfile.txt");
        ch  =(char) dis.read();
        fout.write(ch);
        fout.close();

    }
}
