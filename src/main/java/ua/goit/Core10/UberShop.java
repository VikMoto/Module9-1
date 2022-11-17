package ua.goit.Core10;

import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {

        if(prices.length == 0){
            int[] arr = {};
            return arr;
        }
        int maxPrice = prices[0];
        int minPrice = prices[0];
        int price;
        if(prices.length == 1) {

            return new int[] {minPrice};
        }
        else {

            for(int i = 0; i < prices.length-1; i++) {
                for (int j = 0; j < prices.length-i; j++) {

                    price = prices[j];

                    if (prices[j] < minPrice) {
                        minPrice = prices[j];
                    }
                    if (prices[j] > maxPrice) {
                        maxPrice = prices[j];
                    }

                }
            }
            System.out.println(minPrice + "," + maxPrice);
            if(minPrice == maxPrice) {
                return new int[] {minPrice};
            }  else {
                return new int[] {minPrice, maxPrice};
            }
        }
    }
    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = {54,5454,54,5} ;
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }
}

