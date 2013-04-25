/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a string length 1 from its front, 
 * unless front is false, in which case return a string length 1 
 * from its back. The string will be non-empty.  
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class TheEnd {

    public static String theEnd(String a, boolean  front) {
       
        if(front==true){
            return a.substring(0,1);
        }else{
            if(front==false){
                return a.substring(a.length()-1, a.length());
            }
        }
        
        return a;
    }
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
     System.out.println(theEnd("Hello", false));
     System.out.println(theEnd("oh", true));
    }
}