package Core10;

public class CaptainDisputeAgain {
 /*Напиши клас CaptainDisputeAgain. У цьому класі створи метод public int findMin(int[] triple).
  Він приймає масив із трьох цілих чисел та повертає мінімальне з них. Оператор if використовувати не можна.
  */

    public int findMin(int[] triple){
        int minNumeric = triple[0] < triple[1] ? triple[0] : triple[1];
        minNumeric = minNumeric < triple[2] ? minNumeric : triple[2];
        return minNumeric;
    }
}
