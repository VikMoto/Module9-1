package org.example;

public class Main {

    private static char replaceChar(char c)
    {
        int resultCharCode = c;
        System.out.print(c + "  ");
        System.out.println( resultCharCode);
        if (c >= 97 && c <= 103)
        {
            resultCharCode = c - 49;
        }
        else if (c >= 104 && c <= 110)
        {
            resultCharCode = (c - 54);
        }
        else if (c >= 111 && c <= 116)
        {
            resultCharCode = (c - 63);
        }
        else if (c >= 117 && c <= 122)
        {
            resultCharCode = (c - 66);
        }
        return (char)resultCharCode;
    }

    public static void main(String[] args) {

        String str = "abcDHWRTHfvjsWERfFGwxFGyz";
        //String str = "abcdfefghijklmnopqrstuvwxyz";
        //String str = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
        {

            char replacedChar = replaceChar(c);
            sb.append(replacedChar);
        }
        String result = sb.toString();
        System.out.println("Hello world!");
        System.out.println("NOTFORYOU" + result + "YESNOTFORYOU");
    }
}