package ua.goit.CoreHW7;
//При пошуку та подальшому аналізі тексту буває корисно виділити всі цифри з тексту в окремий масив
// для подальшого аналізу.
//
//Напиши клас DigitExtracter. У цьому класі створи метод public int[] extract(String text). Метод
// приймає рядок і повертає масив усіх цифр, які є в цьому рядку, в тому ж порядку, в якому вони
// зустрічаються.



import java.util.Arrays;
class DigitExtracter {
    public int[] extract(String text) {
        String textIn = text.toLowerCase();
        int[] result;

        String[] endPhrase;
        String endPhraseDigi = "";
        boolean result1 = false;
        boolean result2 = false;
        boolean result3 = false;

        int countDigit = 0;
        int countMathExp = 0;


        char[] digiData = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


        result = addAllCharsFromText(textIn,digiData);

        return  result;
    }
    /**
     * Adds all set of characters from string.
     *
     * @param textIn    string
     * @param digiData  character to add
     */
    private int[] addAllCharsFromText(String textIn, char[] digiData) {
        int i = textIn.length();
        int[] result;
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

        result = new int[count];

        index = 0;
        mainloop:
        for (int j = 0; j < i; j++) {
            char c = textIn.charAt(j);
            for (char aChar : digiData) {
                if (c == aChar) {
                    result[index] = Character.getNumericValue(c);


                    index++;
                    continue mainloop;
                }
            }
        }


        return result;
    }


}



class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2058460");

        //[5, 2, 0, 5, 8, 4, 6, 0]
        System.out.println(Arrays.toString(extracted));
    }
}
