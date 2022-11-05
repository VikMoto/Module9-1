package org.example;
import java.util.*;
public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance >=0) {
            return distance;
        }else {
            return -distance;
        }
    }
    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;

        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }

        return count * price;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }

        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        }

        int extraDistance = distance - 1000;
        return 1000 + extraDistance * 5;
    }



    public void calculateMaxPower() {
        Scanner in = new Scanner(System.in); //Створили об'єкт Scanner
        int engineOne = in.nextInt();
        int engineTwo = in.nextInt();
        int engineThree = in.nextInt();
        int engineMax = 0;
        float maxPower = 0;

        if (engineOne > engineMax) {engineMax = engineOne;}
        if (engineTwo > engineMax) {engineMax = engineTwo;}
        if (engineThree > engineMax) {engineMax = engineThree;}

        if(engineMax < 10) {
            maxPower = engineMax * 0.7f;
        } else if (engineMax >=10 && engineMax <= 100 ) {
            maxPower = engineMax * 1.2f;
        } else if (engineMax >100 ) {
            maxPower = engineMax * 2.1f;
        }

        System.out.print(maxPower);
        in.close();
    }

    public String getMyPrizes(int ticket) {
        String getResult10 = "crystall";
        String getResult7 = "chip";
        String getResult200 = "coin";
        String getResultEnd = "";

        if((ticket/10)*10 == ticket) {
            getResultEnd = getResult10;
        }
        if(ticket%10 == 7) {
            getResultEnd = getResult7;
        }
        if(ticket > 200) {
            getResultEnd = getResult200;
        }
        if((ticket/10)*10 == ticket && ticket%10 == 7 && ticket > 200 ) {
            getResultEnd = getResult10 + " " + getResult7 + " " + getResult200;
        }
        if((ticket/10)*10 == ticket && ticket%10 == 7) {
            getResultEnd = getResult10 + " " + getResult7;
        }
        if((ticket/10)*10 == ticket  && ticket > 200 ) {
            getResultEnd = getResult10  + " " + getResult200;
        }
        if(ticket%10 == 7 && ticket > 200 ) {
            getResultEnd = getResult7 + " " + getResult200;
        }


        return  getResultEnd;
    }
    //etalon code of getMyPrizes!!!!!!!!!!
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    /*public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }

        return result.strip();
    }*/

    public boolean isHangarOk(int side1, int side2, int price) {
        int squearHangar = 0;
        int longSide =0;
        int shortSide =0;
        boolean isHangOk;
        squearHangar = side1 * side2;
        if(side1 < side2) {
            longSide = side2;
            shortSide = side1;
        } else {
            longSide = side1;
            shortSide = side2;
        }

        if(squearHangar >=1500 && shortSide >= longSide/2 && price <= squearHangar*1000) {
            isHangOk = true;
        }else {
            isHangOk = false;
        }
        return isHangOk;
    }


    //Test output

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
       /* System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(1001));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(380));*/

        //Should be true
        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}
