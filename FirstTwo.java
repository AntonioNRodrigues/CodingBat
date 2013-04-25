/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", 
 * and the empty string "" yields the empty string "". 
 * Note that str.length() returns the length of a string. 
 */

/**
 * @author António Rodrigues
 */

package codingbat.exercicios;
public class FirstTwo {

  public static String firstTwo(String str){
      if(str.length()>=2){
      String newS=str.substring(0, 2);
      return newS;}
     
              return str;
  }
    public static void main(String[] args) {
     System.out.println(firstTwo("Hello"));
     System.out.println(firstTwo("H"));
     System.out.println(firstTwo(""));
    }
}
