package ua.goit.CoreHW5;
/*
Вже є написаний абстрактний клас Season, який представляє певний сезон року. Також є клас
 SeasonTest, за допомогою якого можна вивести інформацію про сезон.
Напиши такі класи, що успадковуються від класу Season:
клас Winter, у якого метод getName() повертає "winter", метод isCold() повертає true;
клас Spring, у якого метод getName() повертає "spring", метод isCold() повертає false;
клас Summer, у якого метод getName() повертає "summer", метод isCold() повертає false;
клас Autumn, у якого метод getName() повертає "autumn", метод isCold() повертає true.
 */


public class SeasonTest {
    public String test(Season season) {
        return season.getName() + (season.isCold() ? " is cold" : " is warm");
    }

    public static void main(String[] args) {
        SeasonTest seasonTest = new SeasonTest();

        //Should be winter is cold
        System.out.println(seasonTest.test(new Winter()));

        //Should be spring is warm
        System.out.println(seasonTest.test(new Spring()));

        //Should be summer is warm
        System.out.println(seasonTest.test(new Summer()));

        //Should be autumn is cold
        System.out.println(seasonTest.test(new Autumn()));
    }
}

abstract class Season {
    public abstract boolean isCold();
    public abstract String getName();

}
class Winter extends Season {
    private String winter = "winter";

    @Override
    public String getName() {
        return winter;
    }

    @Override
    public boolean isCold() {
        return true;
    }
}

class Spring extends Season {
    private String spring = "spring";

    @Override
    public String getName() {
        return spring;
    }

    @Override
    public boolean isCold() {
        return false;
    }
}

class Summer extends Season {
    private String summer = "summer";

    @Override
    public String getName() {
        return summer;
    }

    @Override
    public boolean isCold() {
        return false;
    }
}

class Autumn extends Season {
    private String autumn = "autumn";

    @Override
    public String getName() {
        return autumn;
    }

    @Override
    public boolean isCold() {
        return true;
    }
}
