

class exp{
    public static void main(String[] args) {
        exp e = new exp();
        e.call();
    }
     void validateage(int a)  {
        if(a<0){
            throw new Myexp();
        }
    }
    void call(){
        this.validateage(-9);
    }
}
class Myexp extends RuntimeException{
    public Myexp(){
        
    }
    public Myexp(String s)
    {
        super(s);
        System.out.println("helloo");
    }

}