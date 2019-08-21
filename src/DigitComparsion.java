/*Задача 2.
Есть целое положительное число (long). Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.

У числа 15875:
	Наименьшее число: 1
	Наибольшее число: 8
*/

public class DigitComparsion {
    public static void main(String[] args) {

        long value = 1234567890;
        boolean isFinish = true;
        long minValue = Long.MAX_VALUE, maxValue = Long.MIN_VALUE;

        long digit;

        do{
            if (value < 10 ) isFinish = false;

            digit = value%10;

            if (digit > maxValue) maxValue = digit;
            if (digit < minValue) minValue = digit;

            value = value/10;
        }while(isFinish);

        System.out.println("Наименьшее число: "+minValue + " ; Наибольшее число: " + maxValue);
    }
}
