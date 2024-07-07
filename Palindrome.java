import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome p = new Palindrome();
        String s = sc.next();
    
    boolean b = p.ispalindrome(s);
    if(b){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a Palindrome");
    }
}
    boolean ispalindrome(String str){
         int left = 0;
         int right = str.length()-1;
         while (left<right) {
           if(str.charAt(left) != str.charAt(right)){
            return false;
           }
           left++;
           right--;
         }
         return true;
    }
}

