package ua.goit.CoreHW5;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        /*FirNum firNum = new FirNumMultiplyOdd();
        FirTest firTest = new FirTest();

        //Should be 15
        System.out.println(firTest.test(firNum, 5));*/

        FirNum firNum = new FirNumFizzBuzz();
        FirTest firTest = new FirTest();

        //Should be 83
        System.out.println(firTest.test(firNum, 20));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}
class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
    int i = 0;
    int minCount;
    int sum = 0;
    minCount = n;
    if (n > 0) {
        while (i < n) {
            sum += minCount;
            minCount--;
            i++;
        }
    }
    return sum;
    }
}

class FirNumFactorial extends FirNum {
        @Override
    public int calc(int n) {
        int i = 0;
        int minCount;
        int fact = 1;
        minCount = n;
        if (n >= 1) {
            while (i < n) {
                fact *= minCount;
                minCount--;
                i++;
            }
        }
        return fact;
    }
}

/*
Створи клас FirNumMultiplyOdd, який успадковується від класу FirNum. Перевизнач у цього класу
метод calc() так, щоб він повертав добуток непарних чисел від 1 до n включно.
 class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}
 */
class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int i = 1;
        int minCount;
        int mult = 1;
        if ((n/2)*2 == n) {
            minCount = n-1;
            n = minCount;
        }else {
            minCount = n;
        }
            while (i < n) {
                    mult *= minCount;
                    minCount = minCount - 2;
                    i = i + 2;
            }
        return mult;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if ((i%3 == 0 || i%5 == 0) && !(i%3 == 0 && i%5 == 0)) {
                result += i;
            }
        }
        return result;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                result += i;
            }
        }
        return result/2;
    }
}