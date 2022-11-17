package ua.goit.Core10;


public class QuadraticEquationSolver {
    public static double[] solve(int a, int b, int c) {
        double dicriminant;
        double x1,x2,x;
      //  double x2;
      // double x2;

        double[] result1;
        double[] result = new double[]{};

        dicriminant = b*b - 4*a*c;
        if (dicriminant > 0) {
            result1 = new double[2];
            x1 = (-b - Math.sqrt(dicriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(dicriminant)) / (2 * a);
            if (x1 > x2) {
                result1[0] = x1;
                result1[1] = x2;
                result = result1;
            }else {
                result1[0] = x2;
                result1[1] = x1;
                result = result1;
            }
        } else if (dicriminant == 0) {
            result1 = new double[1];
            x = -b / (2 * a);
            result1[0] = x;
            result = result1;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(solve(4, 6, 23));
    }
}
