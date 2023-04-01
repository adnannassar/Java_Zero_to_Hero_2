package DataType.Number.FließkommaNumbers;

public class Float_Test {

    public static void main(String[] args) {
        float x = 100.50f ; // 8 byte
        float y = 2.20f;
        double z = x + y;

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println("Result = " + z);
    }
}
