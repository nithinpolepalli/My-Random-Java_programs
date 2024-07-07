//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args)throws IOException {
        int c;
       
            
            FileReader fr = new FileReader("textt");
            while((c = fr.read())!=-1){
                
                System.out.print((char)c);
           
    }
    fr.close();
}
}