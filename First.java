 class InnerFirst 
    {
        void print1()
        {
            System.out.println("HeLLO WORLD!");
        }
    }

public class First {
    public static void main(String[] args) {
        InnerFirst msg = new InnerFirst();
        msg.print1();
    }
}
    
