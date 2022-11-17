package ua.goit.CoreHW5;

public class Stars {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return countStars(count);
    }

    public static void main(String[] args) {
        System.out.println(countStars(5735));
    }


    public static String countStars(int count) {
        String[] denominationFigure = new String[]{"X", "Y", "Z", "*"};
        int[] denominationStars = new int[]{1000, 100, 10, 1};
        String countStar = "";
        int result = 0;
        int inc = 0;
        int sum = count;
        while (inc < 4) {
            result += sum / denominationStars[inc];
            sum = sum % denominationStars[inc];
            countStar += countFigure(denominationFigure[inc],result);
            result = 0;
            inc++;
        }
        return countStar;
    }

    public static String countFigure(String denFigure, int count ) {
        String countFigure = "";
        int inc = 0;
        while (inc < count) {
            countFigure += denFigure;
            inc++;

        }
        return countFigure;
    }
}


