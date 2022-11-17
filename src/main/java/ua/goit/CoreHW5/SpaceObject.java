package ua.goit.CoreHW5;

abstract class SpaceObject {
}
abstract class Planet extends SpaceObject {
}

class Mars extends Planet {

}

class  Moon extends SpaceObject {

}

class PlanetTester {
    private String result;
    Planet planet;

    {
        planet = new Mars();
    }


    public String test(SpaceObject object) {
        if(object instanceof Planet) {result = "planet";}
        else {
            result = "not planet";
        }
        return result;
    }
}

class TestProg {
    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be true
        System.out.println(tester.test(new Moon())); //Should be false
    }
}