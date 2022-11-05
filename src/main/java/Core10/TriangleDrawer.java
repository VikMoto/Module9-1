package org.example;

public class TriangleDrawer {
    public String drawTriangle(int side) {
        String result = "";

        boolean star = true;
    //System.out.println("*".repeat(3)); //***
        while (side > 0) {
            result += "*".repeat(side);
            side--;
        }

        return result;
    }

}
