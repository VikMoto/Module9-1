package ua.goit.CoreHW7;

class BigOrSmall {
    public String calculate(String text) {
        String result = "";
        int uppers = 0, lowers = 0, other = 0;

        for (char c:text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                ++uppers;
            }else if (Character.isLowerCase(c)) {
                ++lowers;
            }
            else
                ++other;
        }

        if (lowers > uppers) result = "Small";
        if (lowers < uppers) result = "Big";
        if (lowers == uppers) result = "Same";
        return result;
    }

}


class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}