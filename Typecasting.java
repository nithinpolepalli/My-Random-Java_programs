public class Typecasting {
    public static void main(String[] args) {
        // DATA TYPE HEIRACHY
        // Byte , Short , Char , Int , Long , Float , Double
        //  Lower <---------------------------------> Higher
        //NARROWING (EXPLICITY) --> Storing high datatype into low dtatype
        int a =20;
        short s = (short)a;
        //WIDENING(IMPLICITY) --> Storing LOW datatype into HIGH dtatype
        int b =30;
        long l = b;
        //GERNALAZATION --> sub class is promoted to superclass datatype
        // parent p = new child();
        //SPECILIZATION -->  superclass is depromoted to subclass datatype
        // child c = (child) new parent();
    }
}
