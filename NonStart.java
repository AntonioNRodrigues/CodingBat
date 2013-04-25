/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given 2 strings, return their concatenation, 
 * except omit the first char of each. The strings will be at least length 1. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class NonStart {

    public static String nonStart(String a, String b) {
        
        return a.substring(1)+b.substring(1);
    }
    public static void main(String[] args) {
        System.out.println(nonStart("Helloo", "this"));
     System.out.println(nonStart("Hel", "other"));
     System.out.println(nonStart("ThisIsANewString" , "sorterString"));
    }
}