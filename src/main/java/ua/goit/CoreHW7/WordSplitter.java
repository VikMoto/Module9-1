package ua.goit.CoreHW7;

import java.util.Arrays;
import java.util.Locale;
import java.lang.*;
/*
Напиши клас WordSplitter. У цьому класі створи метод public String[] split(String phrase).
 Метод приймає на вхід рядок, поділяє його на слова, і повертає масив рядків. Кожен рядок –
 окреме слово.

Словом вважається будь-яка послідовність символів, крім пробілів.

Гарантується, що вхідний рядок містить лише символи англійського алфавіту, цифри та пробіли.
 */

class WordSplitter {
    public WordSplitter() {
    }
    public String[] split(String phrase) {
        String lowPhrase = phrase.toLowerCase(Locale.ROOT);
       //переводить рядок у массив та прибирає пробіли
        String[] words = lowPhrase.split(" ");

        int lengthResult = 0;
        int index = 0;
        //підраховує кількість слів у массиві
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                lengthResult++;
            }
        }
        //save in new Array only words from old Array
        String[] result = new String[lengthResult];

        for (int i = 0; i < words.length; i++) {
              if (!words[i].equals("")) {
                result[index] = words[i];
                index++;
            }
        }
        return  result;
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello g 78 &  world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}