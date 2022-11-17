package ua.goit.CoreHW5;

public class SpaceshipCalc {
   final int calculateAirBalloons(int passengerCount) {
        return 10 * passengerCount;
    }
    final int calculateBookCount(int passengerCount) {
       return 2 * passengerCount;
    }

    public static void main(String[] args) {
        SpaceshipCalc calc = new SpaceshipCalc();
        System.out.println(calc.calculateAirBalloons(75));
        System.out.println(calc.calculateBookCount(75));
    }
}
