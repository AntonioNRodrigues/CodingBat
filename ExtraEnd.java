/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a new string made of 3 copies of the last 2 chars 
 * of the original string. The string length will be at least 2. 
 */

/**
 * @author António Rodrigues
 */
package codingbat.exercicios;
public class ExtraEnd {
    public static String extraEnd(String str){ 
        int i=str.length();
        String l=str.substring(i-2, i);
        return l+l+l;
    }
    public static void main(String []a){
        System.out.println(extraEnd("Hello"));
    }
}
