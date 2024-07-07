import java.util.Scanner;

/**
 * arraysort
 */
public class arraysort {

    public static void main(String[] args){
        int ar[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<ar.length ; i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0 ; i<ar.length ; i++){
            for(int j=i+1 ; j<ar.length ; j++){
                if(ar[i]>ar[j]){
                    int t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }

            }
        }
        for(int i=0 ; i<ar.length ; i++){
            System.out.print(ar[i]);
        }


    }
}