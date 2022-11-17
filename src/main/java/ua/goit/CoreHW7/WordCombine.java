package ua.goit.CoreHW7;
//Визначний вчений планети Нігон встановив, що якщо з одного слова можна скласти інше слово,
// це слово є зручним .Жителі планети дуже вразилися цим відкриттям, і масово почали перевіряти пари
// слів на їхню зручність . Для цього вони вписують пару слів у пошукову систему Goo, і очікують, що
// пошукова система дасть їм відповідь.
//Допоможи жителям, і напиши програму, яка визначатиме - чи можна з одного слова скласти інше. Літери
// можна використовувати скільки завгодно разів. Регістр літер не враховуй.
//Напиши клас WordCombine. У цьому класі створи метод public boolean canCombine(String sourceWord,
// String targetWord). Він має повертати true лише в тому випадку, якщо із слова sourceWord можна скласти
// слово targetWord.

class WordCombine {
   public boolean canCombine(String sourceWord, String targetWord) {
        String textSuorce = sourceWord.toLowerCase();
        String targetText = targetWord.toLowerCase();
        char[] result;
        char[] result2;
        String endPhrase;
        boolean resultBool = false;
        char[] digiData = targetText.toCharArray();


        result = addAllCharsFromText(textSuorce,digiData);
        endPhrase = String.valueOf(result);

  //check caould we bbuild targetWord founded chars
        result2 = addAllCharsFromText(endPhrase,digiData);

        if (result.length == result2.length) {
            for (int i = 0; i < result.length; i++) {
                if (result[i] == result2[i]) {
                    resultBool = true;
                } else resultBool = false;
            }
        } else resultBool = false;



        return resultBool;
    }
    /**
     * Adds all set of characters from string.
     *
     * @param textIn    string
     * @param digiData  character to add
     */
    private char[] addAllCharsFromText(String textIn, char[] digiData) {
        int i = textIn.length();
        char[] result;
        int count = 0;
        int index ;
        StringBuilder stringbuffer = new StringBuilder(i);

        mainloop:
        for (int j = 0; j < i; j++) {
            char c = textIn.charAt(j);
            for (char aChar : digiData) {
                if (c == aChar) {
                    count++;
                    continue mainloop;
                }
            }
        }

        result = new char[count];

        index = 0;
        mainloop:
        for (int j = 0; j < i; j++) {
            char c = textIn.charAt(j);
            for (char aChar : digiData) {
                if (c == aChar) {
                    result[index] = c;


                    index++;
                    continue mainloop;
                }
            }
        }


        return result;
    }


}



class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}