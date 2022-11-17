package ua.goit.CoreHW7;
/*
Напиши клас UniqueCharCounter. У цьому класі створи метод public int count(String phrase),
який приймає рядок та повертає кількість унікальних символів у цьому рядку.
Рядок складається лише з цифр, символів англійського алфавіту, та пробілів.
 */

class UniqueCharCounter {

    public int count(String phrase) {
        /*
проверяю индекс для каждого символа, и если он отличается от исходного индекса,
то есть несколько случаев.
изначально делаем число уникальных символов = длиной и делаем строку строчной.
Затем, если персонаж появляется несколько раз, мы вычитаем из числа уникальных символов
количество повторений.
если String s = "abcbc"; метод вернул бы 3 вместо 1  indexOf () всегда возвращает индекс
 в этой строке первого вхождения указанного символа. Таким образом, в первый раз он не
  обнаружит повторяющийся символ, который встречается позже в строке
         */
/**************************************************************/
        /*  String lowerCase = phrase.toLowerCase();
        char characters[] = lowerCase.toCharArray();
        int countOfUniqueChars = phrase.length();
        for (int i = 0; i < characters.length; i++) {
            if (i != lowerCase.indexOf(characters[i])) {
                countOfUniqueChars--;
            }
        }
        return countOfUniqueChars;*/



        //Regex Explained:
        //. соответствует любому символу
        //(...) создает группу захвата, на которую будут ссылаться позже
        //(?=...) создает внешний вид, чтобы смотреть вперед во входе
        //.*? соответствует любому символу и его совпадению (нежелательное соответствие)
        //\\1 соответствует первой группе захвата
        //(?i) устанавливает флаг без учета регистра
        //Итак, регулярное выражение будет искать любой символ, который будет иметь дубликат
        // позже в строке, а затем replaceAll заменит его на пустую строку. Таким образом,
        // ввод типа "cabbacbdbadbcabdaadcb" становится "adcb" (сохраняя последний из каждого
        // уникального символа). Затем, когда строка содержит уникальные символы, эта длина
        // строки является ответом.



        String unique = phrase.replaceAll("(.)(?=.*?\\1)", "");
        return unique.length();
    }

}


class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
