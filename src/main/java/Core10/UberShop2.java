package org.example;

public class UberShop2 {
    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
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
        if (prices.length == 0) {
            return new int[0];
        }
        int min = prices[0];
        int max = prices[0];

        for (int price : prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[]{min};
        }

        return new int[]{min, max};
    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int max = prices[0];
        int counterMinPrice = 0;
        int counterEqualPrice = 0;

        for (int price : prices) {

            if (price < min) {
                min = price;
                counterMinPrice++;
            }
            //System.out.println(min);
        }
        //System.out.println(getCount(prices,min));

        if (counterEqualPrice == prices.length) {
            return prices.length;
        } else {
            return getCount(prices,min);
        }
    }

    public static int getCount(int[] a, int min) {
        int count =0;
        for(int i : a)
            if(i == min) count++;
        return count;
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int newArrLenth = 0;

        newArrLenth = prices.length - getCount(prices,toRemove);

        int[] tempArr = new int[newArrLenth];
        int k = 0;
        for(int i=0; i < prices.length; i++) {
                if (prices[i] != toRemove) {
                    tempArr[k] = prices[i];
                    k++;
                    //System.out.println(tempArr[j] + "   " + prices[i]);
                }

        }
        return tempArr;
    }


    public int[] leavePrice9(int[] prices) {
        int toCount = 0;
        for(int price: prices) {
            if (price %10 == 9) {
                toCount++;
            }
        }

        int[] result = new int[toCount];
        int index = 0;
        for(int price: prices) {
            if (price %10 == 9) {
                result[index] = price;
                index++;
            }
        }
        return result;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        int newLength;
        newLength = showcaseStocks.length + warehouseStocks.length;
        String[] result = new String[newLength];

        for (int i = 0; i < showcaseStocks.length; i++) {
            result[i] =  showcaseStocks[i];
            }
        for (int i = showcaseStocks.length; i < newLength; i++) {
            result[i] = warehouseStocks[i-showcaseStocks.length];
        }

        return result;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int price: prices) {
            if (price >= minPrice && price <= maxPrice) {
                sum += price;
            }
        }
    return sum;
    }

    //Test output
    public static void main(String[] args) {
        UberShop2 shop = new UberShop2();

        //Should be [50, 1500]
       // int[] prices = new int[]{10, 1560, 10, 10, 60, 10, 10};
        //System.out.println(shop.getMinPriceCount(prices)); //Should be 2

        /*int[] prices = new int[]{150, 100, 200, 34,33555};
        int toRemove = 100;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));*/

        //Should be [1599, 399]
       /* int[] prices = new int[] {399, 1599, 9, 399, 50, 10, 10, 70,89};
        System.out.println(Arrays.toString(shop.leavePrice9(prices)));

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[] {"gun", "firebow"};
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));*/
        //Should be 144 - 20 + 50 + 40 + 34
        int[] prices = new int[] {10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));


    }
}
