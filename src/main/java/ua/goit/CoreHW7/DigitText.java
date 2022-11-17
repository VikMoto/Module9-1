package ua.goit.CoreHW7;
//Напиши клас DigitText. У цьому класі створи метод public boolean detect(String text). Він приймає рядок
// та повертає true у випадку, якщо рядок складається виключно з цифр та пробілів.

class DigitText {
    public boolean detect(String text) {
        text = text.toLowerCase();
        boolean result = false;
        String endPhrase = "";
        String[] sensitiveData = {"1", "2", "3", "4", "5", "6", "7", "8","9", "0", " " };


        endPhrase = WordDeleter.remove(text,sensitiveData);
        if (endPhrase.length() == 0) result = true;

        return  result;
    }

}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}