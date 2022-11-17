package ua.goit.CoreHW7;
/*
Напиши клас SensitiveDataSearcher. У цього класу створи метод public boolean isSensitiveDataPresent(String phrase).
Він приймає рядок і повертає true, якщо у рядку є чутливі дані.
 */

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        phrase = phrase.toLowerCase();
        boolean result = false;
        String endPhrase = "";
        String[] sensitiveData = {"pass", "key", "login", "email"};


         endPhrase = WordDeleter.remove(phrase,sensitiveData);
         if (!endPhrase.equalsIgnoreCase(phrase)) result = true;

        return  result;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}