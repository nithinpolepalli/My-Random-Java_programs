import java.util.Scanner;

public class imageRotation {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int arr1[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        // TRANSPOSE OF MATRIX
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[i][j] = arr1[j][i];
            }
        }
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col/2 ; j++){
                temp = arr[i][j];
                arr[i][j] = arr[i][row-i-1];
                arr[i][row-1] = temp;
            }
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
