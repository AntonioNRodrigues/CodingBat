/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given two strings, append them together (known as "concatenation") 
 * and return the result. However, if the strings are different lengths, 
 * omit chars from the longer string so it is the same length as 
 * the shorter string. So "Hello" and "Hi" yield "loHi". 
 * The strings may be any length. 
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class MinCat {

    public static String minCat (String a, String b) {
        
        if(a.length() > b.length()){
            return a.substring(a.length()-b.length())+b;
        }
       
        if(a.length() < b.length()){
            return a + b.substring(b.length()-a.length());
            }
        return a+b;
   
}
    public static void main(String[] args) {
        System.out.println(minCat("hello", "Hi"));
        System.out.println(minCat("java", "Hello"));
        System.out.println(minCat("Hello", "java"));
         System.out.println(minCat("Helo", "java"));
       
    }
}