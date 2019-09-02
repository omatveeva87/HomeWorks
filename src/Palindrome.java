/*Пользователь вводит последовательность символов.
Программа должна определить, является ли последовательность палиндромом.
Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.
*/
import java.util.Scanner;

public class Palindrome {

    public static void main (String[] args){

        System.out.println("Enter a word: ");

        Scanner in = new Scanner(System.in);
        String word = in.next();

        compareLetters(word, word.length());
        showResult(compareLetters((word), word.length()));
    }

   public static boolean compareLetters(String enteredWord, int length) {
       char[] letter = enteredWord.toCharArray();
       boolean isPalindrome = true;
       for (int i = length-1, j = 0; i >= j; i--,j++) {

           if (letter[i] != letter[j]) {

               isPalindrome = false;
               break;
           }
       }
       return isPalindrome;
   }

   public static void showResult(boolean isPalindrome){
       if (isPalindrome == true) {
           System.out.println("Is a palindrome");
       } else
           System.out.println("Is not a palindrome");
   }

}
