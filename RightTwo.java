/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a "rotated right 2" version where the last 2 
 * chars are moved to the start. The string length will be at least 2.  
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class RightTwo {

    public static String right2(String a) {
        if(a.length()>=2){
            return a.substring((a.length()-2), a.length())+a.substring(0, a.length()-2);
        }else
        
        return a;
    }
    public static void main(String[] args) {
        System.out.println(right2("Hello"));
     System.out.println(right2("java"));
     System.out.println(right2("Hi"));
    }
}