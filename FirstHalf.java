/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class FirstHalf {
        public static String firstHalf(String str) {
            String newS="";
            if((str.length()%2)==0)
               newS=str.substring(0, (str.length()/2));
           
            return newS;
        }
     public static void main(String[] args) {
         System.out.println(firstHalf("Helloo"));
     System.out.println(firstHalf("He"));
     System.out.println(firstHalf("ThisIsANewString"));
     }
}
