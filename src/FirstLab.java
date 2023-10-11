import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FirstLab {
    public static void main(String[] args) {
        long[] c = new long[10];
        int k = 4;
        for (int i = 0; i < c.length; i++) {
            c[i] = k;
            k += 2;
        }

        double[] x = new double[14];
        Random r = new Random();
        double min = -12.0, max = 8.0;

        for (int i = 0; i < x.length; i++) {
            x[i] = min + (max - min) * r.nextDouble();
        }

        double[][] array = new double[10][14];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (c[i] == 12) {
                    array[i][j] = Math.exp(
                            Math.log(Math.pow(
                                    Math.PI * (5 + Math.abs(x[j])), x[j])
                            )
                    );
                } else if (Arrays.asList(8, 10, 14, 18, 22).contains(c[i])) {
                    array[i][j] = Math.tan(
                            Math.tan(
                                    Math.pow(x[j], (x[j] - 0.5) / x[j])
                            )
                    );
                } else {
                    array[i][j] = 0.5 / Math.asin(
                            Math.sin(
                                    Math.cbrt(
                                            Math.pow((2.0 / 3.0) * x[j], 2)
                                    )
                            )
                    );
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("%.4f\t", array[i][j]);
            }
            System.out.println();
        }
    }
}