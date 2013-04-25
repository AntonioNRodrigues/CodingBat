/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return true if it ends in "ly". 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class EndsLy {

    public static boolean endsLy(String str) {
        if(str.endsWith("ly")){
            return true;
        }
     return false;
    }
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }
}