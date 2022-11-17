package ua.goit.CoreHW7;
/*
Напиши клас WordDeleter. У цього класу створи метод public String remove(String phrase, String[] words). Цей метод приймає рядок phrase,
який складається з окремих слів, розділених рівно одним пробілом, і видаляє з неї всі слова, вказані в масиві words.

Повертається рядок без цих слів. Слова, що залишилися, повинні так само бути розділені рівно одним пробілом.
 */

class WordDeleter {
    public static String remove(String phrase, String[] words) {
       // phrase = phrase.toLowerCase();
        String result = phrase;
        for (int i = 0; i < words.length; i++) {
             result = result.replaceAll("(\\1...)" + words[i] ,"" ); //"(\\1...)" +
            System.out.println("result  " + result);
        }
        result = DoubleSpaceCleaner.clean(result);
        return result.trim();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
       // System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is world", new String[] {"is"}));
    }
}