import java.util.*;
public class Stocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of days");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter "+ n +" elements");
        for(int k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
        int max=0;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                int value = a[j]-a[i];
                if(value > max)
                       max=value; 
            } 
        }
        if(max>0){
            System.out.println(max);
        }
        else{
            System.out.println(0);
        }
    }
}