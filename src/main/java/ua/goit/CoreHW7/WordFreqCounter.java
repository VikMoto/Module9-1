package ua.goit.CoreHW7;

class WordFreqCounter {
    /*
Напиши клас WordFreqCounter. У цьому класі опиши метод public float countFreq(String phrase,
String word). Метод приймає на вхід рядок phrase та слово word, і повертає частоту входження слова
у фразу.

Вхідна фраза phrase складається з окремих слів, розділених пробілами. Гарантується, що у вхідному
рядку є лише слова, розділені одиночними пробілами, і немає інших символів (знаків пунктуації).

Програма повинна ігнорувати регістр літер (слова, що складаються з маленьких та великих літер,
вважаються однаковими).
     */

    public float countFreq(String phrase, String word) {
        String input = phrase.toLowerCase();
        String[] inputPhrase = input.split(" ");
        String inputWord = word.toLowerCase();

        float result = 0f;

        for (int i = 0; i < inputPhrase.length; i++) {


            if (inputPhrase[i].contains(inputWord)) {
                result++;
            }

        }
        return  result = result/inputPhrase.length;
    }

}


class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}