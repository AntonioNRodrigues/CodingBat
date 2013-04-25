/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given 2 strings, a and b, return a new string made of the first char 
 * of a and the last char of b, so "yo" and "java" yields "ya". 
 * If either string is length 0, use '@' for its missing char. 
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class LastChars {

  public static String lastChars(String a, String b) {
      String newS=null;
      
      if(a.length()!=0){
         newS=a.substring(0, 1);
      }else{
          newS="@";
      }
     
        if(b.length()!=0){
              newS+=b.substring(b.length()-1, b.length());
      }else{
            newS+="@";
        }
      
      return newS;
}
    public static void main(String[] args) {
        
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
       System.out.println(lastChars("", ""));
    }
}