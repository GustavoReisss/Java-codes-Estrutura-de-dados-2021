public class TiposLimites1 {
    public static void main(String args[]) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        // byte e = a * b / c; - error: incompatible types: possible lossy conversion
        // from int to byte
        byte f = 50;
        // byte g = f * 6; - error: incompatible types: possible lossy conversion from
        // int to byte

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        // System.out.println("e: " + e);
        System.out.println("f: " + f);
    }
}
