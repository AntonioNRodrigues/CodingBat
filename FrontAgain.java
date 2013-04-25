/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, if the string begins with "red" or "blue" 
 * return that color string, otherwise return the empty string. 
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class FrontAgain {

  public static boolean frontAgain(String str) {
      
      if(str.length()>=2){
          if(str.substring(0,2).equals(str.substring(str.length()-2, str.length()))){
              return true;
          }
      }
      return false;
  }

    public static void main(String[] args) {
        
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
       System.out.println(frontAgain("ed"));
       System.out.println(frontAgain("x"));
       System.out.println(frontAgain(""));
     
    }
}