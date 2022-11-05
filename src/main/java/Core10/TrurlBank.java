package org.example;

public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;
        int index = 0;
        while (n > 0){
            result += n*n;
            n--;
        }
        return result;
    }

    public int countSumOfDigits(int number) {
        int result = 0;

        while(number != 0){
            //Суммирование цифр числа
            result += (number % 10);
            number/=10;
        }

        return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}
