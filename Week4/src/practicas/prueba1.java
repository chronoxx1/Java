package practicas;

/**
 *
 * @author Pepe
 */

public class prueba1 {
    
    public static void main(String[] args) {
        int [] arr={9,7};
        int [] arr2={15,3};
        division(arr, arr2);
        
        //27 
        //30 
    }
    
    static int[] fractionDivision(int[] a, int[] b) {
        
        int c = (a[0]*b[1]);
        int d = (a[1]*b[0]);
        int [] arr3=new int[2];
        
        for (int i = 20; i >= 2; i--) {
            if (c%i==0 && d%i==0) {
                System.out.println(i+" a ");
                System.out.println(i+ " b");
                arr3[0]=c/i;
                arr3[1]=d/i;
                break;
                
            }
            
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(arr3[i]);
        }
        
        
        System.out.println("//////////");
        System.out.println(Math.min(c, d));
        
        return arr3;  
        
    }
 
    static int[] division(int[] a, int[] b) {
        
        int c = (a[0]*b[1]);
        int d = (a[1]*b[0]);
        int [] arr3=new int[2];
        int var = 1;
        
        int m1 = Math.max(a[0], a[1]);
        int m2 = Math.max(b[0], b[1]);
        int m3 = Math.max(m1, m2);
        
        do{
            if (c%var==0 && d%var==0) {
                arr3[0]=c/var;
                arr3[1]=d/var;
            }
            var++;
        }while(m3 >= var);
        
        
        for (int i = 0; i < 2; i++) {
            System.out.println(arr3[i]);
        }
        
        return arr3;  
    }
    
}
