package practicas;

/**
 *
 * @author Pepe
 */
public class taxi {

    public static void main(String[] args) {
        double arr1[] = {0.4, 1};
        double arr2[] = {0.9, 3};
        perfectCity(arr1, arr2);
    }

    static double perfectCity(double[] departure, double[] destination) {
        double a, b, c, d = 0.0;

        if (departure[0] == 0 || destination[0] == 0) {
            a = departure[1];
            b = destination[1];
            c = departure[0] - destination[0];
            c = Math.abs(c);
            d = (a + b) + (c);
            System.out.println(d);
            return d;
        } else {
            double min = Math.min(departure[0], destination[0]);
            double celmin = Math.ceil(min);
            a = celmin - min;
            a = Math.abs(a);

            double max = Math.max(departure[0], destination[0]);
            b = celmin - max;
            b = Math.abs(b);

            c = departure[1] - destination[1];
            c = Math.abs(c);
            d = a+b+c;
            System.out.println(d);
            return d;
        }
    }
}
