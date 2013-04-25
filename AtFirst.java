/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a string length 2 made of its first 2 chars. 
 * If the string length is less than 2, use '@' for the missing chars.
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class AtFirst {

    public static String atFirst(String str) {
       
       if(str.length()>=2){
           return str.substring(0, 2);
       }else 
           if(str.length()==0){return "@@";
           }
       return str.substring(0,1)+"@";
        
}
    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst(""));
        System.out.println(atFirst("h"));
    }
}