/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a new string made of 3 copies of the 
 * first 2 chars of the original string. The string may be any length. 
 * If there are fewer than 2 chars, use whatever is there. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class WithoutTwo {

    public static String without2(String str) {
   
            
        if(str.length()>=2 && str.substring(0,2).equals(str.substring(str.length()-2, str.length()))){
            return str.substring(2);  
        }
       return str;
        
        
    }
    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("AbaaaaaaAb"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
        System.out.println(without2("x"));
        System.out.println(without2(""));
    }
}