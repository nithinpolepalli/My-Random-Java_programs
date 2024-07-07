import java.util.Scanner;

public class BinaryConv {
    public static void main(String[] args) {
        double value=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length()-1;
        for(int i=0;i<=len;i++){
            char c =str.charAt(i);
            if(c=='1'){
                
                value=value + Math.pow(2,(len-i));
            }
        }
        int a = (int)value;
        System.out.println(a);
        
    }
}
