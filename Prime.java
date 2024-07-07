// PRIME NUMBERS BETWEEN TWO NUMBER
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
         p.isprime(num1,num2);
        }


        void isprime(int n1 , int n2){
            int a;
            for(int i=n1 ; i<=n2 ;i++)
            {   a=0;
                for(int j=2 ;j<i;j++){
    
                     if(i%j==0)
                        a++;
            }
              if(a==0)
                  System.out.println(i);
            }
        }
    }
        

