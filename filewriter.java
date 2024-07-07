import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("textt",true);
        fw.write("reddy");
        fw.close();
    }
}
