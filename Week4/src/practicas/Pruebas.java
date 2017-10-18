package practicas;

/**
 *
 * @author Pepe
 */

public class Pruebas {
    
    public static void main(String[] args) {
        centuryFromYear(347);
    }
    
    static int centuryFromYear(int year) {
        if (year >= 1 && year <= 2005) {
            if(year % 2 == 1){
                year = year/100;
                year += 1;
                return year;
            }else{
                year /= 100;
                return year;
            }
        }
        return year;
        
    }
}
