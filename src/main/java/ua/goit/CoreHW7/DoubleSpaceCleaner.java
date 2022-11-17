package ua.goit.CoreHW7;

class DoubleSpaceCleaner {
    /*
    Напиши клас DoubleSpaceCleaner. У цього класу створи метод public String clean(String phrase).
    Метод приймає на вхід рядок, і повертає його, тільки без подвійних пробілів (між кожним словом
    повинен залишитися рівно один пробіл). Також метод повинен видалити всі пробіли на початку та
    в кінці рядка.
     */
    public DoubleSpaceCleaner() {
    }
    public static  String clean(String phrase) {
       String result;
        while(phrase.contains("  ")) {
            String replace = phrase.replace("  ", " ").trim();
            phrase=replace;
        }

        phrase.trim();
        return  phrase;
    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("     Hello           World       "));
    }
}