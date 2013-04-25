/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string of any length, return a new string where the last 2 chars, 
 * if present, are swapped, so "coding" yields "codign". 
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class LastTwo {

  public static String lastTwo(String str) {
      int ia=str.length();
      if(ia==0 ||ia==1){
          return str;
      }else{
          if(ia==2){
              String newS=str.substring(0, ia-2)+str.substring(ia-1, ia)+str.substring(ia-2,ia-1);
              return newS;
          }else{
              if(ia>2){
                  String newS2=str.substring(0, ia-2)+str.substring(ia-1, ia)+str.substring(ia-2,ia-1);
                  return newS2;
              }
          }
      }
      
      return str;
  }

    public static void main(String[] args) {
        
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
       System.out.println(lastTwo("ab"));
       System.out.println(lastTwo("a"));
       System.out.println(lastTwo(""));
    }
}