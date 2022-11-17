package ua.goit.CoreHW6;

class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance(){
        return (int) Math.round( Math.sqrt( (endY-startY)*(endY-startY)
                                          + (endX-startX)*(endX-startX) ) );
    }

}

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println("Hello world");
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}
