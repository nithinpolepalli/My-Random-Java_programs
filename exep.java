public class exep{
    static int a,b;
    public static void main(String[] args) {
        
        try {
            int x = 8/0;
            exep.sum(99,89,10);
            
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        }
        catch(IllegalArgumentException ilae){
            System.out.println("heHe");
        }
    }
    static void sum(int a , int b){
         System.out.println(a+b);
     }
}