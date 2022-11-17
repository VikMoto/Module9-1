package ua.goit.CoreHW6;

class RectangleArea {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public RectangleArea(int[] coords) {
         this.startX =  coords[0];
        this.startY =  coords[1];
        this.endX =  coords[2];
        this.endY =  coords[3];
    }
    public int getArea() {
        int X = endX-startX;
        int Y = endY-startY;
        return Math.abs(X*Y);
    }
}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {28, 20, 33, -4};

        //Expect 100
        //System.out.println(String.valueOf(123));
        System.out.println(new RectangleArea(coords).getArea());
    }
}
