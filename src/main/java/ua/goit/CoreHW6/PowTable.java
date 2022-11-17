package ua.goit.CoreHW6;
import java.util.*;
class PowTable {
    public static final int[] POWERS_2 = new int[10];
    static {
       int[] POWERS_2 = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
    }

}

class PowTableTest {
    public static void main(String[] args) {
        //[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
