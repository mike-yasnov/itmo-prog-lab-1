import java.lang.Math;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] c = new int[15];
        int n = 16;
        for (int i = 0; i < c.length; i++) {
            c[i] = n;
            n -= 1;

        }
//System.out.println("\nc:");
//    for (int i=0; i<15; i++)
//System.out.println(c[i]);

        float[] x = new float[16];
        Random rnd = new Random();
        float min = -14.0f;
        float max = 8.0f;
        for (int i = 0; i < x.length; i++) {
            x[i] = min + rnd.nextFloat() * (max - min);


        }
//System.out.println("\nx:");
//    for (int i=0; i<16; i++)
//System.out.println(x[i]);

        double[][] arr = new double[15][16];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (c[i] == 14) {
                    arr[i][j] = Math.pow(2 * Math.log(Math.abs(x[j])) / 3, Math.asin((x[j] - 3) / 22));
                } else if (Arrays.asList(4, 5, 6, 8, 11, 13, 16).contains(c[i])) {
                    arr[i][j] = Math.pow(2 / (Math.pow(2 * (Math.pow(x[j] / (2 + x[j]), 3) - 1), 2)), 3);
                } else {
                    arr[i][j] = Math.asin(Math.pow(Math.exp(Math.cbrt(Math.pow(-1 * (Math.abs(x[j]) * (5 + Math.abs(x[j]))), x[j]))), 2));
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("%.4f\", arr[i][j]);
            }
            System.out.println(c[i]);
        }

    }
}
