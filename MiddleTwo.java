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
public class MiddleTwo {

    public static String  middleTwo(String str) {
        if((str.length()%2)==0){
            return str.substring((str.length()/2-1), ((str.length()/2)+1) );
        }
         return "";
    }
    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }
}