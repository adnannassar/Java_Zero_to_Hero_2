package Grundlagen.WrapperClasses;

public class OtherWrapperClasses {
    public static void main(String[] args) {
        // boolean
        boolean isTrue = Boolean.parseBoolean("true");
        boolean isFalse = Boolean.parseBoolean("false");
        int compareResult = Boolean.compare(isFalse, isTrue);

        if(compareResult == 0){
            System.out.println("True the are the same");
        }else{
            System.out.println("True the are not the same");
        }

    }
}
