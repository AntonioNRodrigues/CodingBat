/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given two strings, append them together (known as "concatenation") 
 * and return the result. However, if the concatenation creates a double-char, 
 * then omit one of the chars, so "abc" and "cat" yields "abcat".
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class ConCat {

  public static String conCat(String a, String b) {
      int ia=a.length();
      int ib=b.length();
      
      if(ia==0||ib==0){
        }else{
          if(a.substring(ia-1, ia).equals(b.substring(0, 1))){
                    return a+b.substring(ib-ib+1, ib);
          }
      }

      return a+b;
  }

    public static void main(String[] args) {
        
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
       System.out.println(conCat("", ""));
    }
}