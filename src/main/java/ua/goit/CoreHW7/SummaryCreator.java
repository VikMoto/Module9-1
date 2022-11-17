package ua.goit.CoreHW7;
//Напиши клас SummaryCreator. У цьому класі напиши метод public String create(String text). Метод приймає рядок,
// і повертає його короткий варіант згідно з алгоритмом, описаним у теорії.
//Коли пошукова система Goo знайшла довгий текст і його потрібно показати користувачеві на сторінці знайдених
// результатів, то такий текст потрібно обрізати.
//Текст обрізається за таким алгоритмом:
//якщо довжина тексту 15 або менше символів - текст залишається як є;
//якщо довжина тексту 16 і більше символів - то беруться перші 15 символів. Якщо наступний символ після перших 15
// символів не є пробілом - до результату ще додаються три точки ... (тому що ми розрізали якесь слово).

class SummaryCreator {
    public String create(String text) {
        String result = "";
        char[] input = text.toCharArray();

         if(text.length() > 16){
             result = text.substring(0,15);

             if (!(input[15] == ' ')) result += "...";
        }else result = text;

         return result;
    }
}

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}