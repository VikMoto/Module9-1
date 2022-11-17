package ua.goit.CoreHW7;
//Ти продовжуєш розгрібати код пошукової системи Goo і знайшов цікаве місце.
//Є метод, який приймає масив слів, і робить із них рядок, розділяючи слова
// пробілами. При цьому слова перетворюються. Якщо слово довше ніж 3 символи,
// воно наводиться в нижній регістр. Інакше воно наводиться у верхній регістр.
//
//Програма працює правильно, але повільно. Якщо дати їй на вхід масив завдовжки
// десятки тисяч рядків, це буде помітно. Це відбувається через конкатенацію
// рядків у циклі.
//
//Перепиши існуючий код класу PhraseMaker з використанням класу StringBuilder,
// щоб позбутися конкатенації рядків у циклі. В іншому програма повинна працювати
// так само.

class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }
            result.append(word);

            if (i != words.length - 1) {
               result.append(" ");
            }
        }

        return result.toString();

    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}