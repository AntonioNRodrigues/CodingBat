/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given 2 strings, a and b, return a string of the form short+long+short, 
 * with the shorter string on the outside and the longer string on the inside. 
 * The strings will not be the same length, but they may be empty (length 0). 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class ComboString {

    public static String comboString(String a, String b) {
        if(a.length()<b.length()){
            return a+b+a;
        }else
        return b+a+b;
    }
    public static void main(String[] args) {
        System.out.println(comboString("Helloo", "this"));
     System.out.println(comboString("Hel", "other"));
     System.out.println(comboString("ThisIsANewString" , "sorterString"));
    }
}
