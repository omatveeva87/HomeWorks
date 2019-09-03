/*Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово,
формирует из новых слов предложение и выводит его на экран.*/

import java.util.Scanner;

public class Sentence {

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");

        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String[] allWords = sentence.split(" ");

        for (int i = 0; i < allWords.length; i++)
        {
            allWords[i] = revertWord(allWords[i]);
        }

        sentence = String.join(" ", allWords);
        System.out.println(sentence);
    }

    public static String revertWord(String word) {
        char[] ch = word.toCharArray();
        for (int i = 0 , j = word.length()-1; i < word.length()/2; i++, j-- ){
            char tmp = ch[j];
            ch[j] = ch[i];
            ch[i] = tmp;
        }

        return String.valueOf(ch);
    }
}

