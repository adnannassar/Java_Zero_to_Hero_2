package Grundlagen.DataType.Number.NormalNumbers;

public class Short_Test {
    public static void main(String[] args) {
        short x = 20000 ; // 2 byte
        short y = 2;
        int z = x + y;

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println("Result = " + z);
    }
}
