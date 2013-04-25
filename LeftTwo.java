/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a "rotated left 2" version where the first 2 chars are 
 * moved to the end. The string length will be at least 2. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class LeftTwo {

    public static String left2(String a) {
        if(a.length()>=2){
            return a.substring(2, a.length())+a.substring(0, 2);
        }else
        
        return a;
    }
    public static void main(String[] args) {
        System.out.println(left2("Hello"));
     System.out.println(left2("java"));
     System.out.println(left2("Hi"));
    }
}