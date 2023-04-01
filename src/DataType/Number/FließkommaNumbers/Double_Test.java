package DataType.Number.FließkommaNumbers;

public class Double_Test {

    public static void main(String[] args) {
        double x = 1001209312.50 ; // 4 byte
        double y = 2123123112.20f;
        double z = x + y;

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println("Result = " + z);
    }
}
