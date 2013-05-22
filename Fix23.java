/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an int array length 3, if there is a 2 in the array immediately 
 * followed by a 3, set the 3 element to 0. Return the changed array. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Fix23 {

    public static int[]  fix23(int [] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==2){
                if(nums[i+1]==3){
                nums[i+1]=0;
            }
            } 
        }
        
       return nums;
}
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] b= {2,3,1};
        int [] c= {1,2,1};
    
        for (int i = 0; i < fix23(a).length; i++) {
            System.out.println(fix23(a)[i]);
        }
          for (int i = 0; i < fix23(b).length; i++) {
            System.out.println(fix23(b)[i]);
        }
            for (int i = 0; i < fix23(c).length; i++) {
            System.out.println(fix23(c)[i]);
        }
    }
}