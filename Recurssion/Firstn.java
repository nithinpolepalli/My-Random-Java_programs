package Recurssion;
class Sol {
int sum(int n)
{
    if(n==0)
         return 0;
    else
         return n+sum(n-1);
}
    
}
public class Firstn {
    public static void main(String[] args) {
        
    

    int n=10;
    Sol s = new Sol();
    System.out.println( s.sum(n));
}
}