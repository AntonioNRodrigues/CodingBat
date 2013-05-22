/*
 * Classe for the exercice found in www.codingbat.com -->
 * Return an int array length 3 containing the first 3 
 * digits of pi, {3, 1, 4}. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class MakePi {

    public static int[] makePi() {
      return new int[]{3,4,1};
}
    public static void main(String[] args) {
        int a[]=makePi();
        for(int i=0; i<a.length; i++){
             System.out.println(a[i]);
        }
       

    }
}