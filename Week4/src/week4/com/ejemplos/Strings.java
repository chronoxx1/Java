package week4.com.ejemplos;

/**
 *
 * @author Pepe
 */
public class Strings {
    static String cadena = "Parangarecutirimicuaro";
    static String cCesar = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    
    public static void main(String[] args) {
        cadenasArreglos();
    }
    
    public static void cadenasArreglos(){
        //String [] meses = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //String [] semanas = {"mon", "Tue", "Wed", "Thu", "Fri", "Sat", "sun"};
        
        boolean x = true;
        boolean az = false;
        
        System.out.println(x!=az);
        
        
    }
    
    public static void cifradoCesar(){
                
        for (int i = 0; i < cadena.length(); i++) {
            cadena = cadena.replace(cadena.charAt(i), cCesar.charAt(i+3));
        } 
        System.out.println(cadena);
    }
    
}
