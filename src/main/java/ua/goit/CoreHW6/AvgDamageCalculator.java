package ua.goit.CoreHW6;

public class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        try {
            for (int sampleValue : samples) {
                sum += sampleValue;
            }

            return sum / samples.length;
        } catch (ArithmeticException ex) {
            return 0;
        }
    }
}

class AvgDamageCalculatorTest {
    public static void main(String[] args) {
        //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[] {2, 4, 6, 8}));

        //0
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0]));
    }
}