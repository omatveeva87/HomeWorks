/*Задача 3.
Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.
*/
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayNumbers {

    public static void main (String[]args){


        Scanner in;
        int enteredNumber;
        do {
            System.out.println("Enter a number from 10 to 100");
            in = new Scanner(System.in);
            enteredNumber = in.nextInt();
        }
        while (enteredNumber < 10 || enteredNumber > 100);

        int[] numbers = getRandomNumbers(enteredNumber);

        System.out.println("Random array:");
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Multiple Of three:");
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]%3 == 0 && numbers[i] != 0) {
                System.out.print(numbers[i] + "  ");
            }
        }
    }

    public static int[] getRandomNumbers(int arrayLength) {
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(10);
        }
        return arr;
    }
}
