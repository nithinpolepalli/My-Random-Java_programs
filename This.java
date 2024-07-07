public class This {
    public static void main(String arr[])
    {
        int a=10,b=20;
        Red r = new Red();
        int c= r.sum(a,b);
        System.out.print(c);
    }
}
    class Red{
        int p,q;
    int sum(int p,int q)
    {   
         this.p=p;
         this.q=q;
        
        return p+q;
    }
}
