/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a version without the first and last char, 
 * so "Hello" yields "ell". The string length will be at least 2. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class WithoutEnd {

    public static String withoutEnd(String str) {
     return str.substring(1, str.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(withoutEnd("Helloo"));
     System.out.println(withoutEnd("Hel"));
     System.out.println(withoutEnd("ThisIsANewString"));
    }
}
