/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints, return true if the array is length 1 or more, 
 * and the first element and the last element are equal. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class SameFirstLast {

    public static boolean sameFirstLast(int [] nums) {
            
        if(nums.length>=1){
            for(int i=0; i<nums.length; i++){
              if(nums[0]==nums[nums.length-1]){
                  return true;
              }
            }
        }
       return false;
}
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] b= {1,2,1,1};
        int [] c= {1,2,1};
    
        System.out.println(sameFirstLast(a));
        System.out.println(sameFirstLast(b));
        System.out.println(sameFirstLast(c));
    }
}