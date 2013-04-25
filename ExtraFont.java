/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a new string made of 3 copies of the 
 * first 2 chars of the original string. The string may be any length. 
 * If there are fewer than 2 chars, use whatever is there. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class ExtraFont {

    public static String extraFont(String str) {
       
        if(str.length()>=2){
            String str2=str.substring(0, 2);
            return str2+str2+str2;
        }
        else{
            String str3=str.substring(0,str.length());
            return str3+str3+str3;
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println(extraFont("Hello"));
        System.out.println(extraFont("ab"));
        System.out.println(extraFont("H"));
        System.out.println(extraFont(""));
    }
}