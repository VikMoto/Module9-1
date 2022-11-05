package org.example;

public class NumberTranslator {
    public static int translate(String romanNumber) {
        int digitName=0;
        String digit;
        digit = romanNumber.strip();
        digit = digit.toLowerCase();

        switch(digit) {
            case "i":         digitName = 1;        break;
            case "ii":        digitName = 2;        break;
            case "iii":        digitName = 3;        break;
            case "iv":        digitName = 4;        break;
            case "v":        digitName = 5;        break;
            case "vi":        digitName = 6;        break;
            case "vii":        digitName = 7;        break;
            case "viii":        digitName = 8;        break;
            case "ix":        digitName = 9;        break;
            case "x":        digitName = 10;        break;
            case "xi":        digitName = 11;        break;
            case "xii":        digitName = 12;        break;

            default:
                digitName = -1;
        }
        return  digitName;
    }

    public static void main(String[] args) {

        System.out.println(translate(" III"));
    }

}
