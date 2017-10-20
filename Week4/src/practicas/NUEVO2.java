package practicas;

/**
 *
 * @author Pepe
 */
public class NUEVO2 {

    int arr[] = {1};

    public static void main(String[] args) {
        System.out.println(digitsProduct(1));
    }

    static int digitsProduct(int product) {
        int[] arr = new int[10];
        int cont = 0;
        int a = 1;
        String x = "";
        int result;

        int var = product;

        if (product >= 0 && product <= 600) {

            if (product == 0) {
                result = 10;
                return result;
            } else if (product == 1) {
                result = 1;
                return result;
            } else {
                for (int i = 9; i >= 1; i--) {
                    if (var % i == 0) {
                        arr[cont] = i;
                        System.out.println(arr[cont]);
                        cont++;
                        var = var / i;
                        if (i == 1) {
                            i = -1;
                        } else {
                            i = 10;
                        }
                    }
                }

                for (int i = cont - 2; i >= 0; i--) {
                    x = x + arr[i];
                }
            }

        }

        result = Integer.parseInt(x);

        return result;
    }
}
