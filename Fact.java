

class Solution {
    int factorial(int n)
    {
        if(n==0 || n==1)
             return 1;
        else
             return n*factorial(n-1);
    }
        
    }
    public class Fact {
        public static void main(String[] args) {
            
        int n=5;
        Solution s = new Solution();
        System.out.println( s.factorial(n));
    }
    }