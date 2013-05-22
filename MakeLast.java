/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an int array, return a new array with double the length where its last 
 * element is the same as the original array, and all the other elements are 0. 
 * The original array will be length 1 or more. Note: by default, a new int 
 * array contains all 0's.  
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class MakeLast {

    public static int[] makeLast(int []nums) {
        int newSize=nums.length*2;
        int []aux= new int [newSize];
        int zero=0;
        int lastEl=nums[nums.length-1];
        
        for (int i = 0; i < aux.length; i++) {
            aux[i]=zero;
            if(i==aux.length-1){
                aux[i]=lastEl;
            }
        }
        
        return aux;
}
    public static void main(String[] args) {
  
       int []a= {1,2,3};
        for (int i = 0; i < makeLast(a).length; i++) {
            System.out.print(makeLast(a)[i]);
        }

    }
}