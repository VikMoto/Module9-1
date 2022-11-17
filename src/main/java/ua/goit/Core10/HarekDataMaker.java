package ua.goit.Core10;
import java.util.*;
class HarekDataMaker {
    public String aggregateSingle(String name, String age, String planet) {
        return ("name - " + name + ", age - " + age + ", planet - " + planet);
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {
        String[] tempArr = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            tempArr[i] = aggregateSingle(names[i],String.valueOf(ages[i]),planets[i]);
        }
        return tempArr;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"hter", "pou", "diz"};
        int[] ages = new int[] {30, 35, 70};
        String[] planets = new String[] {"Mars", "Earth", "Jupiter"};

        HarekDataMaker harekDataMaker = new HarekDataMaker();

        System.out.println(harekDataMaker.aggregateSingle(names[0], Integer.toString(ages[0]), planets[0]));
        System.out.println("###");

        System.out.println(Arrays.toString(harekDataMaker.aggregateAll(names, ages, planets)));
    }
}