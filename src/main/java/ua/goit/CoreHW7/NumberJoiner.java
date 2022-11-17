package ua.goit.CoreHW7;
//Над пошуковою системою Goo крім тебе працюють інші програмісти. Одне з
// твоїх завдань - робити код-рев'ю їх роботи, і робити рефакторинг повільного
// або неправильно працюючого коду.
//Ти знайшов приклад такого коду.
//Є клас, який склеює масив чисел у рядок. Він працює правильно, але повільно,
// тому що в циклі додає до рядка число. Постійно виділяється оперативна пам'ять,
// і якщо давати на вхід великі (десятки тисяч даних) масиви чисел, то програма
// сповільниться.
// Перепиши існуючий код класу NumberJoiner з використанням класу StringBuilder,
// щоб позбутися конкатенації рядків у циклі. В іншому програма повинна працювати
// так само.

class NumberJoiner {
    public String join(int[] numbers) {
       // String result = "";
        StringBuilder result = new StringBuilder();
        for(int number: numbers) {
            result.append(number);
        }
        return result.toString();


       /* for(int i = 0; i < n; i++) {
            result.append(i);
        }

        System.out.println(result);
        return result.toString();*/

    }

}


class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}