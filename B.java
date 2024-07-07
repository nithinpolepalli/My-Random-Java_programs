
 
class pratice {
    int a;
    void disp1(){
        System.out.println("super");
    }
}
public class B extends pratice{
    void disp2(){
        System.out.println("sub");
    
    }
    public static void main(String[] args) {
        pratice p = new B();
        B c = (B) new pratice();
        c.disp1();
        c.a=77;
        c.disp2();
        // B b = (B)p;
        // p.disp1();
        // p.a=90;
        // b.a=9;
    }
}