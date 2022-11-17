package ua.goit.CoreHW7;
//При аналізі тексту важливо враховувати, скільки у ньому є власних назв - це
// імена людей, назви планет, і т.д.
//Власним ім'ям вважається слово, в якому є хоча б дві літери. Перша літера
// має бути великою, решта - маленькими.
//Напиши програму, яка рахуватиме кількість власних назв у тексті.
//Напиши клас NameCounter. У цьому класі створи метод
// public int count(String text). Він повертає кількість власних назв
// відповідно до алгоритму, описаного вище.

class NameCounter {
    public int count(String text) {
        String[] textArr = text.split(" ");
        int indexEmail = 0;
        int result = 0;
        //search char @ in arrays of string
        for (int i = 0; i < textArr.length; i++) {
            if (!textArr[i].toLowerCase().equals(textArr[i]) && !textArr[i].toUpperCase().equals(textArr[i]) ) result++;
        }

        return result;
    }

}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}