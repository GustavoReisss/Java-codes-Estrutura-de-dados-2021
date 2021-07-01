public class TiposLimites2 {
    public static void main(String args[]) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        float resultA = f * b;
        int resultB = i / c;
        float resultC = (f * b) + (i / c);
        double resultD = d * s;
        double resultE = (f * b) + (i / c) - (d * s);

        System.out.println("a: " + resultA);
        System.out.println("b: " + resultB);
        System.out.println("c: " + resultC);
        System.out.println("d: " + resultD);
        System.out.println("e: " + resultE);
    }
}
