package DataType.Number.NormalNumbers;

public class Long_Test {
    public static void main(String[] args) {
        long x = 20000 ; // 8 byte
        long y = 2;
        long z = x + y;

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("Result = " + z);
    }
}
