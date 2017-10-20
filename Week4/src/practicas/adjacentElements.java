package practicas;

/**
 * Get an array then multiplicate the first valor with the second one and repeat until the end of the array
 * and print the maximum value of the product of multiplicate 2 valors
 * has 2 conditions array >= 2 and <=10 and each vaue inside >= -1000 and <= 1000
 * @author Pepe
 */
public class adjacentElements {

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1000};
        System.out.println(adjacentElementsProduct(arr));
    }

    static int adjacentElementsProduct(int[] inputArray) {
        int aux = -1001;
        if (inputArray.length >= 2 && inputArray.length <= 10) {
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] >= -1000 && inputArray[i] <= 1000) {
                    for (int j = 0; j < inputArray.length - 1; j++) {
                        if (aux < inputArray[j] * inputArray[j + 1]) {
                            aux = inputArray[j] * inputArray[j + 1];
                        }
                    }
                    return aux;
                }
            }      
        }
        return aux;
    }
}
