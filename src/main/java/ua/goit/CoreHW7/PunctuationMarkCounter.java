package ua.goit.CoreHW7;

class PunctuationMarkCounter {
    /*
    Напиши клас PunctuationMarkCounter. У цьому класі створи метод public int count(String phrase).
     Він приймає рядок, і повертає кількість знаків пунктуації у цьому рядку.

Знаками пунктуації вважаються наступні: ., ,, !, :, ;.
     */
    private static final char[] punct = new char[]{'.', ',' , '!', ':', ';'};
    public PunctuationMarkCounter() {
    }

    public int countChar(String phrase,char[] punct) {
        char[] words = phrase.toCharArray();
        int countResult = 0;
        int index = 0;
        //підраховує кількість слів у массиві
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (words[i] == punct[j]) {
                    countResult++;
                }
            }
        }

        return  countResult;


    }
}

/*
class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.countChar("Hello, world!"));

        //1
        System.out.println(counter.countChar("This is Sparta!"));

        //1
        System.out.println(counter.countChar("End."));
    }
}*/