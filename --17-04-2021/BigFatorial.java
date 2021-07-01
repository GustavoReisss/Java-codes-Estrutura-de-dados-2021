import java.math.BigInteger;

public class BigFatorial {
    public static void main(String[] args){
        BigInteger n = new BigInteger("150");

        BigInteger f = BigInteger.ONE;
        
        for(BigInteger i = new BigInteger("2"); i.compareTo(n) != 1; i=i.add(BigInteger.ONE)){
            f = f.multiply(i);
        }
        System.out.println(f);
    }
}
