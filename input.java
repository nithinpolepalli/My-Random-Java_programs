import java.io.*;
import java.util.StringTokenizer;

class input{
    public static void main(String[] args) throws IOException {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bd.readLine();
        StringTokenizer s = new StringTokenizer(str1, " ");
        String s1 = s.nextToken().trim();
        String s2 = s.nextToken().trim();
        String name = s1;
        int age = Integer.parseInt(s2);


        System.out.println(age+" "+name);

    }
}