/*
 * Classe for the exercice found in www.codingbat.com -->
 * Given an int array length 2, return true if it contains a 2 or a 3. 
 */
package codingbat.exercicios;

/**
 * @author António Rodrigues
 */
public class Has23 {

    public static boolean has23(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==2||nums[i]==3){
                return true; 
           }
        }
      
       return false;
}
    public static void main(String[] args) {
        int [] a= {1,2,3};
        int [] b= {1,0,1,1};
        int [] c= {1,6,1};
    
        System.out.println(has23(a));
        System.out.println(has23(b));
        System.out.println(has23(c));
    }
}