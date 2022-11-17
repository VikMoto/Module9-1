package ua.goit.CoreHW7;
/*
Напиши клас PalindromeCounter. У класі створи метод public int count(String phrase).
Метод приймає рядок, який складається зі слів, розділених одним пробілом, і повертає
кількість паліндромів у цьому рядку.
 */

class PalindromeCounter {
    public int count(String phrase) {
        String input = phrase.toLowerCase();
        String[] inputPhrase = input.split(" ");
        String temp;

        int result = 0;

        for (int i = 0; i < inputPhrase.length; i++) {
            temp = new StringBuilder(inputPhrase[i]).reverse().toString();
            if (inputPhrase[i].equals(temp)) {
                result++;
            }

        }
        return  result;
    }

}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}