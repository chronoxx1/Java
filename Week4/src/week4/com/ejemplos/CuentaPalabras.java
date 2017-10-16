package week4.com.ejemplos;

/**
 *
 * @author Pepe
 */

public class CuentaPalabras {
    static String[] meses = {"Enero","Febrero","Marzo","Abri","Mayo","Junio","Julio","Agosto","Septiembre",
        "Octubre","Noviembre","Diciembre",};
    int num;
    
    public CuentaPalabras(int num){
        this.num = num;
    }
    
    public void CuentaLetras(){
        System.out.println("Coincidencias Encontradas....");
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].length() == num) {
                System.out.println(meses[i] + " : " + num);
            }
        }
    }
    
}
