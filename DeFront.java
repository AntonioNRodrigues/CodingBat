/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given a string, return a version without the first 2 chars. 
 * Except keep the first char if it is 'a' and keep the second 
 * char if it is 'b'. The string may be any length. 
 * Harder than it looks. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class DeFront {

    public static String deFront(String str) {
           boolean verdPrimPosicao= str.substring(0, 1).equals("a");// verdadeiro se a str tem um a na primeira posição
           boolean verdSecPosicao= str.substring(0, 1).equals("b");// verdadeiro se a str tem um b na segunda posição
        if(str.length()>=2 && (verdPrimPosicao==true || verdSecPosicao==true)){
            return str.substring( 2);
        }
        
        
       return "";
        
        
    }
    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("wbay"));
        
    }
}