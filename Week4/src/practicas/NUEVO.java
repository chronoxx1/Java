package practicas;

import java.util.regex.Pattern;

/**
 *
 * @author Pepe
 */
public class NUEVO {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        String[] arr2 = {"asd"};
        System.out.println(regularBracketSequence2("([])"));
    }

    static boolean regularBracketSequence2(String sequence) {
        if (sequence.length() >= 4 && sequence.length() <= 20) {
            char f,t;
            int a=0,b=0,c=0,d=0;
            boolean band = false;
            for (int i = 0; i < sequence.length(); i++) {
                f = sequence.charAt(i);
                System.out.println(f+"eschar");
                t=' ';
                switch (f) {
                    case '[':a++;break;
                    case ']':
                        t = sequence.charAt(i-1);
                        if (t=='[') {
                            b++;
                            band = true;
                        }
                        
                        break;
                    case '(':c++;break;
                    case ')':
                        t = sequence.charAt(i-1);
                        if (t=='(') {
                            d++;
                        }else{
                            System.out.println("no2");
                        }
                    default:break;
                }
                
                
            }
            
            if (a==b && c==d) {
                return true;
            }
            return false;
        }
        
        
        return false;
    }
}
