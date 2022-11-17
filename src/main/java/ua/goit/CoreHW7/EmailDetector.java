package ua.goit.CoreHW7;
//Коли Goo сканує сайт, то намагається знайти сторінку "Про автора". Зазвичай, на цій сторінці є email.
//Напиши програму, яка визначатиме, чи є у тексті email.
//Email вважається знайденим, якщо є рядок виду xx@xx, де замість x - будь-який символ, крім пробілу.
//Напиши клас EmailDetector. У цьому класі створи метод public boolean isPresent(String text). Він
// приймає рядок та повертає true лише в тому випадку, якщо в ньому є email згідно з описаним
// алгоритмом.

class EmailDetector {
    public boolean isPresent(String text) {
        String[] textArr = text.split(" ");
        int indexEmail = 0;
        boolean resultBool = false;
        //search char @ in arrays of string
        for (int i = 0; i < textArr.length; i++) {
             if (textArr[i].contains("@")) indexEmail = i;
        }

        //if lenght searched element with @ not begin or end char "@" then result is true
         if(textArr[indexEmail].startsWith("@") || textArr[indexEmail].endsWith("@")   ) resultBool = false;
         else if (textArr[indexEmail].length() >=5) resultBool = true;




        //System.out.println("textArr[indexEmail] = " + textArr[indexEmail]);
        return resultBool;
    }

}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("m@bi a yv binam q upju"));
    }
}
