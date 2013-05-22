/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an array of ints, return true if 6 appears as either the first or last 
 * element in the array. The array will be length 1 or more. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class FirstLast6 {

    public static boolean firstLast(int [] nums) {
            for(int i=0; i<nums.length; i++){
                if(nums[0]==6 || nums[nums.length-1]==6){
                    return true;
                }
    }   
       return false;
}
    public static void main(String[] args) {
        int [] a= {1,2,6};
        int [] b= {6,1,2,3};
        int [] c= {13,6,1,2,3};
        int [] d= {3,6,1};
    
        System.out.println(firstLast(a));
        System.out.println(firstLast(b));
        System.out.println(firstLast(c));
        System.out.println(firstLast(d));
    }
}