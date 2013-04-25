/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a version without both the first 
 * and last char of the string. The string may be any length, 
 * including 0. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class WithouEndTwo {

    public static String withouEnd2(String a) {
       
            if(a.length()>=3){
                return a.substring(1, a.length()-1);
            }
            else
                return "";
    }
    public static void main(String[] args) {
        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));
    }
}