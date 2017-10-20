package practicas;

/**
 *
 * @author Pepe
 */

public class Pruebas {
    
    public static void main(String[] args) {
        System.out.println(centuryFromYear(1988));
        //centuryFromYear(347);
    }
    
    static int centuryFromYear(int year) {
        int band = year;
        if (year >= 1 && year <= 2005) {
            
            for (int i = 0; band >= 100; i++) {
                band -= 100;
            }
            if (band==0) {
                year /= 100;
                return year;
            }else{
                year /=100;
                year += 1;
                return year;
            }
        }
        return year;
    }
}
