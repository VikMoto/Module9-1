package ua.goit.CoreHW7;
/*
Напиши клас ShortWordCounter. У цьому класі створи метод public int count(String phrase,
int minLength). Метод приймає на вхід рядок phrase та змінну minLength. Повертає кількість слів,
які менші або рівні ніж minLength.

Рядок складається виключно з цифр та букв англійського алфавіту, слова розділені одним пробілом,
знаків пунктуації немає.
 */

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        String input = phrase.toLowerCase();
        String[] inputPhrase = input.split(" ");


        int result = 0;

        for (int i = 0; i < inputPhrase.length; i++) {

            if (inputPhrase[i].length() <= minLength) {
                result++;
            }

        }
        return  result;
    }
}

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}