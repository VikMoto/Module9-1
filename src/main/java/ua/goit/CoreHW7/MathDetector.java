package ua.goit.CoreHW7;
//Коли пошукова система шукає якийсь текст на тему "Математика", то знайдені тексти оцінюються за
// параметром - чи є у тексті математичні вирази.
//Такі тексти ранжуються вище.
//Для пошукової системи Goo текст вважається таким, що в ньому є математичні вирази, якщо:
//у тексті є хоча б один символ =;
//у тексті є хоча б один математичний оператор +, -, *, /;
//у тексті є мінімум 2 цифри.
//Напиши клас MathDetector. У цьому класі створи метод public boolean isMath(String text). Цей метод приймає
// текст і повертає true, якщо в тексті є математичні вирази згідно з алгоритмом вище.

class MathDetector {

    public boolean isMath(String text) {
        String textIn = text.toLowerCase();
        boolean resultBool = false;

        String endPhrase = "";
        String endPhraseDigi = "";
        boolean result1 = false;
        boolean result2 = false;
        boolean result3 = false;

        int countDigit = 0;
        int countMathExp = 0;
        int countEqual = 0;

        String[] digiData = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] mathExpressions = {"+", "-", "*", "/", "="};
        String equalChar = "=";


        for (int d = 0; d < digiData.length; d++) {
           result1 = textIn.contains(digiData[d]);
           if (result1 == true) countDigit++;
        }

        for (int i = 0; i < mathExpressions.length; i++) {
            result1 = textIn.contains(mathExpressions[i]);
            if (result1 == true) countMathExp++;
        }
        result3 = textIn.contains(equalChar);

       // System.out.println("countDigit = " + countDigit);
       // System.out.println("countMathExp = " + countMathExp);

        if (countDigit >= 2 && result3 && countMathExp >= 1) resultBool= true;

        return  resultBool;
    }
    /**
     * Removes set of characters from string.
     *
     * @param textIn    string
     * @param digiData  character to remove
     */
    private String removeChars(String textIn, char[] digiData) {
        int i = textIn.length();
        StringBuilder stringbuffer = new StringBuilder(i);
        mainloop:
        for (int j = 0; j < i; j++) {
            char c = textIn.charAt(j);
            for (char aChar : digiData) {
                if (c == aChar) {
                    continue mainloop;
                }
            }
            stringbuffer.append(c);
        }
        return stringbuffer.toString();
    }

}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //true
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}
