public class ValueToDigit {
    public static void main (String []args) {
        final int value = 21442;
        final int firstDevider = 10000, secondDevider = 1000,thirdDevider = 100,fourthDevider = 10;
        int remainder;

        int firstDigit = findDigit(value,firstDevider);
        remainder = findRemainder(value,firstDevider);

        int secondDigit = findDigit(remainder,secondDevider);
        remainder = findRemainder(remainder,secondDevider);

        int thirdDigit = findDigit(remainder,thirdDevider);
        remainder = findRemainder(remainder,thirdDevider);

        int fourthDigit = findDigit(remainder,fourthDevider);
        remainder = findRemainder(remainder,fourthDevider);

        showResult(firstDigit);
        showResult(secondDigit);
        showResult(thirdDigit);
        showResult(fourthDigit);
        showResult(remainder);

    }

    public static int findRemainder(int value, int devider){
       int result = value%devider;
       return result;
    }

    public static int findDigit (int value, int devider){
        int result = value/devider;
        return result;
    }

    public static void showResult (int Digit){
        System.out.println(Digit);

    }
}
