/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string of odd length, return the string length 3 from its middle, 
 * so "Candy" yields "and". The string length will be at least 3. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class MiddleThere {

    public static String middleThere(String str) {
            int i=str.length()/2;
            String str2=str.substring(i-1, i+2);
        return str2;
    }
    public static void main(String[] args) {
        System.out.println(middleThere("Candy"));
        System.out.println(middleThere("and"));
        System.out.println(middleThere("solving"));
    }
}