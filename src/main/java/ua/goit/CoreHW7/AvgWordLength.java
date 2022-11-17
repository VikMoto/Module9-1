package ua.goit.CoreHW7;
//Щоб визначити, чи не є текст пошуковим спамом, корисно оцінити такий параметр, як середня довжина слова
// в тексті . Далі можна порівняти цей показник з аналогічним показником для інших текстів, і у разі великого
// відхилення - придивитися до тексту ближче.
//Напиши програму, яка рахує середню довжину слова у переданому тексті.
//Напиши клас AvgWordLength. У цьому класі напиши метод public double count(String phrase). Метод приймає
// рядок, що складається зі слів, розділених рівно одним пробілом, і повертає середню довжину слова у
// цьому рядку.

class AvgWordLength {
    public double count(String phrase) {
       String[] inputStr = phrase.split(" ");
       int[] lenghtStr = new int[inputStr.length];
       double sumStrLenght = 0;
       double result = 0.00;

        for (int i = 0; i < inputStr.length; i++) {
            lenghtStr[i] = inputStr[i].length();
            sumStrLenght += lenghtStr[i];
            System.out.println("inputStr+lenghtStr = " + inputStr[i] + lenghtStr[i]);
            System.out.println("sumStrLenght = " + sumStrLenght);
        }
        result = sumStrLenght / inputStr.length;
    return result;
    }
}


class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}