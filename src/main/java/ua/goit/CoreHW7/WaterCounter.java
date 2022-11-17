package ua.goit.CoreHW7;
//Бувають такі тексти, після прочитання яких ми не отримуємо нову інформацію. У таких текстах
// дуже багато води - марної інформації.
//Деякі автори текстів люблять додавати по два і більше пробілів між словами, і виходить, що загалом
// текст вийшов довшим (символів більше), але користі в тексті не додалося.
//Напиши програму, яка визначатиме такі водянисті тексти.
//Водянистістю називатимемо ставлення числа прогалин у тексті до загальної кількості символів у тексті.
//
// Напиши клас WaterCounter. У цьому класі створи метод public double count(String text). Він приймає
// рядок і повертає водянистість - відношення кількості пробілів у тексті до загальної кількості
// символів у тексті.
//
//Ніяк не округляй результат, що повертається.

class WaterCounter {
    public double count(String text) {
        char[] space = new char[]{' '};
        double result = 0;
        int countSpace = 0;

        countSpace = countChar(text, space);
        result = (double) countSpace/text.length();

       // System.out.println("result = " + result);
        return  result;
    }


    public int countChar(String phrase,char[] punct) {
        char[] words = phrase.toCharArray();
        int countResult = 0;
        int index = 0;
        //підраховує кількість слів у массиві
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < punct.length; j++) {
                if (words[i] == punct[j]) {
                    countResult++;
                  //  System.out.println("countResult = " + countResult);
                }
            }
        }

        return countResult;
    }


}


class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}