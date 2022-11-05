package org.example;

public class ArlanHelper {

    public static String drawQuad(int n) {
        int number = 0;
        int numberEner = 0;
        String star = "*";
        String quad = "";
        while(number <  n) {
            numberEner = 0;
            while(numberEner <  n) {
                quad += star;
                numberEner++;
            }
            quad += "\n";
            number++;
        }

        return quad;
    }

    public static String drawRect(int width, int height, char c) {
        int number = 0;
        int numberEner = 0;
        String star = "" + c;
        String rect = "";
        while(number <  height) {
            numberEner = 0;
            while(numberEner <  width) {
                rect += star;
                numberEner++;
            }
            rect += "\n";
            number++;
        }

        return rect;
    }

    public String drawLine(int length) {
        int number = 0;
        int numberStars = 0;
        String result = "";
        String star = "*";
        String rect = "#";

        while(number <  length/2) {
            result += star ;
            result += rect ;
            number++;
        }
        if ((length)%2 != 0) {
            result += star;
        }

        return result;
    }

    /*very good realization !!!!!!!!!!!!!!!!!!
    public String drawLine(int length) {
        String result = "";

        boolean star = true;

        while (length > 0) {
            result += star ? '*' : '#';
            star = !star;
            length--;
        }

        return result;
    }     */


    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        //System.out.println(helper.drawQuad(9));
        //System.out.println(helper.drawRect(6, 13, 'e'));

        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(2));

    }
}
