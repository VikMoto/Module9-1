package ua.goit.CoreHW6;
import java.util.*;
/*
Напиши клас TargetFinder. Цей клас має метод public int[] findTarget(int[] aiCoords, int[][] targets).
Цей метод приймає два параметри:
aiCoords - координати точки, де зараз перебуває ШІ. Це масив із двох елементів, x та y відповідно;
targets - двомірний масив. Кожен елемент масиву - це масив із двох елементів, x та y потенційної цілі
відповідно.
Метод повертає точку найближчої цілі з масиву targets. Це масив із двох точок - x та y відповідно.
 */
public class TargetFinder {

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int rowsLength = targets.length;
        int columnsLength = targets[0].length;
        int[] result = new int[]{0,0};
        int j;
        int distMin = new DistanceTarget(aiCoords[0], aiCoords[1], targets[0][0],targets[0][1]).getDistance();
        int distPresent;
        for (int i = 0; i < rowsLength; i++) {

            distPresent = new DistanceTarget(aiCoords[0], aiCoords[1], targets[i][0],targets[i][1]).getDistance();
            if (distPresent < distMin) {
                result[0] = targets[i][0];
                result[1] = targets[i][1];
                distMin = distPresent;
            }



        }

        return result;
    }


}
class DistanceTarget {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public DistanceTarget(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance(){
        return (int) Math.round( Math.sqrt( (endY-startY)*(endY-startY)
                + (endX-startX)*(endX-startX) ) );
    }

}





class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}

