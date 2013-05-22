/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints, return a new array length 2 containing the first 
 * and last elements from the original array. The original array will be 
 * length 1 or more.
 */
package codingbat.exercicios;

/**
 * @author Antonio Rodrigues
 */
public class MakeEnds {

    public static int[] makeEnds(int [] nums) {    
        int aux[]= new int[2];
            for(int i=0; i<nums.length; i++){
                if(i==0){
                    aux[0]=nums[i];
                    aux[1]=nums[i];
                }else if(i==nums.length-1){
                    aux[1]=nums[i];
                }
            }
      return aux; 
}
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] b= {5,11,2,9};
        int [] c= {7};
    
        for (int i = 0; i < makeEnds(a).length; i++) {
            System.out.println(makeEnds(a)[i]);
        }
        for (int i = 0; i < makeEnds(b).length; i++) {
            System.out.println(makeEnds(b)[i]);
        }
        for (int i = 0; i < makeEnds(c).length; i++) {
            System.out.println(makeEnds(c)[i]);
        }
       
    }
}