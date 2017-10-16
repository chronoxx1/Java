package week4.com.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Pepe
 */
public class Strings {

    static Scanner read = new Scanner(System.in);
    static String cadena = "Parangarecutirimicuaro";
    static String[] meses = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dic",};

    public static void main(String[] args) {
        //cadenasArreglos();
        //bj();
        //sw();
        //cifradoCesar(cadena, 3);
        //bucles();
        
        System.out.print("Longitud: ");
        int c = read.nextInt();
        CuentaPalabras cp = new CuentaPalabras(c);
        cp.CuentaLetras();
                
    }

    public static void sw() {
        String exit;

        do {
            System.out.println("Ingrese Chana, Juana o Chona");
            String opcion = read.nextLine();

            opcion = opcion.toLowerCase();
            switch (opcion) {
                case "chana":
                    System.out.println("Chana!!!");
                    break;
                case "juana":
                    System.out.println("Juana!!!");
                    break;
                case "chona":
                    System.out.println("Chona!!!");
                    break;
                default:
                    System.out.println("Opcion Incorrecta!!");
            }
            System.out.print("Otra vez? si/no : ");
            exit = read.nextLine();
            exit = exit.toLowerCase();
        } while (exit.equals("si"));

        read.close();
    }

    public static void burbuja() {
        int aux;
        int cant;
        System.out.print("Tamaño: ");
        cant = read.nextInt();

        int arr[] = new int[cant];

        for (int i = 0; i < cant; i++) {
            arr[i] = read.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        read.close();
    }

    public static void bucles() {
        for (int i = 0; i < meses.length; i++) {
            System.out.println((i+1) + " : " + meses[i]);
        }
    }

    public static String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
        
    }

}
