/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the 
 * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may 
 * be any length, including 0. Note: use .equals() to compare 2 strings.  
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class HasBad {

    public static boolean hasBad(String str) {
       
        if(str.contains("bad")){
                    if(str.substring(0,1).equals("b")||str.substring(1,2).equals("b")){
                        return true;
        }}
            return false;
        
}
    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }
}