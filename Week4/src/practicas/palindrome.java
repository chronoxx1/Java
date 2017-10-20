package practicas;

/**
 *
 * @author Pepe
 */
public class palindrome {

    public static void main(String[] args) {
        
        System.out.println(checkPalindrome("aaasaaa"));
    }

    static boolean checkPalindrome(String inputString) {
        if (inputString.length() >= 1 && inputString.length() <= Math.pow(10, 5)) { /*input length has to be between 1 and 10^5*/
            StringBuffer str = new StringBuffer(inputString); /*create a new Stringbuffer*/
            str.reverse();              /*use reverse method*/
            if (inputString.equals(str.toString())) { /*converts stringbuffer to string and compare with the inputstring*/
                return true; /*return true if inputstring is a palindrome*/
            }
        }
        return false; /*return false otherwise*/
    }
}
