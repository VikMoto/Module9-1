package ua.goit.CoreHW7;
//Остання частина, яку тобі потрібно відрефакторити в пошуковій системі Goo – це код,
// що виділяє імена.
//Є масив рядків, кожен рядок – це ім'я та прізвище, через пробіл. Метод
// String parse(String[] names) приймає масив таких рядків, виділяє з кожної лише
// ім'я, і ​​повертає рядок, що складається тільки з імен, розділених комою
// та пробілом.
//Проблема така сама, є конкатенація рядків у циклі, що призведе до проблем на
// великих даних.
//
//Зроби рефакторинг класу NameParser, перепиши метод String parse(String[] names),
// щоб позбутися конкатенації рядків у циклі. Використовуй замість конкатенації
// клас StringBuilder.
//
//Важливо!. Збережи код вирішення поточного завдання, він знадобиться тобі при
// вирішенні наступного завдання.

class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];
            result.append(firstName);

            if (i != names.length - 1) {
                result.append(", ");
            }
        }


        return result.toString();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}